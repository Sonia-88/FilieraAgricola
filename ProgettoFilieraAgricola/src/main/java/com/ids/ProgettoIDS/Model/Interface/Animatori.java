package com.ids.ProgettoIDS.Model.Interface;

public interface Animatori {


    public interface AnimatoriInterface {
        Integer getIdAnimatore();
        void setIdAnimatore(Integer idAnimatore);

        String getNome();
        void setNome(String nome);

        String getCognome();
        void setCognome(String cognome);

        String getVia();
        void setVia(String via);

        String getCellulare();
        void setCellulare(String cellulare);

        String getEmail();
        void setEmail(String email);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
