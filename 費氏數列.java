/**
 * @author clark
 */
public class 費氏數列 {

    public static void main(String[] args) {
        int n = 43; //Max int = 46(47th)
        System.out.print("費氏數列如下 : ");
        for (int i = 0; i <= n; i++) {
//遞減        for (int i = n; i >= 0; i--) {
            if (i % 10 == 0) {
                System.out.println();   //厲害，搭配 Line 13 println()
            }
            System.out.print(Fib(i) + "\t");
        }
        System.out.println("......");
        System.out.println("\nFib(" + (n + 1) + ")" + " = " + Fib(n));
    }

    public static int Fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
//        if(n<2 && n>=0) return n;
        int a, b = 0, c = 1;
        for (int i = 2; i <= n; i++) {            
            a = c;
            c += b;
            b = a;
        }
        return c;
    }
    /**
     * recursive function 遞迴函式，雖很簡潔太慢，n<30 尚可接受，否則慢上百倍..... public static int
     * Fib(int n){ if(n==0 || n==1) return n; return Fib(n-1)+Fib(n-2); }
     */
}