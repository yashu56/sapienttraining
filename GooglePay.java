public class GooglePay implements PaymentGateway{

    @Override
    public void pay(String from, String to, double amount, String comments) {
        System.out.println("paid "+amount+" from "+from+" to "+to+" comments: "+comments+" using Google Pay");

    }

    @Override
	public void acceptPayment(String from, String to, double amount) {
		System.out.println("Accepting payment from"+ from+"to"+to+" using Google Pay");
		
    }
}