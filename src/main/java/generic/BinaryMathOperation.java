package generic;

interface BinaryMathOperation<T extends Number> {
    T apply(T a, T b);
}
