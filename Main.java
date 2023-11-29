package sistemaAeroporto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //utilizei o metodo scanner abaixo para criar um menu com as tres opcoes possiveis de funcionalidades do sistema
        Scanner menu = new Scanner(System.in);
        int opcaoEscolhida=0;

        System.out.println("O que você gostaria de fazer? (Responda com 1, 2 ou 3)\n" +
                "1 - Gostaria de reservar uma passagem.\n" +
                "2 - Gostaria de cadastrar um vôo.\n" +
                "3 - Consultar informações de um voo.");
        opcaoEscolhida=menu.nextInt();


        //Fluxo para quando a opção reservar uma passagem é a opção escolhida
        if (opcaoEscolhida == 1) {
            Passageiro.reservarAssento();
        }

        //Fluxo para quando a opção cadastrar um vôo é a opção escolhida
        else if (opcaoEscolhida == 2) {
            Voo.cadastrarVoo();

        }

        //Fluxo para quando a opção consultar informações é a opção escolhida
        else if (opcaoEscolhida == 3) {
           Voo.consultarVoo();
        }

        //Fluxo para quando o usuário digitou uma opção inválida
         else {
            System.out.println("Opção inválida");
        }
    }
};
