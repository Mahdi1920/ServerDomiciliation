/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.service;

import infoz.domi.domain.ProduitService;
import infoz.domi.repository.ProduitServiceRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mahdi
 */
@Service
public class ProduitServiceService {

    private final ProduitServiceRepository prodrep;

    public ProduitServiceService(ProduitServiceRepository prodrep) {
        this.prodrep = prodrep;
    }

    public List<ProduitService> getProduits() {
        return prodrep.findprod();
    }
}
