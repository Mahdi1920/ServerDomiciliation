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
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mahdi
 */

@Repository
public interface ProduitServiceRepository extends JpaRepository<ProduitService, Number> {
    @Query(value = "select * from PRODUIT_SERVICE", nativeQuery = true)
    List<ProduitService> findprod();
    //List<ProduitService> findAll() ;
}
