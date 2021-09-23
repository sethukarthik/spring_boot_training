package com.data_structure_problems.e_leet_code;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;

public class GoodPair {

	
//	@Test
//	public void test_1() {
//		int[] nums = {1,2,3,1,1,3};
//		int output = 4;
//		assertEquals(output, goodPair(nums));
//	}
//	
//	@Test
//	public void test_2() {
//		int[] nums = {1,1,1,1};
//		int output = 6;
//		assertEquals(output, goodPair(nums));
//	}
//	
//	@Test
//	public void test_3() {
//		int[] nums = {1,2,3};
//		int output = 0;
//		assertEquals(output, goodPair(nums));
//	}
//	
//	@Test
//	public void test_4() {
//		int[] nums = {1};
//		int output = 0;
//		assertEquals(output, goodPair(nums));
//	}
	
	@Test
	public void test_5() {
		int[] nums = {2,1,3,2};
		int output = 1;
		assertEquals(output, goodPair(nums));
	}
	
	public int goodPair(int[] nums) {
//		int leftPair;
//		int output = 0;
//		
//		if(nums.length == 1) return output;
//		
//		for (int i = 0; i < nums.length; i++) {
//			leftPair = nums[i];
//			for (int j = i+1; j < nums.length; j++) {
//				if(leftPair == nums[j])
//					output += 1;
//			}
//		}
//		return output;
		
		int good_pair = 0;
		int[] freq = new int[101];
		
		for (int i = 0; i < nums.length; i++) {
			freq[nums[i]]++;
		}
		System.out.println(Arrays.toString(freq));
		for (int i = 0; i < 101; i++) {
			if(freq[i] > 1) {
				good_pair += ((freq[i]-1) * freq[i]) / 2;
			}
		}
		
		return good_pair;
	}
	
}