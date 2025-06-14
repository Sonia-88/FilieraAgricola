package com.ids.ProgettoIDS.Model.Interface;

public interface ProdottiMarketPlace {

    public interface ProdottiMarketPlaceInterface {
        Integer getIdProdottoMarketPlace();
        void setIdProdottoMarketPlace(Integer idProdottoMarketPlace);

        Integer getIdProdottoBase();
        void setIdProdottoBase(Integer idProdottoBase);

        Integer getIdProdottoLavoratoTestata();
        void setIdProdottoLavoratoTestata(Integer idProdottoLavoratoTestata);

        Integer getIdPaccoTestata();
        void setIdPaccoTestata(Integer idPaccoTestata);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
