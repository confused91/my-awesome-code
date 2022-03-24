package classtraining.lambdasinpractice;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface FileProc {

    String process(BufferedReader bufferedReader) throws IOException;
}
