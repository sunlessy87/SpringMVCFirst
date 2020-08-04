package com.springMVC.controller;

import com.springMVC.model.Order;
import com.springMVC.service.OrderService;
import com.springMVC.service.OrderServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class OrderController {
    private OrderService orderService = new OrderServiceImpl();

    @RequestMapping("/welcome")
    public String printWelcome() {
        return "welcome";
    }

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String getOrderPage(Model model) {
        List<Order> orders = orderService.getAll();
        model.addAttribute("orderList", orders);
        return "order";
    }

    @RequestMapping(value = "/add-new-order", method=RequestMethod.GET)
    public String addNewOrderPage() {
        return "addNewOrder";
    }
}
