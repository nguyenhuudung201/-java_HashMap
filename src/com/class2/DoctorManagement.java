package com.class2;

import java.util.HashMap;
import java.util.Scanner;



public class DoctorManagement {
    HashMap<Integer,Doctor> map;
    public DoctorManagement() {
        map = new HashMap<Integer,Doctor>();
    }
    public void addNewPerson() throws Exception {
        Doctor newDoctor= new DoctorList();
        newDoctor.addNewPerson();
        if (map.containsKey(newDoctor.getId())){
            System.out.println("Availability already exist");
        }else {
            System.out.println("Your Availability : "+newDoctor.getId());
            map.put(newDoctor.getId(),newDoctor );
        }
    }
    Doctor findDoctorById() {
        System.out.print("Enter id to find: ");
        Scanner input = new Scanner(System.in);
        int findId = input.nextInt();
        for (Doctor item : map.values()) {
            if (findId == item.getId()) {
                item.displayAll();
                return item;
            }
        }
        return null;
    }
    public void updatePersonById() throws Exception {
        Doctor findPerson = this.findDoctorById();
        if (findPerson != null) {
            findPerson.upDateDoctor();
        } else {
            System.out.println("Not found");
        }
    }
    public void deleteDoctor(Integer id) throws Exception{

        if (map == null) {
            throw new Exception("Database doesn't exist");
        }
        if (!map.containsKey(id)) {
            throw new Exception("Doctor doesn't exist");
        }
        this.map.remove(id).getId();
    }
}
