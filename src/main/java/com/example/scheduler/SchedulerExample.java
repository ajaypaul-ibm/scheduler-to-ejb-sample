package com.example.scheduler;

import com.ibm.websphere.scheduler.Scheduler;
import com.ibm.websphere.scheduler.MessageTaskInfo;
import com.ibm.websphere.scheduler.TaskInfoInvalid;

import javax.naming.InitialContext;
import java.util.Hashtable;

public class SchedulerExample {
    public static void main(String[] args) {
        try {
            // Step 1: Set up JNDI properties
            Hashtable<String, String> jndiProps = new Hashtable<>();
            jndiProps.put(javax.naming.Context.INITIAL_CONTEXT_FACTORY, "com.ibm.websphere.naming.WsnInitialContextFactory");
            jndiProps.put(javax.naming.Context.PROVIDER_URL, "iiop://localhost:2809"); // Update host and port as needed

            // Create the InitialContext
            InitialContext ctx = new InitialContext(jndiProps);

            // Step 2: Look up the Scheduler instance
            Scheduler scheduler = (Scheduler) ctx.lookup("scheduler/defaultScheduler");
            java.util.Date startDate = new java.util.Date(System.currentTimeMillis() + 30000);

            // Step 3: Create and configure MessageTaskInfo
            MessageTaskInfo taskInfo = (MessageTaskInfo) scheduler.createTaskInfo(MessageTaskInfo.class);
            taskInfo.setConnectionFactoryJndiName("jms/MyQueueConnectionFactory");
            taskInfo.setDestinationJndiName("jms/MyQueue");
            taskInfo.setStartTime(startDate);

            // Step 4: Schedule the task
            scheduler.create(taskInfo);
            System.out.println("JMS Message Task scheduled successfully!");

        } catch (TaskInfoInvalid e) {
            System.err.println("Invalid TaskInfo specified: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error scheduling the task: " + e.getMessage());
            e.printStackTrace();
        }
    }
}