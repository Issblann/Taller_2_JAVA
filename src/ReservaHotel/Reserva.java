package ReservaHotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reserva {

    private List<ReservaInfo> reservas;
    public Reserva(){
        this.reservas = new ArrayList<>();
    }

    public boolean realizarReserva(Hotel hotel, int numeroHabitacion, Cliente cliente){
        Habitacion habitacion = hotel.getHabitacionesDisponibles().get(numeroHabitacion - 1);
        if (habitacion != null && habitacion.estaDisponible()) {
            ReservaInfo reserva = new ReservaInfo(hotel, habitacion, cliente);
            reservas.add(reserva);
            habitacion.ocupar(cliente);
            return true;
        }
        return false;
    }

    public boolean cancelarReserva(Hotel hotel, int numeroHabitacion) {
        List<Habitacion> habitacionesReservadas = getHabitacionesReservadas(hotel);
        if (numeroHabitacion >= 1 && numeroHabitacion <= habitacionesReservadas.size()) {
            Habitacion habitacionReservada = habitacionesReservadas.get(numeroHabitacion - 1);
            if (habitacionReservada != null && !habitacionReservada.estaDisponible()) {
                habitacionesReservadas.remove(habitacionReservada);
                habitacionReservada.desocupar();
                return true;
            }
        }
        return false;
    }


    public List<Habitacion> getHabitacionesReservadas(Hotel hotel) {
        List<Habitacion> habitacionesReservadas = new ArrayList<>();
        for (ReservaInfo reserva : reservas) {
            if (reserva.getHotel().equals(hotel)) {
                habitacionesReservadas.add(reserva.getHabitacion());
            }
        }
        return habitacionesReservadas;
    }
}
