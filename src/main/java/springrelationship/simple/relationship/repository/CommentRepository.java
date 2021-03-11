package springrelationship.simple.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springrelationship.simple.relationship.entity.Comment;
@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
}
