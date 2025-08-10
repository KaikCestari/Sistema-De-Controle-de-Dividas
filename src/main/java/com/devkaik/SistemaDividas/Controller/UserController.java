package com.devkaik.SistemaDividas.Controller;

import com.devkaik.SistemaDividas.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    public UserServices services;




}
