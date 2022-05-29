/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Mahdi
 */
@Entity
@Table(name = "DEPOT_DOMICILIATION_TITRE")
public class DepotDomiciliationTitre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "CODE_BANQUE")
    private Integer codeBanque;
    @Column(name = "LIB_BANQUE")
    private Integer libBanque;
    @Size(max = 100)
    @Column(name = "LIB_AGENCE")
    private String libAgence;
    @Column(name = "CODE_TITRE")
    private Integer codeTitre;
    @Column(name = "DATE_DOMICILIATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDomiciliation;
    @Column(name = "NOMBRE_REBRIQUE")
    private Integer nombreRebrique;
    @Size(max = 20)
    @Column(name = "MODE_LIVRAISON")
    private String modeLivraison;
    @Size(max = 30)
    @Column(name = "DEVISE")
    private String devise;
    @Column(name = "PTFN_DEVISE")
    private Long ptfnDevise;
    @Column(name = "FOB_DEVISE")
    private Long fobDevise;
    @Column(name = "PTFN_DINARS")
    private Long ptfnDinars;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "MATRICULE_FISCALE")
    private String matriculeFiscale;
    @Size(max = 20)
    @Column(name = "COMPTE_RIB")
    private String compteRib;
    @Size(max = 13)
    @Column(name = "COMPTE_INTERNE")
    private String compteInterne;
    @Column(name = "CODE_CLIENT")
    private Integer codeClient;
    @Size(max = 30)
    @Column(name = "VALIDATION_DOSSIER")
    private String validationDossier;
    @Size(max = 30)
    @Column(name = "PAYS_DESTINATION1")
    private String paysDestination1;
    @Size(max = 30)
    @Column(name = "PAYS_SET_DEF")
    private String paysSetDef;
    @Column(name = "NUMERO_CONTRAT_COMMERCIAL")
    private Integer numeroContratCommercial;
    @Column(name = "DATE_CONTRAT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateContrat;
    @Size(max = 30)
    @Column(name = "NOM_IMPORTATEUR")
    private String nomImportateur;
    @Size(max = 100)
    @Column(name = "ADRESSE_IMPORTATEUR")
    private String adresseImportateur;
    @Size(max = 30)
    @Column(name = "REGIME_STATIQUE")
    private String regimeStatique;
    @Column(name = "NOMBRE_COLIS")
    private Integer nombreColis;
    @Size(max = 30)
    @Column(name = "MODE_REGLEMENT")
    private String modeReglement;
    @Size(max = 30)
    @Column(name = "DELAIS_REGLEMENT")
    private String delaisReglement;
    @Column(name = "DATE_VALIDATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateValidation;
    @Column(name = "DATE_APUREMENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateApurement;
    @Size(max = 30)
    @Column(name = "N_ACCORD_BCT")
    private String nAccordBct;
    @Column(name = "DATE_ACCORD_BCT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAccordBct;
    @Size(max = 30)
    @Column(name = "N_COTUNACE")
    private String nCotunace;
    @Column(name = "DATE_COTUNACE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCotunace;
    @Column(name = "N_RUB")
    private Integer nRub;
    @Column(name = "NUMERO_NGP")
    private Integer numeroNgp;
    @Size(max = 30)
    @Column(name = "DESIGNATION_NGP")
    private String designationNgp;
    @Column(name = "MONTANT")
    private Integer montant;
    @Size(max = 30)
    @Column(name = "PAYS")
    private String pays;
    @Size(max = 30)
    @Column(name = "UNITE")
    private String unite;
    @Column(name = "QUANTITE")
    private Integer quantite;
    @Column(name = "TOTALE")
    private Integer totale;
    @Size(max = 30)
    @Column(name = "NOM_IMAGE")
    private String nomImage;
    @Column(name = "FOB_DINARS")
    private Long fobDinars;

    public DepotDomiciliationTitre() {
    }

    public DepotDomiciliationTitre(String matriculeFiscale) {
        this.matriculeFiscale = matriculeFiscale;
    }

    public Integer getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(Integer codeBanque) {
        this.codeBanque = codeBanque;
    }

    public Integer getLibBanque() {
        return libBanque;
    }

    public void setLibBanque(Integer libBanque) {
        this.libBanque = libBanque;
    }

    public String getLibAgence() {
        return libAgence;
    }

    public void setLibAgence(String libAgence) {
        this.libAgence = libAgence;
    }

    public Integer getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(Integer codeTitre) {
        this.codeTitre = codeTitre;
    }

    public Date getDateDomiciliation() {
        return dateDomiciliation;
    }

    public void setDateDomiciliation(Date dateDomiciliation) {
        this.dateDomiciliation = dateDomiciliation;
    }

    public Integer getNombreRebrique() {
        return nombreRebrique;
    }

    public void setNombreRebrique(Integer nombreRebrique) {
        this.nombreRebrique = nombreRebrique;
    }

    public String getModeLivraison() {
        return modeLivraison;
    }

    public void setModeLivraison(String modeLivraison) {
        this.modeLivraison = modeLivraison;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public Long getPtfnDevise() {
        return ptfnDevise;
    }

    public void setPtfnDevise(Long ptfnDevise) {
        this.ptfnDevise = ptfnDevise;
    }

    public Long getFobDevise() {
        return fobDevise;
    }

    public void setFobDevise(Long fobDevise) {
        this.fobDevise = fobDevise;
    }

    public Long getPtfnDinars() {
        return ptfnDinars;
    }

    public void setPtfnDinars(Long ptfnDinars) {
        this.ptfnDinars = ptfnDinars;
    }

    public String getMatriculeFiscale() {
        return matriculeFiscale;
    }

    public void setMatriculeFiscale(String matriculeFiscale) {
        this.matriculeFiscale = matriculeFiscale;
    }

    public String getCompteRib() {
        return compteRib;
    }

    public void setCompteRib(String compteRib) {
        this.compteRib = compteRib;
    }

    public String getCompteInterne() {
        return compteInterne;
    }

    public void setCompteInterne(String compteInterne) {
        this.compteInterne = compteInterne;
    }

    public Integer getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(Integer codeClient) {
        this.codeClient = codeClient;
    }

    public String getValidationDossier() {
        return validationDossier;
    }

    public void setValidationDossier(String validationDossier) {
        this.validationDossier = validationDossier;
    }

    public String getPaysDestination1() {
        return paysDestination1;
    }

    public void setPaysDestination1(String paysDestination1) {
        this.paysDestination1 = paysDestination1;
    }

    public String getPaysSetDef() {
        return paysSetDef;
    }

    public void setPaysSetDef(String paysSetDef) {
        this.paysSetDef = paysSetDef;
    }

    public Integer getNumeroContratCommercial() {
        return numeroContratCommercial;
    }

    public void setNumeroContratCommercial(Integer numeroContratCommercial) {
        this.numeroContratCommercial = numeroContratCommercial;
    }

    public Date getDateContrat() {
        return dateContrat;
    }

    public void setDateContrat(Date dateContrat) {
        this.dateContrat = dateContrat;
    }

    public String getNomImportateur() {
        return nomImportateur;
    }

    public void setNomImportateur(String nomImportateur) {
        this.nomImportateur = nomImportateur;
    }

    public String getAdresseImportateur() {
        return adresseImportateur;
    }

    public void setAdresseImportateur(String adresseImportateur) {
        this.adresseImportateur = adresseImportateur;
    }

    public String getRegimeStatique() {
        return regimeStatique;
    }

    public void setRegimeStatique(String regimeStatique) {
        this.regimeStatique = regimeStatique;
    }

    public Integer getNombreColis() {
        return nombreColis;
    }

    public void setNombreColis(Integer nombreColis) {
        this.nombreColis = nombreColis;
    }

    public String getModeReglement() {
        return modeReglement;
    }

    public void setModeReglement(String modeReglement) {
        this.modeReglement = modeReglement;
    }

    public String getDelaisReglement() {
        return delaisReglement;
    }

    public void setDelaisReglement(String delaisReglement) {
        this.delaisReglement = delaisReglement;
    }

    public Date getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Date dateValidation) {
        this.dateValidation = dateValidation;
    }

    public Date getDateApurement() {
        return dateApurement;
    }

    public void setDateApurement(Date dateApurement) {
        this.dateApurement = dateApurement;
    }

    public String getNAccordBct() {
        return nAccordBct;
    }

    public void setNAccordBct(String nAccordBct) {
        this.nAccordBct = nAccordBct;
    }

    public Date getDateAccordBct() {
        return dateAccordBct;
    }

    public void setDateAccordBct(Date dateAccordBct) {
        this.dateAccordBct = dateAccordBct;
    }

    public String getNCotunace() {
        return nCotunace;
    }

    public void setNCotunace(String nCotunace) {
        this.nCotunace = nCotunace;
    }

    public Date getDateCotunace() {
        return dateCotunace;
    }

    public void setDateCotunace(Date dateCotunace) {
        this.dateCotunace = dateCotunace;
    }

    public Integer getNRub() {
        return nRub;
    }

    public void setNRub(Integer nRub) {
        this.nRub = nRub;
    }

    public Integer getNumeroNgp() {
        return numeroNgp;
    }

    public void setNumeroNgp(Integer numeroNgp) {
        this.numeroNgp = numeroNgp;
    }

    public String getDesignationNgp() {
        return designationNgp;
    }

    public void setDesignationNgp(String designationNgp) {
        this.designationNgp = designationNgp;
    }

    public Integer getMontant() {
        return montant;
    }

    public void setMontant(Integer montant) {
        this.montant = montant;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Integer getTotale() {
        return totale;
    }

    public void setTotale(Integer totale) {
        this.totale = totale;
    }

    public String getNomImage() {
        return nomImage;
    }

    public void setNomImage(String nomImage) {
        this.nomImage = nomImage;
    }

    public Long getFobDinars() {
        return fobDinars;
    }

    public void setFobDinars(Long fobDinars) {
        this.fobDinars = fobDinars;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matriculeFiscale != null ? matriculeFiscale.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepotDomiciliationTitre)) {
            return false;
        }
        DepotDomiciliationTitre other = (DepotDomiciliationTitre) object;
        if ((this.matriculeFiscale == null && other.matriculeFiscale != null) || (this.matriculeFiscale != null && !this.matriculeFiscale.equals(other.matriculeFiscale))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "infoz.domi.domain.DepotDomiciliationTitre[ matriculeFiscale=" + matriculeFiscale + " ]";
    }
    
}
