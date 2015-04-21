package com.epam.tal5.gura;

import java.util.Random;

public class Matrix {

	// ----9
	public int[][] Init(String[] args) {

		Random rand = new Random();

		int n = Integer.parseInt(args[0]);
		int[][] matr = new int[n][n];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				matr[i][j] = rand.nextInt(2 * n) - rand.nextInt(n);

		return matr;
	}

	public void Print(int[][] matr) {

		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++)
				System.out.print(matr[i][j] + "\t");
			System.out.println();
			System.out.println();
		}

	}

	// ---9.1
	public void RowSort(int[][] matr) {

		for (int k = 0; k < matr.length; k++)
			for (int i = 0; i < matr[k].length - 1; i++) {
				for (int j = i + 1; j < matr[k].length; j++) {
					if (matr[k][i] > matr[k][j]) {
						int t = matr[k][i];
						matr[k][i] = matr[k][j];
						matr[k][j] = t;
					}
				}
			}
	}

	// ------9-2
	public void moveUp(int[][] matr, int num) {

		for (int a = 0; a < num; a++) {
			int[] temp = new int[matr.length];
			int i = 0;
			temp = matr[0];
			for (; i < matr.length - 1; i++)
				matr[i] = matr[i + 1];

			matr[i] = temp;
		}
	}

	public void moveDown(int[][] matr, int num) {

		for (int a = 0; a < num; a++) {

			int[] temp = new int[matr.length];

			temp = matr[matr.length - 1];
			for (int i = matr.length - 1; i > 0; i--)
				matr[i] = matr[i - 1];

			matr[0] = temp;
		}
	}

	public void moveRight(int[][] matr, int num) {

		for (int a = 0; a < num; a++) {
			int temp;
			for (int i = 0; i < matr.length - 1; i++) {
				temp = matr[i][matr[i].length - 1];
				for (int j = matr[i].length - 1; j > 0; j--)
					matr[i][j] = matr[i][j - 1];
				matr[i][0] = temp;
			}
		}

	}

	public void moveLeft(int[][] matr, int num) {

		for (int a = 0; a < num; a++) {
			int temp;
			for (int i = 0; i < matr.length - 1; i++) {
				int j = 0;
				temp = matr[i][0];
				for (; j < matr[i].length - 1; j++)
					matr[i][j] = matr[i][j + 1];
				matr[i][j] = temp;
			}
		}

	}

	// ------9.3
	public void logestIncrStreak(int[][] matr) { // ----выглядит ужасно. но оно
													// работает

		int[] start = { 0, 0 }, maxstart = { 0, 0 };
		int streak = 1, maxstreak = 1;

		for (int i = 0; i < matr.length; i++)
			for (int j = 0; j < matr[i].length; j++) {
				if (j == matr[i].length - 1 && i == matr.length - 1)
					break;
				if (j == matr[i].length - 1 && i != matr.length - 1) {
					if (matr[i][j] < matr[i + 1][0]) {
						streak++;
						continue;
					}
				} else {
					if (matr[i][j] < matr[i][j + 1]) {
						streak++;
						continue;
					}
				}
				if (streak > maxstreak) {
					maxstreak = streak;
					maxstart[0] = start[0];
					maxstart[1] = start[1];
				}
				start[0] = i;
				start[1] = j;
				streak = 1;

			}

		int c = maxstreak, t = 0;

		for (int i = 0; i < matr.length; i++)
			for (int j = 0; j < matr[i].length; j++) {

				if (i == maxstart[0] && j == maxstart[1] + 1)
					t++;
				if (t == 1 && c > 0) {
					System.out.print(matr[i][j] + " ");
					c--;
				}

			}

		System.out.println("MAXstreak- " + maxstreak);

	}

	// ------9.5

	public void rotateNinety(int[][] matr) {

		for (int k = 0; k < matr.length / 2; k++) {
			for (int j = k; j < matr.length - 1 - k; j++) {

				int tmp = matr[k][j];
				matr[k][j] = matr[j][matr.length - 1 - k];
				matr[j][matr.length - 1 - k] = matr[matr.length - 1 - k][matr.length
						- 1 - j];
				matr[matr.length - 1 - k][matr.length - 1 - j] = matr[matr.length
						- 1 - j][k];
				matr[matr.length - 1 - j][k] = tmp;
			}
		}

	}

	// ------9.4

	public int sumFSEvenEl(int[][] matr) {

		int count, currsum, sum = 0;

		for (int i = 0; i < matr.length; i++) {
			currsum = 0;
			count = 0;
			for (int j = 0; j < matr[i].length; j++) {
				if (count == 2)
					break;
				if (matr[i][j] % 2 == 0) {
					count++;
					continue;
				}
				if (count == 1)
					currsum += matr[i][j];

			}
			if (count == 1)
				currsum = 0;
			System.out.println("Row" + i + " - " + currsum);
			sum += currsum;
		}

		return sum;
	}

	// ------9.6

	public void minusAverage(int[][] matr) {

		int aver;

		for (int i = 0; i < matr.length; i++) {
			aver = 0;
			for (int j = 0; j < matr[i].length; j++) {
				aver += matr[i][j];
			}
			aver = aver / matr[i].length;
			System.out.println("AVER=" + aver);
			for (int j = 0; j < matr[i].length; j++)
				matr[i][j] -= aver;
		}

	}

	// ------9.7

	public int[][] deleteZer(int[][] matr) { // //NOT OK =(

		int c = 0;
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				if (matr[i][j] != 0)
					break;
				if (j == matr[i].length - 1) {
					c++;
					matr[i][0] = -1;
				}
			}
		}
		int[][] newmatr = new int[matr.length - c][matr.length];
		for (int i = 0; i < matr.length; i++) {

			if (matr[i][0] != -1)
				for (int j = 0; j < matr[i].length; j++) {

					newmatr[i][j] = matr[i][j];

				}
		}

		return newmatr;

	}

	// ------9.8

	public void zeroToTheEnd(int[][] matr) {

		for (int i = 0; i < matr.length; i++)
			for (int j = 0; j < matr[i].length; j++) {

				if (matr[i][j] == 0) {

					for (int k = j; k < matr[i].length - 1; k++)
						matr[i][k] = matr[i][k + 1];
					matr[i][matr[i].length - 1] = 0;

				}

			}

	}

	public int[][] mMul(int[][] matr1, int[][] matr2) {

		if (matr1[0].length != matr2.length) {
			System.out.println("Error");
		}
		int[][] resultat = new int[matr1.length][matr2[0].length];
		for (int i = 0; i < matr1.length; i++) {
			for (int j = 0; j < matr2[0].length; j++) {
				resultat[i][j] = 0;
				for (int s = 0; s < matr1[0].length; s++) {
					resultat[i][j] += matr1[i][s] * matr2[s][j];
				}
			}
		}
		return resultat;
	}

}
