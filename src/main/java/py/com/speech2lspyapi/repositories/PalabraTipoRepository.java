package py.com.speech2lspyapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.com.speech2lspyapi.models.PalabraTipo;

@RepositoryRestResource
public interface PalabraTipoRepository extends CrudRepository<PalabraTipo, Long>{

}
