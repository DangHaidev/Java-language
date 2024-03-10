public class StringMatching {

    public static void Search(char[] a, char[] b)
    {
        int m = a.length;
        int n = b.length;
        for (int i = 0; i <= n - m; i++)
        {
            for(int j = 0; j < m && a[j] == b[i + j]; j++)
            {
                if(j >= m - 1)
                {
                    System.out.println("Xuat hien tai vi tri " + (i + 1));
                }
            }
        }
    }

    public static void main(String[] args) {
        Search("de".toCharArray(), "abcdefde".toCharArray() );
    }
}
