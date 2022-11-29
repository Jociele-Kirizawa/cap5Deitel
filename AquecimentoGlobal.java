import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AquecimentoGlobal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       boolean valida = true;
       boolean valida_causa = true;
       boolean valida_solucao = true;
        int pontuacao = 0;


        do {
            System.out.println("O que é aquecimento global: ");
            System.out.println(" 1- Aquecimento que a terra vem sofrendo ao longo dos anos devido a falta de politicas ambientais");
            System.out.println("2- Invenção dos pessoas");
            System.out.println("3 - não existe aquecimento global.");
            int aquecimento = scan.nextInt();


            switch (aquecimento) {
                case 1:
                    valida=true;
                    pontuacao += 4;
                    break;
                case 2:
                    valida = true;
                    pontuacao += 3;
                    break;
                case 3:
                    valida=true;
                    pontuacao += 2;
                    break;
                default:
                   valida = false;
                    System.out.println("Opção invalida, escolha novamente");

            }
       }while (valida==false);

        
        
        do {
            System.out.println("Quais sao as principais causa o aquecimento global?");
            System.out.println("1 - Queima de combustiveis fosseis, poluição e desmatamento ");
            System.out.println("2 - consumo de agua");
            System.out.println("3 - Não existe aquecimento global");
            int causa = scan.nextInt();
            
            switch (causa){
                case 1:
                    valida_causa = true;
                    pontuacao+= 3;
                    break;
                case 2:
                    valida_causa = true;
                    pontuacao+=2;
                    break;
                case 3:
                    valida_causa=true;
                    pontuacao+=1;
                    break;
                default:
                    valida_causa=false;
                    System.out.println("Opção invalida, escolha novamente");
            }
            
        }while (valida_causa ==false);
        
        do {
            System.out.println("Como prevenir o aquecimento global?");
            System.out.println("1 - diminuindo consumo de combustiveis fosseis e politicas ambientais");
            System.out.println("2 tomar menos banho");
            System.out.println("3- aquecimento global não existe");
            int solucao = scan.nextInt();
            
            switch (solucao){
                case 1:
                    valida_solucao=true;
                    pontuacao+=2;
                    break;
                case 2:
                    valida_solucao=true;
                    pontuacao+=1;
                    break;
                case 3:
                    valida_solucao=true;
                    break;
                default:
                    valida_solucao = false;
                    System.out.println("Opção invalida, escolha novamente");
            }
            
        }while (valida_solucao == false);
        
        if (pontuacao>= 7){
            System.out.println("Excelente");
        } else if (pontuacao<7&&pontuacao>=5) {
            System.out.println("Muito bem");
            
        }else {
            System.out.println("Precisa melhorar");
        }


    }















}



/*controversa questão do aquecimento global foi amplamente divulgada no filme
“Uma verdade inconveniente,” apresentando o ex-vice-presidente Al Gore. Gore e uma rede de cientistas da ONU, o Grupo Intergovernamental sobre Alterações Climáticas, dividiu o Prêmio Nobel da Paz de 2007 em reconhecimento aos “seus esforços para fomentar e
disseminar melhor conhecimento sobre as mudanças climáticas feitas pelo homem”. Pesquise on-line os dois lados da questão em relação
ao aquecimento global (é recomendável pesquisar frases como “global warming skeptics” [“céticos do aquecimento global”]). Crie um
questionário de múltipla escolha com cinco perguntas sobre o aquecimento global, cada uma tendo quatro possíveis respostas (numeradas
1 a 4). Seja objetivo e tente representar de uma maneira justa ambos os lados da questão. Em seguida, escreva um aplicativo que administre o questionário, calcule o número de respostas corretas (zero a cinco) e retorne uma mensagem ao usuário. Se o usuário responder
corretamente cinco perguntas, imprima “Excelente”; se responder quatro, imprima “Muito bom”; se responder três ou menos, imprima “É
o momento de aprimorar seu conhecimento sobre o aquecimento global” e inclua uma lista de alguns sites onde você encontrou os fatos.*/