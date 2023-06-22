package M_interfaces.teste;

import M_interfaces.dominio.DataLoader;
import M_interfaces.dominio.DatabaseLoader;
import M_interfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
	public static void main(String[] args) {
		DatabaseLoader databaseLoader = new DatabaseLoader();
		FileLoader fileLoader = new FileLoader();

		databaseLoader.load();
		fileLoader.load();

		databaseLoader.remove();
		fileLoader.remove();
		
		databaseLoader.checkPermission();
		fileLoader.checkPermission();
		
		DataLoader.retrieveMaxDataSize();
		DatabaseLoader.retrieveMaxDataSize();
	}
}
