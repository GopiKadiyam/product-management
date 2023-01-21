package com.gk.productmanagement.controller;

import com.gk.productmanagement.entity.Order;
import com.gk.productmanagement.entity.Product;
import com.gk.productmanagement.entity.User;
import com.gk.productmanagement.model.CreateOrderRequestDTO;
import com.gk.productmanagement.model.CreateProductResponseDTO;
import com.gk.productmanagement.repository.OrderRepository;
import com.gk.productmanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    public Long createOrder(@RequestBody CreateOrderRequestDTO createOrderRequestDTO) {
        Order order=new Order();
        order.setPaymentStatus(createOrderRequestDTO.getPaymentStatus());
        order.setPaymentType(createOrderRequestDTO.getPaymentType());

        User user=new User();
        user.setId(createOrderRequestDTO.getUserId());
        order.setUser(user);
        Product product=new Product();
        product.setId(createOrderRequestDTO.getProductId());
        order.setProduct(product);

        Order savedOrder=orderRepository.save(order);

        return savedOrder.getId();
    }
}
