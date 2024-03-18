//Java Program to Find GCD of Two Numbers
class GCD_or_HCF{
    public static void main(String[] args){
        int a = 12;
        int b = 16;
        int hcf = 1;
        for(int i=1;i<=a;i++)
            if((a%i==0)&&(b%i==0))
                hcf=i;
        System.out.print("HCF : "+hcf);
    }
}