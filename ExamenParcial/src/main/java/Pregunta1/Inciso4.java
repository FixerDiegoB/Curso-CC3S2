package Pregunta1;

import java.util.*;

public class Inciso4 {
    public static void remove(List<Character> chars) {
        char end = 'z';
        chars.removeIf(c -> {
            char start = 'a'; return start <= c && c <= end; });
        for (char c : chars) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        List<Character> chars = new ArrayList<Character>();
        chars.add('c');
        chars.add('*');
        chars.add('x');
        chars.add('4');
        remove(chars);
    }
}
