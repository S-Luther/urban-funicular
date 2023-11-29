package App;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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

public class App {

    static ArrayList<SpaceStation> Stations = new ArrayList<>();

    
    public static void main(String[] args) throws IOException {



        boolean go = true;

        int counter = 0;
        Random r = new Random();
        while(go){
            switch(r.nextInt(11)){
                case 0:
                    Stations.add(new SpaceStation<Tolaxian>("Tolaxian", new Tolaxian()));
                case 1:
                    Stations.add(new SpaceStation<Zolarian>("Zolarian", new Zolarian()));
                case 2:
                    Stations.add(new SpaceStation<Zerg>("Zerg", new Zerg()));
                case 3:
                    Stations.add(new SpaceStation<Valerian>("Valerian", new Valerian()));
                case 4:
                    Stations.add(new SpaceStation<Umi>("Umi", new Umi()));
                case 5:
                    Stations.add(new SpaceStation<Ryloth>("Ryloth", new Ryloth()));
                case 6:
                    Stations.add(new SpaceStation<Mangalore>("Mangalore", new Mangalore()));
                case 7:
                    Stations.add(new SpaceStation<Colariat>("Colariat", new Colariat()));
                case 8:
                    Stations.add(new SpaceStation<Caltuplax>("Caltuplax", new Caltuplax()));
                case 9:
                    Stations.add(new SpaceStation<Gregory>("Gregory", new Gregory()));
                case 10:
                    Stations.add(new SpaceStation<Yoshi>("Yoshi", new Yoshi()));
            }
            counter++;
            if(counter > 10){
                go = false;
            }
        }
    }
}
