package ejemploempleados.sinherencia;

public class EjemploSinHerencia {

    public static void main(String[] args) {
        EmpleadoPorComision empleado1;
        empleado1 = new EmpleadoPorComision("Jose", "Rodriguez", "0120", 15000, 0.3);
        
        EmpleadoBaseMasComision empleado2;
        empleado2 = new EmpleadoBaseMasComision("Eduardo", "Valdez", "0130", 15000, 0.25, 3000);
        
        System.out.println("Datos del empleado 1: " + empleado1);
        System.out.printf("Ingresos del empleado 1: %.2f\n\n", empleado1.ingresos());
        
        System.out.println("Datos del empleado 2: " + empleado2);
        System.out.printf("Ingresos del empleado 2: %.2f\n\n", empleado2.ingresos());
    }

}
