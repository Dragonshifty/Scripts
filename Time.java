import java.util.concurrent.ThreadLocalRandom;

public class Time {
    public void display(Script string){
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

    public void delay(int amount){
        try{
            Thread.sleep(amount);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
