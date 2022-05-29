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
public class EmployeRolePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "MAT_EMP")
    private int matEmp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_ROLE")
    private int codeRole;

    public EmployeRolePK() {
    }

    public EmployeRolePK(int matEmp, int codeRole) {
        this.matEmp = matEmp;
        this.codeRole = codeRole;
    }

    public int getMatEmp() {
        return matEmp;
    }

    public void setMatEmp(int matEmp) {
        this.matEmp = matEmp;
    }

    public int getCodeRole() {
        return codeRole;
    }

    public void setCodeRole(int codeRole) {
        this.codeRole = codeRole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) matEmp;
        hash += (int) codeRole;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeRolePK)) {
            return false;
        }
        EmployeRolePK other = (EmployeRolePK) object;
        if (this.matEmp != other.matEmp) {
            return false;
        }
        if (this.codeRole != other.codeRole) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.EmployeRolePK[ matEmp=" + matEmp + ", codeRole=" + codeRole + " ]";
    }
    
}
