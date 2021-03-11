package sec_04_03.step_08;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Main {
    private static void configureLogging() {
        Logger.getLogger("org.stepic.java.logging.ClassA").setLevel(Level.ALL);
        Logger.getLogger("org.stepic.java.logging.ClassB").setLevel(Level.WARNING);

        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.ALL);
        ch.setFormatter(new XMLFormatter());

        Logger logger = Logger.getLogger("org.stepic.java");
        logger.setUseParentHandlers(false);
        logger.addHandler(ch);
    }
}