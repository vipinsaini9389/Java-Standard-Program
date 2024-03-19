//java Program to determine whether a given string is palindrome
class palindrome{
    public static void main(String[] args){
        String str = "NAMAN";
        int start = 0;
        int end = str.length()-1;
        int flag=1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end))
                flag=0;
            start++;
            end--;
        }
        if(flag==1)
            System.out.print("Palindrome");
        else
            System.out.print("Not Palindrome");
    }
}