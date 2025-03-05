package com.example.calculatordemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testAdd() {
        CalculatorController controller = new CalculatorController();
        double result = controller.add(1, 2);
        assert(result == 3);
    }

    @Test
    public void testSubtract() {
        CalculatorController controller = new CalculatorController();
        double result = controller.subtract(2, 1);
        assert(result == 1);
    }

}
