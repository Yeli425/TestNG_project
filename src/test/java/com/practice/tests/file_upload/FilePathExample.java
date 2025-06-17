package com.practice.tests.file_upload;

import org.testng.annotations.Test;

public class FilePathExample {

    @Test
    public void test(){
        //  /Users/jamaldemir/Desktop/EU2TestNGProject/src/test/resources/testfile.txt

        //getting project location/path dynamicly
        String projectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resources/testfile.txt";
        System.out.println(projectPath);
        String filePath = projectPath+"/"+relativePath;
        System.out.println("filePath = " + filePath);


    }

}
