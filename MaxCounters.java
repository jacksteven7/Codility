class Solution {
    public int[] solution(int N, int[] A) {
        int[] nums = new int[N];
        int max=0;
        int maxCounter = 0;
        int minCounter = 0;
        for (int i = 0; i < A.length; i++) {
        	int num = A[i];
        	if(num==N+1){
		  minCounter=maxCounter;
		}else{
		  nums[A[i]-1] = Math.max(minCounter+1, nums[A[i]-1] + 1);
		  maxCounter = Math.max(nums[A[i]-1], maxCounter);
		}
        }
        for (int i = 0; i < nums.length; i++) {
	  nums[i] = Math.max(nums[i], minCounter);  
	}
        return nums;
    }
}
