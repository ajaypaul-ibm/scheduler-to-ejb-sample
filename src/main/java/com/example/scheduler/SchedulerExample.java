package com.example.scheduler;

import com.ibm.websphere.scheduler.Scheduler;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Date;
import java.util.Properties;

public class SchedulerExample {
    public static void main(String[] args) {
        try {
            // Set up initial context
            Properties props = new Properties();
            props.setProperty(InitialContext.INITIAL_CONTEXT_FACTORY, "com.ibm.websphere.naming.WsnInitialContextFactory");
            InitialContext ctx = new InitialContext(props);

            // Lookup the Scheduler
            Scheduler scheduler = (Scheduler) ctx.lookup("scheduler/scheduler");

            // Create a TaskInfoImpl
            TaskInfoImpl taskInfo = new TaskInfoImpl();
            taskInfo.setName("exampleTask");
            taskInfo.setStartTime(new Date(System.currentTimeMillis() + 60000)); // Schedule task to run in 1 minute

            // Create the task
            scheduler.create(taskInfo);

            System.out.println("Task scheduled successfully.");

        } catch (NamingException e) {
            System.err.println("Error during JNDI lookup: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error scheduling task: " + e.getMessage());
        }
    }
}
