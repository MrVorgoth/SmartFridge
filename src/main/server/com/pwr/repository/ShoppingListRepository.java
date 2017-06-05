
package com.pwr.repository;

import com.pwr.model.ProductBaseEntity;
import com.pwr.model.UserShoppingListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * Created by Ania on 04.06.2017.
 */
public interface ShoppingListRepository extends JpaRepository<UserShoppingListEntity, Long> {

    List<UserShoppingListEntity> findAllById(long id);
}
