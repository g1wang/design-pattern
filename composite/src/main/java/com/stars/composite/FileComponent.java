package com.stars.composite;

import java.io.File;

public abstract class FileComponent {
    protected File file;

    public FileComponent(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public abstract void add(FileComponent c);
    public abstract void remove(FileComponent c);
    public abstract void display(int depth);

}
