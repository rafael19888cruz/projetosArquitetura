public class App {
    public static void main(String[] args){

        Recebendo rec = new Recebendo();

        Soma soma = new Soma(2,8);
        Dividir divi = new Dividir(10, 5);
        Multiplicar mult = new Multiplicar(2,6);
        Subtrair sub = new Subtrair(15, 5);

        System.out.println("Soma : " + rec.CalculaOperacao(soma));
        System.out.println("Subtração : " + rec.CalculaOperacao(sub));
        System.out.println("Divisão : " + rec.CalculaOperacao(divi));
        System.out.println("Multiplicação : " + rec.CalculaOperacao(mult));

    }
    
}
