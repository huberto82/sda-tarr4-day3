package generic;

public class MagicArrayApp {
    public static void main(String[] args) {
        MagicArray<String> stringMagicArray = new MagicArray<>(new String[100]);
        MagicArray<Double> doubleMagicArray = new MagicArray<>(new Double[100]);
        stringMagicArray.putAt("ALA",0);
        doubleMagicArray.putAt(10.2, 10);

        System.out.println(stringMagicArray.getAt(0));
        System.out.println(doubleMagicArray.getAt(10));
    }
}
