// Java Program to Display Alternate Prime Number
class AlternatePrime{
    public static boolean Prime(int n){
        for(int j=2;j<=n/2;j++)
            if(n%j==0)
                return false;
        return true;
    }
    public static void main(String[] args){
        int m=2;
        for(int i=2;i<=500;i++){
            if(Prime(i))
                if(m%2==0){
                System.out.print(i+" ");
                m=m+1;
                }
                else
                    m=m+1;
    }
    }
}
