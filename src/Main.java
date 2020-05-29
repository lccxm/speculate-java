public class Main {

    public static void main(String[] args) {

    Dado dado = new Dado();
    Tabuleiro tabuleiro = new Tabuleiro();
    tabuleiro.preenche();
    System.out.println(tabuleiro.printTab());
    tabuleiro.colocaOuRetiraBola(2);
    tabuleiro.colocaOuRetiraBola(1);
    tabuleiro.colocaOuRetiraBola(6);
    tabuleiro.colocaOuRetiraBola(6);
    tabuleiro.colocaOuRetiraBola(4);System.out.println(tabuleiro.printTab());
    }
}
