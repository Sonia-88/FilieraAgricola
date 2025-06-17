package com.ids.ProgettoIDS.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.lang.Nullable;

import java.util.Date;


@Entity
@Table(name = "ProdottiMarketPlace")
public class ProdottiMarketPlace implements com.ids.ProgettoIDS.Model.Interface.ProdottiMarketPlace {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idProdottoMarketPlace;
  @Nullable
  private Integer idProdottoBase;
  @Nullable
  private Integer idProdottoLavoratoTestata;
  @Nullable
  private Integer idPaccoTestata;
  private Boolean Deleted;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dataUltimaModifica;
  private String utenteUltimaModifica;

  public ProdottiMarketPlace(Integer idProdottoMarketPlace, Integer idProdottoBase, Integer idProdottoLavoratoTestata, Integer idPaccoTestata) {
    this.idProdottoMarketPlace = idProdottoMarketPlace;
    this.idProdottoBase = idProdottoBase;
    this.idProdottoLavoratoTestata = idProdottoLavoratoTestata;
    this.idPaccoTestata = idPaccoTestata;
  }

  private void utenteUltimaModifica()
  {
    dataUltimaModifica = new Date();
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    utenteUltimaModifica =  authentication.getName();
  }

  public Integer getIdProdottoMarketPlace() {
    return idProdottoMarketPlace;
  }

  public void setIdProdottoMarketPlace(Integer idProdottoMarketPlace) {
    this.idProdottoMarketPlace = idProdottoMarketPlace;
    utenteUltimaModifica();
  }

  public Integer getIdProdottoBase() {
    return idProdottoBase;
  }

  public void setIdProdottoBase(Integer idProdottoBase) {
    this.idProdottoBase = idProdottoBase;
    utenteUltimaModifica();
  }

  public Integer getIdProdottoLavoratoTestata() {
    return idProdottoLavoratoTestata;
  }

  public void setIdProdottoLavoratoTestata(Integer idProdottoLavoratoTestata) {
    this.idProdottoLavoratoTestata = idProdottoLavoratoTestata;
    utenteUltimaModifica();
  }

  public Integer getIdPaccoTestata() {
    return idPaccoTestata;
  }

  public void setIdPaccoTestata(Integer idPaccoTestata) {
    this.idPaccoTestata = idPaccoTestata;
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
