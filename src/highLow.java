import java.util.*;

public class highLow

{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();



        int n,r;

        r = random.nextInt(11)+1;

        System.out.print("Guess a number: ");

        n = scanner.nextInt();



        System.out.println("Random number: "+r);

        if(n<r)

            System.out.println("Low!!");

        else if(n>r)

            System.out.println("High!!");

        else

            System.out.println("Equal!!");







    }

}