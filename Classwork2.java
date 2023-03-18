package GEC20223A;
import java.util.Scanner;
public class Classwork2 {

	public class Strings {
	    public static String greeting = "Hello. How are you?";
	    
	    public static String Txt ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    
	    public static String Txt1 = "Hello World";                     
	                                		
	    public static String Txt2 = "please locate where 'locate' occurs!";                          
	                                
	    public static String Txt3 ="We are the so-called \"Vikings\" from the north.";
	    
	    public static String Txt4 ="It\'s alright.";
	    
	    
	    public static String firstName = "Suleiman";
	    public static String lastName  = "Sanusi";
	    
	    public static void main(String [] args) {
	    	printHello();
	    	printLength();
	    	printTxt();
	    }
	    
	    public static void printHello() {
	    	System.out.println("please enter your preferred gretting");
	    	Scanner input = new Scanner(System.in);
	    	greeting = input.nextLine();
	    	
	    	System.out.println(greeting);
	    }
	    
	    public static void printLength() {
	    	System.out.println("The length of the string is " + greeting.length());
	    }
	    
	    public static void printTxt() {
	    	System.out.println("The length of the Txt is " + greeting.length());
	    	System.out.println(Txt1.toUpperCase());// Outputs "HELLO WORLD"
	    	System.out.println(Txt1.toLowerCase());// Outputs "HELLO WORLD")
	    	System.out.println(Txt2.indexOf("locate")); // Outputs 7
	    	System.out.println(firstName +" " + lastName);
	    	System.out.println(Txt3);
	    	System.out.println(Txt4);

	    }
	}
}


