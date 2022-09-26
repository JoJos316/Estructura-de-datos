package digito;

public class Digito {

    

    public static void main(String[] args) {
        
        digito(323,100);
    }

    public static void digito(int a,int aux) {

        if (a > 0) {
            int b = a % 10;
            int c = a / 10;
            if (aux>b) {
                 aux=b;
            }  
            digito(c, aux);
        }else{
            System.out.println(aux);
        }
    }

}
