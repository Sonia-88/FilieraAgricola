package com.ids.ProgettoIDS.Model.Interface;

public interface Amministrazione {


    public interface AmministrazioneInterface {
        Integer getIdAmministrazione();
        void setIdAmministrazione(Integer idAmministrazione);

        String getLivello();
        void setLivello(String livello);

        String getUserId();
        void setUserId(String userId);

        String getPassword();
        void setPassword(String password);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
