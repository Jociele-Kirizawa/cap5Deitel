public class ImpressaoTriangulos {
    public static void main(String[] args) {
        for (int i =1; i <=10; i++) {
            System.out.println();

            for (int j = i; j <= 10; j++) {
                System.out.print("*" + " ");
            }
        }
        System.out.println();
        System.out.println();
        for (int k = 10; k>= 1; k--){
            System.out.println();
            for (int l= k ; l<=10; l++){
                System.out.print(" " + "*");
            }
        }
        System.out.println();
        System.out.println();
        for (int n = 1; n<=10; n++){
            System.out.println();
            for (int o = 1; o<=10; o++){
                if (n>=o){
                    System.out.print("");
                }else {
                    System.out.print("*");
                }

            }

        }



    }
}

/*Escreva um aplicativo que exibe os seguintes padrões separadamente, um embaixo do outro.
Utilize loops for para gerar os padrões. Todos os asteriscos (*) devem ser impressos por uma única instrução na forma System.out.
print('*'); o que faz com que os asteriscos sejam impressos lado a lado. Uma instrução na forma System.out.println(); pode
ser utilizada para mover-se para a próxima linha. Uma instrução na forma System.out.print(' '); pode ser utilizada para exibir
um espaço para os últimos dois padrões. Não deve haver outras instruções de saída no programa. [Dica: os dois últimos padrões requerem
que cada linha inicie com um número adequado de espaços em branco.*/