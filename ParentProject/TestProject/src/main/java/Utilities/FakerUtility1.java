package Utilities;

import com.github.javafaker.Faker;

public class FakerUtility1
{
	
	private Faker faker = new Faker();

    public String getFirstName() {
        return faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }

    public String getAddress() {
        return faker.address().fullAddress();
    }

    public String getId() {
        return faker.idNumber().valid();
    }
    
    public String getEmailId() {
        return faker.name().firstName() + "@gmail.com"; 
       
    }

}
