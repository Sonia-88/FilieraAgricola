package com.ids.ProgettoIDS.Model.Interface;

public interface InvitatiAcquirenti  {

    public interface InvitatiAcquirentiInterface {
        Integer getIdInvitatiAcquirenti();
        void setIdInvitatiAcquirenti(Integer idInvitatiAcquirenti);

        Integer getIdVisiteAziende();
        void setIdVisiteAziende(Integer idVisiteAziende);

        Integer getIdAcquirente();
        void setIdAcquirente(Integer idAcquirente);

        Integer getIdAnimatore();
        void setIdAnimatore(Integer idAnimatore);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
