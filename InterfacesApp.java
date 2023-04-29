package Interfaces;
public class InterfacesApp {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
                "Nestor",
                "Padilla",
                19,
                "TecNM",
                "Informatica",
                "4to"
        );

        Empleado empleado = new Empleado(
                "Jose",
                "Perez",
                21,
                "Hotel deams",
                "Recepcionist",
                "15000"
        );

        EstudianteTrabajador estudianteTrabajador = new EstudianteTrabajador(
                "Laura",
                "Juarez",
                24,
                "UNLP",
                "Informatica",
                "9no",
                "Facebook",
                "Junior Programmer",
                "100000"
        );

        System.out.println(estudiante.toString());
        System.out.println(empleado.toString());
        System.out.println(estudianteTrabajador.toString());
    }
}