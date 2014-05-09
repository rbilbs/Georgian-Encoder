import java.io.*;
import java.util.*;

public class Convert {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("This program converts a text file containing a");
		System.out.println("lower ASCII representation of Georgian characters");
		System.out.println("into their corresponding Unicode equivalents.");
		System.out.println();
		
		// prompt user for input and output files
		System.out.print("Input file name? ");
		Scanner console = new Scanner(System.in);
		String filename = console.nextLine();
		Scanner input = new Scanner(new File(filename));
		System.out.print("Output file name? ");
		String outputFileName = console.nextLine();
		PrintStream output = new PrintStream(new File(outputFileName));
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			
			// encode HTML tags
			line = line.replaceAll("<p>", "0000");
			line = line.replaceAll("</p>", "0001");
			line = line.replaceAll("<h1>", "0002");
			line = line.replaceAll("</h1>", "0003");
			line = line.replaceAll("<br />", "0004");
			line = line.replaceAll("<I>", "0005");
			line = line.replaceAll("</I>", "0006");
			line = line.replaceAll("<br/>", "0007");
			line = line.replaceAll("<p >", "0008");
			line = line.replaceAll("<h2>", "0009");
			line = line.replaceAll("</h2>", "0010");
			line = line.replaceAll("<h3>", "0011");
			line = line.replaceAll("</h3>", "0012");
			
			// convert to Unicode
			line = line.replaceAll("a", "ა");
			line = line.replaceAll("b", "ბ");
			line = line.replaceAll("g", "გ");
			line = line.replaceAll("d", "დ");
			line = line.replaceAll("e", "ე");
			line = line.replaceAll("v", "ვ");
			line = line.replaceAll("z", "ზ");
			line = line.replaceAll("T", "თ");
			line = line.replaceAll("i", "ი");
			line = line.replaceAll("k", "კ");
			line = line.replaceAll("l", "ლ");
			line = line.replaceAll("m", "მ");
			line = line.replaceAll("n", "ნ");
			line = line.replaceAll("o", "ო");
			line = line.replaceAll("p", "პ");
			line = line.replaceAll("J", "ჟ");
			line = line.replaceAll("r", "რ");
			line = line.replaceAll("s", "ს");
			line = line.replaceAll("t", "ტ");
			line = line.replaceAll("u", "უ");
			line = line.replaceAll("f", "ფ");
			line = line.replaceAll("q", "ქ");
			line = line.replaceAll("R", "ღ");
			line = line.replaceAll("y", "ყ");
			line = line.replaceAll("S", "შ");
			line = line.replaceAll("C", "ჩ");
			line = line.replaceAll("c", "ც");
			line = line.replaceAll("Z", "ძ");
			line = line.replaceAll("w", "წ");
			line = line.replaceAll("W", "ჭ");
			line = line.replaceAll("x", "ხ");
			line = line.replaceAll("j", "ჯ");
			line = line.replaceAll("h", "ჰ");
			
			// decode HTML tags
			line = line.replaceAll("0000", "<p>");
			line = line.replaceAll("0001", "</p>");
			line = line.replaceAll("0002", "<h1>");
			line = line.replaceAll("0003", "</h1>");
			line = line.replaceAll("0004", "<br />");
			line = line.replaceAll("0005", "<I>");
			line = line.replaceAll("0006", "</I>");
			line = line.replaceAll("0007", "<br/>");
			line = line.replaceAll("0008", "<p >");
			line = line.replaceAll("0009", "<h2>");
			line = line.replaceAll("0010", "</h2>");
			line = line.replaceAll("0011", "<h3>");
			line = line.replaceAll("0012", "</h3>");
			
			output.println(line);
		}
	}
}
