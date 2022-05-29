/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import infoz.domi.domain.Operation;
import infoz.domi.domain.OperationPK;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author Mahdi
 */
public interface OperationRepository extends JpaRepository<Operation,OperationPK>{
    /*@Query(value="select * from operation o where o.operationPK.code_produit_service = (select code_produit_service FROM produitservice where code_produit_service  = :code)",nativeQuery = true)
    List<Object> getOperations(@Param("codeproduitservice") Integer codeproduitservice);*/
}
