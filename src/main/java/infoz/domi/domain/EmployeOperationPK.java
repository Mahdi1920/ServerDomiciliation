/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Mahdi
 */
@Embeddable
public class EmployeOperationPK implements Serializable {

    @NotNull
    @Column(name = "CODE_PRODUIT_SERVICE")
    private int codeProduitService;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_OPERATION")
    private int codeOperation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MAT_EMP")
    private int matEmp;

    public EmployeOperationPK() {
    }

    public EmployeOperationPK(int codeProduitService, int codeOperation, int matEmp) {
        this.codeProduitService = codeProduitService;
        this.codeOperation = codeOperation;
        this.matEmp = matEmp;
    }

    public int getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(int codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public int getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(int codeOperation) {
        this.codeOperation = codeOperation;
    }

    public int getMatEmp() {
        return matEmp;
    }

    public void setMatEmp(int matEmp) {
        this.matEmp = matEmp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeProduitService;
        hash += (int) codeOperation;
        hash += (int) matEmp;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeOperationPK)) {
            return false;
        }
        EmployeOperationPK other = (EmployeOperationPK) object;
        if (this.codeProduitService != other.codeProduitService) {
            return false;
        }
        if (this.codeOperation != other.codeOperation) {
            return false;
        }
        if (this.matEmp != other.matEmp) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.EmployeOperationPK[ codeProduitService=" + codeProduitService + ", codeOperation=" + codeOperation + ", matEmp=" + matEmp + " ]";
    }
    
}
