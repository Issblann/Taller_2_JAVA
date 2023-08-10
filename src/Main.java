import Alumno.Alumno;
import Alumno.SistemaAlumnos;
import Calculadora.Calculadora;
import ConversorMonedas.ConversorMonedas;
import ReservaHotel.Cliente;
import ReservaHotel.Habitacion;
import ReservaHotel.Hotel;
import ReservaHotel.Reserva;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      // Descomente la funcion que desea utilizar
      //  primerPuntoAlumnos();
      //  segundoPuntoConversor();
      //  tercerPuntoCalculadora();
          cuartoPuntoReservasHoteles();


    };

    public static void primerPuntoAlumnos() {
        SistemaAlumnos sistema = new SistemaAlumnos();

        Alumno alumno1 = new Alumno(1, "Isabel Sanchez",18, new double[]{4.5, 4.8, 3.8, 5});
        Alumno alumno2 = new Alumno(2, "Ana Maria Salazar",21, new double[]{3.8, 3.5, 4, 4.2});
        Alumno alumno3 = new Alumno(3, "Santiago Lopez",18, new double[]{4.6, 5, 4.3, 3.2});
        Alumno alumno4 = new Alumno(4, "Maria Paula Rojas",19, new double[]{2.5, 4.7, 3, 4.2});
        Alumno alumno5 = new Alumno(5, "Cristian Perez",20, new double[]{4.5, 3, 4.8, 5});

        sistema.agregarAlumno(alumno1);
        sistema.agregarAlumno(alumno2);
        sistema.agregarAlumno(alumno3);
        sistema.agregarAlumno(alumno4);
        sistema.agregarAlumno(alumno5);

        sistema.mostrarInformacionAlumnos();

    };

    public static void segundoPuntoConversor(){
        Scanner scanner = new Scanner(System.in);
        boolean isMenu = true;

        while (isMenu){
            System.out.println("Seleccione una operacion: ");
            System.out.println("1. USD a COP: ");
            System.out.println("2. USD a EUR: ");
            System.out.println("3. Salir: ");

            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    ConversorMonedas.usdACop();
                    break;
                case 2:
                    ConversorMonedas.usdAEur();
                    break;
                case 3:
                    isMenu = false;
                    System.out.println("Saliste del menú.");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor seleccione una opción valida.");
            }

        }

    }

    public static void tercerPuntoCalculadora() {

        Scanner scanner = new Scanner(System.in);
        boolean isMenu = true;

        while (isMenu) {
            System.out.println("Que operación desea realizar? ");
            System.out.println("1. Suma ");
            System.out.println("2. Resta ");
            System.out.println("3. Multiplicación ");
            System.out.println("4. División ");
            System.out.println("5. Salir ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Calculadora.sumar();
                    break;
                case 2:
                    Calculadora.restar();
                    break;

                case 3:
                    Calculadora.multiplicar();
                    break;

                case 4:
                    Calculadora.dividir();
                    break;
                case 5:
                    isMenu = false;
                    System.out.println("Saliste del menú.");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor seleccione una opción valida.");
            }

        }
    }


    public static void cuartoPuntoReservasHoteles(){

      /*  // Crear un hotel y agregar habitaciones
        Hotel hotel = new Hotel("Hotel Test", 5);

        // Crear una instancia de la clase Reserva
        Reserva reserva = new Reserva();

        // Crear un cliente para la reserva
        Cliente cliente = new Cliente("Juan Perez", "123456789", 1234567890, "Empresa XYZ");

        // Realizar una reserva
        boolean exitoReserva = reserva.realizarReserva(hotel, 1, cliente);

        if (exitoReserva) {
            System.out.println("Reserva realizada con éxito");
        } else {
            System.out.println("No se pudo realizar la reserva");
        } */

        Scanner scanner = new Scanner(System.in);
        Reserva reserva = new Reserva();
        List<Hotel> hoteles = new ArrayList<>();
        hoteles.add(new Hotel("Hotel el bosque", 20));
        hoteles.add(new Hotel("Quenn hotel", 20));
        hoteles.add(new Hotel("Candel Resort", 20));

        while (true){
            System.out.println("Seleccione una opción:");
            System.out.println("1. Realizar reserva");
            System.out.println("2. Cancelar reserva");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 0){
                break;
            } else if(opcion == 1){
                System.out.println("Seleccione un hotel: ");
                for (int i = 0; i<hoteles.size(); i++){
                    System.out.println((i+1) + ". " + hoteles.get(i).getNombre());
                }

                int opcionHotel = scanner.nextInt();

                if(opcionHotel >= 1 && opcionHotel <= hoteles.size()){
                    Hotel hotelSeleccionado = hoteles.get(opcionHotel - 1);
                    System.out.println("Ha seleccionado el hotel: "+ hotelSeleccionado.getNombre());

                    System.out.println("Ingrese su nombre:");
                    String nombreOcupante = scanner.next();

                    System.out.println("Ingrese su cedula:");
                    String cedulaOcupante = scanner.next();

                    System.out.println("Ingrese su telefono");
                    int telefonoOcupante = scanner.nextInt();

                    System.out.println("Ingrese el nombre de la empresa");
                    String empresaTrabajaOcupante = scanner.next();

                    Cliente cliente = new Cliente(nombreOcupante, cedulaOcupante, telefonoOcupante, empresaTrabajaOcupante);

                    System.out.println("Habitaciones disponibles: ");
                    List<Habitacion> habitacionesDisponibles = hotelSeleccionado.getHabitacionesDisponibles();

                    for (Habitacion habitacion : habitacionesDisponibles) {
                        System.out.println("Habitación " + habitacion.getNumHabitacion() + " está DISPONIBLE.");
                    }

                    System.out.println("Seleccione una habitación:");
                    int opcionHabitacion = scanner.nextInt();

                    if (opcionHabitacion >= 1 && opcionHabitacion <= habitacionesDisponibles.size()) {

                        Habitacion habitacionSeleccionada = habitacionesDisponibles.get(opcionHabitacion - 1 );

                        if (habitacionSeleccionada.estaDisponible()) {
                            boolean exitoReserva = reserva.realizarReserva(hotelSeleccionado, opcionHabitacion, cliente);

                            if (exitoReserva) {
                                System.out.println("Reserva realizada con éxito:");
                                System.out.println("Hotel: " + hotelSeleccionado.getNombre());
                                System.out.println("Habitación: " + habitacionSeleccionada.getNumHabitacion());
                                System.out.println("Cliente: " + cliente.getNombre());
                                System.out.println("Cédula: " + cliente.getCedula());
                                System.out.println("Empresa: " + cliente.getEmpresa());
                            } else {
                                System.out.println("No se pudo realizar la reserva. La habitación ya no está disponible.");
                            }

                        }
                        else{
                            System.out.println("La habitación seleccionada ya no está disponible.");
                        }
                    }

                }
            }

            else if(opcion == 2){
                System.out.println("Seleccione un hotel: ");
                for (int i = 0; i<hoteles.size(); i++){
                    System.out.println((i+1) + ". " + hoteles.get(i).getNombre());
                }

                int opcionHotel = scanner.nextInt();
                Hotel hotelSeleccionado = hoteles.get(opcionHotel - 1);

                System.out.println("Habitaciones reservadas en " + hotelSeleccionado.getNombre() + ": ");
                List<Habitacion> habitacionesReservadas = reserva.getHabitacionesReservadas(hotelSeleccionado);

                for (Habitacion habitacion : habitacionesReservadas) {
                    System.out.println("Habitación " + habitacion.getNumHabitacion());
                }

                System.out.println("Seleccione una habitación a cancelar:");
                int opcionCancelar = scanner.nextInt();

                if (opcionCancelar >= 1 && opcionCancelar <= habitacionesReservadas.size()) {
                    if (reserva.cancelarReserva(hotelSeleccionado, opcionCancelar)) {
                        System.out.println("Reserva cancelada con éxito.");
                    } else {
                        System.out.println("No se pudo cancelar la reserva. La habitación no está reservada.");
                    }
                }
            }
            else{
                System.out.println("Opcion invalida");
            }
        }
    }
}
