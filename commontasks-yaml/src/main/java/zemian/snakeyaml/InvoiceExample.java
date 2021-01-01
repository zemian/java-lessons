package zemian.snakeyaml;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import zemian.snakeyaml.invoice.Invoice;

import java.io.FileReader;

public class InvoiceExample {
    public static void main(String[] args) throws Exception {
        try (FileReader reader = new FileReader("commontasks-yaml/examples/invoice.yaml")) {
            Yaml yaml = new Yaml(new Constructor(Invoice.class));
            Invoice invoice = yaml.load(reader);
            System.out.println(invoice);
        }
    }
}
