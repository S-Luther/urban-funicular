package Cultures;
import App.Culture;

public class Mangalore implements Culture{
    
     public stance strategy(){
        return stance.AGGRESSIVE;
    }
    public stance diplomacy(){
        return stance.AGGRESSIVE;
    }

    public String cultureName(){
        return "Mangalore";
    }
}