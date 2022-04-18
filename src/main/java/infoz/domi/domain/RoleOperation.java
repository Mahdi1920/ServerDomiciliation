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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Mahdi
 */
@Entity
@Table(name = "ROLE_OPERATION")
@NamedQueries({ @NamedQuery(name = "RoleOperation.findAll", query = "SELECT r FROM RoleOperation r") })
public class RoleOperation implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected RoleOperationPK roleOperationPK;

    @Column(name = "CREATION")
    private Long creation;

    @Column(name = "MODIFICATION")
    private Long modification;

    @Column(name = "SUPPRESSION")
    private Long suppression;

    @Column(name = "CONSULTATION")
    private Long consultation;

    @JoinColumn(name = "CODE_ROLE", referencedColumnName = "CODE_ROLE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Role role;

    public RoleOperation() {}

    public RoleOperation(RoleOperationPK roleOperationPK) {
        this.roleOperationPK = roleOperationPK;
    }

    public RoleOperation(int codeRole, Long codeProduitService, Long codeOperation) {
        this.roleOperationPK = new RoleOperationPK(codeRole, codeProduitService, codeOperation);
    }

    public RoleOperationPK getRoleOperationPK() {
        return roleOperationPK;
    }

    public void setRoleOperationPK(RoleOperationPK roleOperationPK) {
        this.roleOperationPK = roleOperationPK;
    }

    public Long getCreation() {
        return creation;
    }

    public void setCreation(Long creation) {
        this.creation = creation;
    }

    public Long getModification() {
        return modification;
    }

    public void setModification(Long modification) {
        this.modification = modification;
    }

    public Long getSuppression() {
        return suppression;
    }

    public void setSuppression(Long suppression) {
        this.suppression = suppression;
    }

    public Long getConsultation() {
        return consultation;
    }

    public void setConsultation(Long consultation) {
        this.consultation = consultation;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleOperationPK != null ? roleOperationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoleOperation)) {
            return false;
        }
        RoleOperation other = (RoleOperation) object;
        if (
            (this.roleOperationPK == null && other.roleOperationPK != null) ||
            (this.roleOperationPK != null && !this.roleOperationPK.equals(other.roleOperationPK))
        ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.RoleOperation[ roleOperationPK=" + roleOperationPK + " ]";
    }
}
