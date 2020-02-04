
public class BankAccount{
    private double accountBalance;
    private Address address;
    private AccountType accountType;
    private static long INITIAL_ACCOUNT_ID_VALUE=10_000;
    private long accountId;
    public double deposit(double amount){
        accountBalance+=amount;
        return amount;
    }
    public double withdraw(double amount){
        boolean flag=true;
        switch(this.accountType){
            case SALARY_ACCOUNT: if(amount>this.accountBalance){
                                    flag=false;
                                 }
                                break;
            
            case CURRENT_ACCOUNT:if(this.accountBalance-amount<25_000){
                                    flag=false;
                                 }
                                break;
            case SAVINGS_ACCOUNT:if(this.accountBalance-amount<10_000){
                                    flag=false;
                                 }
                                break;
            
        }
        if(flag){
            this.accountBalance-=amount;
            return amount;
        }
        else
            return 0;
        
        
    }
    public double checkBalance(){
        return accountBalance;
    }

    public BankAccount(double initialAmount,AccountType accountType, Address address){
        switch(accountType){
            case SAVINGS_ACCOUNT:if(initialAmount>10_000){
                                    this.accountBalance=initialAmount;
                                }
                                else{
                                    this.accountBalance=10_000;
                                }
                                break;
            case CURRENT_ACCOUNT:if(initialAmount>25_000){
                                    this.accountBalance=initialAmount;
                                }
                                else{
                                    this.accountBalance=25_000;
                                }
                                break;
            case SALARY_ACCOUNT:this.accountBalance=initialAmount;
                                break;
        
        }
        
        
        this.accountId=++INITIAL_ACCOUNT_ID_VALUE;
        this.address=address;
        this.accountType=accountType;

    }
    public BankAccount(Address address){
        this.address=address;
        this.accountId=++INITIAL_ACCOUNT_ID_VALUE;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(AccountType accountType, Address address) {
        this.accountType=accountType;
        this.address = address;
    }

    public long getAccountId() {
        return accountId;
    }

   
  

   
}