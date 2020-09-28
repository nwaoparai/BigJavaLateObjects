package chapter3;

import java.util.Scanner;

//French country names are feminine when they end with the letter e, masculine otherwise,
//except for the following which are masculine even though they end with e:
//	• le Belize
//	• le Cambodge
//	• le Mexique
//	• le Mozambique
//	• le Zaïre
//	• le Zimbabwe
//Write a program that reads the French name of a country and adds the article: le for
//masculine or la for feminine, such as le Canada or la Belgique.
//However, if the country name starts with a vowel, use l’; for example, l’Afghanistan.
//For the following plural country names, use les:
//	• les Etats-Unis
//	• les Pays-Bas


public class P3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);		
		System.out.print("Enter a country: ");
		String country = a.next();
		
		
		if(country.substring(country.length() - 1).equals("e")) {
			if (country.equals("Belize") || country.equals("Camboge") || country.equals("Mexique") || country.equals("Mozambique") || country.equals("Zaïre") || country.equals("Zimbabwe")) {
				System.out.print("le " + country);
			} else {
				System.out.print("la " + country);
			}			
		}
		
		if(country.substring(country.length() - 1).equals("s")) {
			System.out.print("les " + country);
		}
		
	}

}
