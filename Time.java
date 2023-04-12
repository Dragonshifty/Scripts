import java.util.ArrayList;
import java.util.List;
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

    public void backSpace(Script script){
        int charCount = script.toString().length();
        for (int i = 0; i < charCount; i++){
            try {
                Thread.sleep(100);
                System.out.println(("\b"));
            } catch (InterruptedException e){
            }
        }
    }

    public void runTheNumbers(int amount){
        for (int i = amount; i >= 0; i--){
            try {
                Thread.sleep(5);
                if (i == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + "\r");
                }
                
            } catch (InterruptedException e){

            }
        }
    }

    public void fluctuate(int time){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz          ";
        char[] charArr = alphabet.toCharArray();
        int alphaLength = charArr.length;

        for (int i = time; i >= 0; i--){
            List<String> list = new ArrayList<>();
                String temp = "";
                for (int j = 40; j >= 0; j--){             
                    int random = ThreadLocalRandom.current().nextInt(alphaLength -1);
                    temp += charArr[random];
                }
                // temp += "\r";
                list.add(temp);
                for (String string : list){
                    try {
                        Thread.sleep(5);
                        System.out.print(string + "\r");
                    } catch (InterruptedException e){
                        System.out.println(e);
                    }
                }
        }
    }
}