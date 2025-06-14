package com.ids.ProgettoIDS.Model.Interface;

import java.util.Date;

public interface VisiteAziende {

    public interface VisiteAziendeInterface {
        Integer getIdVisiteAziende();
        void setIdVisiteAziende(Integer idVisiteAziende);

        String getDescrizioneBreve();
        void setDescrizioneBreve(String descrizioneBreve);

        String getDescrizioneEstesa();
        void setDescrizioneEstesa(String descrizioneEstesa);

        String getTipo();
        void setTipo(String tipo);

        Integer getIdProduttore();
        void setIdProduttore(Integer idProduttore);

        Integer getIdDistributore();
        void setIdDistributore(Integer idDistributore);

        Integer getIdTrasormatore();
        void setIdTrasormatore(Integer idTrasormatore);

        String getLuogoEvento();
        void setLuogoEvento(String luogoEvento);

        Date getData();
        void setData(Date data);

        String getIndirizzo();
        void setIndirizzo(String indirizzo);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
