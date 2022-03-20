/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoz.domi.domain;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Mahdi
 */
@Entity
@Table(name = "produitservice")
public class ProduitService {

    @Id
    private Integer CODE_PRODUIT_SERVICE;

    private String LIBELLE_PRODUIT_SERVICE;
    private String PRODUIT_SERVICE;
    private String TYPE_DOSSIER;
    private String USER_SCHEMA;
    private String PASSWORD_SCHEMA;
    private String REPORT_SERVER;
    private String GROUP_PRODUIT;
    private String LIB_GROUP;

    public ProduitService() {}

    public ProduitService(
        int CODE_PRODUIT_SERVICE,
        String LIBELLE_PRODUIT_SERVICE,
        String PRODUIT_SERVICE,
        String TYPE_DOSSIER,
        String USER_SCHEMA,
        String PASSWORD_SCHEMA,
        String REPORT_SERVER,
        String GROUP_PRODUIT,
        String LIB_GROUP
    ) {
        this.CODE_PRODUIT_SERVICE = CODE_PRODUIT_SERVICE;
        this.LIBELLE_PRODUIT_SERVICE = LIBELLE_PRODUIT_SERVICE;
        this.PRODUIT_SERVICE = PRODUIT_SERVICE;
        this.TYPE_DOSSIER = TYPE_DOSSIER;
        this.USER_SCHEMA = USER_SCHEMA;
        this.PASSWORD_SCHEMA = PASSWORD_SCHEMA;
        this.REPORT_SERVER = REPORT_SERVER;
        this.GROUP_PRODUIT = GROUP_PRODUIT;
        this.LIB_GROUP = LIB_GROUP;
    }

    public int getCODE_PRODUIT_SERVICE() {
        return CODE_PRODUIT_SERVICE;
    }

    public void setCODE_PRODUIT_SERVICE(int CODE_PRODUIT_SERVICE) {
        this.CODE_PRODUIT_SERVICE = CODE_PRODUIT_SERVICE;
    }

    public String getLIBELLE_PRODUIT_SERVICE() {
        return LIBELLE_PRODUIT_SERVICE;
    }

    public void setLIBELLE_PRODUIT_SERVICE(String LIBELLE_PRODUIT_SERVICE) {
        this.LIBELLE_PRODUIT_SERVICE = LIBELLE_PRODUIT_SERVICE;
    }

    public String getPRODUIT_SERVICE() {
        return PRODUIT_SERVICE;
    }

    public void setPRODUIT_SERVICE(String PRODUIT_SERVICE) {
        this.PRODUIT_SERVICE = PRODUIT_SERVICE;
    }

    public String getTYPE_DOSSIER() {
        return TYPE_DOSSIER;
    }

    public void setTYPE_DOSSIER(String TYPE_DOSSIER) {
        this.TYPE_DOSSIER = TYPE_DOSSIER;
    }

    public String getUSER_SCHEMA() {
        return USER_SCHEMA;
    }

    public void setUSER_SCHEMA(String USER_SCHEMA) {
        this.USER_SCHEMA = USER_SCHEMA;
    }

    public String getPASSWORD_SCHEMA() {
        return PASSWORD_SCHEMA;
    }

    public void setPASSWORD_SCHEMA(String PASSWORD_SCHEMA) {
        this.PASSWORD_SCHEMA = PASSWORD_SCHEMA;
    }

    public String getREPORT_SERVER() {
        return REPORT_SERVER;
    }

    public void setREPORT_SERVER(String REPORT_SERVER) {
        this.REPORT_SERVER = REPORT_SERVER;
    }

    public String getGROUP_PRODUIT() {
        return GROUP_PRODUIT;
    }

    public void setGROUP_PRODUIT(String GROUP_PRODUIT) {
        this.GROUP_PRODUIT = GROUP_PRODUIT;
    }

    public String getLIB_GROUP() {
        return LIB_GROUP;
    }

    public void setLIB_GROUP(String LIB_GROUP) {
        this.LIB_GROUP = LIB_GROUP;
    }

    @Override
    public String toString() {
        return (
            "ProduitService{" +
            "CODE_PRODUIT_SERVICE=" +
            CODE_PRODUIT_SERVICE +
            ", LIBELLE_PRODUIT_SERVICE=" +
            LIBELLE_PRODUIT_SERVICE +
            ", PRODUIT_SERVICE=" +
            PRODUIT_SERVICE +
            ", TYPE_DOSSIER=" +
            TYPE_DOSSIER +
            ", USER_SCHEMA=" +
            USER_SCHEMA +
            ", PASSWORD_SCHEMA=" +
            PASSWORD_SCHEMA +
            ", REPORT_SERVER=" +
            REPORT_SERVER +
            ", GROUP_PRODUIT=" +
            GROUP_PRODUIT +
            ", LIB_GROUP=" +
            LIB_GROUP +
            '}'
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProduitService other = (ProduitService) obj;
        if (this.CODE_PRODUIT_SERVICE != other.CODE_PRODUIT_SERVICE) {
            return false;
        }
        if (!Objects.equals(this.LIBELLE_PRODUIT_SERVICE, other.LIBELLE_PRODUIT_SERVICE)) {
            return false;
        }
        if (!Objects.equals(this.PRODUIT_SERVICE, other.PRODUIT_SERVICE)) {
            return false;
        }
        if (!Objects.equals(this.TYPE_DOSSIER, other.TYPE_DOSSIER)) {
            return false;
        }
        if (!Objects.equals(this.USER_SCHEMA, other.USER_SCHEMA)) {
            return false;
        }
        if (!Objects.equals(this.PASSWORD_SCHEMA, other.PASSWORD_SCHEMA)) {
            return false;
        }
        if (!Objects.equals(this.REPORT_SERVER, other.REPORT_SERVER)) {
            return false;
        }
        if (!Objects.equals(this.GROUP_PRODUIT, other.GROUP_PRODUIT)) {
            return false;
        }
        if (!Objects.equals(this.LIB_GROUP, other.LIB_GROUP)) {
            return false;
        }
        return true;
    }
}
