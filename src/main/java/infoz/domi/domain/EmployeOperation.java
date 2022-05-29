/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Mahdi
 */
@Entity
@Table(name = "EMPLOYEOPERATION")
@NamedQueries({
    @NamedQuery(name = "EmployeOperation.findAll", query = "SELECT e FROM EmployeOperation e")})
public class EmployeOperation implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmployeOperationPK employeOperationPK;
    @Column(name = "CREATION")
    private Short creation;
    @Column(name = "MODIFICATION")
    private Short modification;
    @Column(name = "SUPPRESSION")
    private Short suppression;
    @Column(name = "CONSULTATION")
    private Short consultation;
    @JoinColumns({
        @JoinColumn(name = "CODE_PRODUIT_SERVICE", referencedColumnName = "CODE_PRODUIT_SERVICE", insertable = false, updatable = false),
        @JoinColumn(name = "CODE_OPERATION", referencedColumnName = "CODE_OPERATION", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Operation operation;

    public EmployeOperation() {
    }

    public EmployeOperation(EmployeOperationPK employeOperationPK) {
        this.employeOperationPK = employeOperationPK;
    }

    public EmployeOperation(short codeProduitService, short codeOperation, int matEmp) {
        this.employeOperationPK = new EmployeOperationPK(codeProduitService, codeOperation, matEmp);
    }

    public EmployeOperationPK getEmployeOperationPK() {
        return employeOperationPK;
    }

    public void setEmployeOperationPK(EmployeOperationPK employeOperationPK) {
        this.employeOperationPK = employeOperationPK;
    }

    public Short getCreation() {
        return creation;
    }

    public void setCreation(Short creation) {
        this.creation = creation;
    }

    public Short getModification() {
        return modification;
    }

    public void setModification(Short modification) {
        this.modification = modification;
    }

    public Short getSuppression() {
        return suppression;
    }

    public void setSuppression(Short suppression) {
        this.suppression = suppression;
    }

    public Short getConsultation() {
        return consultation;
    }

    public void setConsultation(Short consultation) {
        this.consultation = consultation;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeOperationPK != null ? employeOperationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeOperation)) {
            return false;
        }
        EmployeOperation other = (EmployeOperation) object;
        if ((this.employeOperationPK == null && other.employeOperationPK != null) || (this.employeOperationPK != null && !this.employeOperationPK.equals(other.employeOperationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.EmployeOperation[ employeOperationPK=" + employeOperationPK + " ]";
    }
    
}
