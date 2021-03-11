package springrelationship.simple.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springrelationship.simple.relationship.entity.UserProfile;
@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {
}
