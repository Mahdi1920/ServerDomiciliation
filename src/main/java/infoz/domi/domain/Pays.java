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
@Table(name = "PAYS")
public class Pays implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @NotNull
    @Column(name = "CODE_PAYS")
    private Integer codePays;
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "SIGLE_PAYS")
    private String siglePays;
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LIB_PAYS")
    private String libPays;
    @Size(max = 20)
    @Column(name = "NATIONALITE")
    private String nationalite;
    @Size(max = 1)
    @Column(name = "CODE_CONTINENT")
    private String codeContinent;
    @Column(name = "CODE_ZONE")
    private Integer codeZone;
    @Size(max = 2)
    @Column(name = "CONVENTION")
    private String convention;
    @Size(max = 1)
    @Column(name = "LISTE")
    private String liste;
    @Size(max = 1)
    @Column(name = "LUN")
    private String lun;
    @Size(max = 1)
    @Column(name = "MAR")
    private String mar;
    @Size(max = 1)
    @Column(name = "MER")
    private String mer;
    @Size(max = 1)
    @Column(name = "JEU")
    private String jeu;
    @Size(max = 1)
    @Column(name = "VEN")
    private String ven;
    @Size(max = 1)
    @Column(name = "SAM")
    private String sam;
    @Size(max = 1)
    @Column(name = "DIM")
    private String dim;
    @Size(max = 1)
    @Column(name = "LANGUE")
    private String langue;
    @Size(max = 2)
    @Column(name = "CODE_PAYS_ISO")
    private String codePaysIso;
    @Size(max = 2)
    @Column(name = "CODE_ISO")
    private String codeIso;

    public Pays() {
    }

    public Pays(Integer codePays) {
        this.codePays = codePays;
    }

    public Pays(Integer codePays, String siglePays, String libPays) {
        this.codePays = codePays;
        this.siglePays = siglePays;
        this.libPays = libPays;
    }

    public Integer getCodePays() {
        return codePays;
    }

    public void setCodePays(Integer codePays) {
        this.codePays = codePays;
    }

    public String getSiglePays() {
        return siglePays;
    }

    public void setSiglePays(String siglePays) {
        this.siglePays = siglePays;
    }

    public String getLibPays() {
        return libPays;
    }

    public void setLibPays(String libPays) {
        this.libPays = libPays;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getCodeContinent() {
        return codeContinent;
    }

    public void setCodeContinent(String codeContinent) {
        this.codeContinent = codeContinent;
    }

    public Integer getCodeZone() {
        return codeZone;
    }

    public void setCodeZone(Integer codeZone) {
        this.codeZone = codeZone;
    }

    public String getConvention() {
        return convention;
    }

    public void setConvention(String convention) {
        this.convention = convention;
    }

    public String getListe() {
        return liste;
    }

    public void setListe(String liste) {
        this.liste = liste;
    }

    public String getLun() {
        return lun;
    }

    public void setLun(String lun) {
        this.lun = lun;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public String getMer() {
        return mer;
    }

    public void setMer(String mer) {
        this.mer = mer;
    }

    public String getJeu() {
        return jeu;
    }

    public void setJeu(String jeu) {
        this.jeu = jeu;
    }

    public String getVen() {
        return ven;
    }

    public void setVen(String ven) {
        this.ven = ven;
    }

    public String getSam() {
        return sam;
    }

    public void setSam(String sam) {
        this.sam = sam;
    }

    public String getDim() {
        return dim;
    }

    public void setDim(String dim) {
        this.dim = dim;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getCodePaysIso() {
        return codePaysIso;
    }

    public void setCodePaysIso(String codePaysIso) {
        this.codePaysIso = codePaysIso;
    }

    public String getCodeIso() {
        return codeIso;
    }

    public void setCodeIso(String codeIso) {
        this.codeIso = codeIso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codePays != null ? codePays.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pays)) {
            return false;
        }
        Pays other = (Pays) object;
        if ((this.codePays == null && other.codePays != null) || (this.codePays != null && !this.codePays.equals(other.codePays))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.Pays[ codePays=" + codePays + " ]";
    }
    
}
