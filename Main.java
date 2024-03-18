import java.util.Scanner;

public class Main {


   
    

    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", "Desarrollador", 50000);
        empleados[1] = new Empleado("María", "Diseñadora", 45000);
        empleados[2] = new Empleado("Pedro", "Gerente", 60000);

        Empleados gestionEmpleados = new Empleados(empleados);

        Scanner scanner = new Scanner(System.in);
        System.out.print(MagicStrings.INCREMENTO_SALARIO);
        double porcentaje = scanner.nextDouble();

        gestionEmpleados.aumentarSalario(porcentaje);


        System.out.println(MagicStrings.LISTA_EMPLEADOS);
        gestionEmpleados.mostrarListaEmpleados();

        scanner.close();
    }
}
