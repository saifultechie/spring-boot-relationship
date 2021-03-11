package springrelationship.simple.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springrelationship.simple.relationship.entity.Post;
@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
}
