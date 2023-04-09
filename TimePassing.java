import java.util.ArrayList;
import java.util.List;

public class TimePassing {
    List<Script> scripts = new ArrayList<>();
    Time time = new Time();

    public void passTime(){
        scripts.add(new Script("I must admit, I'm impressed..."));
        scripts.add(new Script("I guess if you've got this far there has to be a reason.\n"));
        scripts.add(new Script("Well...\n"));
        scripts.add(new Script("Where to start?\n"));
        scripts.add(new Script("You wouldn't be my first choice for this. Did I say that before?\n"));
        scripts.add(new Script("Well, here we are.\n"));


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

    }
        
}
