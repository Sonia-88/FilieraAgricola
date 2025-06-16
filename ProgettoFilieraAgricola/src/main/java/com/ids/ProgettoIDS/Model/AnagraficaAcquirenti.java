package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;


@Entity
@Table(name = "AnagraficaAcquirenti")
public class AnagraficaAcquirenti implements com.ids.ProgettoIDS.Model.Interface.AnagraficaAcquirenti {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idAnagraficaAcquirenti;
  private String tipo;
  private String cognome;
  private String nome;
  private String viaSpedizione;
  private String cittaSpedizione;
  private String provinciaSpedizione;
  private String viaFatturazione;
  private String cittaFatturazione;
  private String provinciaFatturazione;
  private Boolean Deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;


  public AnagraficaAcquirenti(Integer idAnagraficaAcquirenti, String tipo, String cognome, String nome, String viaSpedizione, String cittaSpedizione, String provinciaSpedizione, String viaFatturazione, String cittaFatturazione, String provinciaFatturazione) {
    this.idAnagraficaAcquirenti = idAnagraficaAcquirenti;
    this.tipo = tipo;
    this.cognome = cognome;
    this.nome = nome;
    this.viaSpedizione = viaSpedizione;
    this.cittaSpedizione = cittaSpedizione;
    this.provinciaSpedizione = provinciaSpedizione;
    this.viaFatturazione = viaFatturazione;
    this.cittaFatturazione = cittaFatturazione;
    this.provinciaFatturazione = provinciaFatturazione;
  }

  private void utenteUltimaModifica()
  {
    dataUltimaModifica = new Date();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    utenteUltimaModifica =  authentication.getName();;
  }

  public Integer getIdAnagraficaAcquirenti() {
    return idAnagraficaAcquirenti;
  }

  public void setIdAnagraficaAcquirenti(Integer idAnagraficaAcquirenti) {
    this.idAnagraficaAcquirenti = idAnagraficaAcquirenti;
    utenteUltimaModifica();
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
    utenteUltimaModifica();
  }

  public String getCognome() {
    return cognome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
    utenteUltimaModifica();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
    utenteUltimaModifica();
  }

  public String getViaSpedizione() {
    return viaSpedizione;
  }

  public void setViaSpedizione(String viaSpedizione) {
    this.viaSpedizione = viaSpedizione;
    utenteUltimaModifica();
  }

  public String getCittaSpedizione() {
    return cittaSpedizione;
  }

  public void setCittaSpedizione(String cittaSpedizione) {
    this.cittaSpedizione = cittaSpedizione;
    utenteUltimaModifica();
  }

  public String getProvinciaSpedizione() {
    return provinciaSpedizione;
  }

  public void setProvinciaSpedizione(String provinciaSpedizione) {
    this.provinciaSpedizione = provinciaSpedizione;
    utenteUltimaModifica();
  }

  public String getViaFatturazione() {
    return viaFatturazione;
  }

  public void setViaFatturazione(String viaFatturazione) {
    this.viaFatturazione = viaFatturazione;
    utenteUltimaModifica();
  }

  public String getCittaFatturazione() {
    return cittaFatturazione;
  }

  public void setCittaFatturazione(String cittaFatturazione) {
    this.cittaFatturazione = cittaFatturazione;
    utenteUltimaModifica();
  }

  public String getProvinciaFatturazione() {
    return provinciaFatturazione;
  }

  public void setProvinciaFatturazione(String provinciaFatturazione) {
    this.provinciaFatturazione = provinciaFatturazione;
    utenteUltimaModifica();
  }

  public Boolean getDeleted() {
    return Deleted;
  }

  public void setDeleted(Boolean deleted) {
    Deleted = deleted;
    utenteUltimaModifica();
  }
}
