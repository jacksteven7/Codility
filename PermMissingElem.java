class Solution {
    public int solution(int[] A) {
        double n = A.length+1;
        double sum = (n*(n+1))/2;
        for (int i : A) sum -= i; 
        return (int)sum;
    }
}
