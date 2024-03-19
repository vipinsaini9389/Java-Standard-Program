 //JavaProgram to print smallest and biggest possible palindrome word in a given string

class LongestPalindrome{
    public static boolean Palindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
    String str = "NAMAN CALLED MAM TO ASK QUESTION";
    String[] arr = str.split(" ");
    String max = "";
    String min = "";
    int count=0;
        for(int i=0;i<arr.length;i++){
            if(Palindrome(arr[i])){
                if(max.length()<arr[i].length()){
                max = arr[i];
                count++;
                }
                if(count==1)
                    min=arr[i];
                if(min.length()>arr[i].length())
                    min = arr[i];
            }
        }
        System.out.println("Longest Palindrome : "+max);
        System.out.println("Smallest Palindrome : "+min);
    }
}