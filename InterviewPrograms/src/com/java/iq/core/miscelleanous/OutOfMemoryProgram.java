package com.java.iq.core.miscelleanous;

/**
 * JAVA program to create an out of memory exception
 * 
 * @author SrikarRao
 *
 */
public class OutOfMemoryProgram {
	public static void main(String[] args) throws Exception {
		OutOfMemoryProgram memoryTest = new OutOfMemoryProgram();
		memoryTest.generateOOM();
	}

	public void generateOOM() throws Exception {
		int iteratorValue = 20;
		System.out.println("\n=================> OOM test started..\n");
		for (int outerIterator = 1; outerIterator < 20; outerIterator++) {
			System.out.println("Iteration " + outerIterator + " Free Mem: "
					+ Runtime.getRuntime().freeMemory());
			int loop1 = 2;
			int[] memoryFillIntVar = new int[iteratorValue];
			do {
				memoryFillIntVar[loop1] = 0;
				loop1--;
			} while (loop1 > 0);
			iteratorValue = iteratorValue * 5;
			System.out.println("\nRequired Memory for next loop: "
					+ iteratorValue);
			Thread.sleep(1000);
		}
	}
}