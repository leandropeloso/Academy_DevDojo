package M_interfaces.dominio;

public interface DataLoader {
	public static final int MAX_DATA_SIZE = 10;
	public abstract void load();

	public default void checkPermission() {
		System.out.println("Fazendo checagem de permiss�es");
	}
	
	public static void retrieveMaxDataSize() {
		System.out.println("Dentro do retrieveMaxDataSize na interface");
	}
}
