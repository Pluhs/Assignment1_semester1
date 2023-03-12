// -------------------------------------------------------
// Assignment 1
// Written by: Mohammed Al assad, 40252007
// For COMP 248 Section 2222-R – Fall 2022
// --------------------------------------------------------
// Opening the scanner so that the user can input using his keyboard
import java.util.Scanner;

public class A1_Q1 {
	
	public static void main(String[] args) {
		// ********************************************************************
		// This program allows the user to input p and q values such that the 
		// program gives the Cartesian coordinates of some stationary
		// astronomical objects/bodies in a 3D space and the coordinates of the 
		// nearest object.
		// ********************************************************************
		Scanner keyIn = new Scanner (System.in);
		// Prompting a message to welcome the user and to input his/her values
		System.out.println("Hello user, welcome to the Simple 3D-Space Program." );
		System.out.print("Please enter the values for 'p' and 'q', simultaneously: ");
		// Identifying what the values entered by the user represent, variable p and q.
		// I used byte and not int here, so the program will run into an exception when going over 127
		// as byte only store numbers up to 127
		byte p = keyIn.nextByte();
		byte q = keyIn.nextByte();
		// Identifying the different constants and variables and their formulas, so we can get the wanted coordinates
		final double e =  2.718281828;
		final double 𝜋 = (double) 22/7;
		double x1 = p * 𝜋 / e + 50;
		double y1 = p * 𝜋 / e + 50 * 12;
		double z1 = q + y1;
		double x2 = x1;
		double y2 = x1 * 12;
		double z2 = y2 * 6 + q; 
		// Displaying the x, y, and z-coordinates after processing the p and q values for the user to see the results
		System.out.println("\nThe Cartesian coordinates of the first object is: \n" + "(" +x1+ ", " +y1+", " +z1+ ")");
		System.out.println("The Cartesian coordinates of the nearest object is: \n" + "(" +x2+ ", " +y2+", " +z2+ ")");
		System.out.println("\nThank you for your contribution to this Space Project.");
		keyIn.close();
		}
	}
