package com.data_structure_problems.e_leet_code;

import java.util.Arrays;

public class flipImage {

	public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i < image.length; i++){
            int pointA = 0;
            int pointB = image[i].length-1;
            while(pointA <= pointB) {
            	if(image[i][pointA] == image[i][pointB]) {
            		image[i][pointA] = 1 - image[i][pointA];
            		image[i][pointB] = image[i][pointA];
            	}
            	pointA++;
            	pointB--;
            }
        }
        return image;
    }
	
	public static void main(String[] args) {
		flipImage img = new flipImage();
		
		int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
		img.flipAndInvertImage(image);
		
	}
	
}

//[1,1,0] -> [0,1,1] -> [1,0,0]
//[1,0,0]
//[0,1,0]
//[1,1,1]