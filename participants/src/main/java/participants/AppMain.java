package participants;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		Trainer trainer=ctx.getBean(Trainer.class);
		for(Participant p:trainer.getParticipants())
		{
			LunchBox lb=p.getL();
			for(Item item:lb.getI())
			{
				System.out.println(item.getName()+" "+item.getTaste());
			}
		}
	}

}
