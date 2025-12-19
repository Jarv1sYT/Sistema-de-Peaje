import java.util.ArrayList;
import java.util.List;

public class Peaje {

    private String nombre;
    private String departamento;

    private int totalPeaje = 0;
    private int totalCamiones = 0;
    private int totalMotos = 0;
    private int totalCarros = 0;

    // Relación 1 a muchos: un peaje tiene muchos vehículos
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Agrega un vehículo, calcula su peaje y actualiza contadores y total
    public void anadirVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);

        int valor = calcularPeaje(vehiculo);
        totalPeaje += valor;

        // Contar por tipo
        if (vehiculo instanceof Carro) totalCarros++;
        else if (vehiculo instanceof Moto) totalMotos++;
        else if (vehiculo instanceof Camion) totalCamiones++;
    }

    // Polimorfismo
    public int calcularPeaje(Vehiculo vehiculo) {
        return vehiculo.getValorPeaje();
    }

    public void imprimir() {
        System.out.println("=== PEaje: " + nombre + " (" + departamento + ") ===");
        System.out.println("Vehículos atendidos: " + vehiculos.size());
        System.out.println("Carros: " + totalCarros + " | Motos: " + totalMotos + " | Camiones: " + totalCamiones);
        System.out.println("\n--- Listado de vehículos ---");

        for (Vehiculo v : vehiculos) {
            v.imprimir(); 
        }

        System.out.println("\nTOTAL RECAUDADO: $" + totalPeaje);
    }
}
