public class ulem extends sodur {
    private int tase = 1;

    public ulem() {
        //tase = this.tase+this.returnID();
    }

    public void tostaTase() {
        this.tase++;
    }

    public int getTase() {
        return this.tase;
    }

    public void setTase(int tase) {
        this.tase = this.tase + tase;
    }
}
