public class Overloading{
    public long sum(int a ,long b){
        System.out.println("int and long");
        return a+b;
    }
    public long sum(long a ,int b){
        System.out.println("long and int ");
        return a+b;
    }
    public int sum(int a ,int b){
        System.out.println("both int");
        return a+b;
    }

    public static void main(String[] args) {
        Overloading overloading=new Overloading();
        overloading.sum(10, 12);
    }
}