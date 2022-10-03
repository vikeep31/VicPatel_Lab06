import java.util.*;

public class fuelCost

{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        double n,e,p;

        System.out.print("Enter number of gallon of gas in the tank: ");

        n = scanner.nextDouble();

        System.out.print("Enter fuel efficiency in mile per gallon: ");

        e = scanner.nextDouble();

        System.out.print("Enter price per gallon: ");

        p = scanner.nextDouble();



        if(n < 0 || e < 0 || p < 0)

            System.out.println("Error: Bad Input!!");

        else

        {

            System.out.println("Cost of 100 mile: $"+ ((100/e)*p) );

            System.out.printf("Car can go about %.2f miles",(e*n));

        }

    }

}