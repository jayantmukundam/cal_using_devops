import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    static double findSqrt(double num){
        logger.info("SQUARE ROOT OF "+ num);
        double ans = Math.sqrt(num);
        logger.info("RESULT "+ ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        System.out.println("Press enter to start");
        sc.nextLine();
        System.out.println("###### WELCOME #######\n");

        while(choice!=5){
            System.out.println("Enter the operation\n");
            System.out.println("1:Square root function\n2:Factorial\n3:Natural Log\n4:Power function\n5.Exit\n");
            choice = sc.nextInt();

            switch (choice){
                case 1:{
                    // square root
                    System.out.println("Enter the number whose square root you want:");
                    double input = sc.nextDouble();
                    double ans = findSqrt(input);

                    System.out.println("The square root of "+input+" is "+ans+".\n");
                }
                break;
                case 2:{
                    //factorial
                }
                break;
                case 3:{
                    // log
                }
                break;
                case 4:{
                    // power
                }
                break;
                case 5:{
                    System.out.println("Exiting...\n");
                }
                break;
            }
        }



    }
}
