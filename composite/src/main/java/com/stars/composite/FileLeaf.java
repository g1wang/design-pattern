package com.stars.composite;

import java.io.File;

public class FileLeaf extends FileComponent {


    public FileLeaf(File file) {
        super(file);
    }

    @Override
    public void add(FileComponent c) {
        return;
    }

    @Override
    public void remove(FileComponent c) {
        return;
    }

    @Override
    public void display(int depth) {
        return;
    }
}
