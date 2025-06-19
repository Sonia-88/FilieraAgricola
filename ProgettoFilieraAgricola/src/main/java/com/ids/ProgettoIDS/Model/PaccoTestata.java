package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "PaccoTestata")
public class PaccoTestata implements com.ids.ProgettoIDS.Model.Interface.PaccoTestata {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idPaccoTestata;
  private Integer idAnagrafica;
  private String prodotto;
  private String packaging;
  private Double prezzoVendita;
  private String confezione;
  private String descrizioneBreve;
  private String descrizioneEstesa;
  private String approvazioneCuratore;
  private Boolean Deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDateTime dataUltimaModifica;
  private String utenteUltimaModifica;


  // Relazione Uno a Molti con PaccoDettaglio
  @OneToMany(mappedBy = "paccoTestata", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<PaccoDettaglio> dettaglioPacco;


  public PaccoTestata(Integer idPaccoTestata, Integer idAnagrafica, String prodotto, String packaging, Double prezzoVendita, String confezione, String descrizioneBreve, String descrizioneEstesa, String approvazioneCuratore) {
    this.idPaccoTestata = idPaccoTestata;
    this.idAnagrafica = idAnagrafica;
    this.prodotto = prodotto;
    this.packaging = packaging;
    this.prezzoVendita = prezzoVendita;
    this.confezione = confezione;
    this.descrizioneBreve = descrizioneBreve;
    this.descrizioneEstesa = descrizioneEstesa;
    this.approvazioneCuratore = approvazioneCuratore;
  }

  private void utenteUltimaModifica()
  {
    dataUltimaModifica = LocalDateTime.now();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    utenteUltimaModifica =  authentication.getName();;
  }

  public Integer getIdPaccoTestata() {
    return idPaccoTestata;
  }

  public void setIdPaccoTestata(Integer idPaccoTestata) {
    this.idPaccoTestata = idPaccoTestata;
    utenteUltimaModifica();
  }

  public Integer getIdAnagrafica() {
    return idAnagrafica;
  }

  public void setIdAnagrafica(Integer idAnagrafica) {
    this.idAnagrafica = idAnagrafica;
    utenteUltimaModifica();
  }

  public String getProdotto() {
    return prodotto;
  }

  public void setProdotto(String prodotto) {
    this.prodotto = prodotto;
    utenteUltimaModifica();
  }

  public String getPackaging() {
    return packaging;
  }

  public void setPackaging(String packaging) {
    this.packaging = packaging;
    utenteUltimaModifica();
  }

  public Double getPrezzoVendita() {
    return prezzoVendita;
  }

  public void setPrezzoVendita(Double prezzoVendita) {
    this.prezzoVendita = prezzoVendita;
    utenteUltimaModifica();
  }

  public String getConfezione() {
    return confezione;
  }

  public void setConfezione(String confezione) {
    this.confezione = confezione;
    utenteUltimaModifica();
  }

  public String getDescrizioneBreve() {
    return descrizioneBreve;
  }

  public void setDescrizioneBreve(String descrizioneBreve) {
    this.descrizioneBreve = descrizioneBreve;
    utenteUltimaModifica();
  }

  public String getDescrizioneEstesa() {
    return descrizioneEstesa;
  }

  public void setDescrizioneEstesa(String descrizioneEstesa) {
    this.descrizioneEstesa = descrizioneEstesa;
    utenteUltimaModifica();
  }

  public String getApprovazioneCuratore() {
    return approvazioneCuratore;
  }

  public void setApprovazioneCuratore(String approvazioneCuratore) {
    this.approvazioneCuratore = approvazioneCuratore;
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


