//How to Create Object in Java

public class CreateObject {
    int x;

    // Constructor
    public CreateObject(int val) {
        x = val;
    }

    public static void main(String[] args) {
        // Create an object of CreateObject
        CreateObject obj = new CreateObject(100);

        // Accessing the object's variable
        System.out.println("Value of x: " + obj.x);
    }
}
