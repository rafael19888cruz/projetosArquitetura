
public class Soma implements Operacoes{

        private final int num1;
        private final int num2;

        public Soma(int num1, int num2) {
                this.num1 = num1;
                this.num2 = num2;
        }

        public int CalculaOperacao() {
                return this.num1 + this.num2;
        }
}