import java.math.BigInteger;

//https://www.codewars.com/kata/decimal-to-factorial-and-back/train/java

class Dec2Fact {

    static String dec2FactString(long nb) {

        long decimal = nb;
        int counter = 0;
        int factNumLength = 1;

        while (decimal > 0) {
            decimal = decimal / factNumLength;
            counter++;
            factNumLength++;
        }

        StringBuilder str = new StringBuilder();
        long[] tab = new long[counter];
        int factNumTab = 1;

        for (int i = tab.length - 1; i > -1; i--) {
            tab[i] = nb % factNumTab;
            nb = nb / factNumTab;
            factNumTab++;
        }

        String[] factString = new String[tab.length];

        for (int i = 0; i < tab.length; i++) {
            factString[i] = "" + tab[i];
        }

        for (int i = 0; i < factString.length; i++) {
            switch (factString[i]) {
                case "15":
                    factString[i] = "F";
                    break;
                case "14":
                    factString[i] = "E";
                    break;
                case "13":
                    factString[i] = "D";
                    break;
                case "12":
                    factString[i] = "C";
                    break;
                case "11":
                    factString[i] = "B";
                    break;
                case "10":
                    factString[i] = "A";
                    break;
            }
        }

        for (String aFactString : factString) {
            str.append(aFactString);
        }

        return str.toString();

    }


    static long factString2Dec(String str) {

        BigInteger[] factorial = new BigInteger[25];
        BigInteger fact = BigInteger.ONE;
        for (int i = 0; i < 25; i++) {
            BigInteger index = new BigInteger(String.valueOf(i + 1));
            fact = fact.multiply(index);
            factorial[i] = fact;
        }

        int length = str.length();
        String [] transformation=new String[length];

        for (int i =0; i < length; i++) {
            transformation[i]=String.valueOf(str.charAt(i));
        }

        for (int i = 0; i < transformation.length; i++) {
            switch (transformation[i]) {
                case "F":
                    transformation[i] = "15";
                    break;
                case "E":
                    transformation[i] = "14";
                    break;
                case "D":
                    transformation[i] = "13";
                    break;
                case "C":
                    transformation[i] = "12";
                    break;
                case "B":
                    transformation[i] = "11";
                    break;
                case "A":
                    transformation[i] = "10";
                    break;
            }
        }

        BigInteger result = BigInteger.ZERO;
        int number = 0;

        for (int i = transformation.length - 2; i > -1; i--) {
            result = result.add((new BigInteger(transformation[i])).multiply(factorial[number]));
            number++;
        }

        return result.longValue();
    }
}