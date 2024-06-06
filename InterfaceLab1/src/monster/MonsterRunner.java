package monster;

import java.util.Scanner;

public class MonsterRunner {
	
	public static void main(String [] args) {
		
		Scanner kb = new Scanner(System.in);
		String name = "";
		int age = 0;
		
		System.out.println("Enter Zombie's name: ");
		name = kb.next();	
		System.out.println("Enter Zombie's size: ");
		age = kb.nextInt();	
		Monster z = new Zombie(name,age);
		
		System.out.println("Enter Skeleton's name: ");
		name = kb.next();	
		System.out.println("Enter Skeleton's size: ");
		age = kb.nextInt();	
		Monster s = new Skeleton(name,age);
		
		
		System.out.println("Skeleton 1 - " + s.toString());
		System.out.println("Zombie 1 - " + z.toString());
		
		if(s.isBigger(z)) {
			System.out.println(s.getName() + " is bigger than " + z.getName() + ".");
		} else {
			System.out.println(s.getName() + " is smaller than " + z.getName() + ".");
		}
		
		
		if(s.sameName(z)) {
			System.out.println(s.getName() + " does have the same name as " + z.getName() + ".");
		} else {
			System.out.println(s.getName() + " does not have the same name as " + z.getName() + ".");
		}
		
		
		
	}
}
