package be.vdab.voorraad.repositories;

import be.vdab.voorraad.domain.Artikel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtikelRepository extends JpaRepository<Artikel, Long> {
}
