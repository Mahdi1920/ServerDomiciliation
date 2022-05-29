/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.web.rest;

import infoz.domi.repository.ProduitServiceRepository;
import java.util.List;
import infoz.domi.config.Constants;
import infoz.domi.security.AuthoritiesConstants;
import infoz.domi.domain.ProduitService;
import infoz.domi.domain.ProduitService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahdi
 */
@RestController
@RequestMapping("/api")
public class ProduitServiceResource {
    @Autowired
    private ProduitServiceRepository prodrep;
    //private ProduitServiceService prodserv;

    @GetMapping("/produits")
    public List<ProduitService1> getProduits() {
        return prodrep.findAll();
    }

    @GetMapping(value = "/prods" )
    public List<Object> getProds() {
        return prodrep.findprod();
    }
    
      @RequestMapping(value = "/verif" , method = RequestMethod.GET)
    public List<Object> verification(@RequestParam Integer codeproduitservice) {
        return prodrep.verification(codeproduitservice);
    }
    
    @RequestMapping(value = "/verif1" , method = RequestMethod.GET)
    public List<Object> verification1(@RequestParam Integer code_produit_service) {
        return prodrep.verification1(code_produit_service);
    }
}
