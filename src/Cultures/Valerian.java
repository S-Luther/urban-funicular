package Cultures;

import java.util.*;

import App.Culture;

public class Valerian implements Culture{
    Random r = new Random();


    public stance strategy(){
        if (r.nextBoolean()) {
            return stance.AGGRESSIVE;
        } else {
            return stance.BALANCED;
        }
    }
    public stance diplomacy(){
        return stance.DEFENSIVE;
    }
}
