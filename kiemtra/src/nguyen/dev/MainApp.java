package nguyen.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class MainApp {
	static final String FILE = "input.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> pL = new ArrayList<>();
		readFromFile(FILE, pL);
		print(pL);
		sort(pL);
		print(pL);
		maxSalary(pL);
	}
//  Lương cao nhất
	private static void maxSalary(ArrayList<Person> pL) {
		// TODO Auto-generated method stub
		System.out.println("<----------------------->");
	    System.out.println("Luong cao nhat : " + pL.get(pL.size() - 1).getName());
	}
// Lương tăng dần
	private static void sort(ArrayList<Person> pL) {
		// TODO Auto-generated method stub
		System.out.println("<----------------------->");
		System.out.println("Luong Tang theo thu tu : ");
		Collections.sort(pL, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				if (o1.getSalary() > o2.getSalary()) {
	                return 1;
	            } else if (o1.getSalary() < o2.getSalary()) {
	                return -1;
	            } else {
	                return 0;
	            }
	        }
	    });
	}

	private static void print(ArrayList<Person> pL) {
		// TODO Auto-generated method stub
		for (Person person : pL) {
			System.out.println(person.toString());
		}
	}

	private static void readFromFile(String file, ArrayList<Person> pL) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fstream = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String line;
			
			while ((line = br.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, ":");
				String name = tokenizer.nextToken();
				int age = Integer.parseInt(tokenizer.nextToken());
				String city = tokenizer.nextToken();
				double wage = Double.parseDouble(tokenizer.nextToken());
				Person person = new Person(name, age, city, wage);
				pL.add(person);
			}
		} catch (Exception e) {

		}
	}

}
