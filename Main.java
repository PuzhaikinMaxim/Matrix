public class Main {
    public static void main(String[] args) {
        Matrix a = new Matrix(1, 2, 3, 4);
        Matrix b = new Matrix(1, 2, 3, 4);
        a = a.Matrix_multiply(a,b);
        a.print(a);
    }
}
