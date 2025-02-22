package collections.list.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Runner {
	private static Scanner sc;
	public static void main(String[] args) {
			Person person = new Person();
			List<String> name = new ArrayList<String>();
			sc = new Scanner(System.in);
			System.out.println("Enter Names | Enter \"end\" to exit");
			while(true) {
				String input = sc.nextLine();
				if("end".equalsIgnoreCase(input)) {
					break;
				}
				name.add(input);
			}
			System.out.println("\nNames in Alphabetical order:");
			Set<String> names = person.nameInput(name);
			System.out.println(names);
		}
}

