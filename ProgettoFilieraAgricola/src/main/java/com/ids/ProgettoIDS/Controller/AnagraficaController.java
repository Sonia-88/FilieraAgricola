package com.ids.ProgettoIDS.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.ids.ProgettoIDS.Services.AnagraficaService;
import com.ids.ProgettoIDS.Model.Anagrafica;
import java.util.List;


import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;


    @RestController
    @RequestMapping("/anagrafiche")
    @Tag(name = "Anagrafica Controller", description = "API per la gestione delle anagrafiche")
    public class AnagraficaController {

        @Autowired
        private AnagraficaService anagraficaService;

        @GetMapping
        @Operation(summary = "Ottieni tutte le anagrafiche", description = "Restituisce l'elenco completo delle anagrafiche")
        public List<Anagrafica> getAll() {
            return anagraficaService.getAllAnagrafiche();
        }

        @GetMapping("/{id}")
        @Operation(summary = "Ottieni un'anagrafica per ID", description = "Restituisce un'anagrafica corrispondente all'ID specificato")
        public Anagrafica getById(@PathVariable Integer id) {
            return anagraficaService.getAnagraficaById(id);
        }

        @PostMapping
        @Operation(summary = "Crea una nuova anagrafica", description = "Inserisce una nuova anagrafica nel database")
        public Anagrafica create(@RequestBody Anagrafica anagrafica) {
            return anagraficaService.saveAnagrafica(anagrafica);
        }

        @PutMapping("/{id}")
        @Operation(summary = "Aggiorna un'anagrafica", description = "Modifica un'anagrafica esistente tramite ID")
        public Anagrafica update(@PathVariable Integer id, @RequestBody Anagrafica anagrafica) {
            anagrafica.setidAnagrafica(id);
            return anagraficaService.saveAnagrafica(anagrafica);
        }

        @DeleteMapping("/{id}")
        @Operation(summary = "Elimina un'anagrafica", description = "Cancella un'anagrafica specificata tramite ID")
        public void delete(@PathVariable Integer id) {
            anagraficaService.deleteAnagrafica(id);
        }
    }

