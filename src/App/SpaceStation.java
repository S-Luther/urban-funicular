package App;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

import App.Culture.stance;
import Cultures.Caltuplax;
import Cultures.Colariat;
import Cultures.Gregory;
import Cultures.Mangalore;
import Cultures.Ryloth;
import Cultures.Tolaxian;
import Cultures.Umi;
import Cultures.Valerian;
import Cultures.Yoshi;
import Cultures.Zerg;
import Cultures.Zolarian;

public class SpaceStation <T> {
    private String[][] map;
    private ArrayList<Thing> things = new ArrayList<>();
    private ArrayList<Being> Citizens = new ArrayList<>();
    private T Culture;
    private ArrayList<SpaceStation> neighbors = new ArrayList<>();
    private int Team;

    public SpaceStation(String s, T culture) throws FileNotFoundException {
        System.out.println(s + " Station created!");

        Culture = culture;

        populate(s);

    }

    private void populate(String s) throws FileNotFoundException{
                boolean go = true;

        int counter = 0;
        Random r = new Random();
        while(go){
            switch(r.nextInt(11)){
                case 0:
                    Citizens.add(new Being<Tolaxian>(s, new Tolaxian()));
                case 1:
                    Citizens.add(new Being<Zolarian>(s,new Zolarian()));
                case 2:
                    Citizens.add(new Being<Zerg>(s,new Zerg()));
                case 3:
                    Citizens.add(new Being<Valerian>(s,new Valerian()));
                case 4:
                    Citizens.add(new Being<Umi>(s,new Umi()));
                case 5:
                    Citizens.add(new Being<Ryloth>(s,new Ryloth()));
                case 6:
                    Citizens.add(new Being<Mangalore>(s,new Mangalore()));
                case 7:
                    Citizens.add(new Being<Colariat>(s,new Colariat()));
                case 8:
                    Citizens.add(new Being<Caltuplax>(s,new Caltuplax()));
                case 9:
                    Citizens.add(new Being<Gregory>(s,new Gregory()));
                case 10:
                    Citizens.add(new Being<Yoshi>(s,new Yoshi()));
            }
            counter++;
            if(counter > 10){
                go = false;
            }
        }
    }

    private void challenge(stance s){

    }

    public stance respond(){
        return null;
    }
}
