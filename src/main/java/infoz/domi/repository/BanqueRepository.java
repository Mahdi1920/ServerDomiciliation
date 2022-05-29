/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import infoz.domi.domain.Banque;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mahdi
 */
@Repository
public interface BanqueRepository extends JpaRepository<Banque,Integer>{
   @Query(value = "select * from banque b where b.code_banque= (select code_banque from donnees_Generales where code_banque=b.code_banque)", nativeQuery = true)
   List<Banque> getBanqueByCode(@Param("codebanque") Integer codebanque );
   
   @Query(value = "select b.lib_banque from banque b where b.code_banque= (select code_banque from donnees_Generales where code_banque=b.code_banque)", nativeQuery = true)
   List<String> getLibelleBanque(@Param("codebanque") Integer codebanque );
   
   
}
