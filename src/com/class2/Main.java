package com.class2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoctorManagement doctorManagement = new DoctorManagement();
        int choose;

        do {
            System.out.println("1. Add Doctor  ");
            System.out.println("2. Update Doctor");
            System.out.println("3. Delete Doctor");
            System.out.println("4. Search Doctor");
            System.out.println("5. Exit");

            System.out.println("Choose menu: ");


            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1: {
                   try {
                       doctorManagement.addNewPerson();
                   }catch (Exception e){
                       System.out.println(e.getMessage());
                   }
                }
                break;
                case 2: {
                    try{
                        doctorManagement.updatePersonById();
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                break;
                case 3: {
                    System.out.println("Enter Id:");
                    Integer id=sc.nextInt();
                    doctorManagement.deleteDoctor(id);
                    System.out.println("OK");
                }
                break;
                case 4: {
                    Doctor doctor =  doctorManagement.findDoctorById();
                    if( doctor != null) {
                        System.out.println("Found");
                    } else {
                        System.out.println("Not found");
                    }
                }
                break;
                case 5: {
                    System.out.println("Close application");
                    return;
                }
            }
        } while(true);
    }
}
