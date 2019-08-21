package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("name.properties")
public class EmpApp{
	@Autowired
private EmpDao empApp;
@Value("${name}")
String name;
public void registerEmp() {
	empApp.save(name);
	
}


}