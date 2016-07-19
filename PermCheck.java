import java.util.HashSet;
class Solution {
    public int solution(int[] A) {
        HashSet<Integer> nums = new HashSet<Integer>();
		for (int s = 0; s < A.length; s++) {
			if(A[s]>A.length) return 0;
			nums.add(A[s]);
		}
		if(nums.size()==A.length)
			return 1;
		return 0;
    }
}
