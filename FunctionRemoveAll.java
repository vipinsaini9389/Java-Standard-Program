import java.util.ArrayList;
class FunctionRemoveAll{
    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(6);
        al2.add(7);
        al2.add(8);
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
		System.out.println(al);
		al.addAll(al2);
		System.out.println(al);
		al.removeAll(al2);
        System.out.println(al);
	}
}	