public class Jogador {

    private String nome;
    private int bolas;
    private boolean ganhou;

    public Jogador(){
        nome = "";
        bolas = 0;
        ganhou = false;
    }

    public String getNome(){
        return nome;
    }

    public int getBolas(){
        return bolas;
    }

    public boolean Ganhou(){
        return ganhou;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setBolas(int bolas){
        this.bolas = bolas;
    }

    public void addBola(){
        bolas += 1;
    }

    public void removeBola(){
        bolas -= 1;
    }

    public void gg(){
        ganhou = true;
    }


}
