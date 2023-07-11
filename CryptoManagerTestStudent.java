/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Chap Bornhor
*/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
 
import org.junit.Test;

public class CryptoManagerTestStudent {
	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("PROJECT"));
		assertTrue(CryptoManager.isStringInBounds("\"PROJECT ARE DUE\""));
		assertFalse(CryptoManager.isStringInBounds("project"));
		assertFalse(CryptoManager.isStringInBounds("{PROJECT"));
		assertFalse(CryptoManager.isStringInBounds("\"This is testing out the RANGE\""));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("HJG", CryptoManager.caesarEncryption("CEB", 5));
		assertEquals("FHE", CryptoManager.caesarEncryption("CEB", 67));
		assertEquals("1.558", CryptoManager.caesarEncryption("HELLO", 105));
		assertEquals("UWTOJHY%NX%IZJ%XTTS", CryptoManager.caesarEncryption("PROJECT IS DUE SOON", 5));
		assertEquals("*,9(C0(C$1C$", CryptoManager.caesarEncryption("GIVE ME AN A", 99));
		//assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("bye", 3));
	}

	@Test
	public void testDecryptCaesar() {		
		assertEquals("PROJECT IS DUE SOON", CryptoManager.caesarDecryption("UWTOJHY%NX%IZJ%XTTS", 5));
		assertEquals("GIVE ME AN A", CryptoManager.caesarDecryption("*,9(C0(C$1C$", 99));
		assertEquals("CEB", CryptoManager.caesarDecryption("FHE", 67));
		assertEquals("CEB", CryptoManager.caesarDecryption("HJG", 5));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("\\W 36D\\0!T'1)W )", CryptoManager.bellasoEncryption("HOW WAS YOUR DAY", "THIS_CIPHER_IS_PRETTY_LONG"));
		assertEquals("PPX_!/P^TXLP!\"", CryptoManager.bellasoEncryption("HAPPY HOLIDAYS", "HOHOHOHOHO"));
		assertEquals("'YT&]![!['3]O2'X'T[#!", CryptoManager.bellasoEncryption("TESTING IS IN SESSION", "START"));

	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("HOW WAS YOUR DAY", CryptoManager.bellasoDecryption("\\W 36D\\0!T'1)W )", "THIS_CIPHER_IS_PRETTY_LONG"));
		assertEquals("HAPPY HOLIDAYS", CryptoManager.bellasoDecryption("PPX_!/P^TXLP!\"", "HOHOHOHOHO"));
		assertEquals("TESTING IS IN SESSION", CryptoManager.bellasoDecryption("'YT&]![!['3]O2'X'T[#!", "START"));

	}

}

