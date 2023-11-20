package fabrik;

import java.io.IOException;

public class ConcreteCsvCreator extends Creator{

	@Override
	public Product factoryMethod() throws IOException{
		return new ConcreteCsvProduct();
	}

}
