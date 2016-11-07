package ar.com.heroku.api;

/**
 * @author arielduarte
 * @since 30/10/2016
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "states", path = "states")
public interface StateRepository extends CrudRepository<State, String> {


}
