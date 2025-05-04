/**
 * 
 */
package leetcode;

import java.util.*;

/**
 * @author kishanjaiswal
 * 
 * Leetcode problem - 1128
 * Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] 
 * if and only if either (a == c and b == d), or (a == d and b == c) - that is, one domino can be rotated to be equal to another domino.
 * Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].
 */
public class EquivalentDominoPair1128 {

	public static void main(String[] args) {
		int[][] domino1= {{1,2},{2,1},{3,4},{5,6}};
		int[][] domino2= {{1,2},{1,2},{1,1},{1,2},{2,2},{2,1}};
		int[][] domino3= {{2,1},{1,2},{1,2},{1,2},{2,1},{2,2},{2,1}};
		
		System.out.println("response1: " + numEquivDominoPairs(domino1));
		System.out.println("response2: " + numEquivDominoPairs(domino2));
		System.out.println("response3: " + numEquivDominoPairs(domino3));

	}
	
	//Ideal Response
	/**
	 * Approach: domino pair for a set: n*(n+1)/2
	 * Have minPair*10+Max so to create unique identifier for the domino set. get the count in hashmap.
	 * iterate and do: nCr(Combination formula)
	 * 
	 * Alternatively, get the sum while adding at the time of adding it to the map.
	 * @param dominoes
	 * @return
	 */
	public static int numEquivDominoPairs(int[][] dominoes) { 
		int response = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int[] each: dominoes ) {
			int a = Math.min(each[0], each[1]);
			int b = Math.max(each[0], each[1]);
			int key =a*10+b;
			response += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0)+1);
		}
		
		return response;
	}


}
