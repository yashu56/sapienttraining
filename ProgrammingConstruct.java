public class ProgrammingConstruct{

    public static void main(String[] args) {
        //for loop demo
         for (int index = 0; index < args.length; index++) {
                System.out.println("The Value of index is:"+args[index]);
         }

         if(args.length>0){
             System.out.println("Number of cities passed:"+args.length);
         }
         else{
            System.out.println("Please pass in atleast name of one city");
         }

         int value=args.length-1;
         while(value>=0){
             System.out.println("Printing the value using while loop: "+args[value]);
             --value;
         }
         
    }
}