/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import infoz.domi.domain.EmployeOperation;
import infoz.domi.domain.EmployeOperationPK;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Mahdi
 */
@Repository
public interface EmployeOperationRepository extends JpaRepository<EmployeOperation,EmployeOperationPK>{
    /*@Query(value = "select p.code_produit_service , p.libelle_produit_service from produitservice p where exists (select distinct code_produit_service from employe_operation where code_produit_service = p.code_produit_service and mat_emp = v_login", nativeQuery = true)
    List<Object> verification(@Param("ma") Integer em );*/
}
