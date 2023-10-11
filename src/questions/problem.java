/**
 * 
 */
package questions;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author Yashwanth
 *
 */
public class problem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new  Scanner(System.in);
		System.out.println("enter the number ");
		String s=scanner.nextLine();
		
		ArrayList<String> c=new  ArrayList<String>();
		c.add("zero");
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		c.add("six");
		c.add("seven");
		c.add("eight");
		c.add("nine");
		
		String ans="";
		StringTokenizer s1= new StringTokenizer(s);
		while(s1.hasMoreElements()) {
			String s2=(String) s1.nextElement();
			if(s2.equals("double")) {
				s2=(String) s1.nextElement();
				ans=ans+c.indexOf(s2)+c.indexOf(s2);
			}
			else if(s2.equals("triple")) {
				s2=(String) s1.nextElement();
				ans=ans+c.indexOf(s2)+c.indexOf(s2);
			}
			else {
				ans=ans+c.indexOf(s2);
			}
		}
		System.out.println(ans);
	}

}
