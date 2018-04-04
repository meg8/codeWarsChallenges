import java.math.BigInteger;

class ProdFib {

    //https://www.codewars.com/kata/product-of-consecutive-fib-numbers/train/java

    static long[] productFib(long prod) {

        BigInteger product = new BigInteger(String.valueOf(prod));

        BigInteger[] fibonacci = new BigInteger[93];
        fibonacci[0]=BigInteger.ZERO;
        fibonacci[1]=BigInteger.ONE;

        for (int i = 2; i < 93; i++) {
            fibonacci[i] = fibonacci[i-1].add(fibonacci[i-2]);
        }

        long[] result = new long[3];

        boolean equality = false;

        for (int i = 0; i < 92; i++) {

            if ((fibonacci[i].multiply(fibonacci[i + 1])).compareTo(product)==0) {
                result[0] = fibonacci[i].longValue();
                result[1] = fibonacci[i + 1].longValue();
                result[2] = BigInteger.ONE.longValue();
                equality = true;
            }
        }

        if (!equality) {

            BigInteger[] multiplication = new BigInteger[92];


            for (int i = 0; i < 92; i++) {
                multiplication[i] = fibonacci[i].multiply(fibonacci[i + 1]);
            }

            int j=0;


            for(int i=91;i>-1;i--){
                if(multiplication[i].compareTo(product)<0){
                    j++;}

                result[0] = fibonacci[j].longValue();
                result[1] = fibonacci[j+1].longValue();
                result[2] = BigInteger.ZERO.longValue();

            }
        }

        return result;

    }

}