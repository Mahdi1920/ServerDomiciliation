/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.web.rest;

import infoz.domi.domain.ProduitService;
import infoz.domi.repository.ProduitServiceRepository;
import infoz.domi.security.AuthoritiesConstants;
import infoz.domi.service.ProduitServiceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahdi
 */
@RestController
@RequestMapping("/api")
//@CrossOrigin("*")
public class ProduitServiceResource {

    private ProduitServiceRepository prodrep;

    //ProduitServiceService prodserv;

    @GetMapping("/produits")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public List<ProduitService> getProduits() {
        return prodrep.findAll();
    }

    @GetMapping("/prods")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public List<ProduitService> getProds() {
        return prodrep.findprod();
    }
}
