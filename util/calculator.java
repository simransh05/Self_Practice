package in.example.util;
import java.util.Scanner;

import in.example.gemetory.*;
public class calculator{
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		double radius = sc.nextDouble();
		long length = sc.nextLong();
		long width = sc.nextLong();
		circle areaCircle = new circle(radius);
		Rectangle areaRec = new Rectangle(length,width);
		double calculate = (double) Math.PI*Math.pow(radius , 2);
		System.out.println(calculate);
		double cal = (double) length * width;
		System.out.println(cal);
	}
}