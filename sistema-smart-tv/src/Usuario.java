import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
         Scanner scanner = new Scanner(System.in);

        boolean clickVolume = true;
        boolean mudarCanal = true;

        System.out.println("A Tv tá ligada?" + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Status novo A Tv tá ligada? " + smartTv.ligada);
        smartTv.volume(clickVolume);
        smartTv.volume(!clickVolume);
        smartTv.mudarCanais(mudarCanal);
        smartTv.mudarCanais(!mudarCanal);
        System.out.print("Digite o número do canal: ");
        int numero = scanner.nextInt();
        smartTv.mudarCanal(numero);
        scanner.close();

        smartTv.desligar();
        System.out.println("Status novo A Tv tá ligada? " + smartTv.ligada);
        smartTv.volume(!clickVolume);

    }
}
