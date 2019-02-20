package ru.workTasks;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileReader {


public static void main(String args[]) throws IOException {
    ObjectMapper mapper = new ObjectMapper();

    Map<String, Device> devices = mapper.readValue(new File("src/main/resources/cfg.json"), Map.class);
   /*
    mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    List<Device> devices;

            devices =  mapper.readValue(new File("src/main/resources/cfg.json"), List.class);

    for(device : devices.entrySet()) {
        //System.out.println(devices.getValue()); //подумать, на что заменить :)
    }*/

   System.out.println();
}

}
