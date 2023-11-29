package Cultures;

import java.util.*;
import App.Culture;


public class Zolarian implements Culture{
    Random r = new Random();

    public stance strategy(){
        // return null;

        return stance.AGGRESSIVE;
    }

    public stance diplomacy(){
        // return null;

        return stance.BALANCED;
    }
}