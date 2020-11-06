public class RSA{
    public static void main(String[] args){
        System.out.print("Alice:" + "\n");
        int p = 3, g = 7;
        int n = p * g;
        System.out.print("p * g = " + n + "\n");

        int fi = (p - 1) * (g - 1);
        System.out.print("fi = (p-1)*(g-1) = " + fi + "\n");

        int e = 5;
        System.out.print("e = " + e + "\n");

        int d = (2 * fi + 1)/e;
        System.out.print("d = " + d + "\n\n");
//---------------------------------------------------------------------------------------
        System.out.print("Bob: " + "\n");
        int m = 0 + (int) (Math.random() * 10);;
        int x = 1;
        for(int i = 0; i < e; i++){
            x *= m;
        }
        int c = x % n;
        System.out.print("m = " + m + "\n" + "c = " + c +"\n\n");

        System.out.print("Alice:" + "\n");
        System.out.print("f = " + (Math.pow(c, d)) % n + "\n");
    }
}