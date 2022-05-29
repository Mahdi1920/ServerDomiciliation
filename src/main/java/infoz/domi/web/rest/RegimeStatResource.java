/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.web.rest;

import infoz.domi.repository.RegimeStatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import infoz.domi.domain.RegimeStat;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Mahdi
 */
@RestController
@RequestMapping("/api")
public class RegimeStatResource {
    @Autowired
    private RegimeStatRepository regimeStatRep;
    
    @GetMapping(value="regimes")
    public List<RegimeStat> getRegimes(){
        return regimeStatRep.findAll();
    }
}
