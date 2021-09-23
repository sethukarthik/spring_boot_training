package com.data_structure_problems.e_leet_code;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SmallerThanCurrent {
	
	@Test
	public void test_1() {
		int[] input = new int[] {8,1,2,2,3};
		int[] exptect = { 4,0,1,1,3 };
		assertArrayEquals(exptect,smallerThanCurrent(input));
	}
	
	@Test
	public void test_2() {
		int[] input = new int[] {7,7,7,7};
		int[] exptect = { 0,0,0,0 };
		assertArrayEquals(exptect,smallerThanCurrent(input));
	}
	
	@Test
	public void test_3() {
		int[] input = new int[] {6,5,4,8};
		int[] exptect = { 2,1,0,3 };
		assertArrayEquals(exptect,smallerThanCurrent(input));
	}

	public int[] smallerThanCurrent(int[] nums) {
		int[] bucket = new int[102];
        for(int i=0;i<nums.length;i++)        
            bucket[nums[i]+1]++;
        System.out.println(Arrays.toString(bucket));
        
        for(int i=0;i<101;i++)
            bucket[i+1] = bucket[i+1]+bucket[i];
        
        System.out.println(Arrays.toString(bucket));
        
        for(int i=0;i<nums.length;i++)
            nums[i] = bucket[nums[i]];
        System.err.println(Arrays.toString(nums));
        return nums;
	}
	
}