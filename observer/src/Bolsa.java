public class Bolsa {
    public static void main(String[] args) {
        Accion apple = new Accion("Apple");
        Usuario juan = new Usuario("Juan");
        Usuario maria = new Usuario("María");

        apple.agregarObservador(juan);
        apple.agregarObservador(maria);

        apple.actualizarPrecio(160.0);
    }
}