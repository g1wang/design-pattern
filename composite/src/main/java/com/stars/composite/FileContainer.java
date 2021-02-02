package com.stars.composite;

import java.io.File;
import java.util.List;

/**
 * dir
 */
public class FileContainer extends FileComponent {

    private List<FileComponent> fileComponents;

    public FileContainer(File file, List<FileComponent> fileComponents) {
        super(file);
        this.fileComponents = fileComponents;
    }

    public List<FileComponent> getFileComponents() {
        return fileComponents;
    }

    public void setFileComponents(List<FileComponent> fileComponents) {
        this.fileComponents = fileComponents;
    }

    @Override
    public void add(FileComponent c) {
        fileComponents.add(c);
    }

    @Override
    public void remove(FileComponent c) {
        fileComponents.remove(c);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < fileComponents.size(); i++) {
            System.out.println("level"+depth+":"+fileComponents.get(i).getFile().getName());
        }
    }

}
