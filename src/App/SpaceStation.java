package App;
import java.util.ArrayList;

import App.Culture.stance;

public class SpaceStation <T> {
    private String[][] map;
    private ArrayList<Thing> things = new ArrayList<>();
    private ArrayList<Being> Citizens = new ArrayList<>();
    private T Culture;
    private ArrayList<SpaceStation> neighbors = new ArrayList<>();
    private int Team;

    public SpaceStation(String s, T Culture) {
        System.out.println(s + " Station created!");
    }

    private void challenge(stance s){

    }

    public stance respond(){
        return null;
    }
}
