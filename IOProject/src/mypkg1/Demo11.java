package mypkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Demo11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        try (FileChannel fcIn = new FileInputStream("AA").getChannel();
                FileChannel fcOut = new FileOutputStream("abc.txt").getChannel()) {
               ByteBuffer buff = ByteBuffer.allocate((int) fcIn.size());
               fcIn.read(buff);
              buff.position(0);
              fcOut.write(buff);
          } catch (FileNotFoundException f) {
              System.out.println("File not found: " + f);
          } catch (IOException e) {
              System.out.println("IOException: " + e);
          }

	}

}
