import java.util.Arrays;

public class ArraySort {
  public static void main(String[] args){
  int arraySize;
  //Changed placeholder from int num to String str
  String str;

  Scanner scan = new Scanner(System.in);
  System.out.println("Enter number of items to sort: ");
  arraySize = scan.nextInt();

//Array changed to type String
  String[] array1 = new String[arraySize];

//Changed prompt from numbers to strings
  System.out.println("Enter strings to sort: ");

//Missed entering Scanner input in main:
  for (int i=0; i < arraySize; i++){
    array1[i]=scan.nextLine();
  }
  scan.close();

  for (int i=0; i < arraySize; i++){
    for (int j = i+ 1; j < count; j++){
      if (array1[i] > array1[j]){
        str = array1[i];
        array1[i] = array1[j];
        array1[j] = str; 
      }
    }
  }

  System.out.println("The sorted array is: " );
  for (int i=0; i < arraySize; i++ ){
    System.out.print(array1[i]+ " ");
  }

}
}
