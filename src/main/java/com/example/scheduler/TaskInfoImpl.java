package com.example.scheduler;

import java.util.Date;

import com.ibm.websphere.scheduler.NotificationSinkHome;
import com.ibm.websphere.scheduler.NotificationSinkInvalid;
import com.ibm.websphere.scheduler.TaskInfo;
import com.ibm.websphere.scheduler.TaskInvalid;
import com.ibm.websphere.scheduler.UserCalendarInvalid;
import com.ibm.websphere.scheduler.UserCalendarPeriodInvalid;
import com.ibm.websphere.scheduler.UserCalendarSpecifierInvalid;

public class TaskInfoImpl implements TaskInfo {

    private static final long serialVersionUID = 1L;
    private String name;
    private Date nextFireTime;
    private int repeatsLeft;
    private int status;
    private String taskId;
    private Date timeCreated;
    private String authenticationAlias;
    private boolean autoPurge;
    private int expectedDuration;
    private NotificationSinkHome notificationSink;
    private String notificationSinkJNDIName;
    private int numberOfRepeats;
    private int qos;
    private String repeatInterval;
    private String startByInterval;
    private Date startTime;
    private String startTimeInterval;
    private int taskExecutionOptions;
    private String userCalendarJNDIName;
    private String userCalendarSpecifier;

    @Override
    public Date getNextFireTime() {
        return nextFireTime;
    }

    @Override
    public int getRepeatsLeft() {
        return repeatsLeft;
    }

    @Override
    public int getStatus() {
        return status;
    }

    @Override
    public String getTaskId() {
        return taskId;
    }

    @Override
    public Date getTimeCreated() {
        return timeCreated;
    }

    @Override
    public String getAuthenticationAlias() {
        return authenticationAlias;
    }

    @Override
    public boolean getAutoPurge() {
        return autoPurge;
    }

    @Override
    public int getExpectedDuration() {
        return expectedDuration;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public NotificationSinkHome getNotificationSink() throws NotificationSinkInvalid {
        return notificationSink;
    }

    @Override
    public String getNotificationSinkJNDIName() {
        return notificationSinkJNDIName;
    }

    @Override
    public int getNumberOfRepeats() {
        return numberOfRepeats;
    }

    @Override
    public int getQOS() {
        return qos;
    }

    @Override
    public String getRepeatInterval() {
        return repeatInterval;
    }

    @Override
    public String getStartByInterval() {
        return startByInterval;
    }

    @Override
    public Date getStartTime() {
        return startTime;
    }

    @Override
    public String getStartTimeInterval() {
        return startTimeInterval;
    }

    @Override
    public int getTaskExecutionOptions() {
        return taskExecutionOptions;
    }

    @Override
    public String getUserCalendarJNDIName() {
        return userCalendarJNDIName;
    }

    @Override
    public String getUserCalendarSpecifier() {
        return userCalendarSpecifier;
    }

    @Override
    public void setAuthenticationAlias(String arg0) {
        this.authenticationAlias = arg0;
    }

    @Override
    public void setAutoPurge(boolean arg0) {
        this.autoPurge = arg0;
    }

    @Override
    public void setExpectedDuration(int arg0) {
        this.expectedDuration = arg0;
    }

    @Override
    public void setInitialState(int arg0) {
        this.status = arg0;
    }

    @Override
    public void setName(String arg0) {
        this.name = arg0;
    }

    @Override
    public void setNotificationSink(NotificationSinkHome arg0) throws NotificationSinkInvalid {
        this.notificationSink = arg0;
    }

    @Override
    public void setNotificationSink(String arg0) {
        this.notificationSinkJNDIName = arg0;
    }

    @Override
    public void setNotificationSink(NotificationSinkHome arg0, int arg1) throws NotificationSinkInvalid {
        this.notificationSink = arg0;
        this.qos = arg1;
    }

    @Override
    public void setNotificationSink(String arg0, int arg1) {
        this.notificationSinkJNDIName = arg0;
        this.qos = arg1;
    }

    @Override
    public void setNumberOfRepeats(int arg0) {
        this.numberOfRepeats = arg0;
    }

    @Override
    public void setQOS(int arg0) {
        this.qos = arg0;
    }

    @Override
    public void setRepeatInterval(String arg0) {
        this.repeatInterval = arg0;
    }

    @Override
    public void setStartByInterval(String arg0) {
        this.startByInterval = arg0;
    }

    @Override
    public void setStartTime(Date arg0) {
        this.startTime = arg0;
    }

    @Override
    public void setStartTimeInterval(String arg0) {
        this.startTimeInterval = arg0;
    }

    @Override
    public void setTaskExecutionOptions(int arg0) {
        this.taskExecutionOptions = arg0;
    }

    @Override
    public void setUserCalendar(String arg0, String arg1) throws UserCalendarInvalid {
        this.userCalendarJNDIName = arg0;
        this.userCalendarSpecifier = arg1;
    }

    @Override
    public void validate() throws UserCalendarSpecifierInvalid, UserCalendarPeriodInvalid, UserCalendarInvalid,
            TaskInvalid, NotificationSinkInvalid {
        // Implementation of validation logic if needed
    }
}
