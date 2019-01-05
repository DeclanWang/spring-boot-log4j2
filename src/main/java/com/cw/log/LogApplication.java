package com.cw.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动入口
 *
 * @author WangCong
 * @since 2019-01-05
 */
@Slf4j
@SpringBootApplication
public class LogApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogApplication.class, args);

        log.debug("这个是DEBUG级别日志");
        log.info("这个是INFO级别日志");
        log.warn("这个是WARN级别日志");
        log.error("这个是ERROR级别日志");
    }

}

