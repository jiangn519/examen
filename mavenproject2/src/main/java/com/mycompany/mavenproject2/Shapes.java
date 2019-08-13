/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author lin
 */
public class Shapes {
     public static double computeAreaTriangle(double base, double height) throws NegativeValuesException {

        if (base < 0 || height < 0) {
            throw new NegativeValuesException();
        }

        return 0.5 * base * height;
    }

    public static double computeAreaRectangle(double width, double height) throws NegativeValuesException {
        if (width < 0 || height < 0) {
            throw new NegativeValuesException();
        }

        return width * height;
    }

    public static double computeAreaTrapezoid(double a, double b, double height) throws NegativeValuesException {
        if (a < 0 || b < 0 || height < 0) {
            throw new NegativeValuesException();
        }

        return 0.5 * (a + b) * height;
    }

    public static double computeAreaEllipse(double a, double b) throws NegativeValuesException {
        if (a < 0 || b < 0) {
            throw new NegativeValuesException();
        }
        return 3.14 * a * b;
    }

    public static double computeAreaSquare(double side) throws NegativeValuesException {
        if (side < 0) {
            throw new NegativeValuesException();
        }

        return side * side;
    }

    public static double computeAreaParallelogram(double base, double height) throws NegativeValuesException {
        if (base < 0 || height < 0) {
            throw new NegativeValuesException();
        }

        return base * height;
    }

    public static double computeAreaCircle(double radius) throws NegativeValuesException {
        if (radius < 0) {
            throw new NegativeValuesException();
        }

        return 3.14 * radius * radius;
    }

    public static double computeAreaSector(double radius, double angle) throws NegativeValuesException {
        if (radius < 0 || angle < 0) {
            throw new NegativeValuesException();
        }

        return 0.5 * radius * radius * angle;
    }   
}
