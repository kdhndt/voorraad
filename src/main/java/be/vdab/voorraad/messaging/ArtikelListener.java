package be.vdab.voorraad.messaging;

import be.vdab.voorraad.events.ArtikelGemaakt;
import be.vdab.voorraad.services.ArtikelService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//momenteel geen Controller nodig, deze component luistert naar elk bericht in de queue en verwerkt die
//van zodra de applicatie start, begint de listener met verwerken
@Component
public class ArtikelListener {
    private final ArtikelService artikelService;

    public ArtikelListener(ArtikelService artikelService) {
        this.artikelService = artikelService;
    }

    //J2J bean in VoorraadApplication converteert een per een inkomende messages uit de voorraad queue naar ArtikelGemaakt objecten via zijn setters
    //dit object wordt dan via naarArtikel() naar een Artikel omgevormd en de database die bij deze applicatie hoort wordt bijgewerkt
    @RabbitListener(queues = "voorraad")
    void verwerkBericht(ArtikelGemaakt gemaakt) {
        artikelService.create(gemaakt.naarArtikel());
    }
}
