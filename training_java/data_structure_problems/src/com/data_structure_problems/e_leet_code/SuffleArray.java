package com.data_structure_problems.e_leet_code;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SuffleArray {

	@Test
	public void test_1() {
		int[] nums = {2,5,1,3,4,7};
		int n = nums.length/2;
		int[] expected = {2,3,5,4,1,7};
		assertArrayEquals(expected, suffleArray(nums, n));
	}

	public int[] suffleArray(int[] nums, int n) {
		int[] firstSet = new int[n];
        int[] secondSet = new int[n];
        int[] sF = new int[2*n];
        
        for(int i=0; i < nums.length/2; i++){
	        firstSet[i] = nums[i];
	        secondSet[i] = nums[i+n];
        }
        int count = 0;
        for(int s : firstSet){
        	sF[count] = s;
        	count = count + 2;
        }         
        count = 1;
        for(int s : secondSet){
        	sF[count] = s;
        	count += 2;
        }       
        return sF;
	}

}