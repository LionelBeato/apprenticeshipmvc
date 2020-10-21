package com.wozu.mvcapprenticeship;

import com.wozu.mvcapprenticeship.model.Billionaire;
import com.wozu.mvcapprenticeship.repo.BillionaireRepo;
import com.wozu.mvcapprenticeship.service.BillionaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    BillionaireRepo billionaireRepo;
    @Autowired
    BillionaireService billionaireService;

    @Override
    public void run(String... args) throws Exception {
        billionaireService.saveBillionaire("Bruce", "Wayne", "CEO");
        System.out.println("entities added");
    }
}
