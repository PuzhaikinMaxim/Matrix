public class Main {
    public static void main(String[] args) {
        Matrix a = new Matrix(1, 2, 3, 4);
        Matrix b = new Matrix(1, 2, 3, 4);
        Matrix c = new Matrix(4, 5, 6, 7);
        double d;
        /*d = a.Definer(a);
        a.print(a.Inverse_Matrix(a));*/
        a.print(a.Summ(a, a.Summ(a,a)));
        /*a.print(a.Subs(a,b));
        a.print(a.Multiply(a,8));
        a.print(a.Matrix_multiply(a,b));*/
        //System.out.println(d);
    }
}
