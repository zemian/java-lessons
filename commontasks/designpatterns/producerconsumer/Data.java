package designpatterns.producerconsumer;

public class Data {
    String description;

    public Data() {
    }

    public Data(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Data{" +
                "description='" + description + '\'' +
                '}';
    }
}
