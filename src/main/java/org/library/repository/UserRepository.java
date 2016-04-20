package org.library.repository;

import org.library.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * @author ilebedyuk
 */
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface  UserRepository extends MongoRepository<User, String> {

    @RestResource(path = "byUser", rel = "byUser")
    User findByFirstname(@Param("user") String firstname);
}
