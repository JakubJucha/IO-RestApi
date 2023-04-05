package pl.zajecia.komputery.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.zajecia.komputery.dao.Entities.Komputer;
import pl.zajecia.komputery.dao.KomputerRepo;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class KomputerManager {
    private KomputerRepo komputerRepo;

    @Autowired
    public KomputerManager(KomputerRepo komputerRepo)
    {
        this.komputerRepo=komputerRepo;
    }

    public Optional<Komputer> findAllById(Long id){
        return komputerRepo.findById(id);
    }

    public Iterable<Komputer> findAll(){
        return komputerRepo.findAll();
    }

    public Komputer save(Komputer komputer){
        return (Komputer) komputerRepo.save(komputer);
    }

    public void delete(Long id){
        komputerRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDb(){
        save(new Komputer(6L,"nazwa1", LocalDate.of(2020,02,02)));
        save(new Komputer(7L,"nazwa2", LocalDate.of(2023,02,03)));
    }
}
