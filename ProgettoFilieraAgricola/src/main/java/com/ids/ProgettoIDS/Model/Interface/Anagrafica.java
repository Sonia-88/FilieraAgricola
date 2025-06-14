package com.ids.ProgettoIDS.Model.Interface;

public interface Anagrafica {


    public interface AnagraficaInterface {
        Integer getIdAnagrafica();
        void setIdAnagrafica(Integer idAnagrafica);

        String getTipo();
        void setTipo(String tipo);

        String getRagioneSociale();
        void setRagioneSociale(String ragioneSociale);

        String getTitolareCognome();
        void setTitolareCognome(String titolareCognome);

        String getTitolareNome();
        void setTitolareNome(String titolareNome);

        String getTitolareCellulare();
        void setTitolareCellulare(String titolareCellulare);

        String getIndirizzo();
        void setIndirizzo(String indirizzo);

        String getCitta();
        void setCitta(String citta);

        String getProvincia();
        void setProvincia(String provincia);

        String getInformazioniVarie();
        void setInformazioniVarie(String informazioniVarie);

        String getLuogoSedePrincipale();
        void setLuogoSedePrincipale(String luogoSedePrincipale);

        String getUserId();
        void setUserId(String userId);

        String getPassword();
        void setPassword(String password);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
