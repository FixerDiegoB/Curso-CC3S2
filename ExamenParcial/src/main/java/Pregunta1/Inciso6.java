package Pregunta1;

import java.util.*;

public class Inciso6 {
    public static void remove(List<Character> chars) {
        char end = 'z';
        System.out.print("Lista original: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        chars.removeIf(c -> {
            char start = 'a'; return start <= c && c <= end; });
    }

    public static void main(String[] args) {
        List<Character> chars = new ArrayList<Character>();
        chars.add('c');
        chars.add('*');
        chars.add('x');
        chars.add('4');
        remove(chars);
        System.out.print("\nLista modificada: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
    }
}
