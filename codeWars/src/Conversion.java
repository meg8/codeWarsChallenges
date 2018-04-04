class Conversion {

    //https://www.codewars.com/kata/roman-numerals-encoder/train/java

    static String solution(int n) {

        String nString=n+"";
        String roman="";

        if(nString.length()==1){
            nString="000"+nString;
        }else if(nString.length()==2){
            nString="00"+nString;
        }else if(nString.length()==3){
            nString="0"+nString;
        }

        switch(nString.charAt(0)){
            case '0': roman+="";
                break;
            case '1': roman+="M";
                break;
            case '2': roman+="MM";
                break;
            case '3': roman+="MMM";
                break;
        }

        switch(nString.charAt(1)){
            case '0': roman+="";
                break;
            case '1': roman+="C";
                break;
            case '2': roman+="CC";
                break;
            case '3': roman+="CCC";
                break;
            case '4': roman+="CD";
                break;
            case '5': roman+="D";
                break;
            case '6': roman+="DC";
                break;
            case '7': roman+="DCC";
                break;
            case '8': roman+="DCCC";
                break;
            case '9': roman+="CM";
        }

        switch(nString.charAt(2)){
            case '0': roman+="";
                break;
            case '1': roman+="X";
                break;
            case '2': roman+="XX";
                break;
            case '3': roman+="XXX";
                break;
            case '4': roman+="XL";
                break;
            case '5': roman+="L";
                break;
            case '6': roman+="LX";
                break;
            case '7': roman+="LXX";
                break;
            case '8': roman+="LXXX";
                break;
            case '9': roman+="XC";
        }

        switch(nString.charAt(3)){
            case '0': roman+="";
                break;
            case '1': roman+="I";
                break;
            case '2': roman+="II";
                break;
            case '3': roman+="III";
                break;
            case '4': roman+="IV";
                break;
            case '5': roman+="V";
                break;
            case '6': roman+="VI";
                break;
            case '7': roman+="VII";
                break;
            case '8': roman+="VIII";
                break;
            case '9': roman+="IX";
        }

        return roman;
    }
}