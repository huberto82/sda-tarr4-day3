package generic;

public class BinaryMathOperationApp {
    //Metoda parametryczna
    public static <N extends Number> N obliczBonus(BinaryMathOperation<N> algorytm, N parametr1, N parametr2){
        return algorytm.apply(parametr1, parametr2);
    }


    public static void main(String[] args) {
        BinaryMathOperation<Double> dodawanie = new BinaryMathOperation<Double>() {
            @Override
            public Double apply(Double a, Double b) {
                return a + b;
            }
        };

        BinaryMathOperation<Integer> mnozenie = new BinaryMathOperation<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a * b;
            }
        };
        System.out.println(dodawanie.apply(3.5, 5.6));
        System.out.println(mnozenie.apply(3, 7));
    }
}
