package App;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Being <T> extends Entity{
    public T Culture;
    ArrayList<Thing> items = new ArrayList<>();
    public int[] personality = new int[3];
    public String name;
    private Random r = new Random();
    private int happiness = 50;

    private int[][] enneagramCombos = {
                                        {1,4,7},
                                        {1,7,4},
                                        {2,4,8},
                                        {2,8,4},
                                        {3,6,9},
                                        {3,9,6},
                                        {4,1,2},
                                        {4,2,1},
                                        {5,7,8},
                                        {5,8,7},
                                        {6,9,3},
                                        {6,3,9},
                                        {7,1,5},
                                        {7,5,1},
                                        {8,2,5},
                                        {8,5,2},
                                        {9,3,6},
                                        {9,6,3},
                                    };
    private int[][] enneagramCompat = {
                                        {1,2,9},
                                        {2,4,8},
                                        {3,1,9},
                                        {4,2,9},
                                        {5,1},
                                        {6,8,9,2},
                                        {7,5,1},
                                        {8,2,9},
                                        {9,4,6}
                                        };
    private int[][] enneagramNonCompat = {
                                        {7},
                                        {},
                                        {},
                                        {8},
                                        {9},
                                        {},
                                        {},
                                        {4},
                                        {5}
                                        };

    public Being(String base, T culture){
        Culture = culture;

        personality = pickRandom(enneagramCombos);
        

        Scanner scan = null;
        
        try {
            scan = new Scanner(new BufferedReader(new FileReader("C:\\Users\\samuelluther\\Code\\SpaceBase\\src\\App\\name.txt")));

            scan.useDelimiter(",\\s*");

            int n = r.nextInt(3000)+1;

            name = "";
            for(int i = 0; i < n; i++){
                if(scan.hasNext()){
                    name = scan.next();
                    name = name.replace("\"" , "");
                }
            }
            

            System.out.println(name + " has entered the "+base+" base. They are of the "+ ((Culture) Culture).cultureName() + " Culture, and of the personality type: " + personality[0]);
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            scan.close();
        }
    }

    private <T> T pickRandom(T[] array){
        return array[r.nextInt(array.length)];
    }

    private boolean contains(int i, int[] a){
        for(int el : a){
            if(el == i){
                return true;
            }
        }
        return false;
    }

    void interact(Being b){
        if(contains(b.personality[0],enneagramCompat[personality[0]-1])){
            happiness = happiness + 1;
            System.out.println(name + " interacted with " + b.name + " and had a pleasant time. New Happiness is: "+happiness);
        }
        if(contains(b.personality[0],enneagramNonCompat[personality[0]-1])){
            happiness = happiness - 10;
            System.out.println(name + " interacted with " + b.name + " and had a dreadful time. New Happiness is: "+happiness);
        }
    }


    void strategy(){
            try {
                
                System.out.println(name+" is going to be " + ((Culture) Culture).strategy());
            } catch (Exception e) {
                // TODO: handle exception
            }
    }

}
