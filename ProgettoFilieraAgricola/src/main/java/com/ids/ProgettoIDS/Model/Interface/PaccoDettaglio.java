package com.ids.ProgettoIDS.Model.Interface;

public interface PaccoDettaglio {

    public interface PaccoDettaglioInterface {
        Integer getIdPaccoDettglio();
        void setIdPaccoDettglio(Integer idPaccoDettglio);

        Integer getIdInformazioniProdotti();
        void setIdInformazioniProdotti(Integer idInformazioniProdotti);

        Integer getElemento();
        void setElemento(Integer elemento);

        Integer getProdotto();
        void setProdotto(Integer prodotto);

        Integer getQta();
        void setQta(Integer qta);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
