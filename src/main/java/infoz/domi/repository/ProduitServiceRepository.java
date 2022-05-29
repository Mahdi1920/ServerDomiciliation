/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.repository;

import infoz.domi.domain.ProduitService1;
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
public interface ProduitServiceRepository extends JpaRepository<ProduitService1, Integer>{
    @Query(value = "SELECT * FROM PRODUITSERVICE", nativeQuery = true)
    List<Object> findprod();
    
    @Query(value = "select p.code_produit_service , p.libelle_produit_service from produitservice p where p.code_produit_service = :code", nativeQuery = true)
   List<Object> verification(@Param("code") Integer code );
    
    @Query(value = "select 1, libelle_produit_service, NULL, to_char(code_produit_service)\n" +
"from produitservice s\n" +
"where exists (select distinct code_produit_service\n" +
"from employeoperation where code_produit_service = s.code_produit_service and mat_emp = :code_produit_service\n" +
"union all\n" +
"select distinct code_produit_service\n" +
"from role_operation r where code_produit_service = s.code_produit_service and exists(select code_role\n" +
"from employe_role where code_role = r.code_role and mat_emp = :code_produit_service\n" +
")) or\n" +
"(code_produit_service = 9999 )", nativeQuery = true)
    List<Object> verification1(@Param("code_produit_service") Integer code_produit_service );
    
    
   
}
