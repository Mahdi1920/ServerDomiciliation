/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Mahdi
 */
@Entity
@Table(name = "OPERATION")
public class Operation implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OperationPK operationPK;
    @Size(max = 50)
    @Column(name = "LIBELLE_OPERATION")
    private String libelleOperation;
    @Size(max = 15)
    @Column(name = "ABREVIATION")
    private String abreviation;
    @Size(max = 50)
    @Column(name = "SOUS_MENU")
    private String sousMenu;
    @Size(max = 1)
    @Column(name = "PARAMETRER")
    private String parametrer;
    @Column(name = "CODE_OPR_AGENCE")
    private Short codeOprAgence;
    @Size(max = 1)
    @Column(name = "VISA_O_N")
    private String visaON;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MAX_VALID_MEME_EMP")
    private BigDecimal maxValidMemeEmp;
    @Size(max = 1)
    @Column(name = "DECHARGE_O_N")
    private String dechargeON;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "operation")
    private List<EmployeOperation> employeoperationList;

    public Operation() {
    }

    public Operation(OperationPK operationPK) {
        this.operationPK = operationPK;
    }

    public Operation(short codeProduitService, short codeOperation) {
        this.operationPK = new OperationPK(codeProduitService, codeOperation);
    }

    public OperationPK getOperationPK() {
        return operationPK;
    }

    public void setOperationPK(OperationPK operationPK) {
        this.operationPK = operationPK;
    }

    public String getLibelleOperation() {
        return libelleOperation;
    }

    public void setLibelleOperation(String libelleOperation) {
        this.libelleOperation = libelleOperation;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public String getSousMenu() {
        return sousMenu;
    }

    public void setSousMenu(String sousMenu) {
        this.sousMenu = sousMenu;
    }

    public String getParametrer() {
        return parametrer;
    }

    public void setParametrer(String parametrer) {
        this.parametrer = parametrer;
    }

    public Short getCodeOprAgence() {
        return codeOprAgence;
    }

    public void setCodeOprAgence(Short codeOprAgence) {
        this.codeOprAgence = codeOprAgence;
    }

    public String getVisaON() {
        return visaON;
    }

    public void setVisaON(String visaON) {
        this.visaON = visaON;
    }

    public BigDecimal getMaxValidMemeEmp() {
        return maxValidMemeEmp;
    }

    public void setMaxValidMemeEmp(BigDecimal maxValidMemeEmp) {
        this.maxValidMemeEmp = maxValidMemeEmp;
    }

    public String getDechargeON() {
        return dechargeON;
    }

    public void setDechargeON(String dechargeON) {
        this.dechargeON = dechargeON;
    }

    public List<EmployeOperation> getEmployeoperationList() {
        return employeoperationList;
    }

    public void setEmployeoperationList(List<EmployeOperation> employeoperationList) {
        this.employeoperationList = employeoperationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (operationPK != null ? operationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operation)) {
            return false;
        }
        Operation other = (Operation) object;
        if ((this.operationPK == null && other.operationPK != null) || (this.operationPK != null && !this.operationPK.equals(other.operationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.Operation[ operationPK=" + operationPK + " ]";
    }
    
}
