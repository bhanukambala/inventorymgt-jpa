package com.dxctraining.supplier.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dxctraining.supplier.entities.Supplier;

public interface ISupplierDao extends JpaRepository<Supplier, String>{
	
		List<Supplier> findByName(String name);
}
