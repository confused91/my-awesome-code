package com.training.design_principles.isp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BurgerOrderService implements OrderService {
    static Logger logger = LogManager.getLogger(com.training.design_principles.isp.BurgerOrderService.class);

    @Override
    public void orderBurger(int quantity) {
        logger.info("Received " + quantity + "burgers");
    }

    @Override
    public void orderFries(int fries) {
        throw new UnsupportedOperationException("No fries in burger only order!");
    }

    @Override
    public void orderCombo(int quantity, int fries) {
        throw new UnsupportedOperationException("No combo in burger only order!");

    }
}
