package com.github.Evgenn91.controller;


import com.github.Evgenn91.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TableController {

    @Autowired
    public TableService userService;



}
