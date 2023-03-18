package GEC20223A;
//Start
//Set value for name and age
//Print out name and age 
//Stop
import java.util.Scanner;
public class Assignment1 {
 static String name= "Suleiman";
 static int age= 20;

public static void main(String[] args) {
	printmyname();
	printmyage();
}
public static void printmyname(){
	System.out.println(name);
	Scanner sc=new Scanner(System.in);
	name=sc.nextLine();
}
public static void printmyage(){
	System.out.println(age);
	Scanner sc=new Scanner(System.in);
	age=sc.nextInt();	
}
}

