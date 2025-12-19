public class SistemaPeaje {

    public static void main(String[] args) {

        Peaje peaje = new Peaje("Peaje Norte", "Pichincha");

        Vehiculo v1 = new Carro ("ABC-123");
        Vehiculo v2 = new Moto  ("XYZ-999");
        Vehiculo v3 = new Camion("TRK-456", 4); 

        peaje.anadirVehiculo(v1);
        peaje.anadirVehiculo(v2);
        peaje.anadirVehiculo(v3);

        peaje.imprimir();
    }
}
