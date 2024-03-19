 /*Java program to print the following pattern 
1     1
 2   2
  3 3
   4
  3 3
 2   2
1     1  */

   class pattern8{
    public static void main(String[] args){
        int m=1;
        int n=1;
         for(int i=1;i<=7;i++){
             for(int j=1;j<=4;j++){
                if(m==j)
                    System.out.print(j);
                else
                    System.out.print(" ");
             }
         for(int k=3;k>=1;k--){
             if(m==k)
                    System.out.print(k);
                else
                    System.out.print(" ");
         }
             System.out.println();
             if(m==4)
                n=-1;
             m=m+n;
        }
    }
}