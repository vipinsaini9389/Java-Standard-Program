//Java Program to swap two string variables without using third or temp variable.
class Swapping{
    public static void main(String[] args){
        String s1 = "AMAN";
        String s2 = "KUMAR";
        System.out.println("S1 : "+s1);
        System.out.println("S2 : "+s2);

        s1 = s1+s2;
        s2 = s1.substring(0,s1.length()-s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("After Swapping");
        System.out.println("S1 : "+s1);
        System.out.println("S2 : "+s2);
    }
}