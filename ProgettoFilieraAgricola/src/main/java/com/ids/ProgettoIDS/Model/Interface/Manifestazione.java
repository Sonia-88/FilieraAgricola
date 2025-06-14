package com.ids.ProgettoIDS.Model.Interface;

import java.util.Date;

public interface Manifestazione {


    public interface ManifestazioneInterface {
        Integer getIdManifestazione();
        void setIdManifestazione(Integer idManifestazione);

        String getDescrizioneBreve();
        void setDescrizioneBreve(String descrizioneBreve);

        String getDescrizioneEstesa();
        void setDescrizioneEstesa(String descrizioneEstesa);

        String getTipo();
        void setTipo(String tipo);

        String getLuogo();
        void setLuogo(String luogo);

        Date getData();
        void setData(Date data);

        String getLuogoSedePrincipale();
        void setLuogoSedePrincipale(String luogoSedePrincipale);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
