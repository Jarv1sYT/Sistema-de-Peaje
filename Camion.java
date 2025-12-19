public class Camion extends Vehiculo {

    private int numeroEjes;
    private int valorPeajeEje = 1;

    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getValorPeajeEje() {
        return valorPeajeEje;
    }

    public void setValorPeajeEje(int valorPeajeEje) {
        this.valorPeajeEje = valorPeajeEje;
    }

    @Override
    public int getValorPeaje() {
        return numeroEjes * valorPeajeEje;
    }

    @Override
    public void imprimir() {
        System.out.println("Camión placa: " + getPlaca()
                + " | Ejes: " + numeroEjes
                + " | Peaje: $" + getValorPeaje());
    }
}
