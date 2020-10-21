package com.wozu.mvcapprenticeship.repo;

import com.wozu.mvcapprenticeship.model.Billionaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillionaireRepo extends JpaRepository<Billionaire, Integer> {
}
