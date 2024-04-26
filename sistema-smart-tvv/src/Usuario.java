public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.Ligar();
        System.out.println(" Novo status: TV está ligada? " + smartTv.ligada);

    }
}
