package org.example.springfile;
import org.example.model.Coach;
import org.example.model.CricketCoach;
import org.example.model.InternationalCD;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
    	try {

			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			/*
			 * Coach theCoach=context.getBean("theCoach",Coach.class);
			 * System.out.println(theCoach.getDailyworkOut()); Coach
			 * theCoach2=context.getBean("theCoach",Coach.class);
			 * System.out.println(theCoach==theCoach2);
			 * 
			 * 
			 * InternationalCD cd = context.getBean("theCD", InternationalCD.class);
			 * System.out.println(cd.getDetails()); cd.setCdId(101);
			 * cd.setCdName("Godzila"); cd.setLanguage("Russian");
			 * System.out.println(cd.getDetails()); SpecialEditionCD
			 * cd1=context.getBean("theCD1",SpecialEditionCD.class);
			 * System.out.println(cd1.getDetails());
			 */
			Coach tempCoach= context.getBean("theCoach",CricketCoach.class);
			System.out.println(tempCoach.getDailyworkOut());
			System.out.println(tempCoach.getDailyFortune());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			e.printStackTrace();
		}
	}
}


