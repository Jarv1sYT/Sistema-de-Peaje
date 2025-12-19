public abstract class Vehiculo {
    // Atributo común a todos los vehículos placa
    private String placa;

    // Constructor obliga a que todo vehículo tenga placa al nacer
    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    // Método abstracto cada tipo de vehículo DEBE definir cuánto paga
    public abstract int getValorPeaje();

    // Método para imprimir datos 
    public void imprimir() {
        System.out.println("Vehículo placa: " + placa + " | Peaje: $" + getValorPeaje());
    }
}
