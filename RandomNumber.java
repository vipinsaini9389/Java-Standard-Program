//How to Generate Random Number in Java
import java.util.Random;
public class RandomNumber{
	public static void main(String []args){
		int number;
		Random random = new Random();
		number = random.nextInt();
		System.out.println("Generate Number is"+" "+number);
	}
}         	