package com.class2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DoctorList extends Doctor {

    @Override
    public void addNewPerson() throws Exception{

        Scanner input = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d{6}");
        try {

            System.out.print("Enter name: ");
            String name = input.nextLine();

            if(name.equals("")) {
                throw new Exception("Name  can not be empty");
            }
            this.name=name;
            System.out.print("Enter code: ");
            String code = input.nextLine();
            if(code.equals("")) {
                throw new Exception("Code can not be empty");
            }
            if(code.length() != 5) {
                throw new Exception("Code must be 5 characters");
            }
            this.Code = code;
            System.out.print("Enter Specialization: ");
            String Specialization = input.nextLine();
            if(Specialization.equals("")) {
                throw new Exception("Specializationcan not be empty");
            }
            if(!Specialization.startsWith("100")) {
                throw new Exception("Specialization must be start with 100");
            } Matcher matcher = pattern.matcher(Specialization );
            if(!matcher.matches()) {
                throw new Exception("Specialization must be 6 digits");
            }
            this.Specialization = Specialization;

            System.out.print("Enter Availability: ");
            String availability=input.nextLine();

            if (availability == null)
                throw new Exception("Please input availability");
            if (Integer.parseInt(availability) < 0) {
                    throw new Exception("Availability is greater than equal zero");
                }
            this.Availability= Integer.parseInt(availability);

        }
        catch (NumberFormatException e){
            throw new Exception("NumberFormatException occurred");
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void upDateDoctor() throws Exception {
        Scanner input = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d{6}");
        try {

            System.out.print("Enter name new : ");
            String name = input.nextLine();

            if(name.equals("")) {
                throw new Exception("Name  can not be empty");
            }
            this.name=name;
            System.out.print("Enter code new : ");
            String code = input.nextLine();
            if(code.equals("")) {
                throw new Exception("Code can not be empty");
            }
            if(code.length() != 5) {
                throw new Exception("Code must be 5 characters");
            }
            this.Code = code;
            System.out.print("Enter Specialization new : ");
            String Specialization = input.nextLine();
            if(Specialization.equals("")) {
                throw new Exception("Specializationcan not be empty");
            }
            if(!Specialization.startsWith("100")) {
                throw new Exception("Specialization must be start with 100");
            } Matcher matcher = pattern.matcher(Specialization );
            if(!matcher.matches()) {
                throw new Exception("Specialization must be 6 digits");
            }
            this.Specialization = Specialization;

            System.out.print("Enter Availability new : ");
            String availability=input.nextLine();
            if (availability == null)
                throw new Exception("Please input availability");
            if (Integer.parseInt(availability) < 0) {
                throw new Exception("Availability is greater than equal zero");
            }
            this.Availability= Integer.parseInt(availability);

        }
        catch (NumberFormatException e){
            throw new Exception("NumberFormatException occurred");
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void displayAll() {
        System.out.println("Doctor name: " + this.name);
        System.out.println("Doctor code: " + this.Code);
        System.out.println("Doctor Specialization:  " + this.Specialization);
        System.out.println("Doctor ID:  " + this.Availability);

    }
}
