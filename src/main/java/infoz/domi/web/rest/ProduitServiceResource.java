/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.web.rest;

import infoz.domi.domain.ProduitService;
import infoz.domi.repository.ProduitServiceRepository;
import infoz.domi.security.AuthoritiesConstants;
import java.util.List;
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
public class ProduitServiceResource {

    private ProduitServiceRepository prodrep;

    /*@GetMapping("/getprods")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public List<ProduitService> getProds(){
        return prodrep.findAll();
    }*/
    @GetMapping("/getprods")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public ProduitService getProds() {
        return prodrep.findprod(200);
    }
}
