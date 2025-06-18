package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "VenditeDettaglio")
public class VenditeDettaglio implements com.ids.ProgettoIDS.Model.Interface.VenditeDettaglio {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idVenditeDettaglio;
  private Integer idVenditeTestata;
  private String progressivo;
  private String ragioneSocialeVenditore;
  private String prodotto;
  private String packaging;
  private Double prezzoDiVendita;
  private String confezione;
  private String descrizioneBreve;
  private Integer qta;
  private Double prezzo;
  private Boolean deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;

  // Relazione Molti a Uno con VenditeTestata
  @ManyToOne
  @JoinColumn(name = "idVenditeTestata", insertable = false, updatable = false)
  private VenditeTestata venditeTestata;



  public VenditeDettaglio(Integer idVenditeDettaglio, Integer idVenditeTestata, String progressivo, String ragioneSocialeVenditore, String prodotto, String packaging, Double prezzoDiVendita, String confezione, String descrizioneBreve, Integer qta, Double prezzo) {
    this.idVenditeDettaglio=idVenditeDettaglio;
    this.idVenditeTestata = idVenditeTestata;
    this.progressivo = progressivo;
    this.ragioneSocialeVenditore = ragioneSocialeVenditore;
    this.prodotto = prodotto;
    this.packaging = packaging;
    this.prezzoDiVendita = prezzoDiVendita;
    this.confezione = confezione;
    this.descrizioneBreve = descrizioneBreve;
    this.qta = qta;
    this.prezzo = prezzo;
    this.deleted = false;
    //utenteUltimaModifica();
  }

  private void utenteUltimaModifica()
  {
    dataUltimaModifica = new Date();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    utenteUltimaModifica =  authentication.getName();;
  }

  public Integer getIdVenditeTestata() {
    return idVenditeTestata;
  }

  public void setIdVenditeTestata(Integer idVenditeTestata) {
    this.idVenditeTestata = idVenditeTestata;
    utenteUltimaModifica();
  }

  public String getProgressivo() {
    return progressivo;
  }

  public void setProgressivo(String progressivo) {
    this.progressivo = progressivo;
    utenteUltimaModifica();
  }

  public String getRagioneSocialeVenditore() {
    return ragioneSocialeVenditore;
  }

  public void setRagioneSocialeVenditore(String ragioneSocialeVenditore) {
    this.ragioneSocialeVenditore = ragioneSocialeVenditore;
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

  public Double getPrezzoDiVendita() {
    return prezzoDiVendita;
  }

  public void setPrezzoDiVendita(Double prezzoDiVendita) {
    this.prezzoDiVendita = prezzoDiVendita;
    utenteUltimaModifica();
  }

  public String getConezione() {
    return confezione;
  }

  public void setConezione(String conezione) {
    this.confezione = conezione;
    utenteUltimaModifica();
  }

  public String getDescrizioneBreve() {
    return descrizioneBreve;
  }

  public void setDescrizioneBreve(String descrizioneBreve) {
    this.descrizioneBreve = descrizioneBreve;
    utenteUltimaModifica();
  }

  public Integer getQta() {
    return qta;
  }

  public void setQta(Integer qta) {
    this.qta = qta;
    utenteUltimaModifica();
  }

  public Double getPrezzo() {
    return prezzo;
  }

  public void setPrezzo(Double prezzo) {
    this.prezzo = prezzo;
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
