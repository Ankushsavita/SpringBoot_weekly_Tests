package com.example.UniversityEventManagementApp.service;

import com.example.UniversityEventManagementApp.model.Event;
import com.example.UniversityEventManagementApp.model.Student;
import io.micrometer.observation.Observation;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class UniverseventService {
    private static List<Student> students = new ArrayList<>();
    private static int countId = 0;

    static {
        students.add(new Student(++countId, "Ankush", "savita", 22, "Faculty of Engineering"));
        students.add(new Student(++countId, "Anurag", "shakya", 25, "Faculty of Arts"));
        students.add(new Student(++countId, "Riya", "Aggarwal", 24, "Faculty of Bachelor of Arts"));
        students.add(new Student(++countId, "Anushka", "jadon", 23, "Faculty of Commerce"));
        students.add(new Student(++countId, "Amit", "verma", 26, "Faculty of Science"));

    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> findAll() {
        return students;
    }

    public Student findById(int studentId) {
        Predicate<? super Student> predicate = student -> student.getStudentId() == studentId;
        Student student = students.stream().filter(predicate).findFirst().get();
        return student;
    }

    public void updateStudent(int studentId, Student newStudent) {
        // step1 : find user to be update
        // step2 : update user

        Student student = findById(studentId); // step1

        student.setStudentId(newStudent.getStudentId()); // step2
        student.setFirstName(newStudent.getFirstName());
        student.setLastName(newStudent.getLastName());
        student.setAge(newStudent.getAge());
        student.setDepartment(newStudent.getDepartment());

    }

    public void deleteStudent(int studentId){
        Predicate<? super Student> predicate = student -> student.getStudentId() == studentId;
        students.removeIf(predicate);
    }


    // Event Model Class-Service

    private static List<Event> events = new ArrayList<>();
    private static int counteventId = 0;

    static{
        events.add(new Event(++counteventId, "Cultural Festival", "D.E.I Agra", LocalDate.of(2021,01,21),"10:30:00", "4:00:00"));
        events.add(new Event(++counteventId, "National Youth Festival", "D.E.I Agra", LocalDate.of(2019,8,07), "11:00:00", "3:00:00"));
        events.add(new Event(++counteventId, "Open Day Exhibition", "D.E.I Agra", LocalDate.of(2020,01,29), "9:00:00", "6:00:00"));
        events.add(new Event(++counteventId, "Convocation", "D.E.I Agra", LocalDate.of(2021,02,28), "12:45:30", "5:00:00"));
        events.add(new Event(++counteventId, "Basant Festival", "D.E.I Agra", LocalDate.of(2018,01,31), "8:00:00", "7:00:00"));
        events.add(new Event(++counteventId, "N.S.S Camp", "D.E.I Agra", LocalDate.of(2017,12,25), "10:00:00", "4:00:00"));
    }

    public void addEvent(Event event){
        events.add(event);
    }

    public List<Event> findAllEvent(){
        return events;
    }

    public List<Event> findAllEventByDate(LocalDate date){
        return events.stream().filter(data -> data.getDate().equals(date)).collect(Collectors.toList());
    }

    public Event updateEvent(int eventId, Event event){
        for(int i = 0; i < events.size(); i++){
            if(events.get(i).getEventId() == eventId){
                events.set(i, event);
                return event;
            }
        }
        return null;

    }

    public void deleteEvent(int eventId){
        Predicate<? super Event> predicate = event -> event.getEventId() == eventId;
        events.removeIf(predicate);
    }
}
