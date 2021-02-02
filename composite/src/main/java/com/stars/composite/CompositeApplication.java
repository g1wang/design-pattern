package com.stars.composite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CompositeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompositeApplication.class, args);
        File file = new File("D:/Stars-store");
        FileComponent fileComponent = scan(file);
        int dept = 0;
        show(fileComponent,dept);


    }

    private static void show(FileComponent fileComponent,int dept) {
        if (FileContainer.class.isInstance(fileComponent)){
            fileComponent.display(dept);
            FileContainer fileContainer = (FileContainer) fileComponent;
            List<FileComponent> fileComponents = fileContainer.getFileComponents();
            ++dept;
            for (FileComponent component : fileComponents) {
                show(component,dept);
            }
        }
    }


    private static FileComponent scan(File file) {
        FileComponent fileComponent = null;
        if (file.isDirectory()) {
            fileComponent = new FileContainer(file, new ArrayList<>());
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                fileComponent.add(scan(files[i]));
            }
        } else {
            FileLeaf fileLeaf = new FileLeaf(file);
            fileComponent = new FileLeaf(file);
        }
        return fileComponent;
    }

}
