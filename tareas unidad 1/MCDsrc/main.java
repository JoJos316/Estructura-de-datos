
public class main {

    public static void main(String[] args) {
        int a = 12;
        int b = 21;
        int c = mcd(a, b);
        System.out.println(c);
    }

    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b,a%b);
    }
}
