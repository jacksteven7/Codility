class Solution {
    public int solution(int[] A) {
		int head = A[0];
		int tail = 0;
		for (int i = 1; i < A.length; i++) {
			tail += A[i];
		}
		
		int min = Math.abs(tail-head);
		for (int i = 1; i < A.length-1; i++) {
			head += A[i];
			tail -= A[i];
			min = Math.min(Math.abs(tail-head), min);
		}
		return min;
    }
}
