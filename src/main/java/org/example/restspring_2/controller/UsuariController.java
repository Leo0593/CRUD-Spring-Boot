package org.example.restspring_2.controller;


import org.example.restspring_2.Model.Usuari;
import org.example.restspring_2.repository.UsuariRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuari")
public class UsuariController {

    @Autowired
    private UsuariRepository usuariRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Usuari> getAllUsuari() {
        return usuariRepository.findAll();
    }

    @PostMapping("/add")
    public @ResponseBody Usuari addUsuari(@RequestBody Usuari usuari) {
        return usuariRepository.save(usuari);
    }

    @PutMapping("/update")
    public @ResponseBody Usuari updateUsuari(@RequestBody Usuari usuari) {
        return usuariRepository.save(usuari);
    }

    @DeleteMapping("/delete/{DNI}")
    public @ResponseBody void deleteUsuari(@PathVariable String DNI) {
        usuariRepository.deleteById(DNI);
    }
}
