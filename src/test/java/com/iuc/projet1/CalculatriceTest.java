package com.iuc.projet1;

import org.example.Calculatrice;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatriceTest {

    private double x;
    private double y;
    private double r;
    private int number;

    @BeforeEach
    void setUp() {
        x=100*Math.random();
        y=50*Math.random();
        number=(int)(1000*Math.random());
    }

    @Test
    @Order(1)
    public void addition() {
        System.out.println("===== TEST ADDITION =====");
        r = x + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("r = " + r);
        // addition(2,4) == 6
        Calculatrice cal = new Calculatrice(x,y);
        // 2, 4, 6
        assertEquals(r, cal.addition());
    }

    @Test
    @Order(2)
    public void soustraction() {
        System.out.println("===== TEST SOUSTRACTION =====");
        r = x - y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("r = " + r);
        // addition(53,8) == 45
        Calculatrice cal = new Calculatrice(x,y);
        // 53, 8, 45
        assertEquals(r, cal.soustraction());
    }

    @Test
    @Order(3)
    public void multiplication() {

    }

    @Test
    @Order(4)
    public void division() {

    }
}
