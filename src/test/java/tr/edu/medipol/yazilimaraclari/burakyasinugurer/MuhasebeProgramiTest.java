package tr.edu.medipol.yazilimaraclari.burakyasinugurer;


import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;




public class MuhasebeProgramiTest {
	
	@Test
	public void maasTest() {
			
		int calisilanSaat = 10;
		int saatlikUcret = 40;
		
		int ucretHesapla = MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);
		Assert.assertEquals(400, ucretHesapla);
	}

}
