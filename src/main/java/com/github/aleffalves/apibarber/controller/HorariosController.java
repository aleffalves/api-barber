package com.github.aleffalves.apibarber.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/horarios")
@CrossOrigin(origins = {"http://localhost:4200", "https://aleffalves.github.io"})
public class HorariosController {
}
