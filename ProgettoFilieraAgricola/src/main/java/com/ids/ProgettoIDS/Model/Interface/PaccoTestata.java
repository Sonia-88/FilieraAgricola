package com.ids.ProgettoIDS.Model.Interface;

public interface PaccoTestata {

    public interface PaccoTestataInterface {
        Integer getIdPaccoTestata();
        void setIdPaccoTestata(Integer idPaccoTestata);

        Integer getIdAnagrafica();
        void setIdAnagrafica(Integer idAnagrafica);

        String getProdotto();
        void setProdotto(String prodotto);

        String getPackaging();
        void setPackaging(String packaging);

        Double getPrezzoVendita();
        void setPrezzoVendita(Double prezzoVendita);

        String getConfezione();
        void setConfezione(String confezione);

        String getDescrizioneBreve();
        void setDescrizioneBreve(String descrizioneBreve);

        String getDescrizioneEstesa();
        void setDescrizioneEstesa(String descrizioneEstesa);

        String getApprovazioneCuratore();
        void setApprovazioneCuratore(String approvazioneCuratore);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
