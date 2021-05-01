package com.example.recruitai.Model;

public class UserClass {
    String Name;
    String Phone;
    String Current;
    String Status;
    Float Resume;
    String Resumepdf;
    String Interviewmp4;
    String Audiotext;
    Float Interviewscore;

    public UserClass() {
    }

    public UserClass(String name, String phone, String current, String status, String resumepdf) {
        Name = name;
        Phone = phone;
        Current = current;
        Status = status;
        Resumepdf = resumepdf;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCurrent() {
        return Current;
    }

    public void setCurrent(String current) {
        Current = current;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Float getResume() {
        return Resume;
    }

    public void setResume(Float resume) {
        Resume = resume;
    }

    public String getResumepdf() {
        return Resumepdf;
    }

    public void setResumepdf(String resumepdf) {
        Resumepdf = resumepdf;
    }

    public String getInterviewmp4() {
        return Interviewmp4;
    }

    public void setInterviewmp4(String interviewmp4) {
        Interviewmp4 = interviewmp4;
    }

    public String getAudiotext() {
        return Audiotext;
    }

    public void setAudiotext(String audiotext) {
        Audiotext = audiotext;
    }

    public Float getInterviewscore() {
        return Interviewscore;
    }

    public void setInterviewscore(Float interviewscore) {
        Interviewscore = interviewscore;
    }
}