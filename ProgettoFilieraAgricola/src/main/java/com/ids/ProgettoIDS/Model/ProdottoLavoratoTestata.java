package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "ProdottoLavoratoTestata")
public class ProdottoLavoratoTestata implements com.ids.ProgettoIDS.Model.Interface.ProdottoLavoratoTestata {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idProdottoLavoratoTestata;
  private Integer idAnagrafica;
  private String prodotto;
  private String packaging;
  private Double prezzoDiVendita;
  private String confezione;
  private String descrizioneBreve;
  private String descrizioneEstesa;
  private String luogoLavorazione;
  private Boolean approvazioneCuratore;
  private Boolean deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;

  // Relazione Uno a Molti con ProdottoLavoratoDettaglio
  @OneToMany(mappedBy = "prodottoLavoratoTestata", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<ProdottoLavoratoDettaglio> dettaglioProdottoLavorato;


  public ProdottoLavoratoTestata(Integer idProdottoLavoratoTestata, Integer idAnagrafica, String prodotto, String packaging, Double prezzoDiVendita, String confezione, String descrizioneBreve, String descrizioneEstesa, String luogoLavorazione, Boolean approvazioneCuratore) {
    this.idProdottoLavoratoTestata = idProdottoLavoratoTestata;
    this.idAnagrafica = idAnagrafica;
    this.prodotto = prodotto;
    this.packaging = packaging;
    this.prezzoDiVendita = prezzoDiVendita;
    this.confezione = confezione;
    this.descrizioneBreve = descrizioneBreve;
    this.descrizioneEstesa = descrizioneEstesa;
    this.luogoLavorazione = luogoLavorazione;
    this.approvazioneCuratore = approvazioneCuratore;
  }

  private void utenteUltimaModifica()
  {
    dataUltimaModifica = new Date();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    utenteUltimaModifica =  authentication.getName();;
  }

  public Integer getIdProdottoLavoratoTestata() {
    return idProdottoLavoratoTestata;
  }

  public void setIdProdottoLavoratoTestata(Integer idProdottoLavoratoTestata) {
    this.idProdottoLavoratoTestata = idProdottoLavoratoTestata;
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

  public Double getPrezzoDiVendita() {
    return prezzoDiVendita;
  }

  public void setPrezzoDiVendita(Double prezzoDiVendita) {
    this.prezzoDiVendita = prezzoDiVendita;
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

  public String getLuogoLavorazione() {
    return luogoLavorazione;
  }

  public void setLuogoLavorazione(String luogoLavorazione) {
    this.luogoLavorazione = luogoLavorazione;
    utenteUltimaModifica();
  }

  public Boolean getApprovazioneCuratore() {
    return approvazioneCuratore;
  }

  public void setApprovazioneCuratore(Boolean approvazioneCuratore) {
    this.approvazioneCuratore = approvazioneCuratore;
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
