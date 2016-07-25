class Solution {
    public int solution(int[] A) {
       	int zeros=0,res=0;
		for (int i : A){ 
			if (i== 0) zeros++; 
			else res += zeros;
			if(res>1000000000)
				return -1;
		}
		return res;
    }
}
