package mx.unam.fi.poo.g1.p8.e1;

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        setRadio(radio);
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    @Override
    public void dibuja() {
        System.out.println("Más adelante van a usar graficos en java");
    }

    @Override
    public double calculaArea() {
        return Math.PI * getRadio() * getRadio();
    }
}