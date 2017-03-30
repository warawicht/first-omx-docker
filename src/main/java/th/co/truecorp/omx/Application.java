package th.co.truecorp.omx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() throws UnknownHostException {
        return "Hi I'm " + InetAddress.getLocalHost();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}