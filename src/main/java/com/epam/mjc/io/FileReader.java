package com.epam.mjc.io;

import java.io.*;


public class FileReader {

    public Profile getDataFromFile(File file) {
        Profile profile = new Profile();

        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            profile.setName(reader.readLine().split(" ")[1]);
            profile.setAge(Integer.parseInt(reader.readLine().split(" ")[1]));
            profile.setEmail(reader.readLine().split(" ")[1]);
            profile.setPhone(Long.parseLong(reader.readLine().split(" ")[1]));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return profile;
    }
}
