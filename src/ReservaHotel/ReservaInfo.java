package ReservaHotel;

public class ReservaInfo {
        private Hotel hotel;
        private Habitacion habitacion;
        private Cliente cliente;

        public ReservaInfo(Hotel hotel, Habitacion habitacion, Cliente cliente) {
            this.hotel = hotel;
            this.habitacion = habitacion;
            this.cliente = cliente;
        }

    public Hotel getHotel() {
        return hotel;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
