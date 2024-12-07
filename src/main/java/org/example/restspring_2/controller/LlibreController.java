package org.example.restspring_2.controller;

import org.example.restspring_2.Model.Llibre;
import org.example.restspring_2.repository.LlibreRepository;
import org.example.restspring_2.repository.PrestecRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/llibre")
public class LlibreController {

    @Autowired
    private LlibreRepository llibreRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Llibre> getAllLlibres() {
        return llibreRepository.findAll();
    }

    @PostMapping("/add")
    public @ResponseBody Llibre addLlibre(@RequestBody Llibre llibre) {
        return llibreRepository.save(llibre);
    }

    @PutMapping("/update")
    public @ResponseBody Llibre updateLlibre(@RequestBody Llibre llibre) {
        return llibreRepository.save(llibre);
    }

    @DeleteMapping("/delete/{isbn}")
    public @ResponseBody void deleteLlibre(@PathVariable String isbn) {
        llibreRepository.deleteById(isbn);
    }

}
