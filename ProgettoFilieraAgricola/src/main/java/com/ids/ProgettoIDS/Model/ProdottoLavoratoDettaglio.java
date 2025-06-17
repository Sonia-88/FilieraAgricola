package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;


@Entity
@Table(name = "ProdottoLavoratoDettaglio")
public class ProdottoLavoratoDettaglio implements com.ids.ProgettoIDS.Model.Interface.ProdottoLavoratoDettaglio {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idProdottoLavoratoDettaglio;
  private Integer idProdottoLavoratoTestata;
  private Integer fase;
  private String descrizioneBreve;
  private String descrizioneEstesa;
  private Integer idProdottoBase;
  private Boolean deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;

  // Relazione Molti a Uno con ProdottoLavoratoTestata
  @ManyToOne
  @JoinColumn(name = "idProdottoLavoratoTestata", insertable = false, updatable = false)
  private ProdottoLavoratoTestata prodottoLavoratoTestata;


  public ProdottoLavoratoDettaglio(Integer idProdottoLavoratoDettaglio, Integer idProdottoLavoratoTestata, Integer fase, String descrizioneBreve, String descrizioneEstesa, Integer idProdottoBase) {
    this.idProdottoLavoratoDettaglio = idProdottoLavoratoDettaglio;
    this.idProdottoLavoratoTestata = idProdottoLavoratoTestata;
    this.fase = fase;
    this.descrizioneBreve = descrizioneBreve;
    this.descrizioneEstesa = descrizioneEstesa;
    this.idProdottoBase = idProdottoBase;
  }

  private void utenteUltimaModifica()
  {
    dataUltimaModifica = new Date();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    utenteUltimaModifica =  authentication.getName();;
  }

  public Integer getIdProdottoLavoratoDettaglio() {
    return idProdottoLavoratoDettaglio;
  }

  public void setIdProdottoLavoratoDettaglio(Integer idProdottoLavoratoDettaglio) {
    this.idProdottoLavoratoDettaglio = idProdottoLavoratoDettaglio;
    utenteUltimaModifica();
  }

  public Integer getIdProdottoLavoratoTestata() {
    return idProdottoLavoratoTestata;
  }

  public void setIdProdottoLavoratoTestata(Integer idProdottoLavoratoTestata) {
    this.idProdottoLavoratoTestata = idProdottoLavoratoTestata;
    utenteUltimaModifica();
  }

  public Integer getFase() {
    return fase;
  }

  public void setFase(Integer fase) {
    this.fase = fase;
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

  public Integer getIdProdottoBase() {
    return idProdottoBase;
  }

  public void setIdProdottoBase(Integer idProdottoBase) {
    this.idProdottoBase = idProdottoBase;
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
