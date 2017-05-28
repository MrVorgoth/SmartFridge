package com.pwr.repository;

import com.pwr.model.ProductBaseEntity;
import com.pwr.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

/**
 * Created by lodwr on 06.05.2017.
 */
public interface ProductBaseRepository extends JpaRepository<ProductBaseEntity, Long> {
  List<ProductBaseEntity> findAllByNameStartingWith(String name);

  @Query("select p from ProductBaseEntity p where LOWER(p.name) LIKE LOWER(CONCAT('%',:pName, '%')) AND p.category.id = :catId")
  public List<ProductBaseEntity> find(@Param("pName") String pName, @Param("catId") String catId);

  @Query("select p from ProductBaseEntity p where LOWER(p.name) LIKE LOWER(CONCAT('%',:pName, '%'))")
  public List<ProductBaseEntity> findByName(@Param("pName") String pName);

  @Query("select p from ProductBaseEntity p where p.category.id = :catId")
  public List<ProductBaseEntity> findByCat(@Param("catId") String catId);

}
