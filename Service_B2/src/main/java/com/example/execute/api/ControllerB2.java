package com.example.execute.api;


import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerB2 {


    @GetMapping("/nameB2")
    public String getControllerName() {
        return "Name B2 From B2 Service IP Address: ";
    }

    @GetMapping("/getB2")
    public String getBbb() {

             return "THIS IS SENT FROM B2 SERVICE";
    }


}


