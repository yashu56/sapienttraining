public class MethodCallStack{
    public static void main(String[] args) {
        System.out.println("Called before executing method 1");
        method1();
        System.out.println("Called after executing method 1");
    }
    public static void method1()
    {
        System.out.println("Called before executing method 2 from method 1");
        method2();
        System.out.println("Called after executing method 2 from method 1");
    }
    public static void method2(){
        System.out.println("Executing method 2 from method 1");
    }
}


/*output
before method1
before metod 2 from 1
2 from 1
aftre 2 from 1 
after 1

*/