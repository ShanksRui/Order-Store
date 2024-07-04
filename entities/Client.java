package entities;

import java.time.LocalDate;

public class Client {

	private String clientName;
	private String email;
	private LocalDate birthDate;
	
	public Client () {
	
	}
	public Client(String clientName, String email, LocalDate birthDate) {
		this.clientName = clientName;
		this.email = email;
		this.birthDate = birthDate;
	
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	@Override
    public String toString() {
        return "Name: " + clientName + ", Email: " + email + ", Birth Date: " + birthDate;
	}
}
