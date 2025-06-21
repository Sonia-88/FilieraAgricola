package com.ids.ProgettoIDS;

import com.ids.ProgettoIDS.Model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.sql.Date;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) {


		//////////////
		//Anagrafica//
		//////////////
		System.out.println("Popolo dati in Anagrafica");
        entityManager.persist(new Anagrafica(null,"Produttore","Acme Srl","","","","Via Caio,11","Camerino","AN","Produttore trentennale di prodotti agricoli di elevata qualità","43.136225, 13.064481","Acme33","Paperino"));
        entityManager.persist(new Anagrafica(null,"Trasformatore","Rossi Mario","","","","Via Tizio,123","Camerino","AN","Lavorazione Artigianale di prodotti agricoli BLA BLA BLA","43.136225, 13.064482","Rossi87","£43£%46%"));
        entityManager.persist(new Anagrafica(null,"Produttore","Bianchi Adelmo","","","","Fraz. Casaluna,44","Camerino","AN","Coltivatore di eccellenza di prodotti agricoli","43.136227, 13.064442","Bianchi","Stich"));
        entityManager.persist(new Anagrafica(null,"Produttore","Verdi Giuseppe","","","","Fraz. SantaLucia 7","Camerino","AN","Coltivatore di antiche sementi BLA BLA BLA","43.136225, 13.064484","Verdone","1234"));
        entityManager.persist(new Anagrafica(null,"Distributore","La confezione Srl","","","","Fraz. SantaLucia 22","Camerino","AN","Pacchi regalo di ogni tipo, confezioniamo tutto BLA BLA BLA","43.136225, 13.064484","Confez999","qwerty"));



        ////////////////
        //ProdottoBase//
        ////////////////
        System.out.println("Popolo dati in ProdottoBase");
        entityManager.persist(new ProdottoBase(null,1,"Mele Fuji","1 Kg",2.99,"sfusa","Mele coltivate in collina","Mele coltivate nelle colline marchigiane della zona di Camerino","43.136225, 13.064481","43.14036321540032, 13.069254166474797",true));
        entityManager.persist(new ProdottoBase(null,3,"Vino Bianco Verdicchio","1,5 L",1.55,"bottiglia","Verdicchio della zona di Jesi","Verdicchio della zona di Jesi bla bla bla  bla bla bla bla bla bla bla bla bla bla bla bla bla bla","43.136225, 13.064482","43.3460793200327, 12.866309802911761",true));
        entityManager.persist(new ProdottoBase(null,4,"Olio Umbro","1 L",14.99,"bottiglia","Olio spremuto a freddo","Olio  prodotto da spremitura di olive operata a freddo.","43.136227, 13.064442","43.31915899548535, 11.32928953393731",true));
        entityManager.persist(new ProdottoBase(null,1,"Tartufo Nero","50 gr",25.00,"vasetto","Tartufo della valle XXXXX","Tartufo raccolto nei boschi della valle xxxxxx","43.136225, 13.064484","45.05856809250575, 7.6849515499853345",true));
        entityManager.persist(new ProdottoBase(null,3,"Tartufo Nero","1 Kg",500.00,"sfusa","Tartuo della valle XXXXX","Tartufo raccolto nei boschi della valle xxxxxx","43.136225, 13.064485","41.90225885133924, 12.453963729408626",false));




        ///////////////////////////
        //ProdottoLavoratoTestata//
        ///////////////////////////
        System.out.println("Popolo dati in ProdottoLavoratoTestata");
        entityManager.persist(new ProdottoLavoratoTestata(null,2,"Olio al tartufo","1 L",17.99,"bottiglia","Un olio aromatizzato al tartufo","Un olio in cui l'aroma di tartufo è essenziale per BLA BLA BLA","43.136225, 13.064481",true));
        entityManager.persist(new ProdottoLavoratoTestata(null,2,"Succo di Mela","1 L",2.99,"bottiglia","Succo di frutta 100% mela","Succo di frutta 100% mela prodotto sui monti Sibillini","42.8245804589843, 13.275598860926461",true));




        /////////////////////////////
        //ProdottoLavoratoDettaglio//
        /////////////////////////////
        System.out.println("Popolo dati in ProdottoLavoratoDettaglio");
        entityManager.persist(new ProdottoLavoratoDettaglio(null,1,1,"Messo a riposare in fusti","Messo a riposare in fusti per far depositare le BLA BLA VLA",5));
        entityManager.persist(new ProdottoLavoratoDettaglio(null,2,2,"Macerato per 30 giorni","Macerato per 30 giorni per conferire all'olio il massimo dell'aroma.",1));
        entityManager.persist(new ProdottoLavoratoDettaglio(null,1,1,"Succo estratto per schiacciamento","Succo prodotto per schiacciamento e confezionato immediatamente BLA BLA BLA",1));





        /////////////////////////////
        //PaccoTestata//
        /////////////////////////////
        System.out.println("Popolo dati in PaccoTestata");
        entityManager.persist(new PaccoTestata(null,5,"Pacco Economico","30x40x60cm",60.00,"Scatola semplice","Desgustazione di prodotti tipici","Desgustazione di prodotti tipici per soprenderti BLA BLA BLA","True"));
        entityManager.persist(new PaccoTestata(null,5,"Pacco Natale","40x60x80cm",90.00,"Scatolone Natalizio","Il miglior regalo di Natale","Un olio in cui l'aroma di tartufo è essanziale per BLA BLA BLA","True"));
        entityManager.persist(new PaccoTestata(null,5,"Pacco De Lux","40x60x80cm",120.00,"Scatolone decorato","I migliori prodotti della regione","I migliori prodotti della regione","True"));




        /////////////////////////////
        //PaccoDettaglio//
        /////////////////////////////
        System.out.println("Popolo dati in PaccoDettaglio");
        entityManager.persist(new PaccoDettaglio(null,1,1,5,2));
        entityManager.persist(new PaccoDettaglio(null,1,2,6,1));
        entityManager.persist(new PaccoDettaglio(null,2,1,2,3));
        entityManager.persist(new PaccoDettaglio(null,2,2,5,1));
        entityManager.persist(new PaccoDettaglio(null,2,3,6,2));




        /////////////////////////////
        //ProdottiMarketPlace//
        /////////////////////////////
        System.out.println("Popolo dati in ProdottiMarketPlace");
        entityManager.persist(new ProdottiMarketPlace(null,1,null,null));
        entityManager.persist(new ProdottiMarketPlace(null,2,null,null));
        entityManager.persist(new ProdottiMarketPlace(null,5,null,null));
        entityManager.persist(new ProdottiMarketPlace(null,6,null,null));
        entityManager.persist(new ProdottiMarketPlace(null,null,1,null));
        entityManager.persist(new ProdottiMarketPlace(null,null,2,null));
        entityManager.persist(new ProdottiMarketPlace(null,null,null,1));
        entityManager.persist(new ProdottiMarketPlace(null,null,null,2));
        entityManager.persist(new ProdottiMarketPlace(null,null,null,3));







        /////////////////////////////
        //AnagraficaAcquirenti//
        /////////////////////////////
        System.out.println("Popolo dati in AnagraficaAcquirenti");
        entityManager.persist(new AnagraficaAcquirenti(null,"Acquirente","Biondi","Mario","Fraz. SantaLucia 23","Camerino","AN","null","null","null"));
        entityManager.persist(new AnagraficaAcquirenti(null,"Acquirente","Bianchi","Filippo","Via Tizio,34","Ancona","AN","Fraz. SantaLucia 23","Camerino","AN"));




        /////////////////////////////
        //Vendite_testata//
        /////////////////////////////
        System.out.println("Popolo dati in Vendite_testata");
        entityManager.persist(new VenditeTestata(null,Date.valueOf("2025-04-05"),164.95,3,"Biondi","Mario","Fraz. SantaLucia 23","Camerino","AN","null","null","null"));
        entityManager.persist(new VenditeTestata(null,Date.valueOf("2025-06-03"),310.95,5,"Bianchi","Filippo","Via Tizio,34","Ancona","AN","Fraz. SantaLucia 23","Camerino","AN"));
        entityManager.persist(new VenditeTestata(null,  Date.valueOf("2025-09-19"),138.87,2,"Biondi","Mario","Fraz. SantaLucia 23","Camerino","AN","null","null","null"));
        entityManager.persist(new VenditeTestata(null,Date.valueOf("2024-05-01"),203.82,3,"Bianchi","Filippo","Via Tizio,34","Ancona","AN","Fraz. SantaLucia 23","Camerino","AN"));




        /////////////////////////////
        //Vendite_dettaglio//
        /////////////////////////////
        System.out.println("Popolo dati in Vendite_dettaglio");
        entityManager.persist(new VenditeDettaglio(null,1,"1","Acme Srl","Mele Fuji","1 Kg",2.99,"sfusa","Mele coltivate in collina",3,8.97));
        entityManager.persist(new VenditeDettaglio(null,1,"2","Rossi Mario","Olio al tartufo","1 L",17.99,"bottiglia","Un olio aromatizzato al tartufo",2,35.98));
        entityManager.persist(new VenditeDettaglio(null,1,"3","La confezione Srl","Pacco De Lux","40x60x80cm",120.00,"Scatolone decorato","I migliori prodotti della regione",1,120.00));
        entityManager.persist(new VenditeDettaglio(null,2,"1","Acme Srl","Tartufo Nero","50 gr",25.00,"vasetto","Tartubo della valle XXXXX",2,50.00));
        entityManager.persist(new VenditeDettaglio(null,2,"2","Rossi Mario","Olio al tartufo","1 L",17.99,"bottiglia","Un olio aromatizzato al tartufo",2,35.98));
        entityManager.persist(new VenditeDettaglio(null,2,"3","Rossi Mario","Succo di Mela","1 L",2.99,"bottiglia","Succo di frutta 100% mela",5,14.95));
        entityManager.persist(new VenditeDettaglio(null,2,"4","La confezione Srl","Pacco Economico","30x40x60cm",60.00,"Scatola semplice","Desgustazione di prodotti tipici",2,120.00));
        entityManager.persist(new VenditeDettaglio(null,4,"1","La confezione Srl","Pacco Natale","40x60x80cm",90.00,"Scatolone Natalizio","Il miglior regalo di Natale",1,90.00));
        entityManager.persist(new VenditeDettaglio(null,1,"4","Acme Srl","Tartufo Nero","50 gr",25.00,"vasetto","Tartubo della valle XXXXX",1,25.00));
        entityManager.persist(new VenditeDettaglio(null,2,"5","Rossi Mario","Olio al tartufo","1 L",17.99,"bottiglia","Un olio aromatizzato al tartufo",5,89.95));
        entityManager.persist(new VenditeDettaglio(null,3,"1","Rossi Mario","Succo di Mela","1 L",2.99,"bottiglia","Succo di frutta 100% mela",8,23.92));
        entityManager.persist(new VenditeDettaglio(null,1,"5","Rossi Mario","Olio al tartufo","1 L",17.99,"bottiglia","Un olio aromatizzato al tartufo",10,179.9));
        entityManager.persist(new VenditeDettaglio(null,2,"6","Rossi Mario","Succo di Mela","1 L",2.99,"bottiglia","Succo di frutta 100% mela",8,23.92));




        /////////////////////////////
        //Amministrazione//
        /////////////////////////////
        System.out.println("Popolo dati in Amministrazione");
        entityManager.persist(new Amministrazione(null,"Amministratore","Admin","Admin00"));
        entityManager.persist(new Amministrazione(null,"Curatore","Curator","Curator00"));




        /////////////////////////////
        //Animatori//
        /////////////////////////////
        System.out.println("Popolo dati in Amministrazione");
        entityManager.persist(new Animatori(null,"Bart","Simpson","Strada Provinciale 77, SpringField","33312345678","xxxx@vvvv.tv"));
        entityManager.persist(new Animatori(null,"Homer","Simpson","Via Nazionale,33 Ancona","33587654321","yyyy.tttt@rrrr..org"));
        entityManager.persist(new Animatori(null,"Margie","Bouvier","Via Toledo,44 Napoli","33356789012","rrrr.ssss@ggggg.net"));




        /////////////////////////////
        //Manifestazione//
        /////////////////////////////
        System.out.println("Popolo dati in Manifestazione");
        entityManager.persist(new Manifestazione(null,"Fiera Agricola","Fiera Agricola della valle del xxxxx, BLA, BLA, BLA…","Fiera","Via Guidi,88 - Roma",Date.valueOf("2025-10-05"),"43.136235, 13.064487"));
        entityManager.persist(new Manifestazione(null,"Desc_Breve","","Eventi","Via Imperatore,23 - Bastia Umbria",Date.valueOf("2025-06-08"),"43.136235, 13.064488"));




        /////////////////////////////
        //InvitatiVendor//
        /////////////////////////////
        System.out.println("Popolo dati in InvitatiVendor");
        entityManager.persist(new InvitatiVendor(null,1,1,1,null,null));
        entityManager.persist(new InvitatiVendor(null,2,2,4,null,null));
        entityManager.persist(new InvitatiVendor(null,1,1,4,null,null));
        entityManager.persist(new InvitatiVendor(null,1,2,5,null,null));
        entityManager.persist(new InvitatiVendor(null,2,1,2,null,null));
        entityManager.persist(new InvitatiVendor(null,2,2,2,null,null));
        entityManager.persist(new InvitatiVendor(null,1,1,3,null,null));
        entityManager.persist(new InvitatiVendor(null,2,2,1,null,null));
        entityManager.persist(new InvitatiVendor(null,1,3,5,null,null));
        entityManager.persist(new InvitatiVendor(null,1,1,null,1,null));
        entityManager.persist(new InvitatiVendor(null,2,2,null,4,null));
        entityManager.persist(new InvitatiVendor(null,1,1,null,4,null));
        entityManager.persist(new InvitatiVendor(null,1,2,null,5,null));
        entityManager.persist(new InvitatiVendor(null,2,1,null,2,null));
        entityManager.persist(new InvitatiVendor(null,2,2,null,2,null));
        entityManager.persist(new InvitatiVendor(null,1,1,null,3,null));
        entityManager.persist(new InvitatiVendor(null,2,2,null,1,null));
        entityManager.persist(new InvitatiVendor(null,1,3,null,5,null));
        entityManager.persist(new InvitatiVendor(null,1,1,null,null,1));
        entityManager.persist(new InvitatiVendor(null,2,2,null,null,4));
        entityManager.persist(new InvitatiVendor(null,1,1,null,null,4));
        entityManager.persist(new InvitatiVendor(null,1,2,null,null,5));
        entityManager.persist(new InvitatiVendor(null,2,1,null,null,2));
        entityManager.persist(new InvitatiVendor(null,2,2,null,null,2));
        entityManager.persist(new InvitatiVendor(null,1,1,null,null,3));
        entityManager.persist(new InvitatiVendor(null,2,2,null,null,1));
        entityManager.persist(new InvitatiVendor(null,1,3,null,null,5));




        /////////////////////////////
        //Visite_Aziende//
        /////////////////////////////
        System.out.println("Popolo dati in Visite_Aziende");
        entityManager.persist(new VisiteAziende(null,"Tour di raccolta mele","Un giro dei boschi con visita al meleto BLA BLA BLA","Presentazioni",                                           1,null,null,"43.136235, 13.064487", Date.valueOf("2025-09-28"),"Via Madonna delle Carceri,33 Camenrino AN"));
        entityManager.persist(new VisiteAziende(null,"Gita a Modena","Gita a Modena con visita all'azienda di distribuzione prodotti locali","Turni_Degustazioni",                            null,null,5,"43.136235, 13.064488",Date.valueOf("2025-07-12"),"Via Reali, 56 Ancona AN"));
        entityManager.persist(new VisiteAziende(null,"Degustazione Vini","Una visita alla cantina XXXXXX dove potrete degustare una ampia varietà di vini di produzione locale","Degustazione",3,null,null,"43.136235, 13.064489",Date.valueOf("2025-06-18"),"Fraz. Popoli, 52 Norcia "));
        entityManager.persist(new VisiteAziende(null,"Degustazione Olio","Olio al tartufo di elvata qualita BLA BLA BLA BLA","Degustazione",                                                   null,null,2,"43.136235, 13.064490",Date.valueOf("2025-05-25"),"Via Nuova, 23 Varese "));




        /////////////////////////////
        //Invitati_Acquirenti//
        /////////////////////////////
        System.out.println("Popolo dati in Invitati_Acquirenti");
        entityManager.persist(new InvitatiAcquirenti(null,1,10,2));
        entityManager.persist(new InvitatiAcquirenti(null,1,9,2));
        entityManager.persist(new InvitatiAcquirenti(null,1,8,2));
        entityManager.persist(new InvitatiAcquirenti(null,2,3,1));
        entityManager.persist(new InvitatiAcquirenti(null,1,7,2));
        entityManager.persist(new InvitatiAcquirenti(null,1,6,2));
        entityManager.persist(new InvitatiAcquirenti(null,2,4,1));
        entityManager.persist(new InvitatiAcquirenti(null,1,5,2));
        entityManager.persist(new InvitatiAcquirenti(null,1,4,2));
        entityManager.persist(new InvitatiAcquirenti(null,2,8,1));
        entityManager.persist(new InvitatiAcquirenti(null,1,3,2));
        entityManager.persist(new InvitatiAcquirenti(null,3,5,2));
        entityManager.persist(new InvitatiAcquirenti(null,1,2,2));
        entityManager.persist(new InvitatiAcquirenti(null,3,2,2));
        entityManager.persist(new InvitatiAcquirenti(null,4,7,3));
        entityManager.persist(new InvitatiAcquirenti(null,4,2,3));
        entityManager.persist(new InvitatiAcquirenti(null,3,1,2));
        entityManager.persist(new InvitatiAcquirenti(null,1,1,2));
        entityManager.persist(new InvitatiAcquirenti(null,2,7,1));
        entityManager.persist(new InvitatiAcquirenti(null,2,10,1));




        /////////////////////////////
        //Acquirente//
        /////////////////////////////
        System.out.println("Popolo dati in Acquirente");
        entityManager.persist(new Acquirente(null,"Mario","Rossi","33323456789","xxxxx.retert@dfgdf.it","","Via Caio,11","Camerino","AN","RossiG1972123"));
        entityManager.persist(new Acquirente(null,"Maurizio","Bianchi","33334567890","x222xxxx.ret222ert@dfg1111df.it","","Via Tizio,123","Camerino","AN","BianchiG19er123"));
        entityManager.persist(new Acquirente(null,"Giorgio","Rossi","33512346789","xxxtyrtrtxx.reterttr@d555fgdf.it","","Fraz. Casaluna,44","Camerino","AN","RossiGwww2123"));
        entityManager.persist(new Acquirente(null,"Giovanni","Verdi","33565748392","rrrr.xxxx@yyyy.it","","Fraz. SantaLucia 7","Camerino","AN","VerdiG19ert72123"));
        entityManager.persist(new Acquirente(null ,"Francesco","Neri","33660193392","xxxxx.retytrrrytrt@dfgdf.it","","Fraz. SantaLucia 22","Camerino","AN","NeriG1123"));





    }

}

