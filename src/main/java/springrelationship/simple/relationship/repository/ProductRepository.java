package springrelationship.simple.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springrelationship.simple.relationship.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
