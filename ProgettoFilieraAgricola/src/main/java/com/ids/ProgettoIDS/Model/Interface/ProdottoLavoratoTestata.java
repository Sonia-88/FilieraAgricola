package com.ids.ProgettoIDS.Model.Interface;

public interface ProdottoLavoratoTestata {

    public interface ProdottoLavoratoTestataInterface {
        Integer getIdProdottoLavoratoTestata();
        void setIdProdottoLavoratoTestata(Integer idProdottoLavoratoTestata);

        Integer getIdAnagrafica();
        void setIdAnagrafica(Integer idAnagrafica);

        String getProdotto();
        void setProdotto(String prodotto);

        String getPackaging();
        void setPackaging(String packaging);

        Double getPrezzoDiVendita();
        void setPrezzoDiVendita(Double prezzoDiVendita);

        String getConfezione();
        void setConfezione(String confezione);

        String getDescrizioneBreve();
        void setDescrizioneBreve(String descrizioneBreve);

        String getDescrizioneEstesa();
        void setDescrizioneEstesa(String descrizioneEstesa);

        String getLuogoLavorazione();
        void setLuogoLavorazione(String luogoLavorazione);

        Boolean getApprovazioneCuratore();
        void setApprovazioneCuratore(Boolean approvazioneCuratore);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
