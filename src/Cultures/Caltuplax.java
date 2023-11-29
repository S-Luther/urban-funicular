package Cultures;
import App.Culture;
import java.util.*;
import java.util.Random;
public class Caltuplax implements Culture{

    Random r = new Random();
    public stance diplomacy(){
        
        return stance.BALANCED;
    }

    public stance strategy(){

        return stance.AGGRESSIVE;
    }


}