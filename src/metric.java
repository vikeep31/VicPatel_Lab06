import java.util.*;

public class metric

{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        double m;

        System.out.print("Enter measurement in meters:   ");

        m = scanner.nextDouble();



        if(m < 0 )

            System.out.println("Error: Bad Input!!");

        else

        {

            System.out.printf("Measurement in meters: %.2f Miles\n",(0.000621371*m));

            System.out.printf("Measurement in meters: %.2f Feet\n",(3.28084*m));

            System.out.printf("Measurement in meters: %.2f Inches\n",(39.3701*m));

        }

    }

}