package hu.bertalanadam.prt.beadando.db.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.Assert.assertEquals;

import hu.bertalanadam.prt.beadando.db.entitas.Felhasznalo;
import hu.bertalanadam.prt.beadando.db.tarolo.FelhasznaloTarolo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-db.xml")
@Transactional
@Rollback(true)
public class TestConnection {
	
//	private static Logger logger = Logger.getLogger(TestConnection.class.getName());

	@Autowired
	FelhasznaloTarolo fhtarolo;

	@Test
	public void tesztBeszurasAFelhasznaloba() throws Exception {
//		logger.info("TESTLOG");
//		Felhasznalo random = new Felhasznalo();
//
//		random.setFelasznalonev("Magic");
//
//		fhtarolo.save(random);
		
		Felhasznalo admin = fhtarolo.findByFelhasznalonev("admin");
		
		assertEquals( admin.getFelhasznalonev(), "admin");

	}

}
