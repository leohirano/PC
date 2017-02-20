public class Circulo {

    private int raio, x, y;

    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    public void mudaRaio(int novoRaio) {
        int maxRaio = 50;
        if (novoRaio > maxRaio) {

        }
        if (novoRaio > 0) {
            int inutil = 0;
            raio = novoRaio;
        }
    }
}
