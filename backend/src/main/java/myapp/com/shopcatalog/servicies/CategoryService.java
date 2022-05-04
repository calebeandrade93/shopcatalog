package myapp.com.shopcatalog.servicies;

import myapp.com.shopcatalog.dto.CategoryDTO;
import myapp.com.shopcatalog.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myapp.com.shopcatalog.repositories.CategoryRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service //Registra essa classe como componente que vai participar da injeção de independencia.
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional (readOnly = true)
    public List<CategoryDTO> findAll() {
        //Necessário criar uma lista Category porque o repository só trabalha com entidade.
        //Após criar a lista, instanciar a lista de CategoryDTO, e depois percorrer a list para passar para o listDto.
        List<Category> list = repository.findAll();
        List<CategoryDTO> listDto = list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
        return listDto;
    }

}
