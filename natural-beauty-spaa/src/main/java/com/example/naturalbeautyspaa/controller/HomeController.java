package com.example.naturalbeautyspaa.controller;

import com.example.naturalbeautyspaa.object.dto.req.HomeRequest;
import com.example.naturalbeautyspaa.service.HomeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/home")
public class HomeController extends PageController<HomeRequest> {
    public HomeController(HomeService service) {
        super(service);
    }
}
