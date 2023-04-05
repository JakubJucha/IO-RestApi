package pl.lab.komputery;


//import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/komputery")
public class KomputerApi {
    private List<Komputer> komputerList;

    public KomputerApi(List<Komputer> komputerList){
        Komputer k1=new Komputer(1L,"SuperKomp", LocalDate.of(2020, 11,13));
        Komputer k2=new Komputer(2L,"GigaKomp", LocalDate.of(2010, 12,15));
        Komputer k3=new Komputer(3L,"PoorPC", LocalDate.of(1995, 10,16));
        Komputer k4=new Komputer(4L,"UltraPC", LocalDate.of(2023, 11,4));
        Komputer k5=new Komputer(5L,"Laptop", LocalDate.of(2002, 04,2));

        komputerList.add(k1);
        komputerList.add(k2);
        komputerList.add(k3);
        komputerList.add(k4);
        komputerList.add(k5);
    }

    @GetMapping("/wszystkie")
    public List<Komputer> pobierz_wszystkie()
    {
        return komputerList;
    }

    @GetMapping
    public Komputer pobierz_jeden(@RequestParam int id)
    {
        return this.komputerList.stream().filter(val -> val.getIdentyfikator() == id).findFirst().orElse(null);
    }

    @PostMapping("/dodaj")
    public void addKomputer (@RequestBody Komputer komputer)
    {
        if (komputer != null)
        {
            komputerList.add(komputer);
        }
    }
}
