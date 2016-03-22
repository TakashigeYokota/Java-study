import java.io.*;

import java.net.*;

public class Prc11_1 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://dokojava.jp/favicon.ico");
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream("dj.ico");
		int i = is.read();
		while (i != -1){
			os.write((byte) i);
			i = is.read();
		}
		is.close();
		os.flush();
		os.close();
	}
}