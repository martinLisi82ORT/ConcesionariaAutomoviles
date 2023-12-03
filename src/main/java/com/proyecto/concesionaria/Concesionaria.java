package com.proyecto.concesionaria;

import com.proyecto.concesionaria.igu.Principal;

public class Concesionaria {
    
    public static void main(String[] args) {
        
        //Llamamos y se hace visible la IGU
        Principal princ = new Principal();        
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
    }
}
