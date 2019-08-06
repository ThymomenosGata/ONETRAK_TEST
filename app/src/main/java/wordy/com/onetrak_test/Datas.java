package wordy.com.onetrak_test;

public class Datas {

    private int aerobic;
    private long date;
    private int run;
    private int walk;

    public Datas(int aerobic, long date, int run, int walk) {
        this.aerobic = aerobic;
        this.date = date;
        this.run = run;
        this.walk = walk;
    }

    public int getAerobic() {
        return aerobic;
    }

    public void setAerobic(int aerobic) {
        this.aerobic = aerobic;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getWalk() {
        return walk;
    }

    public void setWalk(int walk) {
        this.walk = walk;
    }
}
