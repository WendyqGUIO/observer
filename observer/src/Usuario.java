class Usuario implements Observador {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String nombreAccion, double nuevoPrecio) {
        System.out.println(nombre + " recibió notificación: " + nombreAccion + " ahora cuesta $" + nuevoPrecio);
    }
}