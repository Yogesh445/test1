package com.example.demo.server;

import com.example.demo.clientRequest.NoonAcademyClientRequest;
import com.example.demo.exception.DataNotSavedException;
import com.opencsv.CSVWriter;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Created by Yogesh Sharma on 22/06/2019.
 * */
@Component
public class NoonAcademyServer {

    public boolean pushData(NoonAcademyClientRequest request) throws DataNotSavedException {

        synchronized (request) {
            File file = new File("/home/yogesh_s/Desktop/file/info.csv");
            try {
                // create FileWriter object with file as parameter
                FileWriter outputfile = new FileWriter(file);

                // create CSVWriter object filewriter object as parameter
                CSVWriter writer = new CSVWriter(outputfile);

                // adding header to csv
                String[] header = {"Name", "Class", "Marks"};
                writer.writeNext(header);

                // add data to csv
                writer.writeNext(request.getStrData());

                // closing writer connection
                writer.close();

                return true;
            } catch (IOException e) {
                throw new DataNotSavedException("Unable to save data into Server", e);
            }
        }
    }
}
