package ru.workTasks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Device {
    private String id;
    private String Name;
    private String type;
    private boolean enabled;
}
