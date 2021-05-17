package com.xxxx.mail;

import java.util.ArrayList;
import java.util.List;

public class MailTest04 {

    public static void main(String[] args) {
        // 发送HTML内容的邮件
        // testHtmlMail();

        // 发送包含附件的邮件
        testAttachMail();

    }

    /**
     * 发送HTML内容的邮件
     */
    public static void testHtmlMail() {
        MailSendInfo mailSendInfo = new MailSendInfo();
        mailSendInfo.setServerHost("smtp.qq.com");
        mailSendInfo.setServerPort("25");
        mailSendInfo.setUserName("348663490");
        mailSendInfo.setUserPwd("ddsmvcfzkiavbjhf");
        mailSendInfo.setSubject("邮件封装");
        mailSendInfo.setFromAddress("348663490@qq.com");
        mailSendInfo.setContent("<h2>这是封装后发送的邮件</h2>");
        List<String> users = new ArrayList<>();
        users.add("348663490@qq.com");
        mailSendInfo.setToAddrsss(users);
        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailSendInfo);
    }


    /**
     * 发送包含附件的邮件
     */
    public static void testAttachMail() {
        MailSendInfo mailSendInfo = new MailSendInfo();
        mailSendInfo.setServerHost("smtp.qq.com");
        mailSendInfo.setServerPort("25");
        mailSendInfo.setUserName("348663490");
        mailSendInfo.setUserPwd("ddsmvcfzkiavbjhf");
        mailSendInfo.setSubject("邮件封装");
        mailSendInfo.setFromAddress("348663490@qq.com");
        mailSendInfo.setContent("<h2>包含附件的邮件</h2>");
        List<String> users = new ArrayList<>();
        users.add("348663490@qq.com");
        mailSendInfo.setToAddrsss(users);

        // 添加附件
        List<String> files=new ArrayList<String>();
        files.add("F:\\mailtest\\软件产品报表.docx");
        files.add("F:\\mailtest\\temp.txt");
        mailSendInfo.setAttachFileNames(files);
        MailSender mailSender=new MailSender();
        mailSender.sendMail(mailSendInfo);
    }
}
