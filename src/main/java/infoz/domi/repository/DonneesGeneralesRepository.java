/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import infoz.domi.domain.DonneesGenerales;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mahdi
 */
@Repository
public interface DonneesGeneralesRepository extends JpaRepository<DonneesGenerales,Integer>{
   @Query(value="select CODE_BANQUE from DONNEES_GENERALES",nativeQuery = true)
    public List<Integer> getCodesbanque();
    
}
