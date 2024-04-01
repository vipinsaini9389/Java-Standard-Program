import java.util.ArrayList;
class Function{
    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(60);
        al2.add(70);
        al2.add(80);
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        al.addAll(al2);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        //al.removeAll(al2);
        //System.out.println(al);
        //al.retainAll(al2);
        //System.out.println(al);
        //al.clear();
        //System.out.println(al);
        System.out.println(al.isEmpty());
        System.out.println(al.size());
        System.out.println(al.contains(30));
        System.out.println(al.containsAll(al2));
    }
}