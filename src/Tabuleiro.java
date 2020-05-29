public class Tabuleiro {

    private boolean[] casas;
    private int casa6;

    public Tabuleiro(){
        casas = new boolean[4];
        casa6 = 0;
    }

    public void preenche(){
        // 1 3 5
        for(int i = 0; i<=casas.length-1; i++){
            if (i == 0 || i== 2 || i == 4){
                casas[i] = false;
            }
        }
    }

    public boolean temBola(int i){
        return casas[i];
    }

    public String printCasa(int i){
        String casa = "";
        if(i == 6) {
            casa = String.valueOf(i);
        }else{
            i -= 1;
            if(temBola(i)){
                casa = "[X]";
            }else{
                casa = "[ ]";
            }
        }
        return casa;
    }

    public String printTab(){
        return "Casa 1:"+printCasa(1) +" Casa 2:" +printCasa(2)+" Casa 3:" +printCasa(3)+" Casa 4:" +printCasa(4)+" Casa 5:" +printCasa(5)+" Casa 6:" +printCasa(6);
    }

    public void inverteCasa(int i){
        i -= 1;
        casas[i] = !casas[i];
    }

}