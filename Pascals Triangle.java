import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> arr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                arr.add((int) NcR(i, j));
            }
            list.add(arr);
        }
        return list;
    }

    public long NcR(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
}
