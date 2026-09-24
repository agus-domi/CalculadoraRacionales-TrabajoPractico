public class PilaDoblementeEnlazada<T> implements Pila<T> {

  private NodoPila<T> inicio;
  private NodoPila<T> fin;

  public PilaDoblementeEnlazada() {
    this.inicio = null;
    this.fin = null;
  }

  @Override
  public boolean esVacia() {
    return this.inicio == null && this.fin == null;
  }

  @Override
  public T tope() throws IllegalStateException {
    if (esVacia()) {
      throw new IllegalStateException("La Pila esVacia");
    }
    return this.fin.getItem();
  }

  @Override
  public void apilar(T elem) throws IllegalStateException {
    if (esVacia()) {
      NodoPila<T> nodo = new NodoPila<T>(null, elem, null);
      this.inicio = nodo;
      this.fin = nodo;
    } else {
      NodoPila<T> nodo = new NodoPila<T>(this.fin, elem, null);
      this.fin.setNext(nodo);
      this.fin = nodo;
    }
  }

  @Override
  public T desapilar() throws IllegalStateException {
    if (esVacia()) {
      throw new IllegalStateException("La Pila esVacia");
    }
    T ultimo = this.fin.getItem();
    if (inicio == fin) {
      this.fin = null;
      this.inicio = null;
    } else {
      this.fin = fin.getPrev();
      this.fin.setNext(null);
    }
    return ultimo;
  }

  @Override
  public void imprimir() {
    NodoPila<T> nodo = this.fin;
    while (nodo != null) {
      System.out.println(nodo.getItem());
      nodo = nodo.getPrev();
    }
  }
}
