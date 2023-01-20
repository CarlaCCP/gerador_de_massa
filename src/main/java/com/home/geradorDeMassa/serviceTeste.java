package com.home.geradorDeMassa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class serviceTeste {

    @Autowired
    private LorenClient client;

    @Scheduled(fixedRate = 5000)
    public void Teste (){
        System.out.println(client.getLoren().toString());
        System.out.println("TESTANDO SCHEDULED");
    }
}
