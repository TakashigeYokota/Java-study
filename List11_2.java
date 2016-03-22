import java.io.*;

import java.net.*;

public class List11_2 {
	public static void main(String[] args) throws IOException {
		Socket sock = new Socket("dokojava.jp",80);
//		URL url = new URL("http://dokojava.jp");
		InputStream is = sock.getInputStream();
		OutputStream os = sock.getOutputStream();
		os.write("GET /index.html HTTP/1.0\r\n".getBytes());
		os.write("\r\n".getBytes());
		os.flush();
		InputStreamReader isr = new InputStreamReader(is);
		int i = isr.read();
		while (i != -1){
			System.out.print((char) i);
			i = isr.read();
		}
		isr.close();
	}
}