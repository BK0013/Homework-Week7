package homeworkweek7;

import java.util.Scanner;

    public class OddOrEven1 {




            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                System.out.println("enter number");
                int number = input.nextInt();
                String result = number % 2 == 0 ? "Even" : "odd";
                System.out.println(number + " is " + result);

                input.close();

            }


        }