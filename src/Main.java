import java.util.Scanner;

public class Main

{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        double c,f;

        System.out.print("Enter temperature in celsius: ");

        c = scanner.nextDouble();



        if(c < -273.15)

            System.out.println("Error: Bad Input!!");

        else

        {

            if(c == 0)

                System.out.println("Freezing point!!");

            else if(c == 100)

                System.out.println("Boiling point!!");



            f = (c*9)/5 +32;

            System.out.println(c+" degree celsius is "+f+" degree Fahrenheit");

        }

    }

}