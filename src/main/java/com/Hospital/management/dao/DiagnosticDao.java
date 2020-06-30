package com.Hospital.management.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.Hospital.management.model.*;
@Repository
public interface DiagnosticDao extends JpaRepository<Diagnostics,Long> {
	@Query(" from Diagnostics where ws_diag_name=:name")
	public Diagnostics findByws_Diag_Name(String name);

}
