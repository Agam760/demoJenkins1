package com.example.demoJenkins1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Controller_class {
 @RequestMapping("/")
 public String home() {
     return "NewFile";
 }
 
}
