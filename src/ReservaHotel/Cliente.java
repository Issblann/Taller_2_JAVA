package ReservaHotel;

public class Cliente {

    String nombre;
    String cedula;
    int telefono;
    private String empresa;

    public Cliente(String nombre, String cedula, int telefono, String empresa){
            this.nombre = nombre;
            this.cedula = cedula;
            this.telefono = telefono;
            this.empresa = empresa;
    };

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getTelefono() {
        return telefono;
    }
    public String getEmpresa() {
        return empresa;
    }
}
