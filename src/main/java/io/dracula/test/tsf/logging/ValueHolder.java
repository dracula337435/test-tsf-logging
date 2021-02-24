package io.dracula.test.tsf.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class ValueHolder implements InitializingBean, DisposableBean {

    private static final Logger logger = LoggerFactory.getLogger(ValueHolder.class);

    @Value("${a}")
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public void destroy() throws Exception {
        logger.info("destroy holder");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("init holder");
    }

}
