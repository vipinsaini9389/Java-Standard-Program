//Java Program to determine whether a given string is palindrome
class demo2{
	public static void main(String []args){
		 String str = "madam";       
		 int flag=1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length()- i - 1)) {
                flag=0;
            }
        }

        if (flag==1) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
		
	}
}