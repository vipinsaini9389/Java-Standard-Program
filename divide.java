//Java Program to divide a string in 'N' equal parts
import java.util.Scanner;
class divide{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int len = str.length();
        System.out.println("String : "+str);
        System.out.print("Enter Equal Parts : ");
        int parts = sc.nextInt();
        if(parts<len){
            int NewStrLen = len/parts;
            for(int i=0;i<len;i++){
                if(i%NewStrLen==0)
                    System.out.println();
                System.out.print(str.charAt(i));
            }
        }else{
            System.out.println("Can Not Divide Into Parts");
        }
    }
}