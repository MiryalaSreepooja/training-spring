package participants;

import java.util.*;

public class Trainer {
	private String name;
	ArrayList<Participant> participants=new ArrayList<Participant>();
Trainer(){
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ArrayList<Participant> getParticipants() {
	return participants;
}
public void setParticipants(ArrayList<Participant> participants) {
	this.participants = participants;
}


}
