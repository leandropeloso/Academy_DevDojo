package O_exception.runtime.teste;

import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTeste04 {
	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
			System.out.println("Dentro do ArrayIndexOutOfBoundsException");
		} catch (RuntimeException e) {
			System.out.println("Dentro do RuntimeException");
		}
		try {
			talvezLanceException();
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}

	private static void talvezLanceException() throws SQLException, IOException {

	}
}
