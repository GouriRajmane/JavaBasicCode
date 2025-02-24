import java.util.*;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter value a:");
		int a= sc.nextInt();
		
		System.out.print("Enter value b:");
		int b= sc.nextInt();
		System.out.print("Before Swapping:");
		System.out.println("a:"+a + "b:"+b);
		int t= a;
		 a = b;
		 b = t;
		 System.out.print("Afterr Swapping:");
		 System.out.println("a:"+a  + "b:"+b);
		
		/*
		int a=7, b=5;
		System.out.print("Before Swapping:");
		System.out.println("a:"+a + "b:"+b);
		int t= a;
		 a = b;
		 b = t;
		
		System.out.print("Afterr Swapping:");
		System.out.println("a:"+a  + "b:"+b);
		*/
		
	}

}
