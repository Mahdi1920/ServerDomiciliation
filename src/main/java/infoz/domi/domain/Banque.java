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
import javax.persistence.Lob;
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
@Table(name = "BANQUE")
public class Banque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @NotNull
    @Column(name = "CODE_BANQUE")
    private Integer codeBanque;
    @Size(max = 50)
    @Column(name = "LIB_BANQUE")
    private String libBanque;
    @Size(max = 20)
    @Column(name = "SIGLE_BANQUE")
    private String sigleBanque;
    @Size(max = 30)
    @Column(name = "RESIDENCE_BANQUE")
    private String residenceBanque;
    @Size(max = 30)
    @Column(name = "NUMERO_RESIDENCE_BANQUE")
    private String numeroResidenceBanque;
    @Size(max = 30)
    @Column(name = "CITE_RESIDENCE_BANQUE")
    private String citeResidenceBanque;
    @Column(name = "CODE_POSTAL")
    private Integer codePostal;
    @Size(max = 12)
    @Column(name = "TEL")
    private String tel;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 12)
    @Column(name = "FAX")
    private String fax;
    @Size(max = 12)
    @Column(name = "TELEX")
    private String telex;
    @Size(max = 12)
    @Column(name = "NUM_SWIFT")
    private String numSwift;
    @Column(name = "COMPTE_RECOUV")
    private Integer compteRecouv;
    @Column(name = "SOUS_COMPTE_RECOUV")
    private Integer sousCompteRecouv;
    @Column(name = "COMPTE_RECOUV_ESC")
    private Integer compteRecouvEsc;
    @Column(name = "SOUS_COMPTE_RECOUV_ESC")
    private Integer sousCompteRecouvEsc;
    @Size(max = 50)
    @Column(name = "PERSONNE_A_CONTACTER")
    private String personneAContacter;
    @Size(max = 50)
    @Column(name = "PERSONNE_POUR_CORRESPONDANCE")
    private String personnePourCorrespondance;
    @Size(max = 20)
    @Column(name = "CODE_OPERATEUR")
    private String codeOperateur;
    @Lob
    @Column(name = "PHOTO")
    private Serializable photo;
    @Size(max = 20)
    @Column(name = "RIB_REGLEMENT_SGMT")
    private String ribReglementSgmt;
    @Size(max = 1)
    @Column(name = "OFFSHORE_O_N")
    private String offshoreON;

    public Banque() {
    }

    public Banque(Integer codeBanque) {
        this.codeBanque = codeBanque;
    }

    public Integer getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(Integer codeBanque) {
        this.codeBanque = codeBanque;
    }

    public String getLibBanque() {
        return libBanque;
    }

    public void setLibBanque(String libBanque) {
        this.libBanque = libBanque;
    }

    public String getSigleBanque() {
        return sigleBanque;
    }

    public void setSigleBanque(String sigleBanque) {
        this.sigleBanque = sigleBanque;
    }

    public String getResidenceBanque() {
        return residenceBanque;
    }

    public void setResidenceBanque(String residenceBanque) {
        this.residenceBanque = residenceBanque;
    }

    public String getNumeroResidenceBanque() {
        return numeroResidenceBanque;
    }

    public void setNumeroResidenceBanque(String numeroResidenceBanque) {
        this.numeroResidenceBanque = numeroResidenceBanque;
    }

    public String getCiteResidenceBanque() {
        return citeResidenceBanque;
    }

    public void setCiteResidenceBanque(String citeResidenceBanque) {
        this.citeResidenceBanque = citeResidenceBanque;
    }

    public Integer getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(Integer codePostal) {
        this.codePostal = codePostal;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTelex() {
        return telex;
    }

    public void setTelex(String telex) {
        this.telex = telex;
    }

    public String getNumSwift() {
        return numSwift;
    }

    public void setNumSwift(String numSwift) {
        this.numSwift = numSwift;
    }

    public Integer getCompteRecouv() {
        return compteRecouv;
    }

    public void setCompteRecouv(Integer compteRecouv) {
        this.compteRecouv = compteRecouv;
    }

    public Integer getSousCompteRecouv() {
        return sousCompteRecouv;
    }

    public void setSousCompteRecouv(Integer sousCompteRecouv) {
        this.sousCompteRecouv = sousCompteRecouv;
    }

    public Integer getCompteRecouvEsc() {
        return compteRecouvEsc;
    }

    public void setCompteRecouvEsc(Integer compteRecouvEsc) {
        this.compteRecouvEsc = compteRecouvEsc;
    }

    public Integer getSousCompteRecouvEsc() {
        return sousCompteRecouvEsc;
    }

    public void setSousCompteRecouvEsc(Integer sousCompteRecouvEsc) {
        this.sousCompteRecouvEsc = sousCompteRecouvEsc;
    }

    public String getPersonneAContacter() {
        return personneAContacter;
    }

    public void setPersonneAContacter(String personneAContacter) {
        this.personneAContacter = personneAContacter;
    }

    public String getPersonnePourCorrespondance() {
        return personnePourCorrespondance;
    }

    public void setPersonnePourCorrespondance(String personnePourCorrespondance) {
        this.personnePourCorrespondance = personnePourCorrespondance;
    }

    public String getCodeOperateur() {
        return codeOperateur;
    }

    public void setCodeOperateur(String codeOperateur) {
        this.codeOperateur = codeOperateur;
    }

    public Serializable getPhoto() {
        return photo;
    }

    public void setPhoto(Serializable photo) {
        this.photo = photo;
    }

    public String getRibReglementSgmt() {
        return ribReglementSgmt;
    }

    public void setRibReglementSgmt(String ribReglementSgmt) {
        this.ribReglementSgmt = ribReglementSgmt;
    }

    public String getOffshoreON() {
        return offshoreON;
    }

    public void setOffshoreON(String offshoreON) {
        this.offshoreON = offshoreON;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeBanque != null ? codeBanque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banque)) {
            return false;
        }
        Banque other = (Banque) object;
        if ((this.codeBanque == null && other.codeBanque != null) || (this.codeBanque != null && !this.codeBanque.equals(other.codeBanque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.Banque[ codeBanque=" + codeBanque + " ]";
    }
    
}
