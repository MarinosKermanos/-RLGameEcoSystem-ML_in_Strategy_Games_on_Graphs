 package gr.eap.RLGameEcoClient.comm;
//o client stelnei entoles ston server gia apoiadipote ipiresia thelei na zitisei
// All commands will have data that come from the client in serialized JSON format and an execute method that will handle the data accordingly
public abstract class Command extends CommunicationsObject{
	private int id;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}




}
