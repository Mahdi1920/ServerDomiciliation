/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.web.rest;

import infoz.domi.repository.DeviseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import infoz.domi.domain.Devise;
/**
 *
 * @author Mahdi
 */
@RestController
@RequestMapping("api")
public class DeviseResource {
    @Autowired
    private DeviseRepository deviseRep;
    
    @GetMapping(value="/devises")
    public List<Devise>gesDevises() {
        return deviseRep.findAll();
    }
}
