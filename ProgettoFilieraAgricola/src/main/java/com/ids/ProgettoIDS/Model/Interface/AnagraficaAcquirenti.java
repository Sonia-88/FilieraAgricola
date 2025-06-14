package com.ids.ProgettoIDS.Model.Interface;

public interface AnagraficaAcquirenti {

    public interface AnagraficaAcquirentiInterface {
        Integer getIdAnagraficaAcquirenti();
        void setIdAnagraficaAcquirenti(Integer idAnagraficaAcquirenti);

        String getTipo();
        void setTipo(String tipo);

        String getCognome();
        void setCognome(String cognome);

        String getNome();
        void setNome(String nome);

        String getViaSpedizione();
        void setViaSpedizione(String viaSpedizione);

        String getCittaSpedizione();
        void setCittaSpedizione(String cittaSpedizione);

        String getProvinciaSpedizione();
        void setProvinciaSpedizione(String provinciaSpedizione);

        String getViaFatturazione();
        void setViaFatturazione(String viaFatturazione);

        String getCittaFatturazione();
        void setCittaFatturazione(String cittaFatturazione);

        String getProvinciaFatturazione();
        void setProvinciaFatturazione(String provinciaFatturazione);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
