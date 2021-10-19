package homeworkweek7;
import java.util.Scanner;
public class LeapYearOrNot2 {

    public static void main(String[] args) {
            int year;

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter any year");
            year = scan.nextInt();

            boolean isLeap = false;
            scan.close();


            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            {
                System.out.println("leap year");
            }
            else{

                System.out.println("not a leap year");


            }

        }
    }

