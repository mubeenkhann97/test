package add;

import java.util.Scanner;

public class CharSet {
	private String elements;
	//REP INVARIANT
	// Each char in a string must be saparated by a comma ","
	// elements must start and end with {};
	// ABRACTION FUNCTION
	//represent set of character {a,b,c}
	
	public CharSet() {
		this.elements = "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CharSet s = new CharSet();
		s.add('m');
		s.add('n');
		System.out.println(s.toString());
		s.add('o');
		System.out.println(s.contains('f'));
		System.out.println(s.size());
		System.out.println(s.toString());
		
	}

	private int size() {
		// TODO Auto-generated method stub
		return elements.length();
	}
		/** Check whether an element is present in a set or not
		 * 
		 * @param c element to check
		 * @return	true if present false otherwise
		 */
	private boolean contains(char e) {
		// TODO Auto-generated method stub
		return elements.contains(e+"");
	}

	private void add(char e) {
		// TODO Auto-generated method stub
		this.elements = elements.concat(Character.toString(e));
	}
	
	public String toString() {
		String s = "{";
		for (int i= 0;i<elements.length();i++) {
			s = s + "," +Character.toString(elements.charAt(i));
		}
		s = s + "}";
		return s;
	}

}
