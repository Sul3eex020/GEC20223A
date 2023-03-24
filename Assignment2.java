package GEC20223A;
//Start
//Enter any number
//If number 40 or less
//Print You are young
//Stop
import java.util.Scanner;
public class Assignment2 {
	static int Number;
public static void main(String[] args) {
	getNumber();
}
public static void getNumber() {	
	System.out.println("Enter Number:");
	Scanner sc=new Scanner(System.in);
	Number=sc.nextInt();
	
	if(Number<=40)
	{
		System.out.println("You are young");
	}
	
}
}

