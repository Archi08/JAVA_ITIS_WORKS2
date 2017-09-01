package task_25;

public abstract class Transport {
    private String type;
    private int weigh;

    public Transport(String type, int weigh) {
        this.type = type;
        this.weigh = weigh;
    }


    public String getType() {
        return type;
    }

    public int getWeigh() {
        return weigh;
    }
    public abstract void come();
    public abstract void leave();
    public abstract  int getCarNumbers();
}
