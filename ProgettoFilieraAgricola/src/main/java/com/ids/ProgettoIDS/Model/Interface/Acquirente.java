package com.ids.ProgettoIDS.Model.Interface;

public interface Acquirente {


    public interface AcquirenteInterface {
        Integer getIdAcquirente();
        void setIdAcquirente(Integer idAcquirente);

        String getNome();
        void setNome(String nome);

        String getCognome();
        void setCognome(String cognome);

        String getTelefono();
        void setTelefono(String telefono);

        String getEmail();
        void setEmail(String email);

        String getIndirizzo();
        void setIndirizzo(String indirizzo);

        String getCitta();
        void setCitta(String citta);

        String getProvincia();
        void setProvincia(String provincia);

        String getUserId();
        void setUserId(String userId);

        String getPassword();
        void setPassword(String password);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
