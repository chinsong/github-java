package userdaotest;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import springbook.user.dao.UserDao;
import springbook.user.domain.User;


public class UserDaoTest {
	@Test
	public void addAndGet() throws SQLException{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml",UserDao.class);
		
		UserDao dao = context.getBean("userDao",UserDao.class);
		User user = new User();
<<<<<<< HEAD
		user.setId("gyunmeefff");
=======
		user.setId("gyunmeeaaaaa");
>>>>>>> d1f0c16125d0784c4808a4e83dd2f25d8bfbce94
		user.setName("PARK");
		user.setPassword("springno1");
		
		try {
			dao.add(user);
			
			User user2 = dao.get(user.getId());
			
			assertThat(user2.getName(),is(user.getName()));
			
			assertThat(user2.getPassword(),is(user.getPassword()));
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
