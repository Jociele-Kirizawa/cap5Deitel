public class ProdutodeParesImpares {
    public static void main(String[] args) {
        int produtoPar=1;
        int produtoImpar = 1;
        int maiorPar= 0;
        int menorPar= 0;
        int maiorImpar=Integer.min(1,150);
        int menorImpar=Integer.max(1,150);

        for (int i =1; i<=150; i++){
            if (i%2==0){
                produtoPar = produtoPar*i;
                if (maiorPar<i){
                    maiorPar=i;
                }
                if (i< menorPar){
                    menorPar=i;
                }
            }else{
                produtoImpar*=i;
                if (maiorImpar<i){
                    maiorImpar=i;
                    if (i< menorImpar){
                        menorImpar=i;
                    }
                }
            }

        }
        System.out.printf("O produto dos pares é %d . O maior numero é %d. O menor é %d", produtoPar, maiorPar, menorPar);
        System.out.println();
        System.out.printf("O produto dos Impares é %d. O maior numero impar é %d. O menor é %d", produtoImpar, maiorImpar, menorImpar);


    }
}
/*Escreva um aplicativo que calcula o produto dos números inteiros ímpares de 1 a 150.
* apresente o menor numero e o maior numero par e impar*/