package com.example.demo.client;

import com.example.demo.clientRequest.NoonAcademyClientRequest;
import com.example.demo.exception.DataNotSavedException;
import com.example.demo.server.NoonAcademyServer;
import mapper.ServerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * Created by Yogesh Sharma on 22/06/2019.
 * */
@Component
public class NoonAcademyClient {

    @Autowired
    private NoonAcademyServer server;
    @Autowired
    private ServerMapper mapper;

    /*
     * Saving the data into the server
     * */
    public void pushData(String str[]) throws DataNotSavedException {
        NoonAcademyClientRequest request = mapper.getClientRequest(str);
        boolean isSaved = server.pushData(request);
        poll(isSaved);
    }

    public String poll(boolean changed) {
        String displayMsg = changed ? "Database updated" : "No Changes";
        return displayMsg;
    }

}
