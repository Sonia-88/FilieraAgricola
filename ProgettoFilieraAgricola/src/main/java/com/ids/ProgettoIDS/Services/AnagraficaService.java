package com.ids.ProgettoIDS.Services;
import com.ids.ProgettoIDS.Repositories.AnagraficaRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.ids.ProgettoIDS.Model.Anagrafica;
import java.util.List;



@Service
public class AnagraficaService {

    @Autowired
    private AnagraficaRepository anagraficaRepository;

    public List<Anagrafica> getAllAnagrafiche() {
        return anagraficaRepository.findAll();
    }

    public Anagrafica getAnagraficaById(Integer id) {
        return anagraficaRepository.findById(id).orElse(null);
    }

    public Anagrafica saveAnagrafica(Anagrafica anagrafica) {
        return anagraficaRepository.save(anagrafica);
    }

    public void deleteAnagrafica(Integer id) {
        anagraficaRepository.deleteById(id);
    }
}
