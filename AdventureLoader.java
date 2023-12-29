import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.File;
import java.io.IOException;

public class AdventureLoader {
    String filePath = "AdventureTest.json";

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
                Skeleton skeleton = new Skeleton();
                location.addEntity(skeleton);
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
