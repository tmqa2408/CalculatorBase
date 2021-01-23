public class Calculator {
    public int sum(int first, int second){

        return first + second;
    }

    public int substract(int first, int second){

        return first - second;
    }

    public int multiply(int first, int second){

        return first * second;
    }

    public int divide(int first, int second) {
        if (second == 0) {
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        return first / second;
    }
}
