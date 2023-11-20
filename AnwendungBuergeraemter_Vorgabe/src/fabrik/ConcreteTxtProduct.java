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
		write.println("Daten des Bürgeramts");
		write.println("Name des Bürgeramts : " + buergeramt.getName());
		write.println("Öffnungszeit des Bürgeramts : " + buergeramt.getGeoeffnetBis() + " - " + buergeramt.getGeoeffnetBis());
		write.println("Strasse und Hausnummer des Bürgeramts : " + buergeramt.getStrasseHNr());
		write.println("Dienstleistungen des Bürgeramts : " + buergeramt.getDienstleistungenAlsString('-'));
	}

	@Override
	public void schliesseDatei() throws IOException {
		write.close();
	}

}
