package array;

import java.util.Scanner;

public class ArrayString {

	
	static String product[] = new String[5];
	static double cost[] = new double[5];
	static double sum=0;
	static int n;
	public static void main(String[] args) {
		
		
		Scanner sn= new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter number of items shoped: ");
		n=s.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter the product name: ");
			
				product[i] = sn.nextLine();

			System.out.print("Enter the cost: ");
			cost[i] = s.nextDouble();
			sum=sum+cost[i];
			
		}

		System.out.println("====================");
		System.out.println("Product " + " " + "Cost");
		System.out.println("-------" + " " + "-------");

		for (int i = 0; i < n; i++) {
			System.out.println(product[i] + "    " + cost[i]);
		}
		System.out.println("====================");
		System.out.println("Total= "+sum+" rs");

	}
}
