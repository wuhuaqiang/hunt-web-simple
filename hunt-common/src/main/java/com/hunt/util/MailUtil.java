package com.hunt.util;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.List;
import java.util.Properties;


public class MailUtil {

    public static void sendMail(Properties mailProp) throws MessagingException {
        /*   Properties prop = new Properties();*/
        //使用java发送邮件5步骤
        //1.创建sesssion
        Session session = Session.getInstance(mailProp);
        //开启session的调试模式，可以查看当前邮件发送状态
        session.setDebug(true);

        //2.通过session获取Transport对象（发送邮件的核心API）
        Transport ts = session.getTransport();

        //3.通过邮件用户名密码链接

        ts.connect(mailProp.getProperty("sendHostName"), mailProp.getProperty("password"));


        //4.创建邮件
        Message msg = createSimpleMail(session, mailProp.getProperty("fromMail"), mailProp.getProperty("toMail"));


        //5.发送电子邮件
        ts.sendMessage(msg, msg.getAllRecipients());

    }

    public static MimeMessage createSimpleMail(Session session, String fromHostName, String toHostName) throws AddressException, MessagingException {
        //创建邮件对象
        MimeMessage mm = new MimeMessage(session);
        //设置发件人
        mm.setFrom(new InternetAddress(fromHostName));
        //设置收件人
        mm.setRecipient(Message.RecipientType.TO, new InternetAddress(toHostName));
        //设置抄送人
        // mm.setRecipient(Message.RecipientType.CC, new InternetAddress("609676384@qq.com"));
        //主题
        mm.setSubject("主题：密码更新！");
        //内容
        mm.setContent("内容：密码已更新去请联系管理员:联系方式QQ：609676374", "text/html;charset=utf-8");

        return mm;
    }


}
