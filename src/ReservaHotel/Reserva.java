package ReservaHotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reserva {

    private Map<Hotel,List<Habitacion>> reservas;

    public Reserva(){
        this.reservas = new HashMap<>();
    }

    public  boolean realizarReserva(Hotel hotel, int numeroHabitacion, Cliente cliente){
            if(reservas.containsKey(hotel)){
                List<Habitacion> habitacionesReservadas = reservas.get(hotel);
                Habitacion habitacion = hotel.getHabitacionesDisponibles().get(numeroHabitacion - 1);
                if(habitacion != null && habitacion.estaDisponible()){
                    habitacionesReservadas.add(habitacion);
                    habitacion.ocupar(cliente);
                    return true;
                }
            }
            return false;
    };


    public boolean cancelarReserva(Hotel hotel, int numeroHabitacion){
            if(reservas.containsKey(hotel)){
                List<Habitacion> habitacionesReservadas = reservas.get(hotel);
                Habitacion habitacion = hotel.getHabitacionesDisponibles().get(numeroHabitacion - 1);
                if(habitacion != null && !habitacion.estaDisponible()){
                    habitacionesReservadas.remove(habitacion);
                    habitacion.desocupar();
                    return true;
                }
            }
            return false;
    }

    public List<Habitacion> getHabitacionesReservadas(Hotel hotel) {
        return reservas.getOrDefault(hotel, new ArrayList<>());
    }
}
