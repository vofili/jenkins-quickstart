/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qucoon.dailygreeter;

import java.util.Calendar;

/**
 *
 * @author val
 */
public class Services {
    
    Calendar mycal = Calendar.getInstance();
    public void doGreeting(){
        System.out.println("hello good morning, "+mycal.getTime());
    }
    
    public static void main(String[] args){
        Services myserv = new Services();
        myserv.doGreeting();
        
    }
}
