package log4j.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kasun on 2/28/17.
 */

public class LogTest {

    private Logger logger;

    @Before
    public void loggerTest() {
        logger = Logger.getLogger("logger");
        logger.removeAllAppenders();
        Logger rootLogger = Logger.getRootLogger();
        rootLogger.removeAllAppenders();
    }

    @Test
    public void basicLogger() {
        BasicConfigurator.configure();
        logger.info("basicLogger");
    }

    @Test
    public void addAppenderWithStream() {
        logger.addAppender(new ConsoleAppender(
                new PatternLayout("%p %t %m%n"),
                ConsoleAppender.SYSTEM_OUT));
        logger.info("addAppenderWithStream");
    }

    @Test
    public void addAppenderWithoutStream() {
        logger.addAppender(new ConsoleAppender(
                new PatternLayout("%p %t %m%n")));
        logger.info("addAppenderWithoutStream");
    }


}
