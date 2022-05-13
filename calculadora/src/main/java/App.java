import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Recebendo rec = new Recebendo();
        Scanner v = new Scanner(System.in);

        System.out.println("Equações disponivéis");
        System.out.println("1 - Soma / 2 - Subtração / 3 - Multiplicaçõ / 4 - Divisão / 0 - sair");
        int i = v.nextInt();

        switch (i) {

            case 1:
                System.out.println("a soma de 2 com 8");
                Soma soma = new Soma(2, 8);
                 System.out.println("Soma : " + rec.CalculaOperacao(soma));
                break;


            case 2:
            System.out.println("a subtração de 15 com 5");
                Subtrair sub = new Subtrair(15, 5);
                System.out.println("Subtração : " + rec.CalculaOperacao(sub));
                break;


            case 3:
            System.out.println("a multiplicação de 2 com 6");
                Multiplicar mult = new Multiplicar(2, 6);
                System.out.println("Multiplicação : " + rec.CalculaOperacao(mult));
                break;


            case 4:
            System.out.println("a divisão de 10 com 5");
                Dividir divi = new Dividir(10, 5);
                System.out.println("Divisão : " + rec.CalculaOperacao(divi));
                break;


            default:
                System.out.println("A equação não existe");
        }
        /*
         * Recebendo rec = new Recebendo();
         * 
         * Soma soma = new Soma(2,8);
         * Dividir divi = new Dividir(10, 5);
         * Multiplicar mult = new Multiplicar(2,6);
         * Subtrair sub = new Subtrair(15, 5);
         * 
         * System.out.println("Soma : " + rec.CalculaOperacao(soma));
         * System.out.println("Subtração : " + rec.CalculaOperacao(sub));
         * System.out.println("Divisão : " + rec.CalculaOperacao(divi));
         * System.out.println("Multiplicação : " + rec.CalculaOperacao(mult));
         */
    }

}
