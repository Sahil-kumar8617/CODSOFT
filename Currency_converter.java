import java.util.Scanner;
import java.util.*;
public class Currency_converter{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to the Currency Converter.");
        System.out.println("Menu");
        System.out.println("1. USD to Rupees");
        System.out.println("2. Euro to Rupees");
        System.out.println("3. Rupees to USD");
        System.out.println("4. Rupees to Euro");
        System.out.println("Enter the choice below from ( 1 , 2, 3, 4):");
        int Choice = sc.nextInt();

        if(Choice==1){
            System.out.println("Enter the amount in USD:");
            double USD = sc.nextDouble();
            double Rupees = usdToRupees(USD);
            System.out.println("Your Converted amount in Rupees is : "+Rupees);

        }else if(Choice==2){
            System.out.println("Enter the amount in Euro:");
            double Euro = sc.nextDouble();
            double Rupees = EuroToRupees(Euro);
            System.out.println("Your Converted amount in USD is : "+Rupees);
            
        }else if(Choice==3){
            System.out.println("Enter the amount in Rupees:");
            double Rupees = sc.nextDouble();
            double USD = usdToRupees(Rupees);
            System.out.println("Your Converted amount in USD is : "+USD);
        }else if(Choice==4){
            System.out.println("Enter the amount in Rupees:");
            double Rupees = sc.nextDouble();
            double Euro = RupeesToEuro(Rupees);
            System.out.println("Your Converted amount in USD is : "+Euro);
        }
        else{
            System.out.println("Invalic Choice . Please select from 1,2,3,4");
        }
        sc.close();

    }
    public static double usdToRupees(double USD){
        return USD*83.47;
    }
    public static double EuroToRupees(double Euro){
        return Euro *89.10;
    }
    public static double RupeesToUSD(double Rupees){
        return Rupees*0.0119804;
    }
    public static double RupeesToEuro(double Rupees){
        return Rupees *0.0113;
    }


}