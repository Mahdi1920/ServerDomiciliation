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
@Table(name = "UNITE")
@NamedQueries({
    @NamedQuery(name = "Unite.findAll", query = "SELECT u FROM Unite u")})
public class Unite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @NotNull
    @Column(name = "CODE_UNITE")
    private Integer codeUnite;
    @Size(max = 50)
    @Column(name = "LIB_UNITE")
    private String libUnite;
    @Size(max = 8)
    @Column(name = "NOM_FORME")
    private String nomForme;

    public Unite() {
    }

    public Unite(Integer codeUnite) {
        this.codeUnite = codeUnite;
    }

    public Integer getCodeUnite() {
        return codeUnite;
    }

    public void setCodeUnite(Integer codeUnite) {
        this.codeUnite = codeUnite;
    }

    public String getLibUnite() {
        return libUnite;
    }

    public void setLibUnite(String libUnite) {
        this.libUnite = libUnite;
    }

    public String getNomForme() {
        return nomForme;
    }

    public void setNomForme(String nomForme) {
        this.nomForme = nomForme;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeUnite != null ? codeUnite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unite)) {
            return false;
        }
        Unite other = (Unite) object;
        if ((this.codeUnite == null && other.codeUnite != null) || (this.codeUnite != null && !this.codeUnite.equals(other.codeUnite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.Unite[ codeUnite=" + codeUnite + " ]";
    }
    
}
