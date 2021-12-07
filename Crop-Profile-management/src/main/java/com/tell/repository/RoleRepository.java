package com.tell.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;
import com.tell.model.ERole;
import com.tell.model.Role;
public interface RoleRepository extends MongoRepository<Role,String>{
	 Optional<Role> findByName(ERole name);
}




