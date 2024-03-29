package model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AdventureLoader {
    String filePath = "src/main/resources/AdventureTest.json";

    ObjectMapper objectMapper = new ObjectMapper();

    public AdventureLoader() {
    }

    public void loadAdventure() {
        try {
            File jsonFile = new File(filePath);
            JsonNode jsonNode = objectMapper.readTree(jsonFile);
            String name = jsonNode.get("location").get("name").asText();
            String description = jsonNode.get("location").get("description").asText();

            Location location = new Location(name, description);

            JsonNode entitiesArray = jsonNode.get("location").get("entities");
            for (JsonNode entityNode : entitiesArray) {
                Iterator<Map.Entry<String, JsonNode>> fields = entityNode.fields();
                while (fields.hasNext()) {
                    Map.Entry<String, JsonNode> entry = fields.next();
                    if (entry.getValue().isTextual() && entry.getValue().asText().contains("skeleton")) {
                        Skeleton skeleton = new Skeleton();
                        location.addEntity(skeleton);
                    }
                }
            }

            System.out.println(location.getName());
            System.out.println(location.getDescription());
            for (Object o : location.getLocation()) {
                if (o instanceof Entity) {
                    System.out.println("Skeleton name: " +((Entity) o).getName());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
