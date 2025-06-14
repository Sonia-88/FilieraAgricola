package com.ids.ProgettoIDS.Model.Interface;

public interface ProdottoBase {

    public interface ProdottoBaseInterface {
        Integer getIdProdottoBase();
        void setIdProdottoBase(Integer idProdottoBase);

        Integer getIdAnaggrafica();
        void setIdAnaggrafica(Integer idAnaggrafica);

        String getProdotto();
        void setProdotto(String prodotto);

        String getPackaging();
        void setPackaging(String packaging);

        Double getPrezzoDiVendita();
        void setPrezzoDiVendita(Double prezzoDiVendita);

        String getConezione();
        void setConezione(String conezione);

        String getDescrizioneBreve();
        void setDescrizioneBreve(String descrizioneBreve);

        String getDescrizioneEstesa();
        void setDescrizioneEstesa(String descrizioneEstesa);

        String getLuogoProduzione();
        void setLuogoProduzione(String luogoProduzione);

        String getLuogoRaccolta();
        void setLuogoRaccolta(String luogoRaccolta);

        Boolean getAprovazioneCuratore();
        void setAprovazioneCuratore(Boolean aprovazioneCuratore);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
