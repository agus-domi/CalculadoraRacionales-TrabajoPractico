public class Calculadora {

    /**
     * Evalua una expresion matemática
     * 
     * @param expresion Representación como string de la expresión matemática a
     *                  evaluar
     * @return
     */
    public static Racional evaluarExpresion(String expresion) {
        // TODO completar
        String [] nums = expresion.split(" ");
        PilaDoblementeEnlazada<Racional> pila = new PilaDoblementeEnlazada<>();
        for(int i=nums.length-1;i>=0;i--){
            String car = nums[i];

            if(car.equals("+")|| car.equals("-")||car.equals("/")||car.equals("*")){
              
              Racional numero1 = pila.desapilar();
              Racional numero2 = pila.desapilar();
              switch(car){
                case "+":
                numero1.suma(numero2);
                pila.apilar(numero1);     
                break;
              
              //A-B = A+B.NEG
              case "-":
                numero2.neg();
                numero1.suma(numero2);
                pila.apilar(numero1);     
                break;
              case "*":
                numero1.mult(numero2);
                pila.apilar(numero1);     
                break;
              case "/":
                numero1.div(numero2);
                pila.apilar(numero1);
                break;
            }
           }
            else if(car.contains("R")){
               String [] denm = car.split("R");

                pila.apilar(new RacionalNum(Integer.parseInt(denm[0]), Integer.parseInt(denm[1])));
            }
            else {
                pila.apilar(new RacionaNum(Integer.parseInt(car),1));
            }
        }
        return pila.desapilar();
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usar java Calculadora <expresion>");
            System.out.println("Ej: java Calculadora '+ 1R2 2R3'");
        } else {
            System.out.println(evaluarExpresion(args[0]));
        }
    }
}
