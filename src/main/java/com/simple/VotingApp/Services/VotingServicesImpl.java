package com.simple.VotingApp.Services;

import com.simple.VotingApp.Entity.Cat;
import com.simple.VotingApp.Entity.Dog;
import com.simple.VotingApp.Repo.ICatRepo;
import com.simple.VotingApp.Repo.IDogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotingServicesImpl implements IVotingService {

    @Autowired
    private ICatRepo catRepo;
    @Autowired
    private IDogRepo dogRepo;
    @Override
    public void VotedCat() {

        Cat cat = new Cat(1);
        catRepo.save(cat);

    }

    @Override
    public void VotedDog() {
        Dog dog = new Dog(1);
        dogRepo.save(dog);

    }

    @Override
    public String FetchResult() {
        Integer countDog = Math.toIntExact(dogRepo.findAll().stream().count());
        Integer countCat = Math.toIntExact(catRepo.findAll().stream().count());

        if( countCat > countDog)
            return "Cat has more votes!!";
        else if( countCat < countDog)
            return "Dog has more votes!!";
        return "It's a draw!!";
    }
}
