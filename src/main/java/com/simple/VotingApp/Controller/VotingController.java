package com.simple.VotingApp.Controller;

import com.simple.VotingApp.Entity.Cat;
import com.simple.VotingApp.Entity.Dog;
import com.simple.VotingApp.Services.VotingServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/voting")
public class VotingController {
    @Autowired
    private VotingServicesImpl voteService;

    @PostMapping("/cat")
    public String VoteCat(){
        voteService.VotedCat();
        return "Your Vote has been Registered";
    }
    @PostMapping("/dog")
    public String VoteDog(){
        voteService.VotedDog();
        return "Your Vote has been Registered";
    }

    @GetMapping("/results")
    public String getResult(){
        return voteService.FetchResult();
    }
}
