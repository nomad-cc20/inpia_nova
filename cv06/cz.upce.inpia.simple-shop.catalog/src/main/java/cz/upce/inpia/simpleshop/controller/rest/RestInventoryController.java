package cz.upce.inpia.simpleshop.controller.rest;

import cz.upce.inpia.simpleshop.controller.client.ProductClient;
import cz.upce.inpia.simpleshop.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class RestInventoryController {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @Autowired
    private ProductClient productClient;

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value="load-balancing-demo", method = RequestMethod.GET)
    public String greeting() {
        ServiceInstance instance = loadBalancer.choose("inventory");
        URI storesUri = URI.create(String.format("http://%s:%s", instance.getHost(), instance.getPort()));

        return restTemplate.getForObject(storesUri+"/api/inventory/"+instance.getPort(), String.class);
    }

    @RequestMapping(value="load-balancing-demo-2/{productId}", method = RequestMethod.GET)
    public Integer greeting2(@PathVariable Integer productId) {
        return productClient.findById(productId);
    }
}
