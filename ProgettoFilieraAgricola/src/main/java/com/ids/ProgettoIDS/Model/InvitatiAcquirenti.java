package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;


@Entity
@Table(name = "InvitatiAcquirenti")
public class  InvitatiAcquirenti implements com.ids.ProgettoIDS.Model.Interface.InvitatiAcquirenti {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idInvitatiAcquirenti;
  private Integer idVisiteAziende;
  private Integer idAcquirente;
  private Integer idAnimatore;
  private Boolean deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;

  public InvitatiAcquirenti(Integer idInvitatiAcquirenti, Integer idVisiteAziende, Integer idAcquirente, Integer idAnimatore) {
    this.idInvitatiAcquirenti = idInvitatiAcquirenti;
    this.idVisiteAziende = idVisiteAziende;
    this.idAcquirente = idAcquirente;
    this.idAnimatore = idAnimatore;
  }

  private void utenteUltimaModifica()
  {
    dataUltimaModifica = new Date();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    utenteUltimaModifica =  authentication.getName();;
  }

  public Integer getIdInvitatiAcquirenti() {
    return idInvitatiAcquirenti;
  }

  public void setIdInvitatiAcquirenti(Integer idInvitatiAcquirenti) {
    this.idInvitatiAcquirenti = idInvitatiAcquirenti;
    utenteUltimaModifica();
  }

  public Integer getIdVisiteAziende() {
    return idVisiteAziende;
  }

  public void setIdVisiteAziende(Integer idVisiteAziende) {
    this.idVisiteAziende = idVisiteAziende;
    utenteUltimaModifica();
  }

  public Integer getIdAcquirente() {
    return idAcquirente;
  }

  public void setIdAcquirente(Integer idAcquirente) {
    this.idAcquirente = idAcquirente;
    utenteUltimaModifica();
  }

  public Integer getIdAnimatore() {
    return idAnimatore;
  }

  public void setIdAnimatore(Integer idAnimatore) {
    this.idAnimatore = idAnimatore;
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
