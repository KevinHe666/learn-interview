package com.kevin.test.quartz;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Description: 你期望任务调度执行的组件定义（调度器执行的内容），都必须实现该接口。
 * @Author: Kevin
 * @Create 2019-11-19 15:27
 */
public class HelloJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        String name = jobDataMap.get("name").toString();
        String characteristic = jobDataMap.get("characteristic").toString();
        System.out.println("name : " + name);
        System.out.println("characteristic : " + characteristic);
    }
}
