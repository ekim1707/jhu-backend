package practice.JHUBackend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Journal {

    private String title;
    private String timestamp;
    private String location;
    private String mood;
    private String music;
    private String entry;

    public Journal(
            @JsonProperty String title,
            @JsonProperty String timestamp,
            @JsonProperty String location,
            @JsonProperty String mood,
            @JsonProperty String music,
            @JsonProperty String entry
    ) {
        this.title = title;
        this.timestamp = timestamp;
        this.location = location;
        this.mood = mood;
        this.music = music;
        this.entry = entry;
    }

    public String getTitle() { return title; }
    public String getTimestamp() { return timestamp; }
    public String getLocation() { return location; }
    public String getMood() { return mood; }
    public String getMusic() { return music; }
    public String getEntry() { return entry; }

}
