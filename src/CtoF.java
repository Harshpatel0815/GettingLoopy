import java.util.Scanner;

public class CtoF
{
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            boolean done = false;
            double Cel = 0;
            double fahr = 0;
            String trash = "";

            done = false;
            do {
                System.out.print("Enter your temperature in Celsius: ");


                if (in.hasNextDouble())
                {
                    Cel = in.nextDouble();
                    in.nextLine();
                    fahr = (Cel * 1.8) + 32;
                    System.out.print("Your temperature in Fahrenheit would be " + fahr);
                    done = true;
                }

                else
                {
                    trash = in.nextLine();
                    System.out.println(trash + " is not a valid number");
                }

            }while (!done);
        }
}