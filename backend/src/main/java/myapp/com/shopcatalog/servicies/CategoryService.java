package myapp.com.shopcatalog.servicies;

import myapp.com.shopcatalog.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myapp.com.shopcatalog.repositories.CategoryRepository;

import java.util.List;

@Service //Registra essa classe como componente que vai participar da injeção de independencia.
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

}
