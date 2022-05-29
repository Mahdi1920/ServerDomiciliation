/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.web.rest;

import infoz.domi.repository.DonneesGeneralesRepository;
import infoz.domi.domain.DonneesGenerales;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahdi
 */
@RestController
@RequestMapping("/api")
public class DonneesGeneralesResource {
    @Autowired
    private DonneesGeneralesRepository donneeRep;
    
    @GetMapping(value = "/codes" )
    public  List<Integer> getCodes(){
        return donneeRep.getCodesbanque();
    }
    @GetMapping(value = "/donnees" )
    public  List<DonneesGenerales> getDonnees(){
        return donneeRep.findAll();
    }
}
