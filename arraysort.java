import java.util.Arrays;

public class ArraySort {
  public static void main(String[] args){
  int arraySize, num;

  Scanner scan = new Scanner(System.in);
  System.out.println("Enter number of items to sort: ");
  arraySize = scan.nextInt();

  int[] array1 = new int[arraySize];

  System.out.println("Enter numbers to sort: ");
  for (int i = 0; i < arraySize; i++) 
        {
            array1[i] = scan.nextInt();
        }
  scan.close();
   

  for (int i=0; i < arraySize; i++){
    for (int j = i+ 1; j < arraySize; j++){
      if (array1[i] > array1[j]){
        num = array1[i];
        array1[i] = array1[j];
        array1[j] = num; 
      }
    }
  }

  System.out.println("The sorted array is: " );
  for (int i=0; i < arraySize; i++ ){
    System.out.print(array1[i]+ " ");
  }

}}

