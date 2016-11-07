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

@Document(collection="cities")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {

	@Id
	private String  id;
	private String name;
	private String url;
	private String department;
	private String state;
	private Integer order;
	private String zip;
	private String lat;
	private String lng;
	private String zoom;

}
