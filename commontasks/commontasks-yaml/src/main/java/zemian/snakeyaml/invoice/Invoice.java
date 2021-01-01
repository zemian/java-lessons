package zemian.snakeyaml.invoice;

// https://bitbucket.org/asomov/snakeyaml/src/master/src/test/java/org/yaml/snakeyaml/
import java.util.List;

public class Invoice {
    public Integer invoice; // invoice
    public String date; // date
    public Person billTo;// bill-to
    public Person shipTo;// ship-to
    public List<Product> product;
    public Float tax;
    public Float total;
    public String comments;


    @Override
    public String toString() {
        return "Invoice{" +
                "invoice=" + invoice +
                ", date='" + date + '\'' +
                ", billTo=" + billTo +
                ", shipTo=" + shipTo +
                ", product=" + product +
                ", tax=" + tax +
                ", total=" + total +
                ", comments='" + comments + '\'' +
                '}';
    }
}