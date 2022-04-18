/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Mahdi
 */
@Entity
@Table(name = "ROLE")
@NamedQueries({ @NamedQuery(name = "Role.findAll", query = "SELECT r FROM Role r") })
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_ROLE")
    private Integer codeRole;

    @Size(max = 100)
    @Column(name = "LIB_ROLE")
    private String libRole;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "role")
    private Collection<RoleOperation> roleOperationCollection;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "role")
    private Collection<EmployeRole> employeRoleCollection;

    public Role() {}

    public Role(Integer codeRole) {
        this.codeRole = codeRole;
    }

    public Integer getCodeRole() {
        return codeRole;
    }

    public void setCodeRole(Integer codeRole) {
        this.codeRole = codeRole;
    }

    public String getLibRole() {
        return libRole;
    }

    public void setLibRole(String libRole) {
        this.libRole = libRole;
    }

    public Collection<RoleOperation> getRoleOperationCollection() {
        return roleOperationCollection;
    }

    public void setRoleOperationCollection(Collection<RoleOperation> roleOperationCollection) {
        this.roleOperationCollection = roleOperationCollection;
    }

    public Collection<EmployeRole> getEmployeRoleCollection() {
        return employeRoleCollection;
    }

    public void setEmployeRoleCollection(Collection<EmployeRole> employeRoleCollection) {
        this.employeRoleCollection = employeRoleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeRole != null ? codeRole.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Role)) {
            return false;
        }
        Role other = (Role) object;
        if ((this.codeRole == null && other.codeRole != null) || (this.codeRole != null && !this.codeRole.equals(other.codeRole))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.Role[ codeRole=" + codeRole + " ]";
    }
}
