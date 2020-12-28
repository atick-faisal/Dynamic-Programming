public class Recursion extends Demo {

    static int a = 9;
    protected String name = "hello";

    public int factorial(int n) {

        super.name = "hello";

        if(n <= 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Recursion.a = 10;
        System.out.println(Recursion.a);
    }

    @Override
    public void name() {

    }
}
