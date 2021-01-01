package zemian.commontasks.designpatterns.producerconsumer;

public class DataProducer implements Producer {
    int counter = 1;

    @Override
    public Data generateData() {
        Data data = new Data("test" + counter);
        counter++;
        return data;
    }
}
