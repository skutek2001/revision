import java.util.Random;

public class DiceRoller {
    Random rand;
    int number;
    DiceRoller(){
        //Random rand = new Random(); - local
        //int number = 0; - local
        rand = new Random();
        roll();
    }

    void roll(){
        number = rand.nextInt(6)+1;
        System.out.println(number);
    }
}
