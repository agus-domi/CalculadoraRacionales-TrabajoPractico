public class RacionalNum implements Racional {
  // atributos
  private int numerador;
  private int denominador;

  public RacionalNum(int numerador, int denominador) {
    this.numerador = numerador;

    if (denominador == 0) {
      throw new IllegalArgumentException("El denominador no puede ser cero.");
    }
    this.denominador = denominador;
    simplificarFraccion();
  }

  public RacionalNum(int numerador) {
    this.numerador = numerador;
    this.denominador = 1;
  }

  public void suma(Racional r) {
    RacionalNum a = (RacionalNum) r;
    if (this.denominador == a.denominador) {
      this.numerador = this.numerador + a.numerador;
    } else {
      int nuevoNum = (this.numerador * a.denominador) + (a.numerador * this.denominador);
      int nuevoDen = (this.denominador * a.denominador);

      this.numerador = nuevoNum;
      this.denominador = nuevoDen;
    }
    simplificarFraccion();
  }

  public void mult(Racional r) {
    RacionalNum a = (RacionalNum) r;
    this.numerador = this.numerador * a.numerador;
    this.denominador = this.denominador * a.denominador;
    this.simplificarFraccion();
  }

  public void neg() {

    this.numerador *= -1;
  }

  public void div(Racional r) {
    RacionalNum a = (RacionalNum) r;
    this.numerador = this.numerador * a.denominador;
    this.denominador = this.denominador * a.numerador;
    this.simplificarFraccion();
  }

  public boolean repOk() {
    return this.denominador != 0;
  }

  public String toString() {
    return this.numerador + "/" + this.denominador;
  }

  private int maximoComunDivisor(int a, int b) {
    int aux;
    while (b != 0) {
      aux = b;
      b = a % b;
      a = aux;
    }
    return Math.abs(a);
  }

  private void simplificarFraccion() {
    int mcd = this.maximoComunDivisor(numerador, denominador);
    this.numerador /= mcd;
    this.denominador /= mcd;

    if (this.denominador < 0) {
      this.numerador = -this.numerador;
      this.denominador = -this.denominador;
    }
  }
}
