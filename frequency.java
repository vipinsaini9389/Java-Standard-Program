 //Java Program to find the frequency of each element in the array
class frequency{
    public static void main(String[] args){
        int[] arr = {2,5,2,5,6,4,3,5,2,8,5,4,3,5};
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=0;
                }
            }
            if(arr[i]!=0)
            System.out.println("Frequency of "+arr[i]+" is "+count);
        }
    }
}