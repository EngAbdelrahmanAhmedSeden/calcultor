/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myproject;

/**
 *
 * @author New 1000 Meeza
 */
public class CalculatorDecimal {
        public static double add(double num, int counter) {
        double sum=0;
        for(int i=0;i<counter;i++){
            sum+=num;
        }
        return sum;
    }
        public static double sub(double num, int counter) {
        double sub=0;
        for(int i=0;i<counter;i++){
            sub=sub-num;
        }
        return sub;    
        }
        public static double multi(double num, int counter) {
        double multi=1;
        for(int i=0;i<counter;i++){
            multi*=num;
        }
        return multi;
    }
    public static double div(double num, int counter)
    {
        double div=1;
        for(int i=0;i<counter;i++){
            div/=num;
        }
        return div;    }
    public static double pow(double number , double pow){
        double res = number;
        for(int i = 1; i < pow; i++)
        {
            res *= number;
        }
        return res;
    }
}
