package com.data_structure_problems.e_leet_code;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/*
 * Pseudocode
 * 
 * candies - number of int[] as nums
 * extra candies - n
 * 
 * constrain
 * n == candies.length
 * 2 <= n <= 100 - Minimum array lenght is 2
 * candies capacity min 1 <= candies[i] <= 100
 * 1 <= extranCandies <= 50
 * 
 * sum the extraCandies to all the element of array
 * 
 * 
*/

public class NumberOfCandies {
	
	
	@Test
	public void test_1() {
		int[] candies = {4,2,1,1,2};
		int extraCandies = 1;
		List<Boolean> output = new ArrayList<>(Arrays.asList(true,false,false,false,false)); 
		assertEquals(output, kidwithCandies(candies, extraCandies));
	}

	public List<Boolean> kidwithCandies(int[] candies, int extraCandies) {
		int max = 0;
        int[] dupCandies = candies.clone();
        Arrays.sort(dupCandies); 
        max = dupCandies[dupCandies.length - 1];
        
        List<Boolean> result = new ArrayList<>();
        for(int c : candies){
            if( c + extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        System.out.println(result);
        return result;
	}
	
}