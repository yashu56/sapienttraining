import java.util.Scanner;

public class BankAccountClient{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        int amount;
        BankAccount bankAccount=new BankAccount();
        while(flag){
            System.out.println("XYZ BANK SYSTEM:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Enter your Input:");
            int input=sc.nextInt();
            switch(input){
                case 1: System.out.println("Your Account Balance is :"+bankAccount.checkBalance());
                        break;
                case 2: System.out.println("Enter amount for deposit");
                        amount=sc.nextInt();
                        //System.out.println(amount+" deposited successfully.");
                        System.out.println("Updated Balance: "+ bankAccount.deposit(amount));
                        break;
                case 3: System.out.println("Enter amount for Withdraw");
                        amount=sc.nextInt();
                        bankAccount.withdraw(amount);
                        System.out.println("Updated Balance: "+bankAccount.accountBalance);
                        break;
                case 4: flag=false;
                        System.out.println("Thank you for Banking with us.");
                        break;
                default:flag=false; 
                        System.out.println("Invalid Input Transaction Failed.");


            }


        }
        sc.close();
    }
}