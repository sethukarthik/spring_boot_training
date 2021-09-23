package com.data_structure_problems.m_leet_code;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SpiralMatrix_54 {

	@Test
	public void test_1() {
		int[][] matrix = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};
		List<Integer> expected = Arrays.asList(1,2,3,6,9,8,7,4,5);
		assertEquals(expected, findMatrix(matrix));
	}
	
	@Test
	public void test_2() {
		int[][] matrix = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 }
		};
		List<Integer> expected = Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7);
		assertEquals(expected, findMatrix(matrix));
	}
	
	@Test
	public void test_3() {
		int[][] matrix = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }
		};
		List<Integer> expected = Arrays.asList(1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10);
		assertEquals(expected, findMatrix(matrix));
	}
	
	public List<Integer> findMatrix(int[][] matrix) {
		int rowBegin = 0;
		int rowEnd = matrix.length-1;
		int colBegin = 0;
		int colEnd = matrix[0].length-1;
		
		List<Integer> res = new ArrayList<>();
		
		while ( rowBegin <= rowEnd && colBegin <= colEnd) {
			for(int i=rowBegin; i <= colEnd; i++) {
				res.add(matrix[rowBegin][i]);
			}
			rowBegin++;
			for(int i = rowBegin; i <= rowEnd; i++) {
				res.add(matrix[i][colEnd]);
			}
			colEnd--;
			if(rowBegin <= rowEnd)
				for(int i = colEnd; i >= colBegin; i--) {
					res.add(matrix[rowEnd][i]);
				}
			rowEnd--;
			if(colBegin <= colEnd)
				for(int i = rowEnd; i >= rowBegin ; i--) {
					res.add(matrix[i][colBegin]);
				}
			colBegin++;
		}
		
//		System.out.println(res.toString());
		return res;
	}
	
}