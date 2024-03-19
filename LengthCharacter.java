//Java Program to find the number of the words in the given text file
class LengthCharacter {
    public static void main(String[] args){
        String str = "ABCSGBAVSVABVSBAVVBS";
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]='-';
                }
            }
            if(arr[i]!='-')
            System.out.println("Length : "+count+" Of Character "+arr[i]);
        }
    }
}