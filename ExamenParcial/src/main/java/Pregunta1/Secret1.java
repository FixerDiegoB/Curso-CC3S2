package Pregunta1;

interface Secret {
    String magic(double d);
}
class Secret1 implements Secret {
    public String magic(double d) {
        return "Poof";
    }
}
