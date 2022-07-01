package org.jlleitschuh.moderne.test.list;

import java.io.File;
import java.io.IOException;

@SuppressWarnings("unused")
public class PartialPathTraversalExample {

    void exapiExample(File dir, File parent) throws IOException {
        if (!dir.getCanonicalPath().startsWith(parent.getCanonicalPath())) {
            throw new IOException("Invalid directory: " + dir.getCanonicalPath());
        }
    }

    void exampleWithString(File dir, File parent) throws IOException {
        String parentPath = parent.getCanonicalPath();
        if (!dir.getCanonicalPath().startsWith(parentPath)) {
            throw new IOException("Invalid directory: " + dir.getCanonicalPath());
        }
    }

    void exampleConcatenated(File dir) throws IOException {
        if (!dir.getCanonicalPath().startsWith("/usr" + "/dir")) {
            throw new IOException("Invalid directory: " + dir.getCanonicalPath());
        }
    }

    void foo(File dir, File parent) throws IOException {
        String canonicalPath = dir.getCanonicalPath();
        if (!canonicalPath.startsWith(parent.getCanonicalPath())) {
            throw new IOException("Invalid directory: " + dir.getCanonicalPath());
        }
    }
}
