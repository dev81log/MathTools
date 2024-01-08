public class MathTools {

    public int sumNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int subtractNumbers(int... numbers) {
        int subtraction = 0;
        for (int number : numbers) {
            subtraction -= number;
        }
        return subtraction;
    }

    public int multiplyNumbers(int... numbers) {
        int multiplication = 1;
        for (int number : numbers) {
            multiplication *= number;
        }
        return multiplication;
    }

    public int divideNumbers(int... numbers) {
        int division = 1;
        boolean isFirst = true;
        for (int number : numbers) {
            if (isFirst) {
                division = number;
                isFirst = false;
            } else if (number != 0) {
                division /= number;
            } else {
                System.out.println("Cannot divide by zero!");
            }
        }
        return division;
    }

    public int remainderNumbers(int... numbers) {
        int remainder = numbers.length > 0 ? numbers[0] : 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                remainder %= numbers[i];
            } else {
                System.out.println("Cannot divide by zero!");
            }
        }
        return remainder;
    }

    public double squareRoot(int number) {
        return Math.sqrt(number);
    }

    public double powerOfTwo(int number) {
        return Math.pow(number, 2);
    }

    public double cubicRoot(int number) {
        return Math.cbrt(number);
    }

    public double powerOfThree(int number) {
        return Math.pow(number, 3);
    }

    public int factorial(int number) {
        if (number < 0) return -1;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public int fibonacci(int position) {
        if (position <= 1) return position;
        int first = 0, second = 1;
        int fibonacci = 0;
        for (int i = 2; i <= position; i++) {
            fibonacci = first + second;
            first = second;
            second = fibonacci;
        }
        return fibonacci;
    }

    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public int lcm(int number1, int number2) {
        return (number1 * number2) / gcd(number1, number2);
    }

    public int gcd(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }
}
