package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int code = sc.nextInt();
			a.add(code);
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int code = sc.nextInt();
			b.add(code);
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int code = sc.nextInt();
			c.add(code);
		}
		
		//Union of the three sets, without repetition 
		a.addAll(b);
		a.addAll(c);
		
		System.out.println("Total studens: " + a.size());
		
		sc.close();
	}

}
