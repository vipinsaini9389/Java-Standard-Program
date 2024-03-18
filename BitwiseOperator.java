 //Java Program to Swap Two Numbers Using Bitwise Operator
 class BitwiseOperator{
    public static void main(String[] args){
        int a = 5;        // 101
        int b = 7;        // 111
        a = a^b;        // 010 = 101^111
        b = a^b;        // 101 = 010^111
        a = a^b;        // 111 = 010^101
        System.out.println("A : "+a);
        System.out.println("B : "+b);

    }
}