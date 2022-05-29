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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;


/**
 *
 * @author Mahdi
 */
@Entity
@Table(name = "AGENCE")
@NamedQueries({
    @NamedQuery(name = "Agence.findAll", query = "SELECT a FROM Agence a")})
public class Agence implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgencePK agencePK;
    @Size(max = 20)
    @Column(name = "LIB_AGENCE")
    private String libAgence;
    @Size(max = 3)
    @Column(name = "TYPE_AGENCE")
    private String typeAgence;
    @Column(name = "CODE_LOCALITE")
    private Integer codeLocalite;
    @Size(max = 30)
    @Column(name = "ADRESSE_AGENCE")
    private String adresseAgence;
    @Column(name = "INDICATIF_TEL")
    private Integer indicatifTel;
    @Column(name = "NUMERO_TEL")
    private Integer numeroTel;
    @Column(name = "CODE_AGENCE_BNA")
    private Integer codeAgenceBna;
    @Size(max = 2)
    @Column(name = "CODE_BCT")
    private String codeBct;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "CODE_ZONE_AGENCE")
    private Integer codeZoneAgence;

    public Agence() {
    }

    public Agence(AgencePK agencePK) {
        this.agencePK = agencePK;
    }

    public Agence(Integer codeBanque, Integer codeAgenceBct) {
        this.agencePK = new AgencePK(codeBanque, codeAgenceBct);
    }

    public AgencePK getAgencePK() {
        return agencePK;
    }

    public void setAgencePK(AgencePK agencePK) {
        this.agencePK = agencePK;
    }

    public String getLibAgence() {
        return libAgence;
    }

    public void setLibAgence(String libAgence) {
        this.libAgence = libAgence;
    }

    public String getTypeAgence() {
        return typeAgence;
    }

    public void setTypeAgence(String typeAgence) {
        this.typeAgence = typeAgence;
    }

    public Integer getCodeLocalite() {
        return codeLocalite;
    }

    public void setCodeLocalite(Integer codeLocalite) {
        this.codeLocalite = codeLocalite;
    }

    public String getAdresseAgence() {
        return adresseAgence;
    }

    public void setAdresseAgence(String adresseAgence) {
        this.adresseAgence = adresseAgence;
    }

    public Integer getIndicatifTel() {
        return indicatifTel;
    }

    public void setIndicatifTel(Integer indicatifTel) {
        this.indicatifTel = indicatifTel;
    }

    public Integer getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(Integer numeroTel) {
        this.numeroTel = numeroTel;
    }

    public Integer getCodeAgenceBna() {
        return codeAgenceBna;
    }

    public void setCodeAgenceBna(Integer codeAgenceBna) {
        this.codeAgenceBna = codeAgenceBna;
    }

    public String getCodeBct() {
        return codeBct;
    }

    public void setCodeBct(String codeBct) {
        this.codeBct = codeBct;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCodeZoneAgence() {
        return codeZoneAgence;
    }

    public void setCodeZoneAgence(Integer codeZoneAgence) {
        this.codeZoneAgence = codeZoneAgence;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agencePK != null ? agencePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agence)) {
            return false;
        }
        Agence other = (Agence) object;
        if ((this.agencePK == null && other.agencePK != null) || (this.agencePK != null && !this.agencePK.equals(other.agencePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.Agence[ agencePK=" + agencePK + " ]";
    }
    
}
