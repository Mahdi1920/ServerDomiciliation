/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.web.rest;

import infoz.domi.domain.ModeDeLivraison;
import infoz.domi.repository.ModeDeLivraisonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahdi
 */
@RestController
@RequestMapping("/api")
public class ModeDeLivraisonResource {
    @Autowired
    private ModeDeLivraisonRepository modelivRep;
    
    @GetMapping(value="/modliv")
    public List<ModeDeLivraison> getModesLiv(){
        return modelivRep.findAll();
    }
}
