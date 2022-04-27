package myapp.com.shopcatalog.repositories;

import myapp.com.shopcatalog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Registra essa classe como um repository.
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
