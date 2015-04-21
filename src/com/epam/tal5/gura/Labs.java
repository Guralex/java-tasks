package com.epam.tal5.gura;

public class Labs {

	public void invert(int[] arr) { // ----OK
		for (int k = arr.length / 2; k >= 0; k--) {
			int tmp = arr[k];
			arr[k] = arr[arr.length - k - 1];
			arr[arr.length - k - 1] = tmp;
		}
	}

	public int[] merge(int[] fst, int[] snd) { // ---OK
		int[] result = new int[fst.length + snd.length];
		int fstIndex = 0;
		int sndIndex = 0;
		int index = 0;
		while (index != result.length) {
			if (fstIndex < fst.length && sndIndex < snd.length) {
				if (fst[fstIndex] < snd[sndIndex]) {
					result[index++] = fst[fstIndex++];
				} else {
					result[index++] = snd[sndIndex++];
				}
			} else {
				if (fstIndex < fst.length) {
					System.arraycopy(fst, fstIndex, result, index,
							result.length - index);
					break;
				} else {
					System.arraycopy(snd, sndIndex, result, index,
							result.length - index);
					break;
				}
			}
		}
		return result;
	}

	public void bsort(int[] arr) {// --OK
		for (int barrier = 0; barrier < arr.length; barrier++) {
			for (int index = barrier; index > 0; index--) {
				if (arr[index - 1] > arr[index]) {
					int tmp = arr[index];
					arr[index] = arr[index - 1];
					arr[index - 1] = tmp;
				}
			}
		}
	}

	public void selsort(int[] arr) { // --OK
		{
			for (int barrier = 0; barrier < arr.length; barrier++) {
				int minindex = barrier;
				for (int index = barrier + 1; index < arr.length; index++) {
					if (arr[index] < arr[minindex]) {
						minindex = index;
					}
				}
				int tmp = arr[minindex];
				arr[minindex] = arr[barrier];
				arr[barrier] = tmp;
			}
		}
	}

	public void inssort(int[] arr) {

		// -- Не работало, сколько не пробовал.Разберусь -дозалью

	}

	// ---matrix mul - look MATRIX.class

}
