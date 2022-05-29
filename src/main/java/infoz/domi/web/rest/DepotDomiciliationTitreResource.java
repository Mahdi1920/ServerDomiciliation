/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.web.rest;

import infoz.domi.repository.DepotDomiciliationTitreRepository;
import infoz.domi.domain.DepotDomiciliationTitre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahdi
 */
@RestController
@RequestMapping("/api")
public class DepotDomiciliationTitreResource {
    @Autowired
    private  DepotDomiciliationTitreRepository depotRep;
    
    @PostMapping(value="/addDepot")
    public void AddDepot(DepotDomiciliationTitre titre){
        depotRep.save(titre);
    }
}
