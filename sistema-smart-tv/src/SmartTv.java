import java.util.Scanner;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void volume(boolean clickVolume) {
        if (ligada == true){
            if (clickVolume) {
                volume++;
                System.out.println("Volume Aumentado");
            }
            if (!clickVolume) {
                volume--;
                System.out.println("Volume diminuido");
            }
        }else{
            System.out.println("A tv está desligada!");
        }
    }

    public void mudarCanal (int canalEspecifico) {
        canal = canalEspecifico;
        System.out.println("O canal mudou para: " + canal);
    }

    public void mudarCanais (boolean mudarCanais) {
        if (ligada && mudarCanais) {
            if (mudarCanais) {
                canal++;
                System.out.println(canal);
            } if (!mudarCanais) {
                canal--;
                System.out.println(canal);
            }
            
        }

    }
}
