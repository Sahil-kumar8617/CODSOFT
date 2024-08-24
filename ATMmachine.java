import java.util.Scanner;
class ATM{
    float Balance;
    int pin=8617;
    public void checkpin(){
        System.out.println("Enter your PIN:");
        Scanner sc=new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==pin){
            menu();
        }
        else{
            System.out.println("Enter a Valid Pin");
            checkpin();
        }
    }


public void menu(){
    System.out.println("Enter your Choice: ");
    System.out.println("1. Check A/C Balance");
    System.out.println("2. Withdraw Money");
    System.out.println("3. Deposit Money");
    System.out.println("4. EXIT");

    Scanner sc=new Scanner(System.in);
    int opt=sc.nextInt();
    if(opt==1){
        checkBalance();
    }
    else if(opt==2){
        withdrawMoney();
    }
    else if(opt==3){
        depositMoney();
    }
    else if(opt==4){
        return;
    }
    else{
        System.out.println("Enter valid choice");

    }

}
     

public  void  checkBalance(){
     System.out.println("Balance:" + Balance);
     menu();
}
public void withdrawMoney(){
    System.out.println("Enter Amount to Withdraw:");
    Scanner sc=new Scanner(System.in);
    float amount=sc.nextFloat();
    if(amount>Balance){
    System.out.println("Insufficient balance");

}
else{
    Balance=Balance-amount;
    System.out.println("Money withdraw Successfuly");
}
menu();
}

public void depositMoney(){
    System.out.println("Enter the amount:");
    Scanner sc= new Scanner(System.in);
    float amount=sc.nextFloat();
    Balance=Balance+amount;
    System.out.println("Money deposited Succesfully");
    menu();
}


}

public class ATMmachine{
    public static void main(String[] args) {
         ATM obj = new ATM();
         obj.checkpin();

    }

}