import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Dado dado = new Dado();
    Tabuleiro tabuleiro = new Tabuleiro();
    tabuleiro.preenche();
    System.out.println(tabuleiro.printTab());
    tabuleiro.colocaOuRetiraBola(4);
    System.out.println(tabuleiro.printTab());
    }
}
