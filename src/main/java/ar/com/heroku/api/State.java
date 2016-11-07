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

@Document(collection="states")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class State {

	@Id
	private String  id;
	private String name;

}
