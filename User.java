package Jenkins.JenkinsJavaGettingStarted;

public class User {
String Id;
String name;
String LastName;
String location; 
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public User(String id, String name, String lastName) {
	super();
	Id = id;
	this.name = name;
	LastName = lastName;
}



}
