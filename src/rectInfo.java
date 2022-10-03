import java.util.*;

public class rectInfo

{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        double l,b;

        System.out.print("Enter length of rectangle:   ");

        l = scanner.nextDouble();

        System.out.print("Enter breadth of rectangle:  ");

        b = scanner.nextDouble();



        if(l < 0 || b < 0 )

            System.out.println("Error: Bad Input!!");

        else

        {

            System.out.println("Perimeter of rectangle:     "+ (2*(l+b))+" Unit " );

            System.out.println("Area of rectangle:          "+l*b+" Unit square");

            System.out.println("Diagonal of rectangle:      " + (Math.sqrt( Math.pow(l,2) + Math.pow(b,2) ) )+" Unit" );

        }

    }

}