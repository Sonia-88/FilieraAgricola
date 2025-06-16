package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;


@Entity
@Table(name = "Acquirente")
public class Acquirente implements com.ids.ProgettoIDS.Model.Interface.Acquirente {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idAcquirente;
  private String nome;
  private String cognome;
  private String telefono;
  private String email;
  private String indirizzo;
  private String citta;
  private String provincia;
  private String userId;
  private String password;
  private Boolean deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;

  public Acquirente(Integer idAcquirente, String nome, String cognome, String telefono, String email, String indirizzo, String citta, String provincia, String userId, String password) {
    this.idAcquirente = idAcquirente;
    this.nome = nome;
    this.cognome = cognome;
    this.telefono = telefono;
    this.email = email;
    this.indirizzo = indirizzo;
    this.citta = citta;
    this.provincia = provincia;
    this.userId = userId;
    this.password = password;
  }

  private void utenteUltimaModifica()
  {
    dataUltimaModifica = new Date();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    utenteUltimaModifica =  authentication.getName();;
  }



  public Integer getIdAcquirente() {
    return idAcquirente;
  }

  public void setIdAcquirente(Integer nome) {
    this.idAcquirente = idAcquirente;
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

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
    utenteUltimaModifica();
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
    utenteUltimaModifica();
  }

  public String getIndirizzo() {
    return indirizzo;
  }

  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
    utenteUltimaModifica();
  }

  public String getCitta() {
    return citta;
  }

  public void setCitta(String citta) {
    this.citta = citta;
    utenteUltimaModifica();
  }

  public String getProvincia() {
    return provincia;
  }

  public void setProvincia(String provincia) {
    this.provincia = provincia;
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
