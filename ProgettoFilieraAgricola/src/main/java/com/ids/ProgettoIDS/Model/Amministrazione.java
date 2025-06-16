package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;


@Entity
@Table(name = "Amministrazione")
public class Amministrazione implements com.ids.ProgettoIDS.Model.Interface.Amministrazione {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idAmministrazione;
  private String livello;
  private String userId;
  private String password;
  private Boolean deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;

  public Amministrazione(Integer idAmministrazione, String livello, String userId, String password) {
    this.idAmministrazione=idAmministrazione;
    this.livello = livello;
    this.userId = userId;
    this.password = password;
  }

  private void utenteUltimaModifica()
  {
    dataUltimaModifica = new Date();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    utenteUltimaModifica =  authentication.getName();;
  }


  public Integer getIdAmministrazione() {
    return idAmministrazione;
  }

  public void setIdAmministrazione(Integer livello) {
    this.idAmministrazione = livello;
    utenteUltimaModifica();
  }
  public String getLivello() {
    return livello;
  }

  public void setLivello(String livello) {
    this.livello = livello;
    utenteUltimaModifica();
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
    utenteUltimaModifica();
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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
