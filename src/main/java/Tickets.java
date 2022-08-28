public class Tickets implements Comparable<Tickets> {
    int id;
    int price;
    int time;
    String led;
    String ego;
    protected String from;
    protected String to;

    public Tickets(int id, int price, int time, String mow, String kzn, String from, String to) {
        this.id = id;
        this.price = price;
        this.time = time;
        this.led = mow;
        this.ego = kzn;
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLed() {
        return led;
    }

    public void setLed(String led) {
        this.led = led;
    }

    public String getEgo() {
        return ego;
    }

    public void setEgo(String ego) {
        this.ego = ego;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int compareTo(Tickets o) {
        if (price < o.getPrice()) {
            return -1;
        } else if (price > o.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }
}
