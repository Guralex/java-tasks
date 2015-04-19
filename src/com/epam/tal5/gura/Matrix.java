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

public void logestIncrStreak(int [][] matr){ //----????????????????
	
	int[] start={0,0};
	int streak=1,maxstreak=1;
	
	for (int i = 0; i < matr.length-1; i++)
		for (int j = 0; j < matr[i].length-1; j++){
			
			if(matr[i+1][j+1]>matr[i][j]) {streak++;continue;}
			
				if(streak>maxstreak){maxstreak=streak;start[0]=i+1;start[1]=j+1;}
				streak=1;
				
			
			
		}
	
	System.out.println("MAXstreak- "+ maxstreak+" Startfrom " + matr[start[0]][start[1]]);
	


			
}

public void rotateNinety(int [][] matr){
	
	for (int k=0; k<matr.length/2; k++) 
    {
        for (int j=k; j<matr.length-1-k; j++)
        {
          
            int tmp = matr[k][j];
            matr[k][j] = matr[j][matr.length-1-k];
            matr[j][matr.length-1-k] = matr[matr.length-1-k][matr.length-1-j];
            matr[matr.length-1-k][matr.length-1-j] = matr[matr.length-1-j][k];
            matr[matr.length-1-j][k] = tmp;
        }
    }
	
}

public int sumFSEvenEl(int [][] matr){
	
	int count,currsum,sum=0;
	
	for (int i = 0; i < matr.length; i++){
        currsum=0;
		count=0;
		for (int j = 0; j < matr[i].length; j++){
			if(count==2) break;
			if(matr[i][j]%2==0) {count++;continue;}
        	if(count==1) currsum+=matr[i][j];
        	
        }
		if(count==1)currsum=0;
		System.out.println("Row"+i+" - "+currsum);
		sum+=currsum;
	}
	
	return sum;
}

public void minusAverage(int [][] matr){
	
	int aver;
	
	for (int i = 0; i < matr.length; i++)
	{
		aver=0;
		for (int j = 0; j < matr[i].length; j++){
			aver+=matr[i][j];
			}
		aver=aver/matr[i].length;
		System.out.println("AVER="+aver);
		for (int j = 0; j < matr[i].length; j++)matr[i][j]-=aver;
	}
	
}

public void deleteZer(int [][] matr){ ////--------??????????????
	
	int[] rowtodel = new int[matr.length],celtodel = new int[matr.length];
	int c1=0,c2=0;
	for (int i = 0; i < matr.length; i++)
	{
		if(matr[i][i]!=0) continue;
		for(int j=0;j<matr[i].length;j++)
		{
			if(matr[i][j]!=0) break;
			if(j==matr[i].length-1) {rowtodel[c1]=i;c1++;}
		}
		for(int j=0;j<matr[i].length;j++)
		{
			if(matr[j][i]!=0) break;
			if(j==matr[i].length-1) {celtodel[c2]=i;c2++;}
		}
	}
	
	int [][]  newmat = new int[matr.length-c1][matr.length-c2];
	
	
}


}
