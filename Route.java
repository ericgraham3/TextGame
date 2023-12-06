import java.util.ArrayList;

public class Route {
    private ArrayList<Location> connectedLocations = new ArrayList<>();

    public ArrayList<Location> getConnectedLocations() {
        return connectedLocations;
    }

    public void addLocation(Object... location){
        for (Object o : location) {
            if (!(o instanceof Location)) {
                throw new RuntimeException("Not a location");
            }
            else {
                this.connectedLocations.add((Location)o);
            }
        }
    }

}
