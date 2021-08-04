
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Random number = "+Math.random());
		System.out.println("PI ="+Math.PI);
		System.out.println("Largest Int = "+Integer.MAX_VALUE);
		System.out.println("Smallest Int = "+Integer.MIN_VALUE);
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter value x: ");
		try {
			int x = Integer.parseInt(r.readLine());
			System.out.print("Enter value y: ");
			int y = Integer.parseInt(r.readLine());
			System.out.println("x+y="+(x+y));
		} catch (NumberFormatException | IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}

