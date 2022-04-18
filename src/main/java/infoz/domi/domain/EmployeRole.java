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
@Table(name = "EMPLOYE_ROLE")
@NamedQueries({ @NamedQuery(name = "EmployeRole.findAll", query = "SELECT e FROM EmployeRole e") })
public class EmployeRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected EmployeRolePK employeRolePK;

    @Column(name = "CODE_NIVEAU")
    private Long codeNiveau;

    @JoinColumn(name = "MAT_EMP", referencedColumnName = "CODE_EMPLOYE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Employe employe;

    @JoinColumn(name = "CODE_ROLE", referencedColumnName = "CODE_ROLE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Role role;

    public EmployeRole() {}

    public EmployeRole(EmployeRolePK employeRolePK) {
        this.employeRolePK = employeRolePK;
    }

    public EmployeRole(int matEmp, int codeRole) {
        this.employeRolePK = new EmployeRolePK(matEmp, codeRole);
    }

    public EmployeRolePK getEmployeRolePK() {
        return employeRolePK;
    }

    public void setEmployeRolePK(EmployeRolePK employeRolePK) {
        this.employeRolePK = employeRolePK;
    }

    public Long getCodeNiveau() {
        return codeNiveau;
    }

    public void setCodeNiveau(Long codeNiveau) {
        this.codeNiveau = codeNiveau;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
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
        hash += (employeRolePK != null ? employeRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeRole)) {
            return false;
        }
        EmployeRole other = (EmployeRole) object;
        if (
            (this.employeRolePK == null && other.employeRolePK != null) ||
            (this.employeRolePK != null && !this.employeRolePK.equals(other.employeRolePK))
        ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.EmployeRole[ employeRolePK=" + employeRolePK + " ]";
    }
}
