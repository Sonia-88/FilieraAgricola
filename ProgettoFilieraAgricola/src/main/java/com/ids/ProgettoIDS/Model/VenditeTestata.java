package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "VenditeTestata")
public class VenditeTestata implements com.ids.ProgettoIDS.Model.Interface.VenditeTestata {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idVenditeTestata;
  private Date dataAcquisto;
  private Double prezzo;
  private Integer elementi;
  private String cognome;
  private String nome;
  private String viaSpedizione;
  private String cittaSpedizione;
  private String provinciaSpedizione;
  private String viaFatturazione;
  private String cittaFatturazione;
  private String provinciaFatturazione;
  private Boolean deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;

  // Relazione Uno a Molti con VenditeDettaglio
  @OneToMany(mappedBy = "venditeTestata", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<VenditeDettaglio> dettaglioVendita;


  public VenditeTestata(Integer idVenditeTestata,Date dataAcquisto, Double prezzo, Integer elementi, String cognome, String nome, String viaSpedizione, String cittaSpedizione, String provinciaSpedizione, String viaFatturazione, String cittaFatturazione, String provinciaFatturazione) {
    this.idVenditeTestata = idVenditeTestata;
    this.dataAcquisto = dataAcquisto;
    this.prezzo = prezzo;
    this.elementi = elementi;
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

  public Integer getIdVenditeTestata() {
    return idVenditeTestata;
  }

  public void setIdVenditeTestata(Integer idVenditeTestata) {
    this.idVenditeTestata = idVenditeTestata;
    utenteUltimaModifica();
  }

  public Date getDataAcquisto() {
    return dataAcquisto;
  }

  public void setDataAcquisto(Date dataAcquisto) {
    this.dataAcquisto = dataAcquisto;
    utenteUltimaModifica();
  }

  public Double getPrezzo() {
    return prezzo;
  }

  public void setPrezzo(Double prezzo) {
    this.prezzo = prezzo;
    utenteUltimaModifica();
  }

  public Integer getElementi() {
    return elementi;
  }

  public void setElementi(Integer elementi) {
    this.elementi = elementi;
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
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
    utenteUltimaModifica();
  }
}
