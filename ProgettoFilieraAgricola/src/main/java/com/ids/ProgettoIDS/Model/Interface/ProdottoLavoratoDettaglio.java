package com.ids.ProgettoIDS.Model.Interface;

public interface ProdottoLavoratoDettaglio {

    public interface ProdottoLavoratoDettaglioInterface {
        Integer getIdProdottoLavoratoDettaglio();
        void setIdProdottoLavoratoDettaglio(Integer idProdottoLavoratoDettaglio);

        Integer getIdProdottoLavoratoTestata();
        void setIdProdottoLavoratoTestata(Integer idProdottoLavoratoTestata);

        Integer getFase();
        void setFase(Integer fase);

        String getDescrizioneBreve();
        void setDescrizioneBreve(String descrizioneBreve);

        String getDescrizioneEstesa();
        void setDescrizioneEstesa(String descrizioneEstesa);

        Integer getIdProdottoBase();
        void setIdProdottoBase(Integer idProdottoBase);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
