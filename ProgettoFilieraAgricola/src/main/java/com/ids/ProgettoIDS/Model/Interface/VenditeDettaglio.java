package com.ids.ProgettoIDS.Model.Interface;

public interface VenditeDettaglio {

    public interface VenditeDettaglioInterface {
        Integer getIdVenditeTestata();
        void setIdVenditeTestata(Integer idVenditeTestata);

        String getProgressivo();
        void setProgressivo(String progressivo);

        String getRagioneSocialeVeditore();
        void setRagioneSocialeVeditore(String ragioneSocialeVeditore);

        String getPrdotto();
        void setPrdotto(String prdotto);

        String getPackaging();
        void setPackaging(String packaging);

        Double getPrezzoDiVendita();
        void setPrezzoDiVendita(Double prezzoDiVendita);

        String getConezione();
        void setConezione(String conezione);

        String getDescrizioneBreve();
        void setDescrizioneBreve(String descrizioneBreve);

        Integer getQta();
        void setQta(Integer qta);

        Double getPrezzo();
        void setPrezzo(Double prezzo);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
