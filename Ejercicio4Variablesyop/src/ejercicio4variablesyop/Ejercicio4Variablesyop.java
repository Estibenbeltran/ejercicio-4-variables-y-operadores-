/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4variablesyop;

/**
 *
 * @author Dairo Estiben Beltran Martinez
 * @version 1.0
 */
/**
 * 
 * este ejercicio permite resolver una ecuacion de segundo grado
 */
class Operacion{
    double a,b,par1,res;
    void op(int a, int b){
        par1 = Math.pow(a,2);
        res = (-(par1)-b*2);
    }
}
public class Ejercicio4Variablesyop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion ope = new Operacion();
        int a=3, b=2;
        System.out.println("La ecuacion a resolver es -a^2-2b=-13");
        ope.op(a, b);
        System.out.println("el valor de a es "+a);
        System.out.println("el valor de b es "+b);
        System.out.println("La respuesta de la ecuacion es "+ope.res);
    }
    
}
