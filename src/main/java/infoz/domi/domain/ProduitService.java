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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mahdi
 */
@Entity
@Table(name = "PRODUIT_SERVICE")
public class ProduitService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PRODUIT_SERVICE")
    private Number codeProduitService;

    @Size(max = 50)
    @Column(name = "LIBELLE_PRODUIT_SERVICE")
    private String libelleProduitService;

    @Size(max = 1)
    @Column(name = "PRODUIT_SERVICE")
    private String produitService;

    @Size(max = 4)
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;

    @Size(max = 20)
    @Column(name = "USER_SCHEMA")
    private String userSchema;

    @Size(max = 25)
    @Column(name = "PASSWORD_SCHEMA")
    private String passwordSchema;

    @Size(max = 30)
    @Column(name = "REPORT_SERVER")
    private String reportServer;

    @Size(max = 2)
    @Column(name = "GROUP_PRODUIT")
    private String groupProduit;

    @Size(max = 20)
    @Column(name = "LIB_GROUP")
    private String libGroup;

    public ProduitService() {}

    public ProduitService(Number codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public Number getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(Number codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public String getLibelleProduitService() {
        return libelleProduitService;
    }

    public void setLibelleProduitService(String libelleProduitService) {
        this.libelleProduitService = libelleProduitService;
    }

    public String getProduitService() {
        return produitService;
    }

    public void setProduitService(String produitService) {
        this.produitService = produitService;
    }

    public String getTypeDossier() {
        return typeDossier;
    }

    public void setTypeDossier(String typeDossier) {
        this.typeDossier = typeDossier;
    }

    public String getUserSchema() {
        return userSchema;
    }

    public void setUserSchema(String userSchema) {
        this.userSchema = userSchema;
    }

    public String getPasswordSchema() {
        return passwordSchema;
    }

    public void setPasswordSchema(String passwordSchema) {
        this.passwordSchema = passwordSchema;
    }

    public String getReportServer() {
        return reportServer;
    }

    public void setReportServer(String reportServer) {
        this.reportServer = reportServer;
    }

    public String getGroupProduit() {
        return groupProduit;
    }

    public void setGroupProduit(String groupProduit) {
        this.groupProduit = groupProduit;
    }

    public String getLibGroup() {
        return libGroup;
    }

    public void setLibGroup(String libGroup) {
        this.libGroup = libGroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeProduitService != null ? codeProduitService.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProduitService)) {
            return false;
        }
        ProduitService other = (ProduitService) object;
        if (
            (this.codeProduitService == null && other.codeProduitService != null) ||
            (this.codeProduitService != null && !this.codeProduitService.equals(other.codeProduitService))
        ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.ProduitService[ codeProduitService=" + codeProduitService + " ]";
    }
}
