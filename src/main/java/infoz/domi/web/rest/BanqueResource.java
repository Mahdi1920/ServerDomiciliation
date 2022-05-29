/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import infoz.domi.repository.BanqueRepository;
import infoz.domi.domain.Banque;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author Mahdi
 */
@RestController
@RequestMapping("/api")
public class BanqueResource {
    
    @Autowired
    private  BanqueRepository banqueRep;
    
    @GetMapping(value="/banques")
    public List<Banque> getBanques(){
        return banqueRep.findAll();
    }
    
    @RequestMapping(value = "/libelles" , method = RequestMethod.GET)
    public List<Banque> GetBanqueByCode(@RequestParam Integer codebanque) {
        return banqueRep.getBanqueByCode(codebanque);
    }
    
    @RequestMapping(value = "/libBanque" , method = RequestMethod.GET)
    public List<String> GetLibBanque(@RequestParam Integer codebanque) {
        return banqueRep.getLibelleBanque(codebanque);
    }
   
}
