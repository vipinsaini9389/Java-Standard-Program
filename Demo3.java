// Java Program to find maximum and minimum occurring character in a string
class Demo3{
    public static void main(String[] args){
        String str = "ABCD";
        String s = "CDBA";
        StringBuffer sb = new StringBuffer(str);
        String[] arr = new String[str.length()];
        for(int i=0;i<str.length();i++){
            String temp = str.substring(1)+str.charAt(0);
            arr[i]=temp;
            str = temp;
        }
        int flag=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i].equals(s))
                flag=1;
        if(flag==1)
            System.out.print("It is A Rotation");
        else
            System.out.print("It is Not A Rotation");
    }
} 