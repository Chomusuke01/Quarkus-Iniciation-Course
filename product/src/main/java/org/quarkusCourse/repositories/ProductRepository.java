package org.quarkusCourse.repositories;

import org.quarkusCourse.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
