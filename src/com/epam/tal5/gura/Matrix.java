package com.epam.tal5.gura;

import java.util.Random;

public class Matrix {

	
public int[][] matrixInit(String[] args){
		
		
		Random rand = new Random();
		
		int n=Integer.parseInt(args[0]);
		int[][] matr = new int[n][n];
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++) matr[i][j] = rand.nextInt(2*n) - rand.nextInt(n);
		
		return matr;
	}
	
}
