import java.util.ArrayList;
import java.util.List;
      
class Accion {
    private String nombre;
    private double precio;
    private List<Observador> observadores;

    public Accion(String nombre) {
        this.nombre = nombre;
        this.precio = 0.0;
        this.observadores = new ArrayList<>();
    }

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar(nombre, precio);
        }
    }
}
