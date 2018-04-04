
public class Main {

    public static void main(String[] args) {

        //********** 1. Conversion

        int example1=1979;
        int example2=1481;

        System.out.println("Rzymskim odpowiednikiem roku "+example1+" jest "+Conversion.solution(example1)+".");
        System.out.println("Rzymskim odpowiednikiem roku "+example2+" jest "+Conversion.solution(example2)+".");
        System.out.println();

        //********** 2. Dec2Fact

        System.out.println("Silniowym odpowiednikiem liczby "+Dec2Fact.factString2Dec("2101803041210")+
                           " jest "+Dec2Fact.dec2FactString(998607707)+".");
        System.out.println("Silniowym odpowiednikiem liczby "+Dec2Fact.factString2Dec("23A7433540000")+
                           " jest "+Dec2Fact.dec2FactString(1116761016)+".");
        System.out.println();

        //********** 3. ProdFib

        long example3=87841;
        long example4=98643843;

        System.out.print("Liczby "+ ProdFib.productFib(example3)[0]+" i "+ProdFib.productFib(example3)[1]+" z ciągu Fibonacciego ");
        if(ProdFib.productFib(example3)[2]==1){
            System.out.println("są produktami liczby "+example3+".");
        }else{
            System.out.println("nie sa produktami liczby "+example3+", ale wynik ich mnozenia jest mniejszy niz liczba "+example3+
            "\n"+"(wynik mnozenia "+ProdFib.productFib(example3)[1]+" i kolejnej liczby ciagu Fibonacciego będzie większy niz "+example3+").");
        }

        System.out.print("Liczby "+ ProdFib.productFib(example4)[0]+" i "+ProdFib.productFib(example4)[1]+" z ciągu Fibonacciego ");
        if(ProdFib.productFib(example4)[2]==1){
            System.out.println("są produktami liczby "+example4+".");
        }else{
            System.out.println("nie sa produktami liczby "+example4+", ale wynik ich mnozenia jest mniejszy niz liczba "+example4+
                    "\n"+"(wynik mnozenia "+ProdFib.productFib(example4)[1]+" i kolejnej liczby ciagu Fibonacciego będzie większy niz "+example4+").");
        }
        System.out.println();

        //********** 4. Suite

        int example5=23;
        int example6=1144;

        System.out.println("Wynikiem równania (1 / "+example5+"!) * (1! + 2! + 3! + ... + "+example5+"!) jest liczba "+Suite.going(example5)+".");
        System.out.println("Wynikiem równania (1 / "+example6+"!) * (1! + 2! + 3! + ... + "+example6+"!) jest liczba "+Suite.going(example6)+".");
        System.out.println();

        //********** 5. Line

        int example7 =99999978;
        int example8 =485389;
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };

        System.out.println(example7+ " puszkę coli pije "+Line.WhoIsNext(names,example7)+".");
        System.out.println(example8+ " puszkę coli pije "+Line.WhoIsNext(names,example8)+".");


    }
}
