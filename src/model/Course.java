package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Course {
    private int courseId;  //课程号
    private String name;  //课程名称
    private int teacherId; //授课教师
    private String location;  //上课地点
    private String courseDuration;  //上课周数
    private String flag;  //课程类别
    private String classes;  //开设班级
    private String startTime;  //课程开始时间
    private int semester;  //课程开设学期
    private int numOfStu;  //选课人数

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Date setStartDate(String startTime){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try{
            return format.parse(startTime);
        }catch (ParseException e){
            e.printStackTrace();
            return null;
        }
    }

    public void setDate(Date startTime){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        this.startTime = format.format(startTime);
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getNumOfStu() {
        return numOfStu;
    }

    public void setNumOfStu(int numOfStu) {
        this.numOfStu = numOfStu;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId" + courseId + "," +
                "name" + name + "," +
                "flag" + flag + "," +
                "teacher" + teacherId + "," +
                "location" + location + "," +
                "courseDuration" + courseDuration + "," +
                "classes" + classes + "," +
                "startTime" + startTime + "," +
                "semester" + semester + "," +
                "numOfStu" + numOfStu + "," +
                "}";
    }
}
