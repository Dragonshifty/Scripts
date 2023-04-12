import java.util.ArrayList;
import java.util.List;

public class TimePassing{
    List<Script> scripts = new ArrayList<>();
    List<Script> scripts2 = new ArrayList<>();
    Time time = new Time();

    public void passTime(){
        scripts.add(new Script("I must admit, I'm impressed..."));
        scripts.add(new Script("I guess if you've got this far there has to be a reason.\n"));
        scripts.add(new Script("Well...\n"));
        scripts.add(new Script("Where to start?\n"));
        scripts.add(new Script("You wouldn't be my first choice for this. Did I say that before?\n"));
        scripts.add(new Script("Well, here we are.\n"));
        scripts.add(new Script(" Obviously"));
        scripts.add(new Script("Perhaps not obviously"));

        
        scripts2.add(new Script("That was nuts!\n"));
        scripts2.add(new Script("What the flippity flop was that?!\n"));
        scripts2.add(new Script("What did you see?\n"));

        time.display(scripts.get(0));
        time.delay(2000);
        time.display(scripts.get(1));
        time.delay(2800);
        time.display(scripts.get(2));
        time.delay(1000);
        time.display(scripts.get(3));
        time.delay(1000);
        time.display(scripts.get(4));
        time.delay(1500);
        time.display(scripts.get(5));
        time.display(scripts.get(7));
        time.backSpace(scripts.get(7));
        // time.display(scripts.get(8));
        time.runTheNumbers(1000);
        time.fluctuate(500);

        System.out.println();

        time.display(scripts2.get(0));
        time.display(scripts2.get(1));
        time.display(scripts2.get(2));
    }
        
}