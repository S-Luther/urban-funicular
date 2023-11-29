package App;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Being <T> extends Entity{
    T Culture;
    ArrayList<Thing> items = new ArrayList<>();
    int[] personality = new int[3];

    public Being(String base, T culture) throws FileNotFoundException{
        Culture = culture;

        
        Random r = new Random();

        Scanner scan = null;
        
        try {
            scan = new Scanner(new BufferedReader(new FileReader("C:\\Users\\samuelluther\\Code\\SpaceBase\\src\\App\\name.txt")));

            scan.useDelimiter(",\\s*");

            int n = r.nextInt(4)+1;

            String name = "";

            for(int i = 0; i < n; i++){
                if(scan.hasNext()){
                    name = scan.next();
                }
            }

            System.out.println(name + " has entered the "+base+" base.");
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            scan.close();
        }
        


        
    }

}
