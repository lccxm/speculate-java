import java.util.Random;

public class Dado {

    private int num;

    public Dado(){
        num = 0;
    }

    public int joga(){
        Random random = new Random();
        return num = random.nextInt(6)+1;
    }

}
