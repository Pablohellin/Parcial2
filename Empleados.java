public class Empleados {
    
        private Empleado[] lista;
    
        public Empleados(Empleado[] lista) {
            this.lista = lista;
        }
    
        public Empleado[] getLista() {
            return lista;
        }
    
        public void setLista(Empleado[] lista) {
            this.lista = lista;
        }
    
        public void mostrarListaEmpleados() {
            for (Empleado empleado : lista) {
                System.out.println(empleado);
            }
        }
        public void aumentarSalario(double porcentaje) {
            for (Empleado empleado : lista) {
                double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
                empleado.setSalario(nuevoSalario);
            }
        }
    
        public void darAltaEmpleado(Empleado empleado, int indice) {
            if (indice >= 0 && indice < lista.length) {
                lista[indice] = empleado;
            } else {
                System.out.println("Índice fuera de rango.");
            }
        }
}
