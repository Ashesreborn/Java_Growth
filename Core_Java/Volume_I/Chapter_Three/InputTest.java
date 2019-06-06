import java.util.*;

/**
* This program demonStrates console input.
* @version 1 2019-06-06
* @author Ashreborn
*/

public class InputTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//get first imput
		System.out.print("What is your name? ");
		String name = in.nextLine();

		//get second input
		System.out.print("How old are you? ");
		int age = in.nextInt();

		//didplay output on console
		System.out.println("Hello, " + name + ".Next year, you'll be " + (age + 1).);
	}
}