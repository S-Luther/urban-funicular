package Cultures;

import java.util.*;

import App.Culture;

public class Ryloth implements Culture{
    Random r = new Random();


    public stance strategy(){

            if(r.nextBoolean())
            {
                return stance.DEFENSIVE;
            }
            else{
                return stance.AGGRESSIVE;
            }
    }
    public stance diplomacy(){
            if(r.nextBoolean())
            {
                return stance.BALANCED;
            }
            else{
                return stance.AGGRESSIVE;
            }
    }
}