package basesetup;

public class UserDetails {
	public String nickname;
	public String contact;
	public String company;
	public String city;
	public String country;
	public String type;
	
	 public UserDetails (String nickname,String contact, String company,String city,String country,String type) {
		 this.nickname = nickname;
		 this.contact = contact;
		 this.company = company;
		 this.city = city;
		 this.country = country;
		 this.type = type;
	}
	 
	 public String getNickName() {
	        return nickname;
	  }
	 public String getContact() {
	        return contact;
	  }
	 public String getCompany() {
	        return company;
	  }
	 public String getCity() {
	        return city;
	  }
	 public String getCountry() {
	        return country;
	  }
	 public String getType() {
	        return type;
	  }
}
