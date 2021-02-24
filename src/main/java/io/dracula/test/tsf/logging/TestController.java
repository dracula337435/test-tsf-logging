package io.dracula.test.tsf.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dk
 */
@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private ValueHolder valueHolder;

    @GetMapping("a")
    public String getA(){
        return valueHolder.getA();
    }

    @Scheduled(cron = "*/2 * * * * *")
    public void printLogs(){
        System.out.println("将要打日志");
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }

}
