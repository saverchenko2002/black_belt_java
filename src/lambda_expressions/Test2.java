package lambda_expressions;

public class Test2 {
    static void printSolution(Math math) {
        System.out.println(math.doMath(5));
    }

    public static void main(String[] args) {
        printSolution(n -> 5*5);
    }
}

interface Math {
    int doMath(int value);
}
