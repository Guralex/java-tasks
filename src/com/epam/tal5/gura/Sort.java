package com.epam.tal5.gura;

public class Sort {
	
	
	public void bubbleSort(int[] mas){
		
		for (int i = 0; i < mas.length-1; i++){
	        for (int j = i+1; j < mas.length; j++){
	            if (mas[i] < mas[j]) {
	                int t = mas[i];
	                mas[i] = mas[j];
	                mas[j] = t;
	            }
	        }
	    }
	}
	
	public void injSort(int[] mas){
		
		int cur,prevkey;
		
		for(int i=0;i<mas.length; i++)
		{
			cur=mas[i];
			prevkey=i-1;
			while(prevkey>=0 && mas[prevkey]>cur)
				{
					mas[prevkey+1]=mas[prevkey];
					mas[prevkey]=cur;
					prevkey--;
				}
			
		}
		
	}

	public void selSort(int[] mas){
		
		int min, temp;
		 
	    for (int index = 0; index < mas.length-1; index++){
	        min = index;
	        for (int scan = index+1; scan < mas.length; scan++)
	            if (mas[scan] < mas[min])
	                min = scan;
	 
	        // Swap the values
	        temp = mas[min];
	        mas[min] = mas[index];
	        mas[index] = temp;
	    }
		
	}

	public void shellSort(int[] mas){
		
		 int i, k, m=0 ;
		   int[] d = { 1, 4, 7, 12, 20 };
		   while (d[m] < mas.length) ++m;
		   while (--m >= 0){
		      k = d[m];
		      for (i = k; i < mas.length; i++){     
		        injSort(mas);
		      }
		   }
		
		
	}

	public void mergeSort(int[] mas){
		
		
		
	}


	int partition(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	void quickSort(int arr[], int left, int right) {
		
		
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}	
		
	
}
