package Cultures;
import java.util.*;
import App.Culture;

public class Zerg implements Culture{

    Random r = new Random();

    public stance strategy(){
        stance a;
        if(r.nextBoolean()){
            a = stance.AGGRESSIVE;
        } else {
            a = stance.DEFENSIVE;
        }
        return a;
    }
    public stance diplomacy(){
        stance a = stance.AGGRESSIVE;
        return a;
    }
    public String cultureName() {
        return "Zerg";
    }
}