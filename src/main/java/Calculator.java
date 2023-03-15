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

    static int findFactorial(int num) {
        logger.info("FACTORIAL OF "+ num);
        int ans = 1;
        for(int i=1;i<=num;i++)
            ans*=i;
        logger.info("RESULT "+ans);
        return ans;

    }

    static double findLog(double num) {
        logger.info("LOG OF "+num);
        double ans = Math.log(num);
        logger.info("RESULT "+ans);
        return ans;
    }

    static double findPower(double base, double exponent) {
        logger.info("BASE "+base + " | EXPONENT "+exponent);
        double ans = Math.pow(base,exponent);
        logger.info("RESULT "+ans);
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
                    System.out.println("Enter a non-negative integer whose factorial you want:");
                    int input = sc.nextInt();
                    if(input<0){
                        System.out.println("Factorial is not applicable to the given input\n");
                        break;
                    }
                    int ans = findFactorial(input);
                    System.out.println("Factorial of "+input+" is "+ans+"\n");;
                }
                break;
                case 3:{
                    // log
                    System.out.println("Enter a positive integer whose natural log is required:");
                    double input = sc.nextDouble();
                    if(input<=0){
                        System.out.println("Natural log is not applicable to the given input\n");
                        break;
                    }
                    double ans = findLog(input);
                    System.out.println("Natural log of "+input+" is "+ans+"\n");

                }
                break;
                case 4:{
                    // power
                    System.out.println("Enter the base number:");
                    double base = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Enter the exponent number:");
                    double exponent = sc.nextDouble();

                    double ans = findPower(base,exponent);
                    System.out.println(base+" raised to "+exponent+" is "+ans+"\n");

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
