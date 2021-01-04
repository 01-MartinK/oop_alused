public class test {
    public static void main(String[] args) {
        /*
        Kommenteerimine
        Väljastamine
        Katsetamine
         */
        int rows = 5;

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
                //System.out.println(j+"Kurjam");
            }
            System.out.println();
        }

    }
}
