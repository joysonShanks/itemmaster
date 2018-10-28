package com.itemmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
/*import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;*/

import com.itemmaster.models.ProductAdditionalCategories;

public interface ProductAdditionalCategoriesRepository extends JpaRepository<ProductAdditionalCategories, Long> {

	/*@Query(value = "SELECT p FROM productadditionalcategories p WHERE p.productBasic.id = :id")
	public ProductAdditionalCategories findByProductBasicId(@Param("id") long id);*/
}
