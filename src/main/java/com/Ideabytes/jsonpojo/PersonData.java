package com.Ideabytes.jsonpojo;

import com.Ideabytes.Constants;

import java.io.Serializable;
import java.sql.*;
import java.util.Date;
import java.util.List;

public class PersonData {
    String rowNum;
    String lastName;
    Date Birthday;
    List<String> list;

    public PersonData() {
        super();
    }

    public PersonData(String rowNum, String lastName, Date birthday, List<String> list) {
        this.rowNum = rowNum;
        this.lastName = lastName;
        Birthday = birthday;
        this.list = list;
    }

    public PersonData(String string) {
    }

    public String getRowNum() {
        return rowNum;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return Birthday;
    }


    public void setFirsName(String firsName) {
        this.rowNum = rowNum;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PersonData{" +
                "rowNum='" + rowNum + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Birthday=" + Birthday +
                ", list=" + list +
                '}';
    }
}
