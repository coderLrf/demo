//package com.example.config;
//
//import com.xxl.job.core.context.XxlJobHelper;
//import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author lrf
// * @create 2024/3/1
// */
//
////@Configuration
//public class XxlJobConfig {
//    
//    @Value("${xxl.job.admin.addresses}")
//    private String adminAddress;
//
//    @Value("${xxl.job.accessToken}")
//    private String accessToken;
//    
//    @Value("${xxl.job.executor.appname}")
//    private String appName;
//    
//    @Value("${xxl.job.executor.address}")
//    private String address;
//    
//    @Value("${xxl.job.executor.ip}")
//    private String ip;
//    
//    @Value("${xxl.job.executor.port}")
//    private int port;
//    
//    @Value("${xxl.job.executor.logpath}")
//    private String logPath;
//    
//    @Value("${xxl.job.executor.logretentiondays}")
//    private int logRetentionDays;
//    
//    @Bean
//    public XxlJobSpringExecutor xxlJobSpringExecutor() {
//        XxlJobHelper.log(">>>>>>>>>>> xxl-job config init.>>>>>>>>>>>");
//        System.out.println("=============== xxl-job config init.===============");
//
//        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
//        xxlJobSpringExecutor.setAdminAddresses(adminAddress);
//        xxlJobSpringExecutor.setAppname(appName);
//        xxlJobSpringExecutor.setAddress(address);
//        xxlJobSpringExecutor.setIp(ip);
//        xxlJobSpringExecutor.setPort(port);
//        xxlJobSpringExecutor.setAccessToken(accessToken);
//        xxlJobSpringExecutor.setLogPath(logPath);
//        xxlJobSpringExecutor.setLogRetentionDays(logRetentionDays);
//
//        return xxlJobSpringExecutor;
//    }
//
//    public String getAdminAddress() {
//        return adminAddress;
//    }
//
//    public void setAdminAddress(String adminAddress) {
//        this.adminAddress = adminAddress;
//    }
//
//    public String getAccessToken() {
//        return accessToken;
//    }
//
//    public void setAccessToken(String accessToken) {
//        this.accessToken = accessToken;
//    }
//
//    public String getAppName() {
//        return appName;
//    }
//
//    public void setAppName(String appName) {
//        this.appName = appName;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getIp() {
//        return ip;
//    }
//
//    public void setIp(String ip) {
//        this.ip = ip;
//    }
//
//    public int getPort() {
//        return port;
//    }
//
//    public void setPort(int port) {
//        this.port = port;
//    }
//
//    public String getLogPath() {
//        return logPath;
//    }
//
//    public void setLogPath(String logPath) {
//        this.logPath = logPath;
//    }
//
//    public int getLogRetentionDays() {
//        return logRetentionDays;
//    }
//
//    public void setLogRetentionDays(int logRetentionDays) {
//        this.logRetentionDays = logRetentionDays;
//    }
//}
