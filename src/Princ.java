
public class Princ {

    public static void main(String[] args) {
        Circulo circo = new Circulo();
        circo.mudaRaio(1);
        printa(circo);
        
    }
    public static void printa (Circulo circo){
        System.out.println(circo.area());
    }
}
