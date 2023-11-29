package App;
import java.util.ArrayList;

public class Being <T> extends Entity{
    T Culture;
    ArrayList<Thing> items = new ArrayList<>();
    int[] personality = new int[3];

    public Being(T Culture){

    }

}
