public class CallByReference{
    public static void main(String[] args) {
        int primitiveValue=100;
        int[] intArray=new int[10];
        callbyValue(primitiveValue);
        System.out.println("The value of primitiveValue after execution: "+primitiveValue);
        callbyReference(intArray);
        System.out.println("The value of array element after execution: "+intArray[0]);
        }
    public static void callbyValue(int value){
        ++value;

    }
    public static void callbyReference(int[] arr){
            System.out.println("Within the callByReference method the value of array is: "+arr[0]);
            arr[0]+=15;
            System.out.println("Within the callByReference method the value of array after updation is: "+arr[0]);
    }
}