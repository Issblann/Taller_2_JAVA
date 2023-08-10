package ReservaHotel;

public class Habitacion {
    private int numHabitacion;
    private boolean disponible;
    private Cliente ocupante;

    public Habitacion(int numHabitacion){
        this.numHabitacion = numHabitacion;
        this.disponible = true;
        this.ocupante = null;
    };

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public Cliente getOcupante() {
        return ocupante;
    }

    public boolean estaDisponible(){
        return disponible;
    }

    public void ocupar(Cliente cliente){
        ocupante = cliente;
        disponible = false;
    }

    public void desocupar(){
        ocupante = null;
        disponible = false;

    }
}
