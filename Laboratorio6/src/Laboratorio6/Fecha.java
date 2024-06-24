package Laboratorio6;

public class Fecha {
    private final int dia;
    private final int mes;
    private final int a�o;

    public Fecha(int dia, int mes, int a�o) {
        this.dia = dia;
        this.mes = mes;
        this.a�o = a�o;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getA�o() {
        return a�o;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + a�o;
    }
}
