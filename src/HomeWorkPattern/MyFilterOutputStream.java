package HomeWorkPattern;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MyFilterOutputStream extends FilterOutputStream {

        private byte[] key;
        private int currentKeyPosition;

    public MyFilterOutputStream(OutputStream out, byte[] key) {
        super(out);
        this.key = key;
    }

    @Override
    public void write(int val) throws IOException {

       val = val-1;
        currentKeyPosition++;
        super.write(val);

    }
}
