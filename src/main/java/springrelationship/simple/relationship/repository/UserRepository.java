package springrelationship.simple.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springrelationship.simple.relationship.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
