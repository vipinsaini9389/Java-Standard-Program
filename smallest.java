 //Java Program to print the smallest element in an array
 public class smallest{

  public static void main(String args[]){
     int arr[] = {12,13,1,10,34,10};
     int min = arr[0];

     for(int i=0; i<arr.length; i++){
     
       if(min > arr[i]){
       
         min = arr[i];
       }

     }
    System.out.print(min); 
  }
 }