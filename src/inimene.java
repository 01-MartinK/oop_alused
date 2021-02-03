import java.text.DecimalFormat;

public class inimene {
    private static int kasutatudJK = 0;
    private int jk = 0;
    private int id;

    public inimene() {
        this.id = kasutatudJK;
        this.jk = this.id;
        this.id = ++kasutatudJK;

        //System.out.println(this.jk);
        //System.out.println(this.id);
    }

    public void info() {
        System.out.println(jk);
    }


    public int getJk() {
        return jk;
    }

    public void setJk(int jk) {
        this.jk = jk;
    }

    public int getId() {
        return id;
    }
}
