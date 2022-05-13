package com.rd.training.design_principles.isp.fixed_isp;

import com.rd.training.design_principles.isp.violating_isp.ComboOrderService;

public class OrderServiceTest {
    public static void main(String[] args) {
        BurgerOrderService burgerOrderService= new OrderServiceObjectAdapter(new ComboOrderService());
        burgerOrderService.orderBurger(5);
    }
}
