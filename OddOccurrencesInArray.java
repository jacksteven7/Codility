class Solution {
    public int solution(int[] A) {
       	int unpaired = 0;
		for (int i : A) {
			unpaired ^= i;
		}
		return unpaired;
    }
}
