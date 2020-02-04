public class PaymentGatewayClient{
    public static void main(String[] args) {
        PaymentGateway gateway=new GooglePay();
        if(args[0]=="1"){
            gateway=new GooglePay();
        }else{
            gateway=new PhonePe();
        }
        gateway.pay("Kiran","Vinay",2000,"Transfering money");
    }
   
}