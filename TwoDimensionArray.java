public class TwoDimensionArray{

    
    public static void main(String[] args) {
        int rowCount=4,colCount=4;
        int value=10;
        int twoDimensionArray[][]=new int[rowCount][colCount];
        
        initializeArray(value, twoDimensionArray, rowCount, colCount);
        printArray(twoDimensionArray, rowCount, colCount);
       

        
        
    }

    private static void initializeArray(int value,int twoDimensionArray[][],int rowCount,int colCount) {
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                twoDimensionArray[row][col]=value++;
            }
        }
        
    }

    private static void printArray(int twoDimensionArray[][],int rowCount,int colCount){
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
        System.out.print(twoDimensionArray[row][col]+"\t");
            }
        System.out.println();
        }
    }
}
