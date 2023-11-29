package sistemaAeroporto;
import java.util.ArrayList;
import java.util.Scanner;


public class Voo {

    //atributos
    private static int numeroVoo;
    private static String origem;
    private static String destino;
    private static String dataPartida;
    private static String horaPartida;
    private static int totalAssentos;
    private static int disponiveisAssentos;

    public Voo(int numeroVoo, String origem, String destino, String dataPartida, String horaPartida, int totalAssentos,
               int disponiveisAssentos) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataPartida = dataPartida;
        this.horaPartida = horaPartida;
        this.totalAssentos = totalAssentos;
        this.disponiveisAssentos = disponiveisAssentos;
    }

    public static void consultarVoo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero do Voo:");
        int numeroConsultaVoo = scanner.nextInt();

        if (numeroConsultaVoo == numeroVoo) {
            System.out.println("Informações encontradas sobre o Vôo: " +
                    "\n Número do vôo: " + numeroVoo +
                    "\n Origem: " + origem +
                    "\n Destino: " + destino +
                    "\n Data de Partida: " + dataPartida +
                    "\n Hora de Partida: " + horaPartida +
                    "\n Total de Assentos: " + totalAssentos);
        } else {
            System.out.println("Vôo não cadastrado.");
        }
    }

    public static void cadastrarVoo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número do Vôo:");
        int numeroVoo = scanner.nextInt();

        System.out.println("Informe a origem");
        String origem = scanner.next();

        System.out.println("Informe o destino");
        String destino = scanner.next();

        System.out.println("Informe a data de partida (formato DD/MM/AAAA)");
        String dataPartida = scanner.next();

        System.out.println("Informe a hora de partida (formato HH:MM)");
        String horaPartida = scanner.next();

        System.out.println("Informe a quantidade total de assentos");
        int totalAssentos = scanner.nextInt();

        Voo voo1 = new Voo(numeroVoo, origem, destino, dataPartida, horaPartida, totalAssentos, disponiveisAssentos);

        System.out.println("O seguinte vôo foi cadastrado: " +
                "\n Número do vôo: " + numeroVoo +
                "\n Origem: " + origem +
                "\n Destino: " + destino +
                "\n Data de Partida: " + dataPartida +
                "\n Hora de Partida: " + horaPartida +
                "\n Total de Assentos: " + totalAssentos);

    };
}



