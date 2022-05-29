/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.web.rest;

import java.util.List;
import infoz.domi.domain.Operation;
import infoz.domi.repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahdi
 */
@RestController
@RequestMapping("/api")
public class OperationResource {
    
    @Autowired 
    private OperationRepository operationRep ;
    
    @GetMapping(value = "operations")
      public List<Operation> getOperations(){ 
        return operationRep.findAll();
    }
  
}
