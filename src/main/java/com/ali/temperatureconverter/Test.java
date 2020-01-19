/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ali.temperatureconverter;

/**
 *
 * @author hp
 */
public class Test {
    double z;
    public void setTemperature(double x){
        z = (x -32.0) * (5.0 / 9.0);
    }
    public void setTemperature1(double y){
        z = (y * (9.0 / 5.0)) + 32.0;
    }
    public double getTemperature(){
        return z;
    }
}
