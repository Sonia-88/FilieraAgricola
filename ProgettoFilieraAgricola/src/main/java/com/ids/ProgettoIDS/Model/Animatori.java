package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;


@Entity
@Table(name = "Animatori")
public class Animatori implements com.ids.ProgettoIDS.Model.Interface.Animatori {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idAnimatore;
  private String nome;
  private String cognome;
  private String via;
  private String cellulare;
  private String email;
  private Boolean deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;

  public Animatori(Integer idAnimatore, String nome, String cognome, String via, String cellulare, String email) {
    this.idAnimatore = idAnimatore;
    this.nome = nome;
    this.cognome = cognome;
    this.via = via;
    this.cellulare = cellulare;
    this.email = email;
  }

  private void utenteUltimaModifica()
  {
    dataUltimaModifica = new Date();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    utenteUltimaModifica =  authentication.getName();
  }

  public Integer getIdAnimatore() {
    return idAnimatore;
  }

  public void setIdAnimatore(Integer idAnimatore) {
    this.idAnimatore = idAnimatore;
    utenteUltimaModifica();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
    utenteUltimaModifica();
  }

  public String getCognome() {
    return cognome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
    utenteUltimaModifica();
  }

  public String getVia() {
    return via;
  }

  public void setVia(String via) {
    this.via = via;
    utenteUltimaModifica();
  }

  public String getCellulare() {
    return cellulare;
  }

  public void setCellulare(String cellulare) {
    this.cellulare = cellulare;
    utenteUltimaModifica();
  }
  public String getEmail() {
    return email;
  }

  public void setEmail(String cellulare) {
    this.email = email;
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
