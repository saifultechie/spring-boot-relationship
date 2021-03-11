package springrelationship.simple.relationship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springrelationship.simple.relationship.dto.OrderRequest;
import springrelationship.simple.relationship.entity.Customer;
import springrelationship.simple.relationship.repository.CustomerRepository;
import springrelationship.simple.relationship.repository.PostRepository;
import springrelationship.simple.relationship.repository.ProductRepository;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    @PostMapping("/order/place")
    public Customer placeOrder(@RequestBody OrderRequest request)
    {
       return  customerRepository.save(request.getCustomer());
    }
    @GetMapping("/all-orders")
    public List<Customer> findAllOrders()
    {
        return customerRepository.findAll();
    }
}
