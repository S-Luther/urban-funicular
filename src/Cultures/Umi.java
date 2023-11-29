package Cultures;

import java.util.*;
import App.Culture;

public class Umi implements Culture{

    Random r = new Random();

    public stance strategy(){
        if(r.nextBoolean()){
            return stance.AGGRESSIVE;
        }
        else {
            return stance.DEFENSIVE;
        }
    }

    public stance diplomacy(){
        return stance.BALANCED;
    }



}