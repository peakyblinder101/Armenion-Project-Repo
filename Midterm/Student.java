
public class Student {
	String firstName, middleName, lastName, suffix, fullName;
	  
	  public Student() {}
	  
	  // this is getter
	  public String getFirstName() { return firstName;}
	  
	  public String getMiddleName() { return middleName;}
	  
	  public String getLastName() { return lastName;}
	  
	  public String getSuffix() { return suffix;}
	  
	  public String getFullName() { return firstName + " " + middleName + ". " + lastName + " " + suffix+".";}
	  
	  // this part is setter
	  public void setFirstName(String firstName) { this.firstName = firstName;}
	  
	  public void setMiddleName(String middleName) { this.middleName = middleName;}
	  
	  public void setLastName(String lastName) { this.lastName = lastName;}
	  
	  public void setSuffix(String suffix) { this.suffix = suffix;}
}
