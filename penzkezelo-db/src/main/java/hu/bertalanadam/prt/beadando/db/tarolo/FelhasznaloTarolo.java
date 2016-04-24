package hu.bertalanadam.prt.beadando.db.tarolo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import hu.bertalanadam.prt.beadando.db.entitas.Felhasznalo;

/**
 * A felhasználókhoz tartozó DAO aminek segítségével műveleteket hajthatunk végre a felhasználókon.
 * Ez az osztály egy DAO amit a {@link org.springframework.stereotype.Repository} annotációval jelzünk.
 * A {@link org.springframework.transaction.annotation.Transactional} annotáció Propagation.SUPPORTS annotációval
 * elérjük hogy egy éppen futó tranzakcióba képes legyen egy művelet bekapcsolódni.
 * Ez az osztály a {@link org.springframework.data.jpa.repository.JpaRepository} leszármazottja,
 * ezáltal az alapvető CRUD műveletek előre definiáltak.
 * */
@Repository
@Transactional(propagation = Propagation.SUPPORTS)
public interface FelhasznaloTarolo extends JpaRepository<Felhasznalo, Long> {

	Felhasznalo findByFelhasznalonev( String felhasznalonev ) throws Exception;
}
