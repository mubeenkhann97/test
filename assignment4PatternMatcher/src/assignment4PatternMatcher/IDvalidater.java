package assignment4PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDvalidater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Mubeen Khan";
		char section = 'A';
		String myID = "FA16-BSE-029";

		String IDs[] = { "FA14-BSE-013-ATK", "SA16-BSC-019-ATK", "FA14-BSCS-013-LHR", "FA14-BSCS-000-ISD",
				"SP34-BSCS-999-ATK", "FA14-MCS-013-ATK", "SP29-ABC-013-ATK", "SP14-BSCS-011-WAH", "FA2019-BSE-210-ATK",
				"FA14-BS-013-ATK" };

		String semester = "(FA|SP)[1-2][0-9]";
		String program = "[A-Z]{3,4}";
		String stdID = "([0-9][0-9][1-9]|[0-9][1-9][0-9]|[1-9][0-9][0-9])";
		String campus = "(ATK|ISD|WAH)";

		String id = semester + "-" + program + "-" + stdID + "-" + campus;

		Pattern p = Pattern.compile(id);

		myInfo(name, section, myID);

		validateID(IDs, p);
	}

	static void validateID(String[] IDs, Pattern p) {

		System.out.println("Validations result is as follows :\n");

		for (int i = 0; i < IDs.length; i++) {
			Matcher m = p.matcher(IDs[i]);
			System.out.print(IDs[i] + "\t\t");
			if (m.find())
				System.out.print("Valid");
			else
				System.out.print("Invalid");
			System.out.println();
		}
	}

	static void myInfo(String name, char section, String myID) {
		System.out.println("Name : " + name);
		System.out.println("Section : " + section);
		System.out.println("Student Id : " + myID);
	}

}
