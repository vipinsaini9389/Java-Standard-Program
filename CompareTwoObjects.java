//How to Compare Two Objects in Java

public class CompareTwoObjects {
    private int value;

    public CompareTwoObjects(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        CompareTwoObjects obj1 = new CompareTwoObjects(100);
        CompareTwoObjects obj2 = new CompareTwoObjects(100);

        boolean areEqual = obj1.value == obj2.value;

        System.out.println(areEqual); // true, because obj1 and obj2 have the same value
    }
}
