import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //rodar o jogo
        Scanner in = new Scanner(System.in);
        int rodada = 1;
        System.out.println("quantos jogadores? (1 para x1 com o pc)\n");
        int jogadores = in.nextInt();
        if (jogadores <= 2 && jogadores > 0) {
            Jogador jogador1 = new Jogador();
            Jogador jogador2 = new Jogador();
            System.out.println("Nome do Jogador: ");
            String nome = in.next();
            jogador1.setNome(nome);
            jogador1.setBolas(33/2);
            jogador2.setBolas(33/2);


        }
    }
}
