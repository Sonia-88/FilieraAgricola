package com.ids.ProgettoIDS.Controller;
import com.ids.ProgettoIDS.Model.Coordinate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CoordinateController {


    @GetMapping("/prodottoBaseSingolo")
    public List<Coordinate> getCoordinatesById(@RequestParam String codice) {

        // lanciare con http://localhost:8080/mappaTerritorio.html?endPoint=prodottoBaseSingolo&codice=3
        // usa idProdotto nella WHERE per filtrare
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates=leggiSqlProdottoBase(codice);
        return coordinates;
    }


    @GetMapping("/prodottoBaseAll")
    public List<Coordinate> getCoordinates() {
        // lanciare con http://localhost:8080/mappaTerritorio.html?endPoint=prodottoBaseAll
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates=leggiSqlProdottoBase("");
        return coordinates;
    }


    @GetMapping("/prodottoLavoratoSingolo")
    public List<Coordinate> getCoordinatesProdLavById(@RequestParam String codice) {

        // lanciare con http://localhost:8080/mappaTerritorio.html?endPoint=prodottoLavoratoSingolo&codice=1
        // usa idProdotto nella WHERE per filtrare
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates=leggiSqlProdottoLavorato(codice);
        return coordinates;
    }


    @GetMapping("/prodottoLavoratoAll")
    public List<Coordinate> getCoordinatesProdLav() {
        // lanciare con http://localhost:8080/mappaTerritorio.html?endPoint=prodottoLavoratoAll
        List<Coordinate> coordinates = new ArrayList<>();
        coordinates=leggiSqlProdottoLavorato("");
        return coordinates;
    }


private List<Coordinate> leggiSqlProdottoBase(String codice){
        List<Coordinate> coordinates = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb", "user", "1234");
            Statement stmt = conn.createStatement();

            String comandoSQL = "SELECT " +
                    "trim(LEFT(Luogo_Raccolta, POSITION(',' IN Luogo_Raccolta) - 1)) AS Latitude, " +
                    "trim(RIGHT(Luogo_Raccolta, LENGTH(Luogo_Raccolta) - POSITION(',' IN Luogo_Raccolta))) AS Longitude, " +
                    "descrizione_breve " +
                    "FROM Prodotto_Base";

            if (!codice.equals("")) {
                comandoSQL=comandoSQL+ " where id_Prodotto_Base='"+codice+"'";
            }


            ResultSet rs = stmt.executeQuery(comandoSQL);




            while (rs.next()) { // Ora memorizza tutte le righe
                Coordinate coord = new Coordinate();
                coord.setLatitude(rs.getDouble("Latitude"));
                coord.setLongitude(rs.getDouble("Longitude"));
                coord.setDescrizioneBreve(rs.getString("descrizione_breve"));
                coordinates.add(coord);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return coordinates;


    }



    private List<Coordinate> leggiSqlProdottoLavorato(String codice){
        List<Coordinate> coordinates = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb", "user", "1234");
            Statement stmt = conn.createStatement();

            String comandoSQL =
                    "SELECT  " +
                            "trim(LEFT(Luogo_Lavorazione, POSITION(',' IN Luogo_Lavorazione) - 1)) AS Latitude, " +
                            "trim(RIGHT(Luogo_Lavorazione, LENGTH(Luogo_Lavorazione) - POSITION(',' IN Luogo_Lavorazione))) AS Longitude , " +
                            "DESCRIZIONE_ESTESA  " +
                            "FROM PRODOTTO_LAVORATO_TESTATA  ";


            if (!codice.equals("")) {
                comandoSQL=comandoSQL+ " where ID_PRODOTTO_LAVORATO_TESTATA='"+codice+"'";
            }


            ResultSet rs = stmt.executeQuery(comandoSQL);




            while (rs.next()) { // Ora memorizza tutte le righe
                Coordinate coord = new Coordinate();
                coord.setLatitude(rs.getDouble("Latitude"));
                coord.setLongitude(rs.getDouble("Longitude"));
                coord.setDescrizioneBreve(rs.getString("descrizione_estesa"));
                coordinates.add(coord);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return coordinates;


    }


}







