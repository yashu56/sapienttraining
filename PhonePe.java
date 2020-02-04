public class PhonePe implements PaymentGateway{

    @Override
    public void pay(String from, String to, double amount, String comments) {
        System.out.println("paid "+amount+" from "+from+" to "+to+" comments: "+comments+" using PhonePe");

    }

    @Override
	public void acceptPayment(String from, String to, double amount) {
		System.out.println("Accepting payment from"+ from+"to"+to+" using PhonePe");
		
    }
}