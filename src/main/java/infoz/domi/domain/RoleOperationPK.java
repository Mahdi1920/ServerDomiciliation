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
public class RoleOperationPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_ROLE")
    private int codeRole;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PRODUIT_SERVICE")
    private int codeProduitService;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_OPERATION")
    private int codeOperation;

    public RoleOperationPK() {
    }

    public RoleOperationPK(int codeRole, int codeProduitService, int codeOperation) {
        this.codeRole = codeRole;
        this.codeProduitService = codeProduitService;
        this.codeOperation = codeOperation;
    }

    public int getCodeRole() {
        return codeRole;
    }

    public void setCodeRole(int codeRole) {
        this.codeRole = codeRole;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeRole;
        hash += (int) codeProduitService;
        hash += (int) codeOperation;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoleOperationPK)) {
            return false;
        }
        RoleOperationPK other = (RoleOperationPK) object;
        if (this.codeRole != other.codeRole) {
            return false;
        }
        if (this.codeProduitService != other.codeProduitService) {
            return false;
        }
        if (this.codeOperation != other.codeOperation) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.RoleOperationPK[ codeRole=" + codeRole + ", codeProduitService=" + codeProduitService + ", codeOperation=" + codeOperation + " ]";
    }
    
}
