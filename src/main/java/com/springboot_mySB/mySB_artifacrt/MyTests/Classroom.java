package com.springboot_mySB.mySB_artifacrt.MyTests;

public class Classroom {

    private int numberOfSeats;
    private String classroomId;
    private int numberOfStudents;
    private boolean availability = false;
    private String classroomName;
    public Classroom(String classroomId, int numberOfSeats, int numberOfStudents, boolean availability, String classroomName) {
        this.classroomId = classroomId;
        this.availability = availability;
        this.numberOfSeats = numberOfSeats;
        this.numberOfStudents = numberOfStudents;
        this.classroomName = classroomName;
    }

    public String getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "numberOfSeats=" + numberOfSeats +
                ", numberOfStudents=" + numberOfStudents +
                ", availability=" + availability +
                ", classroomName='" + classroomName + '\'' +
                '}';
    }
}
