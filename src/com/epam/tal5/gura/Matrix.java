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

public void matrixPrint(int [][] matr){
	
	for(int i=0;i<matr.length;i++)
		{
			for(int j=0;j<matr[i].length;j++) System.out.print(matr[i][j]+"\t");
			System.out.println();
			System.out.println();
		}
	
}

public void matrixRowSort(int [][] matr){
	
	for (int k = 0; k < matr.length; k++)
	for (int i = 0; i < matr[k].length-1; i++){
        for (int j = i+1; j < matr[k].length; j++){
            if (matr[k][i] > matr[k][j]) {
                int t = matr[k][i];
                matr[k][i] = matr[k][j];
                matr[k][j] = t;
            }
        }
    }
}




}
