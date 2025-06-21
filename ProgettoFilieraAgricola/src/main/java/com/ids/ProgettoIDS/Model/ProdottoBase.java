package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;


@Entity
@Table(name = "ProdottoBase")
public class ProdottoBase implements com.ids.ProgettoIDS.Model.Interface.ProdottoBase {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idProdottoBase;
  private Integer idAnagrafica;
  private String prodotto;
  private String packaging;
  private Double prezzoDiVendita;
  private String confezione;
  private String descrizioneBreve;
  private String descrizioneEstesa;
  private String luogoProduzione;
  private String luogoRaccolta;
  private Boolean approvazioneCuratore;
  private Boolean deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;

  public ProdottoBase(Integer idProdottoBase, Integer idAnaggrafica, String prodotto, String packaging, Double prezzoDiVendita, String conezione, String descrizioneBreve, String descrizioneEstesa, String luogoProduzione, String luogoRaccolta, Boolean aprovazioneCuratore) {
    this.idProdottoBase = idProdottoBase;
    this.idAnagrafica = idAnaggrafica;
    this.prodotto = prodotto;
    this.packaging = packaging;
    this.prezzoDiVendita = prezzoDiVendita;
    this.confezione = conezione;
    this.descrizioneBreve = descrizioneBreve;
    this.descrizioneEstesa = descrizioneEstesa;
    this.luogoProduzione = luogoProduzione;
    this.luogoRaccolta = luogoRaccolta;
    this.approvazioneCuratore = aprovazioneCuratore;
  }

  private void utenteUltimaModifica() {
    dataUltimaModifica = new Date();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    utenteUltimaModifica = authentication.getName();
    ;
  }

  public Integer getIdProdottoBase() {
    return idProdottoBase;
  }

  public void setIdProdottoBase(Integer idProdottoBase) {
    this.idProdottoBase = idProdottoBase;
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

  public String getLuogoProduzione() {
    return luogoProduzione;
  }

  public void setLuogoProduzione(String luogoProduzione) {
    this.luogoProduzione = luogoProduzione;
    utenteUltimaModifica();
  }

  public String getLuogoRaccolta() {
    return luogoRaccolta;
  }

  public void setLuogoRaccolta(String luogoRaccolta) {
    this.luogoRaccolta = luogoRaccolta;
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