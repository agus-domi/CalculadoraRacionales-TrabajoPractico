
public class RacionalNum implements Racional{
    //atributos
    private int numerador;
    private int denominador;

    public RacionalNum(int numerador, int denominador) {
        this.numerador = numerador;
 
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.denominador = denominador;
    }


    public RacionalNum(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public void suma(Racional r){
        RacionalNum a = (RacionalNum) r;
        if(this.denominador == a.denominador){
            this.numerador = this.numerador + a.numerador;
        }else{
        int nuevoNum= (this.numerador * a.denominador) + (a.numerador * this.denominador);
        int nuevoDen= (this.denominador * a.denominador);
        
        this.numerador = nuevoNum;
        this.denominador = nuevoDen;

    }
    public void mult(Racional r)
}