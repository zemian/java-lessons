package zemian.commontasks.log4j2;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Arrays;

/**
 * By default, it picks up classpath "log4j2.xml" resource file.
 *
 * To change this, use the following:
 *
 * java -Dlog4j2.configurationFile=/path/to/log4j2.xml
 *
 * See https://logging.apache.org/log4j/2.x/manual/configuration.html
 */
public class Log4j2Example {
    public static Logger LOG = LogManager.getLogger(Log4j2Example.class);

    public static void main(String[] args) {
        LOG.trace("Testing finer message");
        LOG.debug("Testing fine message");
        LOG.info("Testing info message");
        LOG.warn("Testing warning message");
        LOG.error("Testing severe message");

        Exception ex = new RuntimeException("Oops!");
        LOG.error("Something bad has happened.", ex);

        LOG.info("Arguments {}", Arrays.toString(args));
    }
}
