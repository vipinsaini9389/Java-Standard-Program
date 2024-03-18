 //Fibonacci Series in Java
 import java.util.Scanner;

 class  FibonacciSeries{
  public static void main(String [] args){
  int num,a=0,b=1,c;
    Scanner sc=new Scanner(System.in);
  System.out.println("Enter number: ");
	num = sc.nextInt();
  for (int i=1;i<=num;i++){
  System.out.println(a);
  c=a+b;
  a=b;
  b=c; 
   }
  }
}
