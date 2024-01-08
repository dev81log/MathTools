import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MathTools tools = new MathTools();
        Random random = new Random();

        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        int num3 = random.nextInt(10) + 1;
        int num4 = random.nextInt(10) + 1;
        int num5 = random.nextInt(10) + 1;

        Map<String, Object> operationResults = new LinkedHashMap<>();

        // consult the documentation for the Math class in Java
        operationResults.put("sumNumbers", tools.sumNumbers(num1, num2, num3, num4, num5));
        operationResults.put("subtractNumbers", tools.subtractNumbers(num1, num2, num3, num4, num5));
        operationResults.put("multiplyNumbers", tools.multiplyNumbers(num1, num2, num3, num4, num5));
        operationResults.put("divideNumbers", tools.divideNumbers(num1, num2, num3, num4, num5));
        operationResults.put("remainderNumbers", tools.remainderNumbers(num1, num2, num3, num4, num5));
        operationResults.put("squareRoot", (int) tools.squareRoot(num1));
        operationResults.put("powerOfTwo", (int) tools.powerOfTwo(num1));
        operationResults.put("fibonacci", tools.fibonacci(num2));
        operationResults.put("factorial", tools.factorial(num4));
        operationResults.put("lcm", tools.lcm(num1, num2));
        operationResults.put("gcd", tools.gcd(num1, num2));
        operationResults.put("isPrime", tools.isPrime(num1));
        operationResults.put("cubicRoot", (int) tools.cubicRoot(num1));
        operationResults.put("powerOfThree", (int) tools.powerOfThree(num1));


        System.out.println("Results of the operations:");
        for (Map.Entry<String, Object> entry : operationResults.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
