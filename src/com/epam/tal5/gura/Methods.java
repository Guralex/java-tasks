package com.epam.tal5.gura;

import java.util.Arrays;
import java.util.Random;

public class Methods {
	
	public int[] parseNum (int num )
	{
		
		int k=1,count=1;
		
		while(true){
			if(num/k>=10){count++;k*=10; continue;}
			else break;
		}
		
		int[] resmas = new int[count];
		
		for(int i = count-1; i >= 0; i--) {
            resmas[i] = num % 10;
            num = num / 10;
        }
		
			 
		
		return resmas;
	}
	
	public int[] parseArgs(String[] args){
		
		int[] mas = new int[args.length];
		for(int i=0;i<args.length; i++)
		{
			mas[i]=Integer.parseInt(args[i]);
		}
		
		return mas;
		
	}
	
	
	//-------TASK1
	
	//----1
	public String greet(String[] args){
		
		
		return "Hello,"+args[0];
	}
	//----2
	public String backorder(String[] args){
		
		String a="";
		for(int i=args.length-1;i>=0;i--)
			a+=args[i]+" ";
			
		return a;
	}
	//----3	
	public String randWithNewline(String[] args){
		
		String res="";
		int a = 0;
		a=Integer.parseInt(args[0]);
		
		Random rand=new Random();
		
		for(int i=0;i<a; i++)
			{res+=rand.nextInt(10); if(args.length>1)res+="\n"; }
		
		return res;
	}
	//----4
	public String checkPass(String[] args){
		
		System.out.println("Pass is 123");
		if(args[0].equals("123"))
			return "OK";
		
		return "Not OK";
	}
	
	
	//----6.1-6.4
	public void aLotOfTasks(String[] args){
		
		//----------------------------------
		int[] mas = parseArgs(args);
		
		//----6.1
		String res1="",res2="";
		for(int i=0;i<mas.length; i++)
		{
			if(mas[i]%2==0) res1+=args[i]+" ";	
			else res2+=args[i]+" ";
		}
		System.out.println("EVEN:"+res1);
		System.out.println("UNEVEN:"+res2);
		
		//----6.2
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<mas.length; i++)
		{
			if(mas[i]>max) max=mas[i];
			if(mas[i]<min) min=mas[i];
		}
		System.out.println("MAX:"+max);
		System.out.println("MIN:"+min);
	
		////----6.3-4
		String res3="",res4="";
		for(int i=0;i<mas.length; i++)
		{
			if(mas[i]%3==0 || mas[i]%9==0) res3+=mas[i]+" ";
			if(mas[i]%5==0 && mas[i]%7==0) res4+=mas[i]+" ";
		}
		System.out.println("DIV3or9:"+res3);
		System.out.println("DIV5%7:"+res4);
		
		
		
	}
	
	//----6.5-6.6	
	public void numberWork(String[] args){
	//-------------	
		int[] mas = parseArgs(args);
		
	//------------
		int[][] res = new int[mas.length][];
		
		for(int i=0;i<mas.length; i++)
		{
			res[i] = parseNum(mas[i]);
		}
		
		//System.out.println(Arrays.deepToString(res));
		
		String r="", r2="";
		
		//---samenumbers--
	
		for(int i=0;i<res.length; i++)
		{
			if(res[i].length!=3) continue;
			if(res[i][0]!=res[i][1] && res[i][0]!=res[i][2] && res[i][1]!=res[i][2] ) r+=args[i]+" ";
			
		}
		
		System.out.println("3-char NUMS w/0 eq elems- "+r);
		
		
		//---lucky numbers--
		
		for(int i=0;i<res.length; i++)
		{
			if(res[i].length%2!=0) continue;
			int a=0,b=0;
			for(int j=0;j<res[i].length/2; j++)	
			
			{
				a+=res[i][j];
				b+=res[i][res[i].length-j-1];
			}
				
				
				if(a==b)r2+=args[i]+" ";
			
		}
		System.out.println("LUCKY- "+r2);
		
		
	}

	//----6.7
	public void halfSum(String[] args){
		
		int[] mas = parseArgs(args);
		
		String res="";
		
		for(int i=1;i<mas.length-1; i++)
		{
			if(mas[i]==((mas[i-1]+mas[i+1])/2)) res+=mas[i]+" ";
		}
		
		System.out.println("HALFSUM - "+res );
	}


	
	//-------TASK2

	//----1
	public void shortAndLongNum(String[] args){
		
		int[] mas = parseArgs(args);
		
		int[][] res = new int[mas.length][];
		
		for(int i=0;i<mas.length; i++)
		{
			res[i] = parseNum(mas[i]);
		}
		
		int Min=Integer.SIZE, Max=0,indexMin=0,indexMax=0;
		
		for(int i=0;i<res.length; i++)
		{
			if(res[i].length<Min) {indexMin=i;Min=res[i].length ;}
			if(res[i].length>Max) {indexMax=i;Max=res[i].length ; }
			
		}
		
		System.out.println("THE LONGEST -" + mas[indexMax] + " LENGHT - "+ Max);
		System.out.println("THE SHORTEST -" + mas[indexMin] + " LENGHT - "+ Min);
		
		
	}
	
	//----2
	public void sortBySize(String[] args){
		
		int[] mas = parseArgs(args);
		int[][] res = new int[mas.length][];			
		
		
		for(int i=0;i<mas.length; i++)
		{
			res[i] = parseNum(mas[i]);
		}
		
		
		
		
		for (int i = 0; i < mas.length-1; i++){
	        for (int j = i+1; j < mas.length; j++){
	            if (res[i].length < res[j].length) {
	                int t = mas[i];
	                mas[i] = mas[j];
	                mas[j] = t;
	            }
	        }
	    }
		
		System.out.println("SORT " + Arrays.toString(mas));
	}

	
	
	
	
}
