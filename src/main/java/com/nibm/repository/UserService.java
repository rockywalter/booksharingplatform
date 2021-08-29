package com.nibm.repository;

import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nibm.model.User;
import com.sun.jdi.connect.Transport;

@Service
public class UserService {
	int randomcode;

	@Autowired
	UserRepo userrepo;

	public List<User> findAll() {
		List<User> userlist = userrepo.findAll();
		return userlist;
	}

	public void addOrUpdateUser(User user) {

		userrepo.save(user);

	}

	public User userVerify(User user) {

		User db_user = userrepo.findByEmail(user.getEmail());

		if (db_user != null) {
			if (db_user.getPassword().equals(user.getPassword())) {
				return db_user;

			}

		}

		return null;

	}

	public User findByEmail(User user) {

		if (userrepo.findByEmail(user.getEmail()) != null) {
			return userrepo.findByEmail(user.getEmail());
		}

		return new User();
	}

	public String resetPassword(User user) {

		if (userrepo.findByEmail(user.getEmail()) != null) {
			System.out.println("hit");
			Properties properties = new Properties();
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.starttls.enable", "true");
			properties.put("mail.smtp.host", "smtp.gmail.com");
			properties.put("mail.smtp.port", "587");

			String myEmail = "vishwa.danan@gmail.com";
			String myPassword = "dananjaya123";

			Session session = Session.getInstance(properties, new Authenticator() {

				@Override
				protected PasswordAuthentication getPasswordAuthentication() {

					return new PasswordAuthentication(myEmail, myPassword);
				}
			});

			Message message = prepareMessage(session, myEmail, user.getEmail());
			try {
				javax.mail.Transport.send(message);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return "success";

		} else {
			return "This email is not existing!";
		}

	}

	private Message prepareMessage(Session session, String myEmail, String email) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		randomcode = rand.nextInt(999999);

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(myEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
			message.setSubject("Reset Your Password");
			message.setText(String.valueOf(randomcode));
			return message;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String checkResetCode(String code) {

		if (code.equals(String.valueOf(randomcode))) {
			return "success";
		}
		return "Verification fail!";
	}

}
