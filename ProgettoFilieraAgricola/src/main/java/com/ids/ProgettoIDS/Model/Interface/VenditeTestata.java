package com.ids.ProgettoIDS.Model.Interface;

import java.util.Date;

public interface VenditeTestata {

    public interface VenditeTestataInterface {
        Integer getIdVenditeTestata();
        void setIdVenditeTestata(Integer idVenditeTestata);

        Date getDataAcquisto();
        void setDataAcquisto(Date dataAcquisto);

        Double getPrezzo();
        void setPrezzo(Double prezzo);

        Integer getElementi();
        void setElementi(Integer elementi);

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
