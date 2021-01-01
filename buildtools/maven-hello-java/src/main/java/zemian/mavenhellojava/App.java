package zemian.mavenhellojava;

import org.apache.commons.lang3.RandomUtils;

public class App {
    public static void main( String[] args ) throws Exception {
        double r = RandomUtils.nextDouble(0.0, 2.0);
        System.out.println(r);
    }
}
