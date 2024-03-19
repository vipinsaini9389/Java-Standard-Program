  /*    Java program to print the following pattern on the console  
	  1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
 1 5 10 10 5 1  */
 
class pattern10{
    public static int Fact(int x){
        int f=1;
        for(int i=1;i<=x;i++)
            f=f*i;
        return f;
    }
    public static void main(String[] args){
        for(int i=0;i<6;i++){
            for(int k=6;k>i;k--)
                System.out.print(" ");
            for(int j=0;j<=i;j++)
                System.out.print(Fact(i)/(Fact(i-j)*Fact(j))+" ");
            System.out.println();
        }
    }
}