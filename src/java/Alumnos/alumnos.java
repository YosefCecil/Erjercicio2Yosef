package Alumnos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp_Corei7
 */
public class alumnos 
{
    private String matricula;
    private String nombre;
    private String apellidos;
    private int ddi;
    private int dwi;
    private int ecbd;
    private double prom;
    
   public alumnos()
   {
     matricula=nombre=apellidos="";
     ddi=dwi=ecbd=0;
     prom=0.0;
   }
   
   public alumnos(String matricula, String nombre, String apellidos, int ddi, int dwi, int ecbd)
    {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ddi = ddi;
        this.dwi = dwi;
        this.ecbd = ecbd;
    }
    
    public String getMatricula()
    {
        return matricula;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }


    public int getDDI()
    {
        return ddi;
    }

    public int getDWI()
    {
        return dwi;
    }

    public int getECBD()
    {
        return ecbd;
    }

    public String Promedio(int ddi, int dwi, int ecbd)
    {
        String Promedio;
        prom = (ddi + dwi + ecbd)/3;
        Promedio = String.format("%.2f", prom);

        return Promedio;
    }

}



