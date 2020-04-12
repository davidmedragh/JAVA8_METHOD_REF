/**
 * 
 */
package com.dmedragh.java8Tut;

import java.util.Arrays;

/**
 * @author dmedragh
 *
 */
public class Personne {
	private int age;

	/**
	 * @param age
	 */
	public Personne(int age) {
		super();
		this.age = age;
	}

	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	public int compareA(Personne g, Personne d) {
		return g.age - d.age;
		
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		Personne moi = new Personne(55);
		Personne elle = new Personne(50);
		Personne lui = new Personne(18);
		Personne lesGens[] = new Personne[3];
		lesGens[0] = moi;
		lesGens[1] = elle;
		lesGens[2] = lui;
		for (Personne p : lesGens) {
			System.out.println(p.getAge());
		}

		//old way before java 8 to compare 
		Arrays.sort(lesGens, new ComparateurDePersonne());
		for (Personne p : lesGens) {
			System.out.println(p.getAge());
		}

		// New way on java8
		Arrays.sort(lesGens, Personne::compareA);
		for (Personne p : lesGens) {
			System.out.println(p.getAge());
		}
		
	}


	public int compareA(Personne p2) {
		return this.age -p2.age;
	}

}
