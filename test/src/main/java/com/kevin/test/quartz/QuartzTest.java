package com.kevin.test.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.text.SimpleDateFormat;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * @Description:QuartzTest测试类
 * @Author: Kevin
 * @Create 2019-11-19 15:13
 */
public class QuartzTest {
    public static void main(String[] args) throws SchedulerException, InterruptedException {
        //        接口类对象：
        //
        //Scheduler：跟任务调度相关的最主要的API接口。
        //Job：你期望任务调度执行的组件定义（调度器执行的内容），都必须实现该接口。
        //Trigger：定义一个指定的Job何时被执行的组件，也叫触发器。
        //用于创建示例的对象：
        //
        //JobDetail：用来定义Job的实例。
        //JobBuilder：用来定义或创建JobDetail的实例，JobDetail限定了只能是Job的实例。
        //TriggerBuilder：用来定义或创建触发器的实例。
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.start();
        System.out.println("定时任务开始执行");
        // 定义job,绑定我们的定时任务
        JobDetail job2 = newJob(HelloJob.class)
                .usingJobData("name", "Kevin")
                .usingJobData("characteristic", "超级帅")
                .build();
        System.out.println("绑定的job完成");
        // 执行任务，用定义好的触发器 和 任务
        scheduler.scheduleJob(job2, getTrigger1());
        Thread.sleep(10000);
        scheduler.shutdown();

    }

    /**
     * 触发器立即触发，然后每隔2秒 触发一次，22:55:00：
     */
    private static Trigger getTrigger1() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("定义的触发器开始运行");
        //定义一个任务触发器
        return newTrigger()
                .withIdentity("job2", "group2")
                //定点触发
                //.startAt(sdf.parse("2018-09-27 10:27:00"))
                // 五秒钟后触发
                .startAt(DateBuilder.futureDate(5, DateBuilder.IntervalUnit.SECOND))
                .withSchedule(simpleSchedule()
                        .withIntervalInSeconds(2)
                        .repeatForever())
                //.withRepeatCount(0))
                .endAt(DateBuilder.dateOf(22, 55, 0))
                .build();
    }


}
