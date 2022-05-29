/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import infoz.domi.domain.Agence;
import infoz.domi.domain.AgencePK;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Mahdi
 */
@Repository
public interface AgenceRepository extends JpaRepository<Agence,AgencePK>{
    
}
