package com.example.atelier2;

import com.example.atelier2.entities.Patient;
import com.example.atelier2.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.awt.print.Pageable;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Atelier2Application implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(Atelier2Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        //Ajouter
        patientRepository.save(new Patient(null,"Oumaima",new Date(),false,45));
        patientRepository.save(new Patient(null,"Ikram",new Date(),false,34));
        patientRepository.save(new Patient(null,"Sohaib",new Date(),false,   23));
        patientRepository.save(new Patient(null,"Ayman",new Date(),false,78));

        //afficher
        System.out.println("affichage des patients 3");
        List<Patient> patients=patientRepository.findAll();
        patients.forEach(p->{
            System.out.println((p.getNom()));
        });
        System.out.println("*************************");

        //chercher
        System.out.println("recherche d'un patient dont lid=1");
        Patient p=patientRepository.findById(1L).orElse(null);
        if(p!=null){
           System.out.println(p.getNom());
        }
        System.out.println("*************************");

        //mettre a j si id existe sinon mettre a j
        p.setScore(2000);
        patientRepository.save(p);
        //supprimer
        patientRepository.deleteById(1L);

        //insertion de 100 patients
        for(int i=0;i<100;i++){
            patientRepository.save(new Patient(null,"rana",new Date(),true,(int)Math.random()));
        }
        //affichage des 5 premiers patients
        System.out.println("Pagination des 5 premier patient");
        Page<Patient> pat=patientRepository.findAll(PageRequest.of(0,5)); //page 0 les 5 patients
        pat.forEach(pt->{
            System.out.println((pt.getNom()));
        });
        System.out.println("*************************");

        //affichage des patients qui ne sont pas malade
        System.out.println("test de la fonction des patients non malade");
        List<Patient> pmalade=patientRepository.findByMalade(false);
        pmalade.forEach(pm->{
            System.out.println((pm.getNom()));
        });
        System.out.println("*************************");

        //pagination de patient malade
        System.out.println("test de la fonction des patients avec pagination des 4 premier");
        Page<Patient> pmaladepage=patientRepository.findByMalade(false, PageRequest.of(0,4));
        pmaladepage.forEach(pmp->{
            System.out.println((pmp.getNom()));
        });
        System.out.println("*************************");

        //patient non malade et dont le score est inferieur a un nombre
        List<Patient> pmaladescore=patientRepository.findByMaladeAndScoreLessThan(false,60);
        pmaladescore.forEach(pms->{
            System.out.println(pms.getScore());
        });
    }
}
