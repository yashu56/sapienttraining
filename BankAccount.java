public class BankAccount{
    double accountBalance;
    public double deposit(double amount){
        accountBalance+=amount;
        return accountBalance;
    }
    public double withdraw(double amount){
        if(amount>accountBalance){
            System.out.println("Insufficient Balance.");
        

        }
        else{
            accountBalance-=amount;
            //System.out.println(amount+" Withdrawn successfully");
         
        }
        return accountBalance;
        
    }
    public double checkBalance(){
        return accountBalance;
    }

}