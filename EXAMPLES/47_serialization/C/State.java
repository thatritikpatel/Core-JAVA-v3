import java.io.Serializable;

class State implements Serializable{
	String stateName;

	State(String stateName){
		this.stateName = stateName;
	}
}