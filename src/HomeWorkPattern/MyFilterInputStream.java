package HomeWorkPattern;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;


public class MyFilterInputStream extends FilterInputStream {
    private byte[] key;
    private int currentKeyPosition = 0;

    public MyFilterInputStream(InputStream in, byte[] key) throws IOException {
        super(in);
        this.key = key;
    }

    @Override
    public int read() throws IOException {
        int buff=super.read()+1;
        currentKeyPosition++;
        return buff;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int num = super.read(b, off, len);
        for(int i=off;i<off+len;i++) {
            b[i] = (byte) (b[i]+1);
            currentKeyPosition++;
        }
        return num;
    }
}
