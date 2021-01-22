import java.util.ArrayList;

public class Menyy {

    private ArrayList<String> soogid;

    public Menyy() {
        this.soogid = new ArrayList<String>();
    }

    // lisa meetodid siia

    public void lisaSook(String sook) {
        if (this.soogid.contains(sook)) {
            System.out.println("Vabandage kuid see söök on juba menyys.");
        } else {
            this.soogid.add(sook);
        }
    }
}

