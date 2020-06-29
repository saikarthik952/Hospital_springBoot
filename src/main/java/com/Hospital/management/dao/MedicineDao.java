package com.Hospital.management.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.Hospital.management.model.*;
@Repository
public interface MedicineDao extends JpaRepository<Medicines,Long> {
	@Query(" from Medicines where ws_med_name=:name")
	public Medicines findByws_Med_Name(String name);

}
