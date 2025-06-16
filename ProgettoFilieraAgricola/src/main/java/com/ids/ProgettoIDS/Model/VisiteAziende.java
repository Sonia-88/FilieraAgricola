package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;


@Entity
@Table(name = "VisiteAziende")
public class VisiteAziende implements com.ids.ProgettoIDS.Model.Interface.VisiteAziende {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idVisiteAziende;
  private String descrizioneBreve;
  private String descrizioneEstesa;
  private String tipo;
  private Integer idProduttore;
  private Integer idDistributore;
  private Integer idTrasormatore;
  private String luogoEvento;
  private Date data;
  private String indirizzo;
  private Boolean deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;

  public VisiteAziende(Integer idVisiteAziende, String descrizioneBreve, String descrizioneEstesa, String tipo, Integer idProduttore, Integer idDistributore, Integer idTrasormatore, String luogoEvento, Date data, String indirizzo) {
    this.idVisiteAziende = idVisiteAziende;
    this.descrizioneBreve = descrizioneBreve;
    this.descrizioneEstesa = descrizioneEstesa;
    this.tipo = tipo;
    this.idProduttore = idProduttore;
    this.idDistributore = idDistributore;
    this.idTrasormatore = idTrasormatore;
    this.luogoEvento = luogoEvento;
    this.data = data;
    this.indirizzo = indirizzo;
  }

  private void utenteUltimaModifica()
  {
    dataUltimaModifica = new Date();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    utenteUltimaModifica =  authentication.getName();;
  }

  public Integer getIdVisiteAziende() {
    return idVisiteAziende;
  }

  public void setIdVisiteAziende(Integer idVisiteAziende) {
    this.idVisiteAziende = idVisiteAziende;
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

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
    utenteUltimaModifica();
  }

  public Integer getIdProduttore() {
    return idProduttore;
  }

  public void setIdProduttore(Integer idProduttore) {
    this.idProduttore = idProduttore;
    utenteUltimaModifica();
  }

  public Integer getIdDistributore() {
    return idDistributore;
  }

  public void setIdDistributore(Integer idDistributore) {
    this.idDistributore = idDistributore;
    utenteUltimaModifica();
  }

  public Integer getIdTrasormatore() {
    return idTrasormatore;
  }

  public void setIdTrasormatore(Integer idTrasormatore) {
    this.idTrasormatore = idTrasormatore;
    utenteUltimaModifica();
  }

  public String getLuogoEvento() {
    return luogoEvento;
  }

  public void setLuogoEvento(String luogoEvento) {
    this.luogoEvento = luogoEvento;
    utenteUltimaModifica();
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
    utenteUltimaModifica();
  }

  public String getIndirizzo() {
    return indirizzo;
  }

  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
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
