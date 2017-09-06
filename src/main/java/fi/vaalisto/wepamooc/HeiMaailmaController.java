/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.vaalisto.wepamooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Ville Vaalisto
 */
@SpringBootApplication
@Controller
public class HeiMaailmaController {    
    
    @RequestMapping("*")
    @ResponseBody
    public String home() {
        return "Hei Maailma!";
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HeiMaailmaController.class, args);
    }
}
