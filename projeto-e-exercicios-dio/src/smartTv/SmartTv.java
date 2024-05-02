package smartTv;

public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;   

    
    void mudarCanal(int novoCanal){
        this.canal = novoCanal;
    }

    void aumentarCanal (){
        canal ++;
    }

    void diminuirCanal (){
        canal--;
    }
    
    void aumentarVolume(){
        volume++;
    }

    void diminuirVolume(){

        volume--;
    }

    void ligar () {

        ligada = true;
    }

    void desligar (){
      
        ligada = false;
    }
}
