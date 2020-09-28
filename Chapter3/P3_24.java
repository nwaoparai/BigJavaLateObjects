package chapter3;

import java.util.Scanner;

public class P3_24 {

//	Unit conversion. Write a unit conversion program that asks the users from which
//	unit they want to convert (fl. oz, gal, oz, lb, in, ft, mi) and to which unit they want to
//	convert (ml, l, g, kg, mm, cm, m, km). Reject incompatible conversions (such as gal
//	to km). Ask for the value to be converted, then display the result:
//	Convert from? gal
//	Convert to? ml
//	Value? 2.5
//	2.5 gal = 9462.5 ml
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter unit to convert from: fl, gal, oz, lb, in, ft, mi");
		Scanner a = new Scanner(System.in);		
		System.out.println("Convert from? ");
		String convertFrom = a.next();
		
		System.out.println("Enter unit to convert to: ml, l, g, kg, mm, cm, m, km");
		Scanner b = new Scanner(System.in);	
		System.out.println("Convert to? ");
		String convertTo = b.next();
		
		System.out.println("Value? ");
		Scanner c = new Scanner(System.in);	
		String value = c.next();
		
		if (convertFrom.equals("fl")) {
			if(convertTo.equals("ml")) {
				double newValue = Integer.parseInt(value) *  29.5735;
				System.out.println(value + " fl. oz = " + newValue + " ml");
			} else if(convertTo.equals("l")){
				double newValue = Integer.parseInt(value) *  0.0295;
				System.out.println(value + " fl. oz = " + newValue + " l");
			} else {
				System.out.println("Invalid input");
			}
		} else if (convertFrom.equals("gal")) {
			if(convertTo.equals("ml")) {
				double newValue = Integer.parseInt(value) *  3785.41;
				System.out.println(value + " gal = " + newValue + " ml");
			} else if (convertTo.equals("l")) {
				double newValue = Integer.parseInt(value) *  3.7854;
				System.out.println(value + " gal = " + newValue + " l");
			} else {
				System.out.println("Invalid input");
			}
		} else if (convertFrom.equals("oz")) {
			if(convertTo.equals("g")) {
				double newValue = Integer.parseInt(value) *  28.3495;
				System.out.println(value + " oz = " + newValue + " g");
			} else if (convertTo.equals("kg")) {
				double newValue = Integer.parseInt(value) *  0.0283;
				System.out.println(value + " oz = " + newValue + " kg");
			} else {
				System.out.println("Invalid input");
			}
		} else if (convertFrom.equals("lb")) {
			if(convertTo.equals("g")) {
				double newValue = Integer.parseInt(value) *  483.592;
				System.out.println(value + " lb = " + newValue + " g");
			} else if (convertTo.equals("kg")) {
				double newValue = Integer.parseInt(value) *  0.483;
				System.out.println(value + " lb = " + newValue + " kg");
			} else {
				System.out.println("Invalid input");
			}
		} else if (convertFrom.equals("in")) {
			if(convertTo.equals("mm")) {
				double newValue = Integer.parseInt(value) *  25.4;
				System.out.println(value + " in = " + newValue + " mm");
			} else if (convertTo.equals("cm")) {
				double newValue = Integer.parseInt(value) *  2.54;
				System.out.println(value + " in = " + newValue + " cm");
			} else if (convertTo.equals("m")) {
				double newValue = Integer.parseInt(value) *  0.0254;
				System.out.println(value + " in = " + newValue + " m");
			} else if (convertTo.equals("km")) {
				double newValue = Integer.parseInt(value) *  0.0000254;
				System.out.println(value + " in = " + newValue + " km");
			} else {
				System.out.println("Invalid input");
			}
		} else if (convertFrom.equals("ft")) {
			if(convertTo.equals("mm")) {
				double newValue = Integer.parseInt(value) *  304.8;
				System.out.println(value + " ft = " + newValue + " mm");
			} else if (convertTo.equals("cm")) {
				double newValue = Integer.parseInt(value) *  30.48;
				System.out.println(value + " ft = " + newValue + " cm");
			} else if (convertTo.equals("m")) {
				double newValue = Integer.parseInt(value) *  0.3048;
				System.out.println(value + " ft = " + newValue + " m");
			} else if (convertTo.equals("km")) {
				double newValue = Integer.parseInt(value) *  0.0003048;
				System.out.println(value + " ft = " + newValue + " km");
			} else {
				System.out.println("Invalid input");
			}
		} else if (convertFrom.equals("mi")) {
			if(convertTo.equals("mm")) {
				double newValue = Integer.parseInt(value) *  1609000;
				System.out.println(value + " mi = " + newValue + " mm");
			} else if (convertTo.equals("cm")) {
				double newValue = Integer.parseInt(value) *  160934;
				System.out.println(value + " mi = " + newValue + " cm");
			} else if (convertTo.equals("m")) {
				double newValue = Integer.parseInt(value) *  1609.34;
				System.out.println(value + " mi = " + newValue + " m");
			} else if (convertTo.equals("km")) {
				double newValue = Integer.parseInt(value) *  1.60934;
				System.out.println(value + " mi = " + newValue + " km");
			} else {
				System.out.println("Invalid input");
			}
		} else {
			System.out.println("Invalid input");
		}
	}

}
