/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sanpablo.practica.web.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @autor: zethiel
 * @description: 
 * 
 */

@Controller
@RequestMapping(value = "/demo")
public class DemoController {

    @RequestMapping(method = RequestMethod.GET)
    public String getDemoPage() {
        System.out.println("get - DemoPage");
        return "demo";
    }
}