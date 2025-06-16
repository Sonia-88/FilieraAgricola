package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;


@Entity
@Table(name = "InvitatiVendor")
public class InvitatiVendor implements com.ids.ProgettoIDS.Model.Interface.InvitatiVendor {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idInvitatiVendor;
  private Integer idManifestazione;
  private Integer idAnimatore;
  private Integer idProduttore;
  private Integer idDistributore;
  private Integer idTrasformatore;
  private Boolean deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;

  public InvitatiVendor(Integer idInvitatiVendor, Integer idManifestazione, Integer idAnimatore, Integer idProduttore, Integer idDistributore, Integer idTrasformatore) {
    this.idInvitatiVendor = idInvitatiVendor;
    this.idManifestazione = idManifestazione;
    this.idAnimatore = idAnimatore;
    this.idProduttore = idProduttore;
    this.idDistributore = idDistributore;
    this.idTrasformatore = idTrasformatore;
  }

  private void utenteUltimaModifica()
  {
    dataUltimaModifica = new Date();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    utenteUltimaModifica =  authentication.getName();;
  }

  public Integer getIdInvitatiVendor() {
    return idInvitatiVendor;
  }

  public void setIdInvitatiVendor(Integer idInvitatiVendor) {
    this.idInvitatiVendor = idInvitatiVendor;
    utenteUltimaModifica();
  }

  public Integer getIdManifestazione() {
    return idManifestazione;
  }

  public void setIdManifestazione(Integer idManifestazione) {
    this.idManifestazione = idManifestazione;
    utenteUltimaModifica();
  }

  public Integer getIdAnimatore() {
    return idAnimatore;
  }

  public void setIdAnimatore(Integer idAnimatore) {
    this.idAnimatore = idAnimatore;
    utenteUltimaModifica();
  }

  public Integer getIdProduttore() {
    return idProduttore;
  }

  public void setIdProduttore(Integer idProduttore) {
    this.idProduttore = idProduttore;
    utenteUltimaModifica();
  }

  public Integer getIdDistributore() {
    return idDistributore;
  }

  public void setIdDistributore(Integer idDistributore) {
    this.idDistributore = idDistributore;
    utenteUltimaModifica();
  }

  public Integer getIdTrasformatore() {
    return idTrasformatore;
  }

  public void setIdTrasformatore(Integer idTrasformatore) {
    this.idTrasformatore = idTrasformatore;
    utenteUltimaModifica();
  }

  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
    utenteUltimaModifica();
  }
}
