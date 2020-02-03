public class CalculatorClient{
    public static void main(String[] args) {
        
        Calculator calculator=new Calculator();
        System.out.println("Sum is "+calculator.add(9, 5));
        System.out.println("Difference is "+calculator.substract(9, 5));
        System.out.println("Product is "+calculator.product(9, 5));
        System.out.println("Division is "+calculator.division(9, 5));
        System.out.println("Modulo is "+calculator.modulo(9, 5));
    }
}