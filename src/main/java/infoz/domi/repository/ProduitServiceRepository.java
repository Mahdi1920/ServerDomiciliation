/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.repository;

import infoz.domi.domain.ProduitService;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Mahdi
 */
public interface ProduitServiceRepository extends JpaRepository<ProduitService, Integer> {
    @Query("select LIBELLE_PRODUIT_SERVICE from ProduitService ps where ps.CODE_PRODUIT_SERVICE = ?200")
    ProduitService findprod(Integer CODE_PRODUIT_SERVICE);
}
