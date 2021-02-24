package io.dracula.test.tsf.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author dk
 */
@EnableScheduling
@SpringBootApplication
public class TestTsfLogging {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        SpringApplication.run(TestTsfLogging.class, args);
    }

}
