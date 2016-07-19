import java.util.HashSet;
class Solution {
    public int solution(int X, int[] A) {
   		HashSet<Integer> leaves = new HashSet<Integer>();
  		for (int s = 0; s < A.length; s++) {
  			leaves.add(A[s]);
  			if(leaves.size()==X) return s;
  		}
  		return -1;
    }
}
