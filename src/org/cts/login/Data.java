package org.cts.login; //Default package of java : java.lang

public class Data {

	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer("Greens");
		StringBuffer s2 = new StringBuffer("tech");

		System.out.println("Address of s1 : " + System.identityHashCode(s1));
		System.out.println("Address of s2 : " + System.identityHashCode(s2));

		s1 = s1.append(s2);
		System.out.println(s1);
		System.out.println("Address of new  s1 : " + System.identityHashCode(s1));

		
		System.out.println("tc1");
		System.out.println("tc2");
	}

}
