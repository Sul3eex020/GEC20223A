package GEC20223A;
import java.util.Scanner;
//Start
//Set value for name,department,state and Id.
//Print out name,department,state and Id
//Stop
public class Classwork1 {
	static String name= "Suleiman";
	static String department="Mechanical Engineering";
	static String state="Kebbi";
	static String Id="BU/22B/ENG/6820";

public static void main(String[] args) {
	getname();
	getdepartment();
	getstate();
	getId();
}
public static void getname() {
System.out.println(name);
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
}
public static void getdepartment() {
System.out.println(department);
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
}
public static void getstate() {
System.out.println(state);
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
}

public static void getId() {
System.out.println(Id);
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
}
}
