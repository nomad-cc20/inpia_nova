package cz.upce.inpia.simpleshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableWebMvc
@EnableConfigServer
public class InpiaSimpleShopApplicationConfigServer extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(InpiaSimpleShopApplicationConfigServer.class, args);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern("/thymeleaf/static/**")) {
            registry.addResourceHandler("/thymeleaf/static/**")
                    .addResourceLocations("classpath:/thymeleaf/static/");
        }
    }
}

