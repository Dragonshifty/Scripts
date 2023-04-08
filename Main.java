import java.util.ArrayList;
import java.util.List;
import javafx.concurrent.Task;

public class Main{

    public static void display(Script string){
        char[] charArr = string.toString().toCharArray();
        for (char character : charArr){
            try{
                Thread.sleep(50);
            } catch (InterruptedException e){}
            System.out.print(character);
        }
    }
    public static void main(String[] args){
        List<Script> scripts = new ArrayList<>();

        scripts.add(new Script("And so it begins"));
        scripts.add(new Script("Dog rocket, jumps, and leaves"));

        scripts.add(new Script("Once upon a time, a dirty, stray cat ran up to the dog rocket and saw it leave, so jumped into the cat rocket and flew to the moon with the dog rocket."));
        for (int i = 0; i < scripts.size(); i++){
            display(scripts.get(i));
            System.out.println();
        }
        // display(scripts.get(0));

        
    }
}