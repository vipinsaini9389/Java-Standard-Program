//Java Program to remove all the white spaces from a string

class remove_white_spaces{
    public static String RemoveSpace(String str){
        String temp = "";
        for(int a=0;a<str.length();a++)
            if(str.charAt(a)!=' ')
                temp=temp+str.charAt(a);
        return temp;
    }
    public static void main(String[] args){
        String str = "RAM IS A GOOD BOY";
        System.out.println("String : "+str);
        String NewStr = RemoveSpace(str);
        System.out.print("New String : "+NewStr);
    }
}