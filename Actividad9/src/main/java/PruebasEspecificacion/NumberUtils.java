package PruebasEspecificacion;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NumberUtils {
    public static List<Integer> add(List<Integer> left, List<Integer> right) {
        if (left == null || right == null)
            return null;
        Collections.reverse(left);
        Collections.reverse(right);
        LinkedList<Integer> result = new LinkedList<>();
        int aumento = 0;
        for (int i = 0; i < Math.max(left.size(), right.size()); i++) {
            int leftDigit = left.size() > i ? left.get(i) : 0;
            int rightDigit = right.size() > i ? right.get(i) : 0;
            if (leftDigit < 0 || leftDigit > 9 || rightDigit < 0 ||
                    rightDigit > 9)
                throw new IllegalArgumentException();
            int sum = leftDigit + rightDigit + aumento;
            result.addFirst(sum % 10);
            aumento = sum / 10;
        }
        if (aumento > 0)
            result.addFirst(aumento);
        while (result.size() > 1 && result.get(0) == 0)
            result.remove(0);
        return result;
    }
}
