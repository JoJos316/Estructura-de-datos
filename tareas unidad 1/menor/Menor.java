package menor;

public class Menor {



    public static void main(String[] args) {
        int[] v = {4, 3, 1};
       menor(v,0,v[0]);
    }

    public static void menor(int[] v, int indice,int menor) {
        if (indice < v.length) {
            if (indice+1==v.length) {
               System.out.println(menor);
            }else if(v[indice]>=v[indice+1]){
                menor=v[indice+1];
                menor(v,indice+1,menor);
            }
        }else{
            System.out.println(menor);
        }

    }

}
