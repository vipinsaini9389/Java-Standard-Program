//Java Program to determine whether two strings are the anagram

class Anagram{
    public static void main(String[] args){
        String str1 = "LISTEN";
        String str2 = "SILENT";
        StringBuffer sb = new StringBuffer(str1);
        int count=0;
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str1.length();j++){
                    if(str2.charAt(i)==sb.charAt(j)){
                        sb.setCharAt(j,'*');
                        count++;
                    }
                }
            }
            if(str2.length()==count)
                System.out.print("Anagram");
            else
                System.out.print("Not Anagram");
        }else{
            System.out.print("Not Anagram!");
        }
    }
}
