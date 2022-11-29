import java.util.Scanner;

public class Calculando_vendas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int continua=-1;
        do {


            System.out.println("Escolha o produto ou digite -1 para sair");
            System.out.println("1- agua");
            System.out.println("2- chocolate");
            System.out.println("3- bolacha");
            int produto = scan.nextInt();


            switch (produto) {
                case 1:
                    System.out.println("2.98");
                    break;
                case 2:
                    System.out.println("4.5");
                    break;
                case 3:
                    System.out.println("4.49");
                    break;

            }
        }while (continua!=-1);

        int valida =-1;

        do {
            System.out.println("dIGITE O PRODUTO  algo ou digite -1 para sair");
            System.out.println("1- agua");
            System.out.println("2- chocolate");
            System.out.println("3- bolacha");
           int compra = scan.nextInt();
            System.out.println("Qual qtedade de produto vc quer?");
            int quantidade = scan.nextInt();

            switch (compra){
                case 1:
                    System.out.println("O valor a ser pago é" + quantidade*2.98);
                    break;
                case 2:
                    System.out.println(quantidade*4.5);
                    break;
                case 3:
                    System.out.println(quantidade*4.49);
                    break;


        }}while (valida!=-1);


    }
}




/*(Calculando vendas) Um varejista on-line vende cinco produtos cujos preços no varejo são como a seguir: produto 1, US$ 2,98; produto
2, US$ 4,50; produto 3, US$ 9,98; . Escreva um aplicativo que leia uma série de pares de números
como segue:
a) número de produto
b) quantidade vendida
Seu programa deve utilizar uma instrução switch para determinar o preço de varejo de cada produto. Você deve calcular e exibir o valor de
varejo total de todos os produtos vendidos. Utilize um loop controlado por sentinela para determinar quando o programa deve parar o loop
e exibir os resultados finais*/