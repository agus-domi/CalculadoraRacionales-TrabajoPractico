public class PilaDoblementeEnlazada<T> implements Pila<T> {

    private NodoPila<T> inicio;
    private NodoPila<T> fin;

    PilaDoblementeEnlazada() {
        this.inicio = null;
        this.fin = null;
    }

    @Override
    public boolean esVacia() {
        return this.inicio == null && this.fin == null;
    }

    @Override
    public T tope() throws IllegalStateException {
        // TODO Implementar este método y eliminar la línea siguiente
        throw new UnsupportedOperationException("Unimplemented method 'tope'");
    }

    @Override
    public void apilar(T elem) throws IllegalStateException {
        // TODO Implementar este método y eliminar la línea siguiente
        throw new UnsupportedOperationException("Unimplemented method 'apilar'");
    }

    @Override
    public T desapilar() throws IllegalStateException {
        // TODO Implementar este método y eliminar la línea siguiente
        throw new UnsupportedOperationException("Unimplemented method 'desapilar'");
    }

    @Override
    public void imprimir() {
        // TODO Implementar este método y eliminar la línea siguiente
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

}