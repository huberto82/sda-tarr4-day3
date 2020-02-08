package anonymous;

public class MathApp {

    public static int obliczBonus(MathOperation algorytm, int parametr1, int parametr2){
        return algorytm.calculation(parametr1, parametr2);
    }

    public static void main(String[] args) {
        //definiowanie obiektu klasy anonimowej implementującej interfejs
        MathOperation dodawanie = new MathOperation() {
            @Override
            public int calculation(int a, int b) {
                return a + b;
            }
        };
        MathOperation mnożenie = new MathOperation() {
            @Override
            public int calculation(int a, int b) {
                return a * b;
            }
        };

        System.out.println(dodawanie.calculation(4, 5));
        System.out.println(mnożenie.calculation(4,5));
        System.out.println(obliczBonus(dodawanie, 5, 7));
        System.out.println(obliczBonus(mnożenie, 6, 8));
        MathOperation algorytmBonusu = mnożenie;

        System.out.println(obliczBonus(algorytmBonusu, 5, 7));
    }
}
