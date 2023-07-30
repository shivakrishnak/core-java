import java.io.*

public class Main {
	//what will be the output?
	public static void main(String args) {
		try (InputStream inputStream = new FileInputStream("file.txt");
		     BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
				while (bufferedInputStream.available() > 0) {
					System.out.print((char) bufferedInputStream.read());
					if (bufferedInputStream.available() <= 0) inputStream.reset();
				}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}

Pre-condition
file.txt is valid and contains only 1 row - "HelloWorld!"