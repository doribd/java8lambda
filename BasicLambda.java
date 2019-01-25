/**
 * Some lambda examples.
 *
 * @author Dor
 */
public class BasicLambda {

    public static void main(String[] args) {
        Printit printit = () -> System.out.println("Hello World!");
        Add addFunction = (int a, int b) -> a + b;
        Divider divideFunction = (int a, int b) -> {
            if (b == 0) return 0;
            return a / b;
        };

        printit.print();

        System.out.println("1+2=" + addFunction.add(1, 2));
        System.out.println("2/2=" + divideFunction.divide(2, 2));
    }
}

interface Printit {
    void print();
}

interface Add {
    int add(int a, int b);
}

interface Divider {
    int divide(int a, int b);
}
