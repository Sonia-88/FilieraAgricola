package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


@Entity
@Table(name = "PaccoDettaglio")
public class PaccoDettaglio implements com.ids.ProgettoIDS.Model.Interface.PaccoDettaglio {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idPaccoDettaglio;
  private Integer idInformazioniProdotti;
  private Integer elemento;
  private Integer prodotto;
  private Integer qta;
  private Boolean deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;


  // Relazione Molti a Uno con PaccoTestata
  @ManyToOne
  @JoinColumn(name = "idPaccoTestata", insertable = false, updatable = false)
  private PaccoTestata paccoTestata;




  public PaccoDettaglio(Integer idPaccoDettaglio, Integer idInformazioniProdotti, Integer elemento, Integer prodotto, Integer qta) {
    this.idPaccoDettaglio = idPaccoDettaglio;
    this.idInformazioniProdotti = idInformazioniProdotti;
    this.elemento = elemento;
    this.prodotto = prodotto;
    this.qta = qta;
    utenteUltimaModifica();
  }





  private void utenteUltimaModifica() {
    this.dataUltimaModifica = new Date();
    System.out.println("dentro");
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

    if(authentication==null)
    {utenteUltimaModifica="Inserito da DatabaseSeeder";}
    else {utenteUltimaModifica = authentication.getName();}
  }

  public Integer getIdPaccoDettglio() {
    return idPaccoDettaglio;
  }

  public void setIdPaccoDettglio(Integer idPaccoDettglio) {
    this.idPaccoDettaglio = idPaccoDettglio;
    utenteUltimaModifica();
  }

  public Integer getIdInformazioniProdotti() {
    return idInformazioniProdotti;
  }

  public void setIdInformazioniProdotti(Integer idInformazioniProdotti) {
    this.idInformazioniProdotti = idInformazioniProdotti;
    utenteUltimaModifica();
  }

  public Integer getElemento() {
    return elemento;
  }

  public void setElemento(Integer elemento) {
    this.elemento = elemento;
    utenteUltimaModifica();
  }

  public Integer getProdotto() {
    return prodotto;
  }

  public void setProdotto(Integer prodotto) {
    this.prodotto = prodotto;
    utenteUltimaModifica();
  }

  public Integer getQta() {
    return qta;
  }

  public void setQta(Integer qta) {
    this.qta = qta;
    utenteUltimaModifica();
  }

  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
    utenteUltimaModifica();
  }


  public Date getDataUltimaModifica () {
    return dataUltimaModifica;
  }

  public void setDataUltimaModifica(Date deleted) {
    this.dataUltimaModifica = new Date();
  }
}