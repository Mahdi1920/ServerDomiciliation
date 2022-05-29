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
@Table(name = "DELAIS_REGLEMENT")
public class DelaisReglement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @NotNull
    @Column(name = "CODE_DEL_REG")
    private Integer codeDelReg;
    @Size(max = 50)
    @Column(name = "LIB_DEL_REG")
    private String libDelReg;
    @Column(name = "DELAIS")
    private Integer delais;
    @Size(max = 1)
    @Column(name = "PERIODE")
    private String periode;
    @Size(max = 1)
    @Column(name = "MODE_REG")
    private String modeReg;
    @Column(name = "ORDRE")
    private Integer ordre;

    public DelaisReglement() {
    }

    public DelaisReglement(Integer codeDelReg) {
        this.codeDelReg = codeDelReg;
    }

    public Integer getCodeDelReg() {
        return codeDelReg;
    }

    public void setCodeDelReg(Integer codeDelReg) {
        this.codeDelReg = codeDelReg;
    }

    public String getLibDelReg() {
        return libDelReg;
    }

    public void setLibDelReg(String libDelReg) {
        this.libDelReg = libDelReg;
    }

    public Integer getDelais() {
        return delais;
    }

    public void setDelais(Integer delais) {
        this.delais = delais;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public String getModeReg() {
        return modeReg;
    }

    public void setModeReg(String modeReg) {
        this.modeReg = modeReg;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeDelReg != null ? codeDelReg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DelaisReglement)) {
            return false;
        }
        DelaisReglement other = (DelaisReglement) object;
        if ((this.codeDelReg == null && other.codeDelReg != null) || (this.codeDelReg != null && !this.codeDelReg.equals(other.codeDelReg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.DelaisReglement[ codeDelReg=" + codeDelReg + " ]";
    }
    
}
