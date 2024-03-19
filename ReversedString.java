// Reverse String in Java Word by Word

class ReversedString{
    public static void main(String[] args){
        String str = "RAMAN IS A GOOD BOY";
        System.out.println("String : "+str);
        String[] arr = str.split(" ");
        String rev = "";
        for(int j=0;j<arr.length;j++){
            String temp = arr[j];
            for(int i=temp.length()-1;i>=0;i--)
                rev=rev+temp.charAt(i);
            if(j<arr.length-1)
            rev = rev+" ";
        }
        System.out.print("Reversed String : "+rev);
    }
}