package sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloConsole {
    private static Logger log = LoggerFactory.getLogger(HelloConsole.class);
    public static void main(String[] args) {
        log.info(getMessage());
    }
    static String getMessage() {
        HelloService service = new HelloService();
        return "SerivceMessage:%s".formatted(service.hello());
    }
}
