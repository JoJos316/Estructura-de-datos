
package cajas;

public class Cajas {
static int cont;
    public static void main(String[] args) {
        cajas(13, 3);
        System.out.println(cont);
    }
    public static void cajas(int carga,int max){
        if(carga>max){
           int aux=carga/2;
           
           if(aux*2==carga){
               cajas(aux, max);
               cajas(aux, max);
           }else{
               cajas(aux+1, max);
               cajas(aux, max);
           }
        }else{
            cont++;
        }
    }
    
}
