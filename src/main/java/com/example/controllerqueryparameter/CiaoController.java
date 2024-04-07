package com.example.controllerqueryparameter;

import org.springframework.web.bind.annotation.*;

//Scrivi una applicazione web Spring Boot
//che alla endpoint GET v1/ciao?nome=Giuseppe&provincia=Lombardia
//risponde con "Ciao Giuseppe, com'è il tempo in Lombardia?"
@RestController
@RequestMapping("/v1")
public class CiaoController {
    @RequestMapping(path = "/ciao", method = RequestMethod.GET)
    public String ciao(@RequestParam String nome, @RequestParam String regione) {
        return "Ciao " + nome +", com'è il tempo in" + regione + "?";
    }
}
