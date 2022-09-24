package server;
import java.util.Random;
//Autor Johann Escobar Pastrana
public class Methods {



    public  String CURP(String nombre,String primer_Apellido,String segundo_Apellido,String sexo,String estado_nacimiento,String fecha_Nacimiento) {

        nombre.substring(0,1);
        primer_Apellido.charAt(0);
        segundo_Apellido.charAt(0);
        fecha_Nacimiento.substring(3,4);
        fecha_Nacimiento.substring(5,6);
        fecha_Nacimiento.charAt(7);
        sexo.charAt(0);
        ////CREACION DEL CURP/////////
        String estadoNomenclatura = "";
        if (estado_nacimiento == "Aguascalientes") ;
        {
            estadoNomenclatura = "AS";
        }
                     if (estado_nacimiento == "BajaCalifornia") ;
        {
            estadoNomenclatura = "BC";
        }
                     if (estado_nacimiento == "BajaCaliforniaSur") ;
        {
            estadoNomenclatura = "BS";
        }
                     if (estado_nacimiento == "Campeche") ;
        {
            estadoNomenclatura = "CC";
        }
                     if (estado_nacimiento == "Coahuila") ;
        {
            estadoNomenclatura = "CL";
        }
                     if (estado_nacimiento == "Colima") ;
        {
            estadoNomenclatura = "CM";
        }
                     if (estado_nacimiento == "Chiapas") ;
        {
            estadoNomenclatura = "CS";
        }
                     if (estado_nacimiento == "Chihuahua") ;
        {
            estadoNomenclatura = "CH";
        }
                     if (estado_nacimiento == "DistritoFederal") ;
        {
            estadoNomenclatura = "DF";
        }
                     if (estado_nacimiento == "Durango") ;
        {
            estadoNomenclatura = "DG";
        }
                     if (estado_nacimiento == "Guanajuato") ;
        {
            estadoNomenclatura = "GT";
        }
                     if (estado_nacimiento == "Guerrero") ;
        {
            estadoNomenclatura = "GR";
        }
                     if (estado_nacimiento == "Hidalgo") ;
        {
            estadoNomenclatura = "HG";
        }
                     if (estado_nacimiento == "Jalisco") ;
        {
            estadoNomenclatura = "JC";
        }
                     if (estado_nacimiento == "Mexico") ;
        {
            estadoNomenclatura = "MC";
        }
                     if (estado_nacimiento == "Michoacan") ;
        {
            estadoNomenclatura = "MN";
        }
                     if (estado_nacimiento == "Morelos") ;
        {
            estadoNomenclatura = "MS";
        }
                     if (estado_nacimiento == "Nayarit") ;
        {
            estadoNomenclatura = "NT";
        }
                     if (estado_nacimiento == "NuevoLeon") ;
        {
            estadoNomenclatura = "NL";
        }
                     if (estado_nacimiento == "Oaxaca") ;
        {
            estadoNomenclatura = "OC";
        }
                     if (estado_nacimiento == "Puebla") ;
        {
            estadoNomenclatura = "PL";
        }
                     if (estado_nacimiento == "Queretaro") ;
        {
            estadoNomenclatura = "QT";
        }
                     if (estado_nacimiento == "QuintanaRoo") ;
        {
            estadoNomenclatura = "QR";
        }
                     if (estado_nacimiento == "SanLuisPotosi") ;
        {
            estadoNomenclatura = "SP";
        }
                     if (estado_nacimiento == "Sinaloa") ;
        {
            estadoNomenclatura = "SL";
        }
                     if (estado_nacimiento == "Sonora") ;
        {
            estadoNomenclatura = "SR";
        }
                     if (estado_nacimiento == "Tabasco") ;
        {
            estadoNomenclatura = "TC";
        }
                     if (estado_nacimiento == "Tamaulipas") ;
        {
            estadoNomenclatura = "TS";
        }
                     if (estado_nacimiento == "Tlaxcala") ;
        {
            estadoNomenclatura = "TL";
        }
                     if (estado_nacimiento == "Veracruz") ;
        {
            estadoNomenclatura = "VZ";
        }
                     if (estado_nacimiento == "Yucatan") ;
        {
            estadoNomenclatura = "YN";
        }
                     if (estado_nacimiento == "Zacatecas") ;
        {
            estadoNomenclatura = "ZS";
        }

        int ultimoNumero = (int) Math.random();

        Random random = new Random();
        String setOfCharacters = "qwertyuiopasdfghjklñzxcvbnm";
        int randomInt = random.nextInt(setOfCharacters.length());
        char ultimoCaracter = setOfCharacters.charAt(randomInt);


        String uno =nombre.substring(0,1);
        String dos = String.valueOf(primer_Apellido.charAt(0));
        String tres    = String.valueOf(segundo_Apellido.charAt(0));
        String cuatro  =fecha_Nacimiento.substring(3,4);
        String cinco   =fecha_Nacimiento.substring(5,6);
        String seis = String.valueOf(fecha_Nacimiento.charAt(7));
        String siete  = String.valueOf(sexo.charAt(0));

        String curpGenerado = uno+dos+tres+cuatro+cinco+seis+siete+estadoNomenclatura+ultimoNumero+ultimoCaracter;
       return curpGenerado;
    }

    }










