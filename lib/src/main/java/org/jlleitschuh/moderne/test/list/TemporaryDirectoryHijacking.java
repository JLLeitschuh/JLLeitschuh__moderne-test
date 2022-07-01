package org.jlleitschuh.moderne.test.list;

import java.io.File;
import java.io.IOException;

@SuppressWarnings("unused")
public class TemporaryDirectoryHijacking {
    File example() throws IOException {
        // This is a vulnerability
        File file = File.createTempFile("prefix", "suffix");
        file.delete();
        file.mkdir();
        return file;
    }
}
