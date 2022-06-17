public class Multiplicar implements Operacoes {

    private final int num3;
    private final int num4;

    public Multiplicar(int num3, int num4) {
        this.num3 = num3;
        this.num4 = num4;
    }

    public int CalculaOperacao() {
        return this.num3 - this.num4;
    }
}
