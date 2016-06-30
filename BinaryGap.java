class Solution {
    public int solution(int N) {
        String num = Integer.toBinaryString(N);
        String zeros[] = num.split("1");
        int arraySize = num.charAt(num.length()-1) == '1' ?  zeros.length : zeros.length - 1;
        int maxSize=0;
        for(int i=0;i<arraySize;i++){ maxSize= maxSize < zeros[i].length() ? zeros[i].length() : maxSize; }
        return maxSize;
    }
}
