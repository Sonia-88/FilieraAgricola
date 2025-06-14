package com.ids.ProgettoIDS.Model.Interface;

public interface InvitatiVendor {

    public interface InvitatiVendorInterface {
        Integer getIdInvitatiVendor();
        void setIdInvitatiVendor(Integer idInvitatiVendor);

        Integer getIdManifestazione();
        void setIdManifestazione(Integer idManifestazione);

        Integer getIdAnimatore();
        void setIdAnimatore(Integer idAnimatore);

        Integer getIdProduttore();
        void setIdProduttore(Integer idProduttore);

        Integer getIdDistributore();
        void setIdDistributore(Integer idDistributore);

        Integer getIdTrasformatore();
        void setIdTrasformatore(Integer idTrasformatore);

        Boolean getDeleted();
        void setDeleted(Boolean deleted);
    }

}
