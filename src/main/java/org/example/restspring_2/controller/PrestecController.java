package org.example.restspring_2.controller;

import org.example.restspring_2.Model.Prestec;
import org.example.restspring_2.repository.LlibreRepository;
import org.example.restspring_2.repository.PrestecRepository;
import org.example.restspring_2.repository.UsuariRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prestec")
public class PrestecController {

    @Autowired
    private PrestecRepository prestecRepository;

    @Autowired
    private LlibreRepository llibreRepository;

    @Autowired
    private UsuariRepository usuariRepository;

    @GetMapping("/all")
    public Iterable<Prestec> getAllPrestec() {
        return prestecRepository.findAll();
    }

    @PostMapping("/add")
    public Prestec addPrestec(@RequestBody Prestec prestec) {
        // Check if the ISBN exists in the Llibre table
        if (!llibreRepository.existsById(prestec.getIsbn())) {
            throw new IllegalArgumentException("Invalid ISBN: " + prestec.getIsbn());
        }
        // Check if the DNI exists in the Usuari table
        if (!usuariRepository.existsById(prestec.getDni())) {
            throw new IllegalArgumentException("Invalid DNI: " + prestec.getDni());
        }
        return prestecRepository.save(prestec);
    }

    @PutMapping("/update")
    public Prestec updatePrestec(@RequestBody Prestec prestec) {
        // Check if the ISBN exists in the Llibre table
        if (!llibreRepository.existsById(prestec.getIsbn())) {
            throw new IllegalArgumentException("Invalid ISBN: " + prestec.getIsbn());
        }
        // Check if the DNI exists in the Usuari table
        if (!usuariRepository.existsById(prestec.getDni())) {
            throw new IllegalArgumentException("Invalid DNI: " + prestec.getDni());
        }
        return prestecRepository.save(prestec);
    }

    @DeleteMapping("/delete/{codi}")
    public void deletePrestec(@PathVariable int codi) {
        prestecRepository.deleteById(codi);
    }
}