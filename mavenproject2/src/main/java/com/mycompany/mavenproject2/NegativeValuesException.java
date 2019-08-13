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
public class NegativeValuesException  extends Exception{
    public NegativeValuesException(){
    System.out.println("You are trying to compute an area using negative values !");
  }  
}
