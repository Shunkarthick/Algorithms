package ds.executables;

import ds.sort.InsertionSort;

public class Execute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Integer input[] = {78,32,342,7,123,9,32,780,11,2,44,67};
		Integer input[] = {31,41,59,26,41,58};
		long startTime = printTime();
		InsertionSort.insertionSort(input);
		//InsertionSort.searchProblem(input, 71);
		System.out.println("Running time: "+(printTime() - startTime));
	}
	
	public static long printTime(){		
		return System.currentTimeMillis();		
	}
}
