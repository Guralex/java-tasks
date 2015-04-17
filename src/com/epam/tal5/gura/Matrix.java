package com.epam.tal5.gura;

import java.util.Random;

public class Matrix {


	
	
public int[][] Init(String[] args){
		
		
		Random rand = new Random();
		
		int n=Integer.parseInt(args[0]);
		int[][] matr = new int[n][n];
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++) matr[i][j] = rand.nextInt(2*n) - rand.nextInt(n);
		
		return matr;
	}

public void Print(int [][] matr){
	
	for(int i=0;i<matr.length;i++)
		{
			for(int j=0;j<matr[i].length;j++) System.out.print(matr[i][j]+"\t");
			System.out.println();
			System.out.println();
		}
	
}

public void RowSort(int [][] matr){
	
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

public void moveUp(int [][] matr,int num){
	
	for(int a=0;a<num;a++){ 
	int [] temp = new int[matr.length];
	int i=0;
	temp=matr[0];
	for(;i<matr.length-1;i++) matr[i]=matr[i+1];
	
	matr[i]=temp;}
}

public void moveDown(int [][] matr,int num){
	
	for(int a=0;a<num;a++){ 
	
	int [] temp = new int[matr.length];
	
	temp=matr[matr.length-1];
	for(int i=matr.length-1;i>0;i--) matr[i]=matr[i-1];
	
	matr[0]=temp;}
}

public void moveRight(int [][] matr,int num){
	
	for(int a=0;a<num;a++){ 
	int temp;
	for(int i=0;i<matr.length-1;i++) 
	{
		temp = matr[i][matr[i].length-1];
		for(int j=matr[i].length-1;j>0;j--) matr[i][j]=matr[i][j-1];
		matr[i][0]=temp;
	}
	}
	
}

public void moveLeft(int [][] matr,int num){
	
	for(int a=0;a<num;a++){ 
	int temp;
	for(int i=0;i<matr.length-1;i++) 
	{
		int j=0;
		temp = matr[i][0];
		for(;j<matr[i].length-1;j++) matr[i][j]=matr[i][j+1];
		matr[i][j]=temp;
	}}
	
}

}
