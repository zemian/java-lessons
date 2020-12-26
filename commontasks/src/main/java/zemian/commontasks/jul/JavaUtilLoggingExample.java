package zemian.commontasks.jul;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * To enable logging:
 * java -Djava.util.logging.config.file=/Users/zedeng/src/zemian/java-lessons/commontasks/src/main/resources/logging.properties zemian.commontasks.jul.JavaUtilLoggingExample
 */
public class JavaUtilLoggingExample {
    public static Logger LOG = Logger.getLogger(JavaUtilLoggingExample.class.getName());

    public static void main(String[] args) {
        LOG.finest("Testing finest message");
        LOG.finer("Testing finer message");
        LOG.fine("Testing fine message");
        LOG.info("Testing info message");
        LOG.warning("Testing warning message");
        LOG.severe("Testing severe message");

        Exception ex = new RuntimeException("Oops!");
        LOG.log(Level.SEVERE, "Something bad has happened.", ex);
    }
}
