package cz.upce.inpia.simpleshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableWebMvc
@EnableFeignClients
@EnableCircuitBreaker
public class InpiaSimpleShopApplicationCatalog extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(InpiaSimpleShopApplicationCatalog.class, args);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern("/thymeleaf/static/**")) {
            registry.addResourceHandler("/thymeleaf/static/**")
                    .addResourceLocations("classpath:/thymeleaf/static/");
        }
    }
}

