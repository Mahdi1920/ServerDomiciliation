/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "DONNEES_GENERALES")
public class DonneesGenerales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @NotNull
    @Column(name = "CODE_BANQUE")
    private Integer codeBanque;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOM_BANQUE")
    private String nomBanque;
    @Size(max = 1)
    @Column(name = "TYPE_TEMPS_TRAITEMENT")
    private String typeTempsTraitement;
    @Column(name = "TEMPS_TRAITEMENT")
    private Integer tempsTraitement;
    @Size(max = 35)
    @Column(name = "CODE_BCT")
    private String codeBct;
    @Size(max = 35)
    @Column(name = "CODE_DOUANE")
    private String codeDouane;
    @Size(max = 35)
    @Column(name = "CODE_MINISTERE_COMMERCE")
    private String codeMinistereCommerce;
    @Column(name = "CODE_AGENCE")
    private Integer codeAgence;
    @Size(max = 100)
    @Column(name = "LIB_AGENCE")
    private String libAgence;
    @Size(max = 3)
    @Column(name = "TYPE_PIECES_JOINTES")
    private String typePiecesJointes;
    @Size(max = 35)
    @Column(name = "NOM_SIGNATAIRE")
    private String nomSignataire;
    @Size(max = 50)
    @Column(name = "SIGNATAIRE_BCT")
    private String signataireBct;
    @Size(max = 35)
    @Column(name = "EMETTEUR_INITIATEUR")
    private String emetteurInitiateur;
    @Size(max = 35)
    @Column(name = "DESTINATAIRE_INITIATEUR")
    private String destinataireInitiateur;
    @Size(max = 20)
    @Column(name = "CODE_ORGANISME")
    private String codeOrganisme;
    @Column(name = "ANNEE_DOMICILIATION")
    private Integer anneeDomiciliation;
    @Size(max = 100)
    @Column(name = "SIGNATAIRE_FINEX")
    private String signataireFinex;
    @Size(max = 3)
    @Column(name = "FTP_LECT")
    private String ftpLect;
    @Size(max = 50)
    @Column(name = "NOM_IMAGE")
    private String nomImage;
    @Size(max = 50)
    @Column(name = "NOM_REPORT_SERVER")
    private String nomReportServer;
    @Size(max = 200)
    @Column(name = "ADRESSE_HTTP_REPORT_SERVER")
    private String adresseHttpReportServer;
    @Size(max = 100)
    @Column(name = "PATH_IMAGE")
    private String pathImage;
    @Size(max = 100)
    @Column(name = "ADRESSE_IP_SERVEUR_SAUVEGARDE")
    private String adresseIpServeurSauvegarde;
    @Size(max = 100)
    @Column(name = "ADRESSE_IP_SERVEUR_TTN")
    private String adresseIpServeurTtn;
    @Size(max = 20)
    @Column(name = "USER_SERVEUR_SAUVEGARDE")
    private String userServeurSauvegarde;
    @Size(max = 20)
    @Column(name = "PASSWORD_SERVEUR_SAUVEGARDE")
    private String passwordServeurSauvegarde;
    @Size(max = 20)
    @Column(name = "USER_SERVEUR_TTN")
    private String userServeurTtn;
    @Size(max = 20)
    @Column(name = "PASSWORD_SERVEUR_TTN")
    private String passwordServeurTtn;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MNT_AVA_AUTORISE")
    private BigDecimal mntAvaAutorise;
    @Column(name = "MONTANT_TELECOMPENSE")
    private BigDecimal montantTelecompense;
    @Size(max = 7)
    @Column(name = "CODE_DOUANE_BNQ")
    private String codeDouaneBnq;
    @Column(name = "CODE_AGENCE_AVA_BNQ")
    private Integer codeAgenceAvaBnq;
    @Column(name = "NUM_DOSSIER_AVA_BNQ")
    private Integer numDossierAvaBnq;
    @Column(name = "POURCENTAGE_AVA")
    private Integer pourcentageAva;
    @Column(name = "TAUX_RAPATRIEMENT")
    private Long tauxRapatriement;
    @Size(max = 1)
    @Column(name = "REPERTOIRE_UNIQUE")
    private String repertoireUnique;
    @Size(max = 100)
    @Column(name = "PATH_SCAN_AS")
    private String pathScanAs;
    @Size(max = 100)
    @Column(name = "PATH_AFFICHE_AS")
    private String pathAfficheAs;
    @Column(name = "CODE_CORRESPONDANT_VISA")
    private Integer codeCorrespondantVisa;
    @Column(name = "CODE_CORRESPONDANT_MASTER")
    private Integer codeCorrespondantMaster;
    @Lob
    @Column(name = "PHOTO")
    private Serializable photo;
    @Column(name = "ANNEE_CIRCULAIRE")
    private Integer anneeCirculaire;
    @Column(name = "NUMERO_CIRCULAIRE")
    private Integer numeroCirculaire;
    @Column(name = "DATE_APPLICATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateApplication;
    @Column(name = "TIMER_SWIFT")
    private Integer timerSwift;
    @Size(max = 1)
    @Column(name = "TYPE_TIMER_SWIFT")
    private String typeTimerSwift;
    @Size(max = 12)
    @Column(name = "NUM_SWIFT")
    private String numSwift;
    @Size(max = 1)
    @Column(name = "ARBITRAGE_O_N")
    private String arbitrageON;
    @Size(max = 1)
    @Column(name = "COM_TND_DVS")
    private String comTndDvs;
    @Size(max = 1)
    @Column(name = "DEVISE_PALLIER")
    private String devisePallier;
    @Column(name = "NBR_JOUR_RELANCE_RDI")
    private Integer nbrJourRelanceRdi;
    @Column(name = "MNT_CAPITAL")
    private BigDecimal mntCapital;
    @Size(max = 200)
    @Column(name = "EMAIL_ADMIN")
    private String emailAdmin;
    @Size(max = 5)
    @Column(name = "CUT_OFF_TIME_SDM")
    private String cutOffTimeSdm;
    @Size(max = 5)
    @Column(name = "CUT_OFF_TIME_TRE")
    private String cutOffTimeTre;

    public DonneesGenerales() {
    }

    public DonneesGenerales(Integer codeBanque) {
        this.codeBanque = codeBanque;
    }

    public DonneesGenerales(Integer codeBanque, String nomBanque) {
        this.codeBanque = codeBanque;
        this.nomBanque = nomBanque;
    }

    public Integer getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(Integer codeBanque) {
        this.codeBanque = codeBanque;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public String getTypeTempsTraitement() {
        return typeTempsTraitement;
    }

    public void setTypeTempsTraitement(String typeTempsTraitement) {
        this.typeTempsTraitement = typeTempsTraitement;
    }

    public Integer getTempsTraitement() {
        return tempsTraitement;
    }

    public void setTempsTraitement(Integer tempsTraitement) {
        this.tempsTraitement = tempsTraitement;
    }

    public String getCodeBct() {
        return codeBct;
    }

    public void setCodeBct(String codeBct) {
        this.codeBct = codeBct;
    }

    public String getCodeDouane() {
        return codeDouane;
    }

    public void setCodeDouane(String codeDouane) {
        this.codeDouane = codeDouane;
    }

    public String getCodeMinistereCommerce() {
        return codeMinistereCommerce;
    }

    public void setCodeMinistereCommerce(String codeMinistereCommerce) {
        this.codeMinistereCommerce = codeMinistereCommerce;
    }

    public Integer getCodeAgence() {
        return codeAgence;
    }

    public void setCodeAgence(Integer codeAgence) {
        this.codeAgence = codeAgence;
    }

    public String getLibAgence() {
        return libAgence;
    }

    public void setLibAgence(String libAgence) {
        this.libAgence = libAgence;
    }

    public String getTypePiecesJointes() {
        return typePiecesJointes;
    }

    public void setTypePiecesJointes(String typePiecesJointes) {
        this.typePiecesJointes = typePiecesJointes;
    }

    public String getNomSignataire() {
        return nomSignataire;
    }

    public void setNomSignataire(String nomSignataire) {
        this.nomSignataire = nomSignataire;
    }

    public String getSignataireBct() {
        return signataireBct;
    }

    public void setSignataireBct(String signataireBct) {
        this.signataireBct = signataireBct;
    }

    public String getEmetteurInitiateur() {
        return emetteurInitiateur;
    }

    public void setEmetteurInitiateur(String emetteurInitiateur) {
        this.emetteurInitiateur = emetteurInitiateur;
    }

    public String getDestinataireInitiateur() {
        return destinataireInitiateur;
    }

    public void setDestinataireInitiateur(String destinataireInitiateur) {
        this.destinataireInitiateur = destinataireInitiateur;
    }

    public String getCodeOrganisme() {
        return codeOrganisme;
    }

    public void setCodeOrganisme(String codeOrganisme) {
        this.codeOrganisme = codeOrganisme;
    }

    public Integer getAnneeDomiciliation() {
        return anneeDomiciliation;
    }

    public void setAnneeDomiciliation(Integer anneeDomiciliation) {
        this.anneeDomiciliation = anneeDomiciliation;
    }

    public String getSignataireFinex() {
        return signataireFinex;
    }

    public void setSignataireFinex(String signataireFinex) {
        this.signataireFinex = signataireFinex;
    }

    public String getFtpLect() {
        return ftpLect;
    }

    public void setFtpLect(String ftpLect) {
        this.ftpLect = ftpLect;
    }

    public String getNomImage() {
        return nomImage;
    }

    public void setNomImage(String nomImage) {
        this.nomImage = nomImage;
    }

    public String getNomReportServer() {
        return nomReportServer;
    }

    public void setNomReportServer(String nomReportServer) {
        this.nomReportServer = nomReportServer;
    }

    public String getAdresseHttpReportServer() {
        return adresseHttpReportServer;
    }

    public void setAdresseHttpReportServer(String adresseHttpReportServer) {
        this.adresseHttpReportServer = adresseHttpReportServer;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public String getAdresseIpServeurSauvegarde() {
        return adresseIpServeurSauvegarde;
    }

    public void setAdresseIpServeurSauvegarde(String adresseIpServeurSauvegarde) {
        this.adresseIpServeurSauvegarde = adresseIpServeurSauvegarde;
    }

    public String getAdresseIpServeurTtn() {
        return adresseIpServeurTtn;
    }

    public void setAdresseIpServeurTtn(String adresseIpServeurTtn) {
        this.adresseIpServeurTtn = adresseIpServeurTtn;
    }

    public String getUserServeurSauvegarde() {
        return userServeurSauvegarde;
    }

    public void setUserServeurSauvegarde(String userServeurSauvegarde) {
        this.userServeurSauvegarde = userServeurSauvegarde;
    }

    public String getPasswordServeurSauvegarde() {
        return passwordServeurSauvegarde;
    }

    public void setPasswordServeurSauvegarde(String passwordServeurSauvegarde) {
        this.passwordServeurSauvegarde = passwordServeurSauvegarde;
    }

    public String getUserServeurTtn() {
        return userServeurTtn;
    }

    public void setUserServeurTtn(String userServeurTtn) {
        this.userServeurTtn = userServeurTtn;
    }

    public String getPasswordServeurTtn() {
        return passwordServeurTtn;
    }

    public void setPasswordServeurTtn(String passwordServeurTtn) {
        this.passwordServeurTtn = passwordServeurTtn;
    }

    public BigDecimal getMntAvaAutorise() {
        return mntAvaAutorise;
    }

    public void setMntAvaAutorise(BigDecimal mntAvaAutorise) {
        this.mntAvaAutorise = mntAvaAutorise;
    }

    public BigDecimal getMontantTelecompense() {
        return montantTelecompense;
    }

    public void setMontantTelecompense(BigDecimal montantTelecompense) {
        this.montantTelecompense = montantTelecompense;
    }

    public String getCodeDouaneBnq() {
        return codeDouaneBnq;
    }

    public void setCodeDouaneBnq(String codeDouaneBnq) {
        this.codeDouaneBnq = codeDouaneBnq;
    }

    public Integer getCodeAgenceAvaBnq() {
        return codeAgenceAvaBnq;
    }

    public void setCodeAgenceAvaBnq(Integer codeAgenceAvaBnq) {
        this.codeAgenceAvaBnq = codeAgenceAvaBnq;
    }

    public Integer getNumDossierAvaBnq() {
        return numDossierAvaBnq;
    }

    public void setNumDossierAvaBnq(Integer numDossierAvaBnq) {
        this.numDossierAvaBnq = numDossierAvaBnq;
    }

    public Integer getPourcentageAva() {
        return pourcentageAva;
    }

    public void setPourcentageAva(Integer pourcentageAva) {
        this.pourcentageAva = pourcentageAva;
    }

    public Long getTauxRapatriement() {
        return tauxRapatriement;
    }

    public void setTauxRapatriement(Long tauxRapatriement) {
        this.tauxRapatriement = tauxRapatriement;
    }

    public String getRepertoireUnique() {
        return repertoireUnique;
    }

    public void setRepertoireUnique(String repertoireUnique) {
        this.repertoireUnique = repertoireUnique;
    }

    public String getPathScanAs() {
        return pathScanAs;
    }

    public void setPathScanAs(String pathScanAs) {
        this.pathScanAs = pathScanAs;
    }

    public String getPathAfficheAs() {
        return pathAfficheAs;
    }

    public void setPathAfficheAs(String pathAfficheAs) {
        this.pathAfficheAs = pathAfficheAs;
    }

    public Integer getCodeCorrespondantVisa() {
        return codeCorrespondantVisa;
    }

    public void setCodeCorrespondantVisa(Integer codeCorrespondantVisa) {
        this.codeCorrespondantVisa = codeCorrespondantVisa;
    }

    public Integer getCodeCorrespondantMaster() {
        return codeCorrespondantMaster;
    }

    public void setCodeCorrespondantMaster(Integer codeCorrespondantMaster) {
        this.codeCorrespondantMaster = codeCorrespondantMaster;
    }

    public Serializable getPhoto() {
        return photo;
    }

    public void setPhoto(Serializable photo) {
        this.photo = photo;
    }

    public Integer getAnneeCirculaire() {
        return anneeCirculaire;
    }

    public void setAnneeCirculaire(Integer anneeCirculaire) {
        this.anneeCirculaire = anneeCirculaire;
    }

    public Integer getNumeroCirculaire() {
        return numeroCirculaire;
    }

    public void setNumeroCirculaire(Integer numeroCirculaire) {
        this.numeroCirculaire = numeroCirculaire;
    }

    public Date getDateApplication() {
        return dateApplication;
    }

    public void setDateApplication(Date dateApplication) {
        this.dateApplication = dateApplication;
    }

    public Integer getTimerSwift() {
        return timerSwift;
    }

    public void setTimerSwift(Integer timerSwift) {
        this.timerSwift = timerSwift;
    }

    public String getTypeTimerSwift() {
        return typeTimerSwift;
    }

    public void setTypeTimerSwift(String typeTimerSwift) {
        this.typeTimerSwift = typeTimerSwift;
    }

    public String getNumSwift() {
        return numSwift;
    }

    public void setNumSwift(String numSwift) {
        this.numSwift = numSwift;
    }

    public String getArbitrageON() {
        return arbitrageON;
    }

    public void setArbitrageON(String arbitrageON) {
        this.arbitrageON = arbitrageON;
    }

    public String getComTndDvs() {
        return comTndDvs;
    }

    public void setComTndDvs(String comTndDvs) {
        this.comTndDvs = comTndDvs;
    }

    public String getDevisePallier() {
        return devisePallier;
    }

    public void setDevisePallier(String devisePallier) {
        this.devisePallier = devisePallier;
    }

    public Integer getNbrJourRelanceRdi() {
        return nbrJourRelanceRdi;
    }

    public void setNbrJourRelanceRdi(Integer nbrJourRelanceRdi) {
        this.nbrJourRelanceRdi = nbrJourRelanceRdi;
    }

    public BigDecimal getMntCapital() {
        return mntCapital;
    }

    public void setMntCapital(BigDecimal mntCapital) {
        this.mntCapital = mntCapital;
    }

    public String getEmailAdmin() {
        return emailAdmin;
    }

    public void setEmailAdmin(String emailAdmin) {
        this.emailAdmin = emailAdmin;
    }

    public String getCutOffTimeSdm() {
        return cutOffTimeSdm;
    }

    public void setCutOffTimeSdm(String cutOffTimeSdm) {
        this.cutOffTimeSdm = cutOffTimeSdm;
    }

    public String getCutOffTimeTre() {
        return cutOffTimeTre;
    }

    public void setCutOffTimeTre(String cutOffTimeTre) {
        this.cutOffTimeTre = cutOffTimeTre;
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
        if (!(object instanceof DonneesGenerales)) {
            return false;
        }
        DonneesGenerales other = (DonneesGenerales) object;
        if ((this.codeBanque == null && other.codeBanque != null) || (this.codeBanque != null && !this.codeBanque.equals(other.codeBanque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DonneesGenerales{" + "codeBanque=" + codeBanque + ", nomBanque=" + nomBanque + ", typeTempsTraitement=" + typeTempsTraitement + ", tempsTraitement=" + tempsTraitement + ", codeBct=" + codeBct + ", codeDouane=" + codeDouane + ", codeMinistereCommerce=" + codeMinistereCommerce + ", codeAgence=" + codeAgence + ", libAgence=" + libAgence + ", typePiecesJointes=" + typePiecesJointes + ", nomSignataire=" + nomSignataire + ", signataireBct=" + signataireBct + ", emetteurInitiateur=" + emetteurInitiateur + ", destinataireInitiateur=" + destinataireInitiateur + ", codeOrganisme=" + codeOrganisme + ", anneeDomiciliation=" + anneeDomiciliation + ", signataireFinex=" + signataireFinex + ", ftpLect=" + ftpLect + ", nomImage=" + nomImage + ", nomReportServer=" + nomReportServer + ", adresseHttpReportServer=" + adresseHttpReportServer + ", pathImage=" + pathImage + ", adresseIpServeurSauvegarde=" + adresseIpServeurSauvegarde + ", adresseIpServeurTtn=" + adresseIpServeurTtn + ", userServeurSauvegarde=" + userServeurSauvegarde + ", passwordServeurSauvegarde=" + passwordServeurSauvegarde + ", userServeurTtn=" + userServeurTtn + ", passwordServeurTtn=" + passwordServeurTtn + ", mntAvaAutorise=" + mntAvaAutorise + ", montantTelecompense=" + montantTelecompense + ", codeDouaneBnq=" + codeDouaneBnq + ", codeAgenceAvaBnq=" + codeAgenceAvaBnq + ", numDossierAvaBnq=" + numDossierAvaBnq + ", pourcentageAva=" + pourcentageAva + ", tauxRapatriement=" + tauxRapatriement + ", repertoireUnique=" + repertoireUnique + ", pathScanAs=" + pathScanAs + ", pathAfficheAs=" + pathAfficheAs + ", codeCorrespondantVisa=" + codeCorrespondantVisa + ", codeCorrespondantMaster=" + codeCorrespondantMaster + ", photo=" + photo + ", anneeCirculaire=" + anneeCirculaire + ", numeroCirculaire=" + numeroCirculaire + ", dateApplication=" + dateApplication + ", timerSwift=" + timerSwift + ", typeTimerSwift=" + typeTimerSwift + ", numSwift=" + numSwift + ", arbitrageON=" + arbitrageON + ", comTndDvs=" + comTndDvs + ", devisePallier=" + devisePallier + ", nbrJourRelanceRdi=" + nbrJourRelanceRdi + ", mntCapital=" + mntCapital + ", emailAdmin=" + emailAdmin + ", cutOffTimeSdm=" + cutOffTimeSdm + ", cutOffTimeTre=" + cutOffTimeTre + '}';
    }

}
