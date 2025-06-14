package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import java.util.Date;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;


@Entity
@Table(name = "Anagrafica")
public class Anagrafica implements com.ids.ProgettoIDS.Model.Interface.Anagrafica {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idAnagrafica;
  private String tipo;
  private String ragioneSociale;
  private String titolareCognome;
  private String titolareNome;
  private String titolareCellulare;
  private String indirizzo;
  private String citta;
  private String provincia;
  private String informazioniVarie;
  private String luogoSedePrincipale;
  private String userId;
  private String password;
  private Boolean deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;

  public Anagrafica() {
    // Costruttore vuoto richiesto da JPA
  }


  public Anagrafica(Integer idAnagrafica,String tipo, String ragioneSociale, String titolareCognome, String titolareNome, String titolareCellulare, String indirizzo, String citta, String provincia, String informazioniVarie, String luogoSedePrincipale, String userId, String password) {
    this.idAnagrafica=idAnagrafica;
    this.tipo = tipo;
    this.ragioneSociale = ragioneSociale;
    this.titolareCognome = titolareCognome;
    this.titolareNome = titolareNome;
    this.titolareCellulare = titolareCellulare;
    this.indirizzo = indirizzo;
    this.citta = citta;
    this.provincia = provincia;
    this.informazioniVarie = informazioniVarie;
    this.luogoSedePrincipale = luogoSedePrincipale;
    this.userId = userId;
    this.password = password;
  }

  private void utenteUltimaModifica()
  {
    dataUltimaModifica = new Date();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    utenteUltimaModifica =  authentication.getName();;
  }
  public Integer getidAnagrafica() {
    return idAnagrafica;
  }

  public void setidAnagrafica(Integer tipo) {
    this.idAnagrafica = idAnagrafica;
    utenteUltimaModifica();
  }
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
    utenteUltimaModifica();
  }

  public String getRagioneSociale() {
    return ragioneSociale;
  }

  public void setRagioneSociale(String ragioneSociale) {
    this.ragioneSociale = ragioneSociale;
    utenteUltimaModifica();
  }

  public String getTitolareCognome() {
    return titolareCognome;
  }

  public void setTitolareCognome(String titolareCognome) {
    this.titolareCognome = titolareCognome;
    utenteUltimaModifica();
  }

  public String getTitolareNome() {
    return titolareNome;
  }

  public void setTitolareNome(String titolareNome) {
    this.titolareNome = titolareNome;
    utenteUltimaModifica();
  }

  public String getTitolareCellulare() {
    return titolareCellulare;
  }

  public void setTitolareCellulare(String titolareCellulare) {
    this.titolareCellulare = titolareCellulare;
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

  public String getInformazioniVarie() {
    return informazioniVarie;
  }

  public void setInformazioniVarie(String informazioniVarie) {
    this.informazioniVarie = informazioniVarie;
    utenteUltimaModifica();
  }

  public String getLuogoSedePrincipale() {
    return luogoSedePrincipale;
  }

  public void setLuogoSedePrincipale(String luogoSedePrincipale) {
    this.luogoSedePrincipale = luogoSedePrincipale;
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
