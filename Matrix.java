public class Matrix {
    private double x11;
    private double x12;
    private double x21;
    private double x22;
    public Matrix(double x11, double x12, double x21, double x22)
    {
        this.x11 = x11;
        this.x12 = x12;
        this.x21 = x21;
        this.x22 = x22;
    }
    public static Matrix Summ(Matrix a, Matrix b)
    {
        return new Matrix(a.x11 + b.x11, a.x12 + b.x12, a.x21 + b.x21, a.x22 + b.x22);
    }
    public static Matrix Subs(Matrix a, Matrix b)
    {
        return new Matrix(a.x11 - b.x11,a.x12 - b.x12,a.x21 - b.x21, a.x22 - b.x22);
    }
    public static Matrix Multiply(Matrix a, double x)
    {
        return new Matrix(a.x11 * x, a.x12 * x, a.x21 * x, a.x22 * x);
    }
    public static Matrix Matrix_multiply(Matrix a, Matrix b)
    {
        Matrix c = new Matrix(1,1,1,1);
        c.x11 = a.x11 * b.x11 + a.x12 * b.x21;
        c.x12 = a.x11 * b.x12 + a.x12 * b.x22;
        c.x21 = a.x21 * b.x11 + a.x22 * b.x21;
        c.x22 = a.x21 * b.x21 + a.x22 * b.x22;
        return new Matrix(c.x11,c.x12,c.x21,c.x22);
    }
    public static double Definer(Matrix a)
    {
        double Definer = a.x11 * a.x22 - a.x12 * a.x21;
        return Definer;
    }
    public static Matrix Inverse_Matrix(Matrix a)
    {
        double Def;
        a.x11 = a.x22;
        a.x12 = -a.x21;
        a.x21 = -a.x12;
        a.x22 = a.x11;
        Def = 1/Definer(a);
        Matrix c = Multiply(a,Def);
        return new Matrix(c.x11,c.x12,c.x21,c.x22);
    }
    public static void print(Matrix a)
    {
        System.out.print(a.x11 + " " + a.x12 + "\n");
        System.out.print(a.x21 + " " + a.x22 + "\n");
    }
}
