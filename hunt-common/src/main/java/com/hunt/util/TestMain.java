package com.hunt.util;

import javax.mail.MessagingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws MessagingException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.put("mail.host", "smtp.163.com");
		prop.put("mail.transport.protocol", "smtp");
		prop.put("mail.smtp.auth", true);
		prop.put("sendHostName","aswuhuaqiang@163.com");
		prop.put("password","whq7402979");
		prop.put("fromMail","aswuhuaqiang@163.com");
		prop.put("toMail","609676374@qq.com");
		MailUtil.sendMail(prop);
	}

}
