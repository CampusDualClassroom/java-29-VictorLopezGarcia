package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args){
        try {
            throw new Exception("Excepción lanzada desde main");
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
