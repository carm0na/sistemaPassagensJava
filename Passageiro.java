package sistemaAeroporto;
import java.util.Scanner;

public class Passageiro {

        //atributos
        String nomePassageiro;
        long idPassageiro;
        long telPassageiro;

        //contrutor
        Passageiro(){

        }

        Passageiro(String nomePassageiro, long idPassageiro, long telPassageiro){
                this.nomePassageiro = nomePassageiro;
                this.idPassageiro = idPassageiro;
                this.telPassageiro = telPassageiro;
        }

        //metodos
        public static void reservarAssento(){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Qual assento você gostaria de reservar?");
                int numeroAssento = scanner.nextInt();

                if (numeroAssento == 1) {
                        Passageiro p1 = new Passageiro();
                        System.out.println("Nome completo: ");
                        p1.nomePassageiro = scanner.next();

                        System.out.println("Identidade: ");
                        p1.idPassageiro = scanner.nextLong();

                        System.out.println("Telefone: ");
                        p1.telPassageiro = scanner.nextLong();


                        System.out.println("Assento " + numeroAssento + "reservado!");
                } else {
                        System.out.println("Assento não disponível");
                }
        }

};