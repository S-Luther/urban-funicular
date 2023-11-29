package Cultures;
import App.Culture;
import java.util.*;
import java.util.Random;
public class Yoshi implements Culture {
    Random r = new Random();
    public stance strategy() {
        if (r.nextBoolean()){
            return stance.BALANCED;
        } else{
            return stance.DEFENSIVE;
        }
    }
    public stance diplomacy(){
        return stance.DEFENSIVE;
    }
}