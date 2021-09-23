package com.data_structure_problems.e_leet_code;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class isMonotonic {

	@Test
	public void test_1() {
		int[] nums = {1,2,2,3};
		boolean expected = true;
		assertEquals(expected, isMonotonic(nums));
	}
	
	@Test
	public void test_2() {
		int[] nums = {6,5,4,4};
		boolean expected = true;
		assertEquals(expected, isMonotonic(nums));
	}
	
	@Test
	public void test_3() {
		int[] nums = {1,3,2};
		boolean expected = false;
		assertEquals(expected, isMonotonic(nums));
	}
	
	@Test
	public void test_4() {
		int[] nums = {1,1,1};
		boolean expected = true;
		assertEquals(expected, isMonotonic(nums));
	}
	
	public boolean isMonotonic(int[] nums) {
        int increment = 0;
        int decrement = 0;
        
        for(int i=0; i < nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                increment++;   
            }else if(nums[i] > nums[i+1]){
                decrement++;   
            }
        }
        if(increment != 0 && decrement != 0)
            return false;
        
        return true;
    }
	
}
