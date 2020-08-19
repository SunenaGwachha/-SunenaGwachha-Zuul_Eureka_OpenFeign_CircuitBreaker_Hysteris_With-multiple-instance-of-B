package com.example.execute.api;


import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerB1 {


    @GetMapping("/nameB1")
    public String getControllerName() {
        return "Name B1 From B1 Service IP Address: ";
    }

    @GetMapping("/getB1")
    public String getBbb() {

        return "THIS IS SENT FROM B1 SERVICE";
    }


}
