package com.functional_interface.data_serialization_for_backup;

public class UserData implements BackupSerializable {
	private String username;
	private String email;
	private int age;

	public UserData(String username, String email, int age) {
		this.username = username;
		this.email = email;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "UserData{" +
				"username='" + username + '\'' +
				", email='" + email + '\'' +
				", age=" + age +
				'}';
	}

}
