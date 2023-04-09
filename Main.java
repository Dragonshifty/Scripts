import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main{

    public static void display(Script string){
        char[] charArr = string.toString().toCharArray();
        for (char character : charArr){
            try{
                int rand = ThreadLocalRandom.current().nextInt(0,5);
                switch(rand){
                    case 0:
                        Thread.sleep(35);
                        break;
                    case 1:
                        Thread.sleep(50);
                        break;
                    case 2:
                        Thread.sleep(70);
                        break;
                    case 3:
                        Thread.sleep(80);
                        break;
                    case 4:
                        Thread.sleep(100);
                        break;
                }
            } catch (InterruptedException e){}
            System.out.print(character);
        }
    }

    public static void delay(int amount){
        try{
            Thread.sleep(amount);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        List<Script> scripts = new ArrayList<>();

        scripts.add(new Script("I must admit, I'm impressed..."));
        // scripts.add(new Script("Dog rocket, jumps, and leaves"));

        // scripts.add(new Script("Once upon a time, a dirty, stray cat ran up to the dog rocket and saw it leave, so jumped into the cat rocket and flew to the moon with the dog rocket."));
        

        scripts.add(new Script("I guess if you've got this far there has to be a reason.\n"));
        scripts.add(new Script("Well...\n"));
        scripts.add(new Script("Where to start?\n"));
        scripts.add(new Script("You wouldn't be my first choice for this. Did I say that before?\n"));
        scripts.add(new Script("Well, here we are.\n"));



        display(scripts.get(0));
        delay(2000);
        display(scripts.get(1));
        delay(2800);
        display(scripts.get(2));
        delay(1000);
        display(scripts.get(3));
        delay(1000);
        display(scripts.get(4));
        delay(1500);
        display(scripts.get(5));


        
        // for (int i = 0; i < scripts.size(); i++){
        //     display(scripts.get(i));
        //     System.out.println();
        // }
        // display(scripts.get(0));

        
    }
}