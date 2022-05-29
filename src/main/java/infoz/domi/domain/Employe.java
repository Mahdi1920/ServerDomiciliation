/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
/**
 *
 * @author Mahdi
 */
@Entity
@Table(name = "EMPLOYE")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Employe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @NotNull
    @Column(name = "CODE_EMPLOYE")
    private Integer codeEmploye;
    @Size(max = 50)
    @Column(name = "NOM_EMPLOYE")
    private String nomEmploye;
    @Size(max = 50)
    @Column(name = "PRENOM_EMPLOYE")
    private String prenomEmploye;
    @Size(max = 13)
    @Column(name = "MOT_PASSE")
    private String motPasse;
    @Size(max = 1)
    @Column(name = "DROIT_DE_VALIDATION")
    private String droitDeValidation;
    @Size(max = 50)
    @Column(name = "ADRESSE_MAIL")
    private String adresseMail;
    @Size(max = 1)
    @Column(name = "ENVOI_O_N")
    private String envoiON;
    @Size(max = 1)
    @Column(name = "ACTIF_O_N")
    private String actifON;
    @Size(max = 2)
    @Column(name = "AGENCE_SIEGE")
    private String agenceSiege;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employe")
    private List<EmployeRole> employeRoleList;

    public Employe() {
    }

    public Employe(Integer codeEmploye) {
        this.codeEmploye = codeEmploye;
    }

    public Integer getCodeEmploye() {
        return codeEmploye;
    }

    public void setCodeEmploye(Integer codeEmploye) {
        this.codeEmploye = codeEmploye;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public String getPrenomEmploye() {
        return prenomEmploye;
    }

    public void setPrenomEmploye(String prenomEmploye) {
        this.prenomEmploye = prenomEmploye;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public String getDroitDeValidation() {
        return droitDeValidation;
    }

    public void setDroitDeValidation(String droitDeValidation) {
        this.droitDeValidation = droitDeValidation;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public String getEnvoiON() {
        return envoiON;
    }

    public void setEnvoiON(String envoiON) {
        this.envoiON = envoiON;
    }

    public String getActifON() {
        return actifON;
    }

    public void setActifON(String actifON) {
        this.actifON = actifON;
    }

    public String getAgenceSiege() {
        return agenceSiege;
    }

    public void setAgenceSiege(String agenceSiege) {
        this.agenceSiege = agenceSiege;
    }

    /*public List<EmployeRole> getEmployeRoleList() {
        return employeRoleList;
    }

    public void setEmployeRoleList(List<EmployeRole> employeRoleList) {
        this.employeRoleList = employeRoleList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeEmploye != null ? codeEmploye.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employe)) {
            return false;
        }
        Employe other = (Employe) object;
        if ((this.codeEmploye == null && other.codeEmploye != null) || (this.codeEmploye != null && !this.codeEmploye.equals(other.codeEmploye))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employe{" + "codeEmploye=" + codeEmploye + ", nomEmploye=" + nomEmploye + ", prenomEmploye=" + prenomEmploye + ", motPasse=" + motPasse + ", droitDeValidation=" + droitDeValidation + ", adresseMail=" + adresseMail + ", envoiON=" + envoiON + ", actifON=" + actifON + ", agenceSiege=" + agenceSiege + /*", employeRoleList=" + employeRoleList + */ '}';
    }

    
    
}
