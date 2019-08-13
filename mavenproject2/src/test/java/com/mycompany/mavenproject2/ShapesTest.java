/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lin
 */
public class ShapesTest {
    
    public ShapesTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   /**
     * Test of computeAreaTriangle method, of class Shapes.
     */
    @Test
    public void testComputeAreaTriangle() throws Exception {
        System.out.println("computeAreaTriangle");
        double base = 0.0;
        double height = 0.0;
        double expResult = 0.0;
        double result = Shapes.computeAreaTriangle(base, height);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of computeAreaRectangle method, of class Shapes.
     */
    @Test
    public void testComputeAreaRectangle() throws Exception {
        System.out.println("computeAreaRectangle");
        double width = 0.0;
        double height = 0.0;
        double expResult = 0.0;
        double result = Shapes.computeAreaRectangle(width, height);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of computeAreaTrapezoid method, of class Shapes.
     */
    @Test
    public void testComputeAreaTrapezoid() throws Exception {
        System.out.println("computeAreaTrapezoid");
        double a = 0.0;
        double b = 0.0;
        double height = 0.0;
        double expResult = 0.0;
        double result = Shapes.computeAreaTrapezoid(a, b, height);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of computeAreaEllipse method, of class Shapes.
     */
    @Test
    public void testComputeAreaEllipse() throws Exception {
        System.out.println("computeAreaEllipse");
        double a = 0.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = Shapes.computeAreaEllipse(a, b);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of computeAreaSquare method, of class Shapes.
     */
    @Test
    public void testComputeAreaSquare() throws Exception {
        System.out.println("computeAreaSquare");
        double side = 0.0;
        double expResult = 0.0;
        double result = Shapes.computeAreaSquare(side);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of computeAreaParallelogram method, of class Shapes.
     */
    @Test
    public void testComputeAreaParallelogram() throws Exception {
        System.out.println("computeAreaParallelogram");
        double base = 0.0;
        double height = 0.0;
        double expResult = 0.0;
        double result = Shapes.computeAreaParallelogram(base, height);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of computeAreaCircle method, of class Shapes.
     */
    @Test
    public void testComputeAreaCircle() throws Exception {
        System.out.println("computeAreaCircle");
        double radius = 0.0;
        double expResult = 0.0;
        double result = Shapes.computeAreaCircle(radius);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of computeAreaSector method, of class Shapes.
     */
    @Test
    public void testComputeAreaSector() throws Exception {
        System.out.println("computeAreaSector");
        double radius = 0.0;
        double angle = 0.0;
        double expResult = 0.0;
        double result = Shapes.computeAreaSector(radius, angle);
        assertEquals(expResult, result, 0.0);
    }
    
        /**
     * Test of computeAreaTriangle method, of class Shapes.
     */
    @Test(expected = NegativeValuesException.class)
    public void testComputeAreaTriangle1() throws Exception {
        System.out.println("computeAreaTriangle");
        double base = -5.0;
        double height = 0.0;
        double result = Shapes.computeAreaTriangle(base, height);


    }

    /**
     * Test of computeAreaRectangle method, of class Shapes.
     */
    @Test(expected = NegativeValuesException.class)
    public void testComputeAreaRectangle1() throws Exception {
        System.out.println("computeAreaRectangle");
        double width = -5.0;
        double height = 0.0;        
        double result = Shapes.computeAreaRectangle(width, height);

    }

    /**
     * Test of computeAreaTrapezoid method, of class Shapes.
     */
    @Test(expected = NegativeValuesException.class)
    public void testComputeAreaTrapezoid1() throws Exception {
        System.out.println("computeAreaTrapezoid");
        double a = -50.0;
        double b = 0.0;
        double height = 0.0;
        double result = Shapes.computeAreaTrapezoid(a, b, height);

    }

    /**
     * Test of computeAreaEllipse method, of class Shapes.
     */
    @Test(expected = NegativeValuesException.class)
    public void testComputeAreaEllipse1() throws Exception {
        System.out.println("computeAreaEllipse");
        double a = -40.0;
        double b = 0.0;
        double result = Shapes.computeAreaEllipse(a, b);

    }

    /**
     * Test of computeAreaSquare method, of class Shapes.
     */
    @Test(expected = NegativeValuesException.class)
    public void testComputeAreaSquare1() throws Exception {
        System.out.println("computeAreaSquare");
        double side = -10.0;
        double expResult = 0.0;
        double result = Shapes.computeAreaSquare(side);


    }

    /**
     * Test of computeAreaParallelogram method, of class Shapes.
     */
    @Test(expected = NegativeValuesException.class)
    public void testComputeAreaParallelogram1() throws Exception {
        System.out.println("computeAreaParallelogram");
        double base = -10.0;
        double height = 0.0;
        double expResult = 0.0;
        double result = Shapes.computeAreaParallelogram(base, height);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of computeAreaCircle method, of class Shapes.
     */
    @Test(expected = NegativeValuesException.class)
    public void testComputeAreaCircle1() throws Exception {
        System.out.println("computeAreaCircle");
        double radius = -80.0;
        double expResult = 0.0;
        double result = Shapes.computeAreaCircle(radius);

    }

    /**
     * Test of computeAreaSector method, of class Shapes.
     */
    @Test(expected = NegativeValuesException.class)
    public void testComputeAreaSector1() throws Exception {
        System.out.println("computeAreaSector");
        double radius = -5.0;
        double angle = 0.0;
         double result = Shapes.computeAreaSector(radius, angle);

    }
    
}
