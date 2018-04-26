package org.zk.hello;

/**
 * Created by Administrator on 4/26/2018.
 */
public class HelloService {

    private String msg;

    public String sayHello() {
        return "hello," + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
