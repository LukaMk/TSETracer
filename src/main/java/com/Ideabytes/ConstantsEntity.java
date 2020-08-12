package com.Ideabytes;


import java.util.Objects;

public class ConstantsEntity {
    private static final String DELIMITER = ":::";
    private long startTime;
    private long endTime;
    private String className;
    private String methodName;
    private String params;
    private String returns;

    public ConstantsEntity(long startTime, long endTime, String className, String methodName, String params, String returns) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.className = className;
        this.methodName = methodName;
        this.params = params;
        this.returns = returns;
    }

    public static String getDELIMITER() {
        return DELIMITER;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getReturns() {
        return returns;
    }

    public void setReturns(String returns) {
        this.returns = returns;
    }

    @Override
    public String toString() {
        return "TSE(" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", params='" + params + '\'' +
                ", returns='" + returns + '\'' +
                ')';
    }
}