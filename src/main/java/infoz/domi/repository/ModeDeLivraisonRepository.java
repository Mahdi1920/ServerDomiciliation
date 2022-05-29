/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import infoz.domi.domain.ModeDeLivraison;
/**
 *
 * @author Mahdi
 */
public interface ModeDeLivraisonRepository extends JpaRepository<ModeDeLivraison, Integer>{
    
}
