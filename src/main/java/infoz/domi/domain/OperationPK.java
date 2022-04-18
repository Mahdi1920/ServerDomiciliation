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
public class OperationPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PRODUIT_SERVICE")
    private Long codeProduitService;

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_OPERATION")
    private Long codeOperation;

    public OperationPK() {}

    public OperationPK(Long codeProduitService, Long codeOperation) {
        this.codeProduitService = codeProduitService;
        this.codeOperation = codeOperation;
    }

    public Long getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(Long codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public Long getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(Long codeOperation) {
        this.codeOperation = codeOperation;
    }

    /* @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeProduitService;
        hash += (int) codeOperation;
        return hash;
    }
*/
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OperationPK)) {
            return false;
        }
        OperationPK other = (OperationPK) object;
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
        return "infoz.domi.domain.OperationPK[ codeProduitService=" + codeProduitService + ", codeOperation=" + codeOperation + " ]";
    }
}
