package Cultures;

import App.Culture;
import java.util.Random;

public class Colariat implements Culture{
    Random r = new Random();
    public stance strategy(){
        if(r.nextBoolean()){
            return stance.AGGRESSIVE;
        }
        else{
            return stance.BALANCED;
        }
        
    }
    public stance diplomacy(){
        if(r.nextBoolean()){
            return stance.BALANCED;
        }
        else{
            return stance.DEFENSIVE;
        }
         
    }
}