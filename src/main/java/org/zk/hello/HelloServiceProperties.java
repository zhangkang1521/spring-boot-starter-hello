package org.zk.hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 4/26/2018.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static final String DEFAULT_MSG = "world";

    private String msg = DEFAULT_MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
