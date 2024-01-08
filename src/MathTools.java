/**
 * MathTools.java
 * This class contains methods for performing various mathematical operations.
 * At the end of this class, there is a brief documented description of the methods.
 * Methods:
 */

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

    public int quadraticEquation(int a, int b, int c) {
        int delta = (b * b) - (4 * a * c);
        if (delta < 0) return -1;
        else if (delta == 0) return -b / (2 * a);
        else {
            int x1 = (-b + (int) Math.sqrt(delta)) / (2 * a);
            int x2 = (-b - (int) Math.sqrt(delta)) / (2 * a);
            return x1 > x2 ? x1 : x2;
        }
    }

    public int delta(int a, int b, int c) {
        return (b * b) - (4 * a * c);
    }

   public int triangleArea(int base, int height) {
        return (base * height) / 2;
    }

    public int rectangleArea(int base, int height) {
        return base * height;
    }

    public int squareArea(int side) {
        return side * side;
    }

    public int circleArea(int radius) {
        return (int) (Math.PI * Math.pow(radius, 2));
    }

    public int trapezoidArea(int base1, int base2, int height) {
        return ((base1 + base2) * height) / 2;
    }

    public int rhombusArea(int diagonal1, int diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }

    public int cubeVolume(int side) {
        return side * side * side;
    }

    public int rectangularPrismVolume(int base, int height, int depth) {
        return base * height * depth;
    }

    public int cylinderVolume(int radius, int height) {
        return (int) (Math.PI * Math.pow(radius, 2) * height);
    }

    public int coneVolume(int radius, int height) {
        return (int) ((Math.PI * Math.pow(radius, 2) * height) / 3);
    }

    public int sphereVolume(int radius) {
        return (int) ((4 * Math.PI * Math.pow(radius, 3)) / 3);
    }

    public int pyramidVolume(int base, int height) {
        return (base * height) / 3;
    }

    public int trianglePerimeter(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }

    public int rectanglePerimeter(int base, int height) {
        return (base + height) * 2;
    }

    public int squarePerimeter(int side) {
        return side * 4;
    }

    public int circlePerimeter(int radius) {
        return (int) (2 * Math.PI * radius);
    }

    public int trapezoidPerimeter(int side1, int side2, int side3, int side4) {
        return side1 + side2 + side3 + side4;
    }

    public int rhombusPerimeter(int side) {
        return side * 4;
    }

    public int cubeSurfaceArea(int side) {
        return 6 * (side * side);
    }

    public int meterToCentimeter(int meter) {
        return meter * 100;
    }

    public int meterToMillimeter(int meter) {
        return meter * 1000;
    }

    public int meterToKilometer(int meter) {
        return meter / 1000;
    }

    public int centimeterToMeter(int centimeter) {
        return centimeter / 100;
    }

    public int centimeterToMillimeter(int centimeter) {
        return centimeter * 10;
    }

    public int centimeterToKilometer(int centimeter) {
        return centimeter / 100000;
    }

    public int millimeterToMeter(int millimeter) {
        return millimeter / 1000;
    }

    public int millimeterToCentimeter(int millimeter) {
        return millimeter / 10;
    }

    public int millimeterToKilometer(int millimeter) {
        return millimeter / 1000000;
    }

    public int kilometerToMeter(int kilometer) {
        return kilometer * 1000;
    }

    public int kilometerToCentimeter(int kilometer) {
        return kilometer * 100000;
    }

    public int kilometerToMillimeter(int kilometer) {
        return kilometer * 1000000;
    }

    public int kilometerToMile(int kilometer) {
        return (int) (kilometer * 0.621371);
    }

    public int mileToKilometer(int mile) {
        return (int) (mile * 1.60934);
    }

    public double weightToGram(int weight, String unit) {
        switch (unit) {
            case "ton":
                return weight * 1000000;
            case "kilogram":
                return weight * 1000;
            case "pound":
                return weight * 453.592;
            case "ounce":
                return weight * 28.3495;
            default:
                return weight;
        }
    }

    public double gramToWeight(int gram, String unit) {
        switch (unit) {
            case "ton":
                return gram / 1000000;
            case "kilogram":
                return gram / 1000;
            case "pound":
                return gram / 453.592;
            case "ounce":
                return gram / 28.3495;
            default:
                return gram;
        }
    }

    public double temperatureToFahrenheit(int temperature) {
        return (temperature * 9 / 5) + 32;
    }

    public double temperatureToCelsius(int temperature) {
        return (temperature - 32) * 5 / 9;
    }

    public double temperatureToKelvin(int temperature) {
        return temperature + 273.15;
    }

    public double fahrenheitToTemperature(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToTemperature(int celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double kelvinToTemperature(int kelvin) {
        return kelvin - 273.15;
    }

    public double speedToKilometerPerHour(int speed, String unit) {
        switch (unit) {
            case "mile per hour":
                return speed * 1.60934;
            case "meter per second":
                return speed * 3.6;
            default:
                return speed;
        }
    }

    public double speedToMilePerHour(int speed, String unit) {
        switch (unit) {
            case "kilometer per hour":
                return speed * 0.621371;
            case "meter per second":
                return speed * 2.23694;
            default:
                return speed;
        }
    }

    public double speedToMeterPerSecond(int speed, String unit) {
        switch (unit) {
            case "kilometer per hour":
                return speed / 3.6;
            case "mile per hour":
                return speed / 2.23694;
            default:
                return speed;
        }
    }

    public double kilometerPerHourToSpeed(int kilometerPerHour, String unit) {
        switch (unit) {
            case "mile per hour":
                return kilometerPerHour * 0.621371;
            case "meter per second":
                return kilometerPerHour * 3.6;
            default:
                return kilometerPerHour;
        }
    }

    public double milePerHourToSpeed(int milePerHour, String unit) {
        switch (unit) {
            case "kilometer per hour":
                return milePerHour * 1.60934;
            case "meter per second":
                return milePerHour * 2.23694;
            default:
                return milePerHour;
        }
    }

    public double meterPerSecondToSpeed(int meterPerSecond, String unit) {
        switch (unit) {
            case "kilometer per hour":
                return meterPerSecond * 3.6;
            case "mile per hour":
                return meterPerSecond * 2.23694;
            default:
                return meterPerSecond;
        }
    }

    public double areaToSquareMeter(int area, String unit) {
        switch (unit) {
            case "square kilometer":
                return area * 1000000;
            case "square mile":
                return area * 2589988.11;
            case "square yard":
                return area * 0.836127;
            case "square foot":
                return area * 0.092903;
            case "square inch":
                return area * 0.00064516;
            case "hectare":
                return area * 10000;
            case "acre":
                return area * 4046.86;
            default:
                return area;
        }
    }

    public double areaToSquareKilometer(int area, String unit) {
        switch (unit) {
            case "square meter":
                return area / 1000000;
            case "square mile":
                return area * 0.386102;
            case "square yard":
                return area * 1.19599e-6;
            case "square foot":
                return area * 1.07639e-5;
            case "square inch":
                return area * 1.19599e-9;
            case "hectare":
                return area / 100;
            case "acre":
                return area * 0.00404686;
            default:
                return area;
        }
    }

    public double areaToSquareMile(int area, String unit) {
        switch (unit) {
            case "square meter":
                return area / 2589988.11;
            case "square kilometer":
                return area * 2.58999;
            case "square yard":
                return area * 3.22831e-7;
            case "square foot":
                return area * 3.58701e-8;
            case "square inch":
                return area * 3.22831e-10;
            case "hectare":
                return area / 259;
            case "acre":
                return area * 0.0015625;
            default:
                return area;
        }
    }

    public double areaToSquareYard(int area, String unit) {
        switch (unit) {
            case "square meter":
                return area / 0.836127;
            case "square kilometer":
                return area * 1195990.05;
            case "square mile":
                return area * 3.22831e-7;
            case "square foot":
                return area * 0.111111;
            case "square inch":
                return area * 0.000771605;
            case "hectare":
                return area * 11959.9;
            case "acre":
                return area * 0.000206612;
            default:
                return area;
        }
    }

    public double areaToSquareFoot(int area, String unit) {
        switch (unit) {
            case "square meter":
                return area / 0.092903;
            case "square kilometer":
                return area * 10763910.4;
            case "square mile":
                return area * 3.58701e-8;
            case "square yard":
                return area * 9;
            case "square inch":
                return area * 0.00694444;
            case "hectare":
                return area * 107639;
            case "acre":
                return area * 0.0000229568;
            default:
                return area;
        }
    }

    public double areaToSquareInch(int area, String unit) {
        switch (unit) {
            case "square meter":
                return area / 0.00064516;
            case "square kilometer":
                return area * 1550003100;
            case "square mile":
                return area * 1.59423e-9;
            case "square yard":
                return area * 1296;
            case "square foot":
                return area * 144;
            case "hectare":
                return area * 15500031;
            case "acre":
                return area * 0.000000159423;
            default:
                return area;
        }
    }

    public double areaToHectare(int area, String unit) {
        switch (unit) {
            case "square meter":
                return area / 10000;
            case "square kilometer":
                return area * 100;
            case "square mile":
                return area * 0.00386102;
            case "square yard":
                return area * 0.000119599;
            case "square foot":
                return area * 0.0000107639;
            case "square inch":
                return area * 1.19599e-7;
            case "acre":
                return area * 0.0247105;
            default:
                return area;
        }
    }

    public double areaToAcre(int area, String unit) {
        switch (unit) {
            case "square meter":
                return area / 4046.86;
            case "square kilometer":
                return area * 0.00404686;
            case "square mile":
                return area * 0.0015625;
            case "square yard":
                return area * 0.000206612;
            case "square foot":
                return area * 0.0000229568;
            case "square inch":
                return area * 2.29568e-8;
            case "hectare":
                return area * 0.404686;
            default:
                return area;
        }
    }

    public double volumeToCubicMeter(int volume, String unit) {
        switch (unit) {
            case "cubic kilometer":
                return volume * 1000000000;
            case "cubic mile":
                return volume * 4168181825.44;
            case "cubic yard":
                return volume * 0.764555;
            case "cubic foot":
                return volume * 0.0283168;
            case "cubic inch":
                return volume * 0.0000163871;
            case "liter":
                return volume / 1000;
            case "milliliter":
                return volume / 1000000;
            case "gallon":
                return volume * 0.00378541;
            default:
                return volume;
        }
    }

    public double volumeToCubicKilometer(int volume, String unit) {
        switch (unit) {
            case "cubic meter":
                return volume / 1000000000;
            case "cubic mile":
                return volume * 2.39913e-10;
            case "cubic yard":
                return volume * 1.30795e-9;
            case "cubic foot":
                return volume * 3.53147e-8;
            case "cubic inch":
                return volume * 6.10237e-11;
            case "liter":
                return volume / 1000000000;
            case "milliliter":
                return volume / 1000000000;
            case "gallon":
                return volume * 2.64172e-10;
            default:
                return volume;
        }
    }

    public double volumeToCubicMile(int volume, String unit) {
        switch (unit) {
            case "cubic meter":
                return volume / 4168181825.44;
            case "cubic kilometer":
                return volume * 4.16818e-10;
            case "cubic yard":
                return volume * 1.30795e-9;
            case "cubic foot":
                return volume * 3.53147e-8;
            case "cubic inch":
                return volume * 6.10237e-11;
            case "liter":
                return volume / 4168181825.44;
            case "milliliter":
                return volume / 4168181825.44;
            case "gallon":
                return volume * 2.64172e-10;
            default:
                return volume;
        }
    }

    public int hourToMinute(int hour) {
        return hour * 60;
    }

    public int hourToSecond(int hour) {
        return hour * 3600;
    }

    public int hourToMillisecond(int hour) {
        return hour * 3600000;
    }

    public int minuteToHour(int minute) {
        return minute / 60;
    }

    public int minuteToSecond(int minute) {
        return minute * 60;
    }

    public int minuteToMillisecond(int minute) {
        return minute * 60000;
    }

    public int secondToHour(int second) {
        return second / 3600;
    }

    public int secondToMinute(int second) {
        return second / 60;
    }

    public int secondToMillisecond(int second) {
        return second * 1000;
    }

    public int millisecondToHour(int millisecond) {
        return millisecond / 3600000;
    }

    public int millisecondToMinute(int millisecond) {
        return millisecond / 60000;
    }

    public int millisecondToSecond(int millisecond) {
        return millisecond / 1000;
    }

    public double speedToKilometerPerSecond(int speed, String unit) {
        switch (unit) {
            case "kilometer per hour":
                return speed / 3600;
            case "mile per hour":
                return speed / 2236.94;
            case "meter per second":
                return speed / 1000;
            default:
                return speed;
        }
    }
}

/**
 * MathTools.java
 * This class contains methods for performing various mathematical operations.
 *
 * Methods:
 * sumNumbers(int... numbers): Calculates the sum of all input numbers.
 * subtractNumbers(int... numbers): Subtracts all input numbers from each other, in sequence.
 * multiplyNumbers(int... numbers): Multiplies all input numbers together.
 * divideNumbers(int... numbers): Divides the first input number by the rest of the input numbers, handling division by zero.
 * remainderNumbers(int... numbers): Computes the remainder of the first input number when divided by the rest, handling division by zero.
 * squareRoot(int number): Returns the square root of the input number.
 * powerOfTwo(int number): Calculates the square (power of 2) of the input number.
 * cubicRoot(int number): Computes the cubic root of the input number.
 * powerOfThree(int number): Calculates the cube (power of 3) of the input number.
 * factorial(int number): Computes the factorial of the input number.
 * fibonacci(int position): Calculates the Fibonacci number at the given position.
 * isPrime(int number): Determines if the input number is prime.
 * lcm(int number1, int number2): Calculates the least common multiple between two numbers.
 * gcd(int number1, int number2): Calculates the greatest common divisor between two numbers.
 * quadraticEquation(int a, int b, int c): Solves a quadratic equation and returns the roots if they exist.
 * delta(int a, int b, int c): Calculates the discriminant of a quadratic equation.
 * triangleArea(int base, int height): Calculates the area of a triangle given its base and height.
 * rectangleArea(int base, int height): Calculates the area of a rectangle given its base and height.
 * squareArea(int side): Calculates the area of a square given its side length.
 * circleArea(int radius): Calculates the area of a circle given its radius.
 * trapezoidArea(int base1, int base2, int height): Calculates the area of a trapezoid given its two bases and height.
 * rhombusArea(int diagonal1, int diagonal2): Calculates the area of a rhombus given its two diagonals.
 * cubeVolume(int side): Calculates the volume of a cube given its side length.
 * rectangularPrismVolume(int base, int height, int depth): Calculates the volume of a rectangular prism given its base, height, and depth.
 * cylinderVolume(int radius, int height): Calculates the volume of a cylinder given its radius and height.
 * coneVolume(int radius, int height): Calculates the volume of a cone given its radius and height.
 * sphereVolume(int radius): Calculates the volume of a sphere given its radius.
 * pyramidVolume(int base, int height): Calculates the volume of a pyramid given its base and height.
 * trianglePerimeter(int side1, int side2, int side3): Calculates the perimeter of a triangle given its three sides.
 * rectanglePerimeter(int base, int height): Calculates the perimeter of a rectangle given its base and height.
 * squarePerimeter(int side): Calculates the perimeter of a square given its side length.
 * circlePerimeter(int radius): Calculates the perimeter of a circle given its radius.
 * trapezoidPerimeter(int side1, int side2, int side3, int side4): Calculates the perimeter of a trapezoid given its four sides.
 * rhombusPerimeter(int side): Calculates the perimeter of a rhombus given the length of one side.
 * cubeSurfaceArea(int side): Calculates the surface area of a cube given its side length.
 * meterToCentimeter(int meter): Converts meters to centimeters.
 * meterToMillimeter(int meter): Converts meters to millimeters.
 * meterToKilometer(int meter): Converts meters to kilometers.
 * centimeterToMeter(int centimeter): Converts centimeters to meters.
 * centimeterToMillimeter(int centimeter): Converts centimeters to millimeters.
 * centimeterToKilometer(int centimeter): Converts centimeters to kilometers.
 * millimeterToMeter(int millimeter): Converts millimeters to meters.
 * millimeterToCentimeter(int millimeter): Converts millimeters to centimeters.
 * millimeterToKilometer(int millimeter): Converts millimeters to kilometers.
 * kilometerToMeter(int kilometer): Converts kilometers to meters.
 * kilometerToCentimeter(int kilometer): Converts kilometers to centimeters.
 * kilometerToMillimeter(int kilometer): Converts kilometers to millimeters.
 * kilometerToMile(int kilometer): Converts kilometers to miles.
 * mileToKilometer(int mile): Converts miles to kilometers.
 * weightToGram(int weight, String unit): Converts weights from various units to grams.
 * gramToWeight(int gram, String unit): Converts weights from grams to various units.
 * temperatureToFahrenheit(int temperature): Converts temperature from Celsius to Fahrenheit.
 * temperatureToCelsius(int temperature): Converts temperature from Fahrenheit to Celsius.
 * temperatureToKelvin(int temperature): Converts temperature to Kelvin.
 * fahrenheitToTemperature(int fahrenheit): Converts temperature from Fahrenheit to Celsius.
 * celsiusToTemperature(int celsius): Converts temperature from Celsius to Fahrenheit.
 * kelvinToTemperature(int kelvin): Converts temperature from Kelvin to Celsius.
 * speedToKilometerPerHour(int speed, String unit): Converts speed from various units to kilometers per hour.
 * speedToMilePerHour(int speed, String unit): Converts speed from various units to miles per hour.
 * speedToMeterPerSecond(int speed, String unit): Converts speed from various units to meters per second.
 * kilometerPerHourToSpeed(int kilometerPerHour, String unit): Converts speed from kilometers per hour to various units.
 * milePerHourToSpeed(int milePerHour, String unit): Converts speed from miles per hour to various units.
 * meterPerSecondToSpeed(int meterPerSecond, String unit): Converts speed from meters per second to various units.
 * areaToSquareMeter(int area, String unit): Converts areas from various units to square meters.
 * areaToSquareKilometer(int area, String unit): Converts areas from various units to square kilometers.
 * areaToSquareMile(int area, String unit): Converts areas from various units to square miles.
 * areaToSquareYard(int area, String unit): Converts areas from various units to square yards.
 * areaToSquareFoot(int area, String unit): Converts areas from various units to square feet.
 * areaToSquareInch(int area, String unit): Converts areas from various units to square inches.
 * areaToHectare(int area, String unit): Converts areas from various units to hectares.
 * areaToAcre(int area, String unit): Converts areas from various units to acres.
 * volumeToCubicMeter(int volume, String unit): Converts volumes from various units to cubic meters.
 * volumeToCubicKilometer(int volume, String unit): Converts volumes from various units to cubic kilometers.
 * volumeToCubicMile(int volume, String unit): Converts volumes from various units to cubic miles.
 * hourToMinute(int hour): Converts hours to minutes.
 * hourToSecond(int hour): Converts hours to seconds.
 * hourToMillisecond(int hour): Converts hours to milliseconds.
 * minuteToHour(int minute): Converts minutes to hours.
 * minuteToSecond(int minute): Converts minutes to seconds.
 * minuteToMillisecond(int minute): Converts minutes to milliseconds.
 * secondToHour(int second): Converts seconds to hours.
 * secondToMinute(int second): Converts seconds to minutes.
 * secondToMillisecond(int second): Converts seconds to milliseconds.
 * millisecondToHour(int millisecond): Converts milliseconds to hours.
 * millisecondToMinute(int millisecond): Converts milliseconds to minutes.
 * millisecondToSecond(int millisecond): Converts milliseconds to seconds.
 * speedToKilometerPerSecond(int speed, String unit): Converts speed from various units to kilometers per second.
 */