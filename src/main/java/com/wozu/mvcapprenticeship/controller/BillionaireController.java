package com.wozu.mvcapprenticeship.controller;

import com.wozu.mvcapprenticeship.model.Billionaire;
import com.wozu.mvcapprenticeship.service.BillionaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillionaireController {

    @Autowired
    BillionaireService billionaireService;

    @PostMapping("/postbruce")
    public void postBruce(){
        billionaireService.saveBillionaire("Bruce", "Wayne", "CEO");
    }

    @GetMapping("/getall")
    public List<Billionaire> getBruce(){
        return billionaireService.getAllBillionaire();
    }

}
