package fabrik;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import business.Buergeramt;

public class ConcreteTxtProduct extends Product {

	PrintWriter write ;
    public ConcreteTxtProduct() throws IOException {
    	write = new PrintWriter(new FileWriter("buerger.txt"));
	}
	
		
	@Override
	public void fuegeInDateiHinzu(Buergeramt buergeramt) throws IOException {
		write.println("Daten des B�rgeramts");
		write.println("Name des B�rgeramts : " + buergeramt.getName());
		write.println("�ffnungszeit des B�rgeramts : " + buergeramt.getGeoeffnetBis() + " - " + buergeramt.getGeoeffnetBis());
		write.println("Strasse und Hausnummer des B�rgeramts : " + buergeramt.getStrasseHNr());
		write.println("Dienstleistungen des B�rgeramts : " + buergeramt.getDienstleistungenAlsString('-'));
	}

	@Override
	public void schliesseDatei() throws IOException {
		write.close();
	}

}
