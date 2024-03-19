/*Java Program to separate the Individual Characters from a String


Remove Specific Character From A String*/

import java.util.Scanner;
class RemoveSpecificCharacter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "AMANKUMAR";
        String temp = "";
        System.out.println("String : "+str);
        System.out.print("Enter A Character : ");
        char ch = sc.next().charAt(0);
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)!=ch)
                temp=temp+str.charAt(i);
        System.out.print("New String : "+temp);
    }
}