/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Mahdi
 */
@Entity
@Table(name = "MODE_DE_LIVRAISON")
public class ModeDeLivraison implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_MOD_LIV")
    private Integer codeModLiv;
    @Size(max = 50)
    @Column(name = "LIB_MOD_LIV")
    private String libModLiv;
    @Size(max = 50)
    @Column(name = "LIB_MOD_LIV_FR")
    private String libModLivFr;
    @Size(max = 3)
    @Column(name = "SIGLE")
    private String sigle;
    @Column(name = "CODE_NATURE_OPERATION")
    private Integer codeNatureOperation;

    public ModeDeLivraison() {
    }

    public ModeDeLivraison(Integer codeModLiv) {
        this.codeModLiv = codeModLiv;
    }

    public Integer getCodeModLiv() {
        return codeModLiv;
    }

    public void setCodeModLiv(Integer codeModLiv) {
        this.codeModLiv = codeModLiv;
    }

    public String getLibModLiv() {
        return libModLiv;
    }

    public void setLibModLiv(String libModLiv) {
        this.libModLiv = libModLiv;
    }

    public String getLibModLivFr() {
        return libModLivFr;
    }

    public void setLibModLivFr(String libModLivFr) {
        this.libModLivFr = libModLivFr;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public Integer getCodeNatureOperation() {
        return codeNatureOperation;
    }

    public void setCodeNatureOperation(Integer codeNatureOperation) {
        this.codeNatureOperation = codeNatureOperation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeModLiv != null ? codeModLiv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModeDeLivraison)) {
            return false;
        }
        ModeDeLivraison other = (ModeDeLivraison) object;
        if ((this.codeModLiv == null && other.codeModLiv != null) || (this.codeModLiv != null && !this.codeModLiv.equals(other.codeModLiv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.ModeDeLivraison[ codeModLiv=" + codeModLiv + " ]";
    }
    
}
