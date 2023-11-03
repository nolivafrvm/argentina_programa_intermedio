package clase_dos.Empleado;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", 40000, "TI"));
        empleados.add(new Empleado("Alicia", 60000, "TI"));
        empleados.add(new Empleado(null, 55000, "RRHH"));

        // Filtrar empleados con salarios mayores a 55000
        List<Empleado> empleadosConSalarioAlto = filtrarEmpleados(empleados,
                (empleado) -> empleado.getSalario() > 55000);

        // Filtrar empleados con salarios mayores a 55000
        List<Empleado> empleadosNombreNull = filtrarEmpleados(empleados,
                (empleado) -> empleado.getNombre() == null);

        // Filtrar empleados en el departamento de TI
        List<Empleado> empleadosTI = filtrarEmpleados(empleados,
                empleado -> empleado.getDepartamento().equals("TI"));

        System.out.println("Empleados con salarios altos: " + empleadosConSalarioAlto);
        System.out.println("Empleados del departamento de TI: " + empleadosTI);
        System.out.println("Empleados con nombres nulos: " + empleadosNombreNull);
    }

    public static List<Empleado> filtrarEmpleados(List<Empleado> empleados, EmpleadoFiltro filtro) {
        List<Empleado> empleadosFiltrados = new ArrayList<>();
        for (Empleado empleado : empleados) {
            if (filtro.cumpleCondicion(empleado)) {
                empleadosFiltrados.add(empleado);
            }
        }
        return empleadosFiltrados;
    }

}
