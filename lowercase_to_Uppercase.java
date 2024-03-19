 /*Java Program to replace lower-case characters with upper-case and vice-versa

 Change lowercase to Uppercase*/
class lowercase_to_Uppercase{
    public static void main(String[] args){
        String str = "Ram Is A Good Boy";
        String temp="";
        System.out.println("String : "+str);
        for(int a=0;a<str.length();a++){
            if((str.charAt(a)>=65)&&(str.charAt(a)<=90))
                temp=temp+((char)(str.charAt(a)+32));
            else
            if((str.charAt(a)>=97)&&(str.charAt(a)<=122))
                temp=temp+((char)(str.charAt(a)-32));
            else
                temp=temp+str.charAt(a);
        }
        System.out.println("String : "+temp);
    }
}