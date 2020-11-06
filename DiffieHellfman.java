public class DiffieHellfman{
    public static void main(String [] args){
        int p = 23; //простое число
        System.out.print("The value of P: " + p + "\n");
        int g = 9;  //натуральное число
        System.out.print("The value of G: " + g + "\n");

        int a = 7;
        System.out.print("The private key a for Alice: " + a + "\n");
        int b = 9;
        System.out.print("The private key b for Bob: " + b + "\n");
//----------------------------------------------------------------------
        int x = 1;
        int y = 1;

        for (int i = 0; i < a; i++){
            x *= g;
        }
        int A = x % p; //Alice

        for (int i = 0; i < b; i++){
            y *= g;
        }
        int B = y % p; //Bob

        System.out.print("Alice and Bob compute public values: " + A + " " + B + "\n");
//----------------------------------------------------------------------
        int q = 1;
        int w = 1;

        for (int i = 0; i < a; i++){
            q *= B;
        }
        int kA = q % p;

        for (int i = 0; i < b; i++){
            w *= A;
        }
        int kB = w % p;

        System.out.print("Secret key for the Alice is: " + kA + "\n");
        System.out.print("Secret key for the Bob is: " + kB + "\n");
    }
}