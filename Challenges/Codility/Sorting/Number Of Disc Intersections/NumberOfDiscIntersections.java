/*
We draw N discs on a plane. The discs are numbered from 0 to N − 1. An array A of N non-negative integers, specifying the radiuses of the discs, is given. The J-th disc is drawn with its center at (J, 0) and radius A[J].

We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and K-th discs have at least one common point (assuming that the discs contain their borders).

The figure below shows discs drawn for N = 6 and A as follows:

  A[0] = 1
  A[1] = 5
  A[2] = 2
  A[3] = 1
  A[4] = 4
  A[5] = 0


There are eleven (unordered) pairs of discs that intersect, namely:

discs 1 and 4 intersect, and both intersect with all the other discs;
disc 2 also intersects with discs 0 and 3.
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A describing N discs as explained above, returns the number of (unordered) pairs of intersecting discs. The function should return −1 if the number of intersecting pairs exceeds 10,000,000.

Given array A shown above, the function should return 11, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [0..2,147,483,647].
 */

 	public int solution1(int[] A) {
		int N = A.length;
		if (N < 2)
			return 0;
		// intervals stores the two elements : i - A[i] and i + A[i]
		long[][] intervals = new long[N][2];
		for (int i = 0; i < N; i++) {
			intervals[i][0] = (long) i - A[i];
			intervals[i][1] = (long) i + A[i];
		}
		// using the lambda expression to sort a two dimensional array by the
		// intervals left end in ascending order
		Arrays.sort(intervals, (long[] a, long[] b) -> Long.signum(a[0] - b[0]));
		int result = 0;
		for (int i = 0; i < N - 1; i++) {
			// using the intervals' right end as the key value of binary search
			long rightEnd = intervals[i][1];
			int binarySearchLeft = i + 1;
			int binarySearchRight = N - 1;
			int resultIndex = i;
			// using the binary search to find the number of intersections
			while (binarySearchLeft <= binarySearchRight) {
				int binarySearchMid = (binarySearchLeft + binarySearchRight) / 2;
				if (intervals[binarySearchMid][0] <= rightEnd) {
					resultIndex = binarySearchMid;
					binarySearchLeft = binarySearchMid + 1;
				} else
					binarySearchRight = binarySearchMid - 1;
			}
			// count the number of intersections
			result += (resultIndex - i);
			if (result > 10000000)
				return -1;
		}
		return result;
	}