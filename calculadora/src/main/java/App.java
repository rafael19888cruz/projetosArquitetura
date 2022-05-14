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
            System.out.println("Informe os valores");
            
            int num1 = v.nextInt();
            int num2 = v.nextInt();
            Soma soma = new Soma(num1,num2);
               
             System.out.println("Soma : " + rec.CalculaOperacao(soma));
                break;


            case 2:
            System.out.println("Informe os valores");
            
            int num3 = v.nextInt();
            int num4 = v.nextInt();
            Subtrair sub = new Subtrair(num3,num4);
            System.out.println("Subtração : " + rec.CalculaOperacao(sub));
                break;


            case 3:
            System.out.println("Informe os valores");
            
            int num5 = v.nextInt();
            int num6 = v.nextInt();
                Multiplicar mult = new Multiplicar(num5, num6);
                System.out.println("Multiplicação : " + rec.CalculaOperacao(mult));
                break;


            case 4:
            System.out.println("Informe os valores");
            
            int num7 = v.nextInt();
            int num8 = v.nextInt();
                Dividir divi = new Dividir(num7, num8);
                System.out.println("Divisão : " + rec.CalculaOperacao(divi));
                break;


            default:
                System.out.println("A equação não existe");
        }
        
    }

}
