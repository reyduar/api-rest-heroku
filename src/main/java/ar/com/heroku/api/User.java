package ar.com.heroku.api;

/**
 * @author arielduarte
 * @since 30/10/2016
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	private String  id;
	private String firsName;
	private String lastName;
	private String emailAddress;
	private String phone;
	private String country;
	private String province;
	private String city;
	private int role;
	private String password;

}
