package business;

import java.io.FileWriter;
import java.io.IOException;

import fabrik.ConcreteCsvCreator;
import fabrik.ConcreteTxtCreator;
import fabrik.Creator;
import fabrik.Product;

public class BuergeraemterModel {

	private Buergeramt buergeramt;
	
	public BuergeraemterModel()
	{
		
	}

	public Buergeramt getBuergeramt() {
		return this.buergeramt;
	}
	
	public void schreibeBuergeraemterInCsvDatei() throws IOException
	{
		Creator create= new ConcreteCsvCreator();
		Product product= create.factoryMethod();
		product.fuegeInDateiHinzu(buergeramt);
		product.schliesseDatei();
		
	}
	
	public void schreibeBuergeraemterInTxtDatei() throws IOException
	{
		Creator create= new ConcreteTxtCreator();
		Product product= create.factoryMethod();
		product.fuegeInDateiHinzu(buergeramt);
		product.schliesseDatei();
		
	}
	
	public void setBuergeramt(Buergeramt buergeramt)
	{
		this.buergeramt = buergeramt;
	}
}
