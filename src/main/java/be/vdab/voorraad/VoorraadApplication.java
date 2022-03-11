package be.vdab.voorraad;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VoorraadApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoorraadApplication.class, args);
    }

    //JSON data naar Java object
    @Bean
    Jackson2JsonMessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }


}
