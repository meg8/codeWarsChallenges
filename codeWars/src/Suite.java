import java.math.BigInteger;
import java.math.BigDecimal;

class Suite {

    //https://www.codewars.com/kata/going-to-zero-or-to-infinity/train/java

    static double going(int n) {

        BigInteger theBigestFactorial = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        BigInteger[] factorial = new BigInteger[n];

        for (int i = 0; i < n; i++) {
            BigInteger index = new BigInteger(String.valueOf(i + 1));
            theBigestFactorial = theBigestFactorial.multiply(index);
            factorial[i] = theBigestFactorial;
        }

        for (int i = 0; i < n; i++) {
            sum = sum.add(factorial[i]);
        }

        BigDecimal divide = BigDecimal.ONE.divide((new BigDecimal(theBigestFactorial)),50000, BigDecimal.ROUND_HALF_UP);
        BigDecimal multiply =(new BigDecimal(sum)).multiply(divide);

        double result=multiply.doubleValue();

        result = ((int) (result * 1e6) / 1e6);

        return result;
    }

}