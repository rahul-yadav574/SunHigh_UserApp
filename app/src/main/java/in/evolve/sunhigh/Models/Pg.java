package in.evolve.sunhigh.Models;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Brekkishhh on 22-12-2016.
 */
public class Pg {

    private String pgName;
    private String pgLocation;
    private List<String> pgFacilities;
    private HashMap<String,String> pgChares;

    public Pg(String pgName, String pgLocation, List<String> pgFacilities, HashMap<String, String> pgChares) {
        this.pgName = pgName;
        this.pgLocation = pgLocation;
        this.pgFacilities = pgFacilities;
        this.pgChares = pgChares;
    }

    public String getPgName() {
        return this.pgName;
    }

    public void setPgName(String pgName) {
        this.pgName = pgName;
    }

    public String getPgLocation() {
        return this.pgLocation;
    }

    public void setPgLocation(String pgLocation) {
        this.pgLocation = pgLocation;
    }

    public List<String> getPgFacilities() {
        return this.pgFacilities;
    }

    public void setPgFacilities(List<String> pgFacilities) {
        this.pgFacilities = pgFacilities;
    }

    public HashMap<String, String> getPgChares() {
        return this.pgChares;
    }

    public void setPgChares(HashMap<String, String> pgChares) {
        this.pgChares = pgChares;
    }
}
