package com.Hospital.management.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.Hospital.management.model.*;


@Repository
public interface PatientMedicineDao extends JpaRepository<PatientMedicines,Long>{
	@Query(" from PatientMedicines where ws_pat_id=:ws_pat_id")
public List<PatientMedicines> findByws_Pat_Id(Long ws_pat_id);
}
