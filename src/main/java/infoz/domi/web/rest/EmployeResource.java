/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.web.rest;

import infoz.domi.domain.Employe;
import infoz.domi.security.AuthoritiesConstants;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import infoz.domi.repository.EmployeRepository;
import infoz.domi.service.EmployeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahdi
 */
@RestController
@RequestMapping("/api")
public class EmployeResource {
    
    @Autowired
    private EmployeRepository emprep;
    
   private EmployeService empserve;
    
    @GetMapping("/employees")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public List<Employe> getEmployes() {
        return emprep.findEmploye();
    }
    
    @GetMapping("/empls")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public List<Employe> getEmpls() {
        return emprep.findAll();
    }
    @GetMapping("/employe/{code}")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public List<Employe> getEmployeByCode(Integer code) {
        return emprep.findEmployeByCodeEmploye(code);
    }
}
