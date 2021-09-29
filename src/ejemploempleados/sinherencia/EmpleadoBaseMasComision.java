package ejemploempleados.sinherencia;

public class EmpleadoBaseMasComision {

    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;
    private double salarioBase; // Salario base por semana

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,
            String numeroSeguroSocial, double ventasBrutas,
            double tarifaComision, double salarioBase) {
        // Si las ventas brutas no son validas, se igualan a 0
        if (ventasBrutas < 0.0) {
            ventasBrutas = 0;
        }

        // Si la tarifa de comision no es valida, se establece en 15%
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            tarifaComision = 0.15;
        }
        
        // Si el salario base es invalido se establece en 1000
        if (salarioBase < 0.0) {
            salarioBase = 1000;
        }

        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
        this.salarioBase = salarioBase;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        if (ventasBrutas <= 0.0) {
            ventasBrutas = 0;
        }
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            tarifaComision = 0.15;
        }
        this.tarifaComision = tarifaComision;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0) {
            salarioBase = 1000;
        }
        this.salarioBase = salarioBase;
    }

    // Calcula los ingresos
    public double ingresos() {
        return salarioBase + tarifaComision * ventasBrutas;
    }

    // Devuelve representacion String del objeto EmpleadoPorComision
    @Override // Esta etiqueta indica que este metodo sobrescribe el metodo de una superclase
    public String toString() {
        return "EmpleadoBaseMasComision{" + "primerNombre=" + primerNombre
                + ", apellidoPaterno=" + apellidoPaterno + ", numeroSeguroSocial="
                + numeroSeguroSocial + ", ventasBrutas=" + ventasBrutas
                + ", tarifaComision=" + tarifaComision + ", salarioBase="
                + salarioBase + '}';
    }
    
}

