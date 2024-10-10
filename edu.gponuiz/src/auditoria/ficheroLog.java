package auditoria;

import java.io.FileWriter;
import java.time.LocalDate;


public class ficheroLog {

	public void ficheroLog(String mensaje) {
	    try {

//"intento" de crear fichero log
	    	
	    LocalDate fechaHoy = LocalDate.now();

	    String ficheroLog = "C:\\Users\\gpr\\eclipse-workspace\\edu.gponuiz\\src\\auditoria" + fechaHoy + ".txt";

	    FileWriter escribe = new FileWriter(ficheroLog, true);

	    escribe.write(mensaje + "\n");
	    escribe.close();

	    } catch (Exception e) {
	        System.out.println("Error al escribir fichero log" + e.getMessage());
	    }
	}


}
