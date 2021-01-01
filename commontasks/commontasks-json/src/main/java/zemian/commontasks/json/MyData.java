package zemian.commontasks.json;

import java.util.Date;

public class MyData {
    private String name;
    private int value;
    private Date timestamp;
    private double rate;

    public MyData(String name, int value, Date timestamp, double rate) {
        this.name = name;
        this.value = value;
        this.timestamp = timestamp;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", timestamp=" + timestamp +
                ", rate=" + rate +
                '}';
    }
}
