import java.util.Scanner;

public class Calculando{

    static public void main(String[] args){
       Scanner scan=new Scanner(System.in);
       double result;
       double n1,n2;
       int opcao;
       
       

       
static void menu(){
    Calcular cal = new Calcular();

    int opcao;
    String menu = "escolha a opção\n"+
                    "1-Somar\n"+
                    "2-Subtrair\n"+
                    "3-Multiplicar\n"+
                    "4-Dividir\n"+
                    "s-sair";
    while (opcao !=s){

       switch(opcao){
           case 1:
            System.out.printf("%n Digite o primeiro numero: ");
            n1 = scan.nextDouble();
            System.out.printf("%n Digite o segundo  numero: ");
            n2 = scan.nextDouble();
                result = cal.Somar(n1,n2);
                System.out.printf(result);
                break;
            case 2:
            System.out.printf("%n Digite o primeiro numero: ");
            n1 = scan.nextDouble();
            System.out.printf("%n Digite o segundo  numero: ");
            n2 = scan.nextDouble();
                result = cal.Subtrair(n1,n2);
                System.out.printf(result);
                 break;
            case 3:
            System.out.printf("%n Digite o primeiro numero: ");
            n1 = scan.nextDouble();
            System.out.printf("%n Digite o segundo  numero: ");
            n2 = scan.nextDouble();
                result = cal.Multiplicar(n1,n2);
                System.out.printf(result);
                 break;  
            case 4:
            if(n1 < n2){
                System.out.println("Erro!!" );
            }        
            else{
                System.out.printf("%n Digite o primeiro numero: ");
            n1 = scan.nextDouble();
            System.out.printf("%n Digite o segundo  numero: ");
            n2 = scan.nextDouble();
                result = cal.Multiplicar(n1,n2);
                System.out.printf(result);
            }
            break;
       }

    }
}
}