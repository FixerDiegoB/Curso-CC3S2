package Pregunta1;

import java.util.function.Consumer;

interface Secret {
    String magic(double d);
}
class Secret1 implements Secret {
    public String magic(double d) {
        return "Poof";
    }
}

class SecretMain {
    public static void main (String[] args) {
        Secret str = (double d) -> "Poof";
        System.out.println(str.magic(23));
    }
}