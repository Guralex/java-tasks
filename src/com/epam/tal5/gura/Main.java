package com.epam.tal5.gura;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Labs lab = new Labs();

		Methods met = new Methods();

		// Sort sort=new Sort();

		Matrix matr = new Matrix();

		int[][] m = matr.Init(args);
		int[][] testm = { { 8, 7, 6, 5 }, { 0, 0, 0, 0 }, { 10, 11, 6, 6 },
				{ 6, 6, 6, 6 } };

		// System.out.println(met.greet(args));

		// System.out.println(met.backorder(args));

		// System.out.println(met.randWithNewline(args));

		// System.out.println(met.checkPass(args));

		// met.aLotOfTasks(args);

		/*
		 * sorts int[] mas1 = {2,3,1,6,5,4}; int[] mas2 = {2,3,1,6,5,4}; int[]
		 * mas3 = {2,3,1,6,5,4}; int[] mas4 = {2,3,1,6,5,4}; int[] mas5 =
		 * {2,3,1,6,5,4}; System.out.println(Arrays.toString(mas1)); long bef =
		 * System.nanoTime(); sort.quickSort(mas1,0,5); long aft =
		 * System.nanoTime();
		 * System.out.println(Arrays.toString(mas1)+"QS TIME -"+(aft-bef));
		 * 
		 * bef = System.nanoTime(); sort.shellSort(mas2); aft =
		 * System.nanoTime(); System.out.println("SHELL TIME -"+(aft-bef));
		 * 
		 * bef = System.nanoTime(); sort.selSort(mas2); aft = System.nanoTime();
		 * System.out.println("SEL TIME -"+(aft-bef));
		 * 
		 * bef = System.nanoTime(); sort.injSort(mas2); aft = System.nanoTime();
		 * System.out.println("inj TIME -"+(aft-bef));
		 * 
		 * bef = System.nanoTime(); sort.bubbleSort(mas2); aft =
		 * System.nanoTime(); System.out.println("BUB TIME -"+(aft-bef));
		 */

		/*
		 * matr.Print(testm);
		 * System.out.println("-----------------------------");
		 * 
		 * matr.Print(matr.deleteZer(testm));
		 */

		met.varNumbers(args);
	}

}