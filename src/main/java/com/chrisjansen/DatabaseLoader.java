package com.chrisjansen;

import com.chrisjansen.domain.GenericAssumption;
import com.chrisjansen.repository.GenericAssumptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by A426156 on 4/24/2017.
 */
@Component
public class DatabaseLoader implements CommandLineRunner{

    private final GenericAssumptionRepository repository;

    @Autowired
    public DatabaseLoader(GenericAssumptionRepository genericAssumptionRepository){
        this.repository=genericAssumptionRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        //create 2 test records!
        this.repository.save(new GenericAssumption("sourceSys1", "prodType1"));
        this.repository.save(new GenericAssumption("sourceSys2", "prodType2"));
    }
}
