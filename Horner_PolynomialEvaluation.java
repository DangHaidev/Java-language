public class Horner_PolynomialEvaluation {
    static int horner(int[] poly, int n, int x)
    {
        int result = poly[0];
        for(int i = 1; i < n ; i++)
        {
            result = result*x + poly[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] poly = {2,0,4,-1};
        int x = 2;
        int n = poly.length;
        System.out.println(horner(poly, n, x));
    }
}
