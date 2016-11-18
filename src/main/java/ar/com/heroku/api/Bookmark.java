package ar.com.heroku.api;

/**
 * @author arielduarte
 * @since 14/11/2016
 * Esta clase se creo para la webapp Bookmarks
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="bookmarks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bookmark {

	@Id
	private String  id;
	private String name;
	private String author;
	private String description;
	private String url;
	private String type;
	private String code;
	private String image;
	private String category;
	private String tags;
	private String createdDT;
}
