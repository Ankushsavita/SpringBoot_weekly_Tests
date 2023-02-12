package com.example.UniversityEventManagementApp.controller;

import com.example.UniversityEventManagementApp.model.Event;
import com.example.UniversityEventManagementApp.model.Student;
import com.example.UniversityEventManagementApp.service.UniverseventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/vi/university-Event-app")
public class UniverseventController {

    @Autowired
    private final UniverseventService universeventService;

    public UniverseventController(UniverseventService universeventService){ // Dependency Injection
        this.universeventService = universeventService;
    }

    // Student Model Class-Controller CRUD Operations

    // 1). Add Student
    // http://localhost:8080/api/vi/university-Event-app/add-student
    @PostMapping("/add-student")
    public void addStudent(@RequestBody Student student){
         universeventService.addStudent(student);
    }

    // 2). get All Student
    // http://localhost:8080/api/vi/university-Event-app/find-all
    @GetMapping("find-all")
    public List<Student> findAllStudent(){
       return universeventService.findAll();
    }

    // 3). get Student By Id
    // http://localhost:8080/api/vi/university-Event-app/find-student/studentId/2
    @GetMapping("find-student/studentId/{studentId}")
    public Student findStudentById(@PathVariable int studentId){
        return universeventService.findById(studentId);
    }

    // 4). Update Student
    // http://localhost:8080/api/vi/university-Event-app/update-student/studentId/4
    @PutMapping("update-student/studentId/{studentId}")
    public void updateStudent(@PathVariable int studentId, @RequestBody Student student){
        universeventService.updateStudent(studentId, student);
    }

    // 5). delete Student
    // http://localhost:8080/api/vi/university-Event-app/delete-student/studentId/5
    @DeleteMapping("delete-student/studentId/{studentId}")
    public void deleteStudent(@PathVariable int studentId){
        universeventService.deleteStudent(studentId);
    }



    // Event Model class-Controller CRUD Operations

    // 6). Add event
    // http://localhost:8080/api/vi/university-Event-app/add-event
    @PostMapping("add-event")
    public void addEvent(@RequestBody Event event){
        universeventService.addEvent(event);
    }

    //  get All Event
    // http://localhost:8080/api/vi/university-Event-app/find-allEvent
    @GetMapping("find-allEvent")
    public List<Event> findAllEvent(){
        return universeventService.findAllEvent();
    }

    // 7). get Event By Date
    // http://localhost:8080/api/vi/university-Event-app/find-event/date/2021-01-21
    @GetMapping("find-event/date/{date}")
    public List<Event> findAllEventByDate(@PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date){
        return universeventService.findAllEventByDate(date);
    }

    // 8). update Event
    // http://localhost:8080/api/vi/university-Event-app/update-event/eventId/1
    @PutMapping("update-event/eventId/{eventId}")
    public Event updateEvent(@PathVariable int eventId, @RequestBody  Event event){
        return universeventService.updateEvent(eventId,event);
    }

    // 9). delete Event
    // http://localhost:8080/api/vi/university-Event-app/delete-event/eventId/1
    @DeleteMapping("delete-event/eventId/{eventId}")
    public void deleteEvent(@PathVariable int eventId){
        universeventService.deleteEvent(eventId);
    }

}
