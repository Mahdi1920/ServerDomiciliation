/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import infoz.domi.domain.Employe;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mahdi
 */
@Repository
public interface EmployeRepository extends JpaRepository<Employe,Number>{
    @Query(value = "select * from employe", nativeQuery = true)
    List<Employe> findEmploye();
    
    @Query(value ="select * from employe e where e.CODE_EMPLOYE = :code", nativeQuery=true)
    List<Employe> findEmployeByCodeEmploye(@Param("code") Integer code);
    
}
