class Solution {
  public int[] solution(int[] A, int K) {
    if(A.length==0) return A;
    int[] part1 = new int[A.length-(K%A.length)];
    int[] part2 = new int[K%A.length];
    System.arraycopy(A, 0, part1, 0, part1.length);
    System.arraycopy(A, part1.length, part2, 0, part2.length);
    int[] c= new int[part1.length+part2.length];
    System.arraycopy(part2, 0, c, 0, part2.length);
    System.arraycopy(part1, 0, c, part2.length, part1.length);
    return c;
  }
}
