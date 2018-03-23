package model;

import com.opencsv.bean.CsvBindByName;

public class Person {

		 @CsvBindByName (column = "id", required = true)
		 private Integer id;
	
	     @CsvBindByName(column = "first_name", required = true)
	     private String firstName;

	     @CsvBindByName(column = "last_name", required = true)
	     private String lastName;

	     @CsvBindByName(column = "email", required = true)
	     private String email;
	     
	     @CsvBindByName(column = "gender", required = true)
	     private String gender;
	     
	     @CsvBindByName(column = "birth_day", required = true)
	     private String birthDate;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}

}
	     

