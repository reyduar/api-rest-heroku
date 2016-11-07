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

@Document(collection="properties")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Property {

	@Id
	private String  id;
	private String owner;
	private String url;
	private Boolean active;
	private String title;
	private String address;
	private String type;
	private String city;
	private Boolean description;
	private Integer rooms;
	private Integer baths;
	private Boolean ac;
	private Boolean heat;
	private Boolean kitchen;
	private Boolean yard;
	private Boolean garage;
	private Boolean pool;
	private Boolean grill;
	private Boolean grillShed;
	private Boolean gatedCommunity;
	private Boolean alarm;
	private Boolean furniture;
	private Boolean warranty;
	private Boolean realState;
	private Double price;
	private String priceCurrency;
	private String properyType;
	private Integer amount;
	private Integer visits;
	private String zip;
	private String lat;
	private String lng;
	private String zoom;
	private String created;
	private String updated;

}
