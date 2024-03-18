//Sphenic Number in Java

import java.util.Scanner;
class Sphenic{
public static boolean Prime(int n){
 for(int i=2;i<=n/2;i++)
    if(n%i==0)
        return false;
 return true;
}
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter A Number : ");
 int num = sc.nextInt();
 int temp=num;
 int mul=1;
 int count=0;
 for(int m=2;m<=num;m++){
    if(num%m==0){
        if(Prime(m)){
        mul=mul*m;
        num=num/m;
        count++;a
        }
    }
        if(count==3)
            break;
 }
 if((temp==mul)&&(count==3))
    System.out.print("Sphenic");
 else
    System.out.print("Not Sphenic");
}
}
