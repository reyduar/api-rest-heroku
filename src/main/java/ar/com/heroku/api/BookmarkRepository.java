package ar.com.heroku.api;

/**
 * @author arielduarte
 * @since 30/10/2016
 */

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bookmarks", path = "bookmarks")
public interface BookmarkRepository extends CrudRepository<Bookmark, String> {

	/**
	 * URL http://localhost:8080/bookmarks/search/findByType?type=Blog
	 * @param type
	 * @return
	 */
	@Query(value = "{ type : ?0 }")
	List<Bookmark> findByType(@Param("type") String type);
	
	/**
	 * URL http://localhost:8080/bookmarks/search/findByAuthor?author=a
	 * @param author
	 * @return
	 */
	@Query("{ author : { $regex : ?0, $options: 'i'}}")
	List<Bookmark> findByAuthor(@Param("author") String author);
	
	/**
	 * URL http://localhost:8080/bookmarks/search/findByName?name=Routing
	 * @param name
	 * @return
	 */
	@Query("{ name : { $regex : ?0, $options: 'i'}}")
	List<Bookmark> findByName(@Param("name") String name);
	
	/**
	 * URL http://localhost:8080/bookmarks/search/findBySearches?name=Routing&type=Blog&author=&page=0&size=1
	 * @param name
	 * @param type
	 * @param author
	 * @param pageRequest
	 * @return
	 */
	@Query("{$or:[ { name : {$regex: ?0 }},{ type : {$regex: ?1 }},{ author : {$regex: ?2 }} ]}")
	Page<Bookmark> findBySearches (@Param("name") String name, @Param("type") String type, @Param("author") String author, Pageable pageRequest);
	
}
