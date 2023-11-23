public class SmartTv {

    boolean ligada =false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void amentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
        //volume = volume + 1;
        
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("diminuindo o volume para: " + volume);
        //volume = volume - 1;
        
    }
    public void ligar (){
        ligada=true;
    }
    public void desligar (){
        ligada=false;
    }

public static void main(String[] args) throws Exception {
      int numero1 = 1;
      String numero2 = "2";
      System.out.println(numero1+numero2); 
    }



}