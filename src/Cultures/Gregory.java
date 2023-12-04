package Cultures;

import App.Culture;
import java.util.Random;

public class Gregory implements Culture{
    Random r = new Random();
    public stance strategy(){
      if (r.nextBoolean()){
        return stance.AGGRESSIVE;
      }else{
        return stance.DEFENSIVE;
      }
    }
    public stance diplomacy(){
       return stance.BALANCED;
    }
    @Override
    public String cultureName() {
      return "Gregory";
    }
}