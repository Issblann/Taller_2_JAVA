package Alumno;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class SistemaAlumnos {

    private ArrayList<Alumno> listaAlumnos;

    public SistemaAlumnos(){
        this.listaAlumnos = new ArrayList<>();
    };

    public void agregarAlumno(Alumno alumno){
            listaAlumnos.add(alumno);
    };

    public void asignarCalificaciones(Alumno alumno, double[] calificaciones){
            alumno.setCalificaciones(calificaciones);
    }

    public String calcularPromedio(Alumno alumno){
            double[] calificaciones = alumno.getCalificaciones();

            double sumaCalificaciones = 0;

        for (double calificacion: calificaciones) {
            sumaCalificaciones += calificacion;
        }

        double promedio =  sumaCalificaciones/calificaciones.length;

        DecimalFormat promedioFormateado = new DecimalFormat("#.#");

        return  promedioFormateado.format(promedio);
    };

    public void mostrarInformacionAlumnos(){

        for (Alumno alumno: listaAlumnos) {
            System.out.println("ID: " + alumno.getId());
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Edad: " + alumno.getEdad());
            System.out.print("Calificaciones: ");
            double[] calificaciones = alumno.getCalificaciones();
            for ( double calificacion: calificaciones) {
                System.out.println(calificacion + " ");
            }

            System.out.println("Promedio de cada estudiante: " + calcularPromedio(alumno));

            System.out.println("--------------");
        }
    }
}
