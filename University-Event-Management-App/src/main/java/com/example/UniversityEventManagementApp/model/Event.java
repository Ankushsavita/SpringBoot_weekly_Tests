package com.example.UniversityEventManagementApp.model;

import java.time.LocalDate;

public class Event {
    private int eventId;
    private String eventName;
    private String locationOfEvent;
    private LocalDate date;
    private String startTime;
    private String endTime;

    public Event(int eventId, String eventName, String locationOfEvent, LocalDate date, String startTime, String endTime) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.locationOfEvent = locationOfEvent;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocationOfEvent() {
        return locationOfEvent;
    }

    public void setLocationOfEvent(String locationOfEvent) {
        this.locationOfEvent = locationOfEvent;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", locationOfEvent='" + locationOfEvent + '\'' +
                ", date='" + date + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
