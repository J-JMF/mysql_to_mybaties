package com.example.mysql_to_mybaties.controller;

import com.example.mysql_to_mybaties.entity.Web;
import com.example.mysql_to_mybaties.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Web")
class WebController {
    @Autowired
    private WebService webService;

    @RequestMapping("/getAllWeb")
    public List<Web> findAll(){
        return webService.findAllWeb();
    }
    @GetMapping("/getWebByid/{id}")
    public List<Web> findUserByWebId(@PathVariable int id){
        return webService.findWebByid(id);
    }
}

