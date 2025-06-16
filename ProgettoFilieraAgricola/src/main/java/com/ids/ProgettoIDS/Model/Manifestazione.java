package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Date;


@Entity
@Table(name = "Manifestazione")
public class Manifestazione implements com.ids.ProgettoIDS.Model.Interface.Manifestazione {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idManifestazione;
  private String descrizioneBreve;
  private String descrizioneEstesa;
  private String tipo;
  private String luogo;
  private Date data;
  private String luogoSedePrincipale;
  private Boolean deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;

  public Manifestazione(Integer idManifestazione, String descrizioneBreve, String descrizioneEstesa, String tipo, String luogo, Date data, String luogoSedePrincipale) {
    this.idManifestazione = idManifestazione;
    this.descrizioneBreve = descrizioneBreve;
    this.descrizioneEstesa = descrizioneEstesa;
    this.tipo = tipo;
    this.luogo = luogo;
    this.data = data;
    this.luogoSedePrincipale = luogoSedePrincipale;
  }

  private void utenteUltimaModifica()
  {
    dataUltimaModifica = new Date();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    utenteUltimaModifica =  authentication.getName();;
  }

  public Integer getIdManifestazione() {
    return idManifestazione;
  }

  public void setIdManifestazione(Integer idManifestazione) {
    this.idManifestazione = idManifestazione;
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

  public String getLuogo() {
    return luogo;
  }

  public void setLuogo(String luogo) {
    this.luogo = luogo;
    utenteUltimaModifica();
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
    utenteUltimaModifica();
  }

  public String getLuogoSedePrincipale() {
    return luogoSedePrincipale;
  }

  public void setLuogoSedePrincipale(String luogoSedePrincipale) {
    this.luogoSedePrincipale = luogoSedePrincipale;
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
