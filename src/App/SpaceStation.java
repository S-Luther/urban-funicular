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
    Random r = new Random();

    public SpaceStation(String s, T culture){
        System.out.println(s + " Station created!");

        Culture = culture;

        populate(s);

    }

    private void populate(String s){
                boolean go = true;

        int counter = 0;
        
        while(go){
            switch(r.nextInt(11)){
                case 0:
                    Citizens.add(new Being<Tolaxian>(s, new Tolaxian()));
                    break;
                case 1:
                    Citizens.add(new Being<Zolarian>(s,new Zolarian()));
                    break;
                case 2:
                    Citizens.add(new Being<Zerg>(s,new Zerg()));
                    break;
                case 3:
                    Citizens.add(new Being<Valerian>(s,new Valerian()));
                    break;
                case 4:
                    Citizens.add(new Being<Umi>(s,new Umi()));
                    break;
                case 5:
                    Citizens.add(new Being<Ryloth>(s,new Ryloth()));
                    break;
                case 6:
                    Citizens.add(new Being<Mangalore>(s,new Mangalore()));
                    break;
                case 7:
                    Citizens.add(new Being<Colariat>(s,new Colariat()));
                    break;
                case 8:
                    Citizens.add(new Being<Caltuplax>(s,new Caltuplax()));
                    break;
                case 9:
                    Citizens.add(new Being<Gregory>(s,new Gregory()));
                    break;
                case 10:
                    Citizens.add(new Being<Yoshi>(s,new Yoshi()));
                    break;
            }

            Citizens.get(counter).strategy();
            
            counter++;
            if(counter > 10){
                go = false;
            }
        }
    }

    public void simulate(){
        for(Being b: Citizens){
            b.interact( Citizens.get(r.nextInt(Citizens.size())));
        }
    }


    public stance respond(){
        return null;
    }
}
