/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.service;

import infoz.domi.repository.EmployeRepository;
import infoz.domi.domain.Employe;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mahdi
 */
@Service
public class EmployeService {
    @Autowired
    private final EmployeRepository emplrep;

    public EmployeService(EmployeRepository emplrep) {
        this.emplrep = emplrep;
    }

    public List<Employe> getEmployes() {
        return emplrep.findEmploye();
    }
}
