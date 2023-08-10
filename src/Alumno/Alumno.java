package Alumno;

public class Alumno {
        private int id;
        private String nombre;
        private int edad;
        private double[] calificaciones;

        public Alumno(int id, String nombre, int edad, double[] calificaciones) {
            this.id = id;
            this.nombre = nombre;
            this.edad = edad;
            this.calificaciones = calificaciones;
        };

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public double[] getCalificaciones() {
            return calificaciones;
        }

        public void setCalificaciones(double[] calificaciones) {
            this.calificaciones = calificaciones;
        }
};
