class Line {

    //https://www.codewars.com/kata/double-cola/train/java

    static String WhoIsNext(String[] names, int n){

        String name;
        int numberOfCanOfCola = 1;
        int result = 0;
        int power = 0;
        int lastResult = 0;


        if (n < 6) {
            name = names[n - 1];

        } else {

            while (n >= result) {
                lastResult = result;

                for (int i = 1; i < 27; i++) {
                    result = numberOfCanOfCola + (5 * (int) Math.pow(2, power));
                }

                power++;
                numberOfCanOfCola = result;
            }

            if (n < result) {
                result = lastResult;
                power--;
            }

            int lastS = (result+4) / 5;
            int lastL = lastS + (int) Math.pow(2, power);
            int lastP = lastL + (int) Math.pow(2, power);
            int lastR = lastP + (int) Math.pow(2, power);

            int index = n - result+1;

            if(index<lastS+1) {
                name = "Sheldon";
            }else if(index>lastS&&index<lastL+1) {
                name = "Leonard";
            }else if(index>lastL&&index<lastP+1) {
                name = "Penny";
            }else if(index>lastP&&index<lastR+1) {
                name = "Rajesh";
            }else{
                name = "Howard";
            }

        }


        return name;

    }
}