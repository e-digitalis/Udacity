package googleResultat;

import java.io.InputStream;
import java.util.Scanner;


public class ScannerClass {


	public static void main(String[] args) {

		
		double radius;
		double diameter;
		double circumference;
		final double pi = Math.PI;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Can you please enter the radius?");
		radius = sc.nextDouble();
		
		diameter = radius*2;
		circumference = diameter*pi;
		
		System.out.println("Thank you! We can now calculate the diameter: "+diameter);
		System.out.println("We can also calculate the circumference: "+circumference);
		System.out.println("Lastly, we want to calculate the area: "+pi*radius*radius);
		
		sc.close();

	}

}
