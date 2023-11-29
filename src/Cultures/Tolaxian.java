package Cultures;

import java.util.*;

import App.Culture;

public class Tolaxian implements Culture{
    Random r = new Random();


    public stance strategy(){

        if(r.nextBoolean())
        {
            return stance.DEFENSIVE;
        }
        else{
            return stance.BALANCED;
        }
        
    }
    public stance diplomacy(){
        return stance.BALANCED;
    }
}
