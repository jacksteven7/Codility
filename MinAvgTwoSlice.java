class Solution {
        public int solution(int[] A) {
            int pos = 0; 
    		double res = Double.MAX_VALUE;
    		double v2,v3;
    		for (int i = 0; i < A.length; i++) {
    			try {
    				v2 = (A[i]+A[i+1])/2.0;
    				if(v2<res){
    					res = v2;
    					pos = i;
    				}
    				v3 = (A[i]+A[i+1]+A[i+2])/3.0;
    				if(v3<res){
    					res = v3;
    					pos = i;
    				}
    			} catch (Exception e) {
    			}
    		}
        	return pos;
    	}
}
