import java.math.BigDecimal;
import java.math.RoundingMode;
class Solution {
    public int solution(int X, int Y, int D) {
        return new BigDecimal(((double)(Y-X)/D)).setScale(0, RoundingMode.UP).intValue();
    }
}
