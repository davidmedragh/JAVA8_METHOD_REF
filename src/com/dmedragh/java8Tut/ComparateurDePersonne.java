/**
 * 
 */
package com.dmedragh.java8Tut;

import java.util.Comparator;

/**
 * @author yacin
 *
 */
public class ComparateurDePersonne implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Personne p1 = (Personne)o1;
		Personne p2 = (Personne)o2;
		return p1.compareA(p2);
	}

}
