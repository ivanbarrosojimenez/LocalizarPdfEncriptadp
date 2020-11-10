package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * Esta clase comprueba si un fichero esta encriptado con la libreria de pdfbox 1.8
 * @author ibarrosj
 *
 */
public class UtilidadesFichero {

	/**
	 * Este metodo comprueba si el fichero esta encriptado o no.
	 * @param url
	 * @return true en caso de que no este bloqueado o se produzca algun error de 
	 */
	public static boolean esFicheroBloqueado(String ruta) {
		try {
			byte[] byteArray = Files.readAllBytes(Paths.get(ruta));
			String pdfContent = new String(byteArray);
			int lastTrailerIndex = pdfContent.lastIndexOf("trailer");
			if (lastTrailerIndex >= 0 && lastTrailerIndex < pdfContent.length()) {
				String newString = pdfContent.substring(lastTrailerIndex, pdfContent.length());
				int firstEOFIndex = newString.indexOf("%%EOF");
				String trailer = newString.substring(0, firstEOFIndex);
				return (trailer.contains("/Encrypt"));
				
			}
		} catch (IOException e) {
			return true;
		}
		return true;
	}
}

