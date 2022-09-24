package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.w3c.dom.ls.LSOutput;
import servicios.DaoPerson;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
//Autor Johann Escobar Pastrana
public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));   ////IGUAL SALDRA ERROR Y LE DAS AL PRIMERO
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        ///////////ACCESO AL server TODO LO DE ARRIBA///////
        DaoPerson dao = new DaoPerson();
        Scanner leer = new Scanner(System.in);

        /////EXAMEN////

        String opcion = "", nombre, primer_Apellido, segundo_Apellido, sexo, estado_nacimiento, fecha_Nacimiento, curp;
        String estadoNomenclatura = "";

        do {
            System.out.println("----CURP-----");

            System.out.println("1. Registro");
            System.out.println("2. Consultar Datos Personales");
            System.out.println("3. Cerrar Sistema");

            System.out.println("-----Selecciona una opcion-----");
            opcion = leer.next();
            if (isNumber(opcion)) {
                switch (Integer.parseInt(opcion)) {
                    case 1:
                        do {
                            System.out.println("--Registro de Usuario--");

                            System.out.println("Nombre");
                            nombre = leer.next();
                            if (isDouble(nombre) || isNumber(nombre)) {
                                System.out.println("Ingrese un Nombre");
                            }
                        } while (isDouble(nombre) || isNumber(nombre));

                        do {
                            System.out.println("Primer Apellido");
                            primer_Apellido = leer.next();
                            if (isDouble(primer_Apellido) || isNumber(primer_Apellido)) {
                                System.out.println("Ingrese un Apellido");
                            }
                        } while (isDouble(primer_Apellido) || isNumber(primer_Apellido));

                        do {
                            System.out.println("Segundo  Apellido");
                            segundo_Apellido = leer.next();
                            if (isDouble(segundo_Apellido) || isNumber(segundo_Apellido)) {
                                System.out.println("Ingrese un Apellido");
                            }
                        } while (isDouble(segundo_Apellido) || isNumber(segundo_Apellido));

                        do {
                            System.out.println("Sexo");
                            System.out.println("H.- HOMBRE");
                            System.out.println("M.- MUJER");
                            sexo = leer.next();
                            if (isDouble(sexo) || isNumber(sexo)) {
                                System.out.println("Ingrese el Caracter Solicitado(H o M)");
                            }
                        } while (isDouble(sexo)|| isNumber(sexo));

                        do {
                            System.out.println("Estado de Mexico");
                            estado_nacimiento = leer.next();
                            if (isDouble(estado_nacimiento) || isNumber(estado_nacimiento)) {
                                System.out.println("Ingrese un Estado de Mexico");
                            }
                        } while (isDouble(estado_nacimiento) || isNumber(estado_nacimiento));

                        do {
                            System.out.println("Fecha de Nacimiento");
                            fecha_Nacimiento = leer.next();
                            if (isDouble(fecha_Nacimiento) || isNumber(fecha_Nacimiento)) {
                                System.out.println("Ingrese una fecha de Nacimiento");
                            }
                        } while (isDouble(fecha_Nacimiento) || isNumber(fecha_Nacimiento));


                        /////mandar a llamar al metodo "curp" de metodos
                        Object[] CURP = {nombre, primer_Apellido, segundo_Apellido, sexo, estado_nacimiento, fecha_Nacimiento};
                        String response = (String) client.execute("Methods.CURP", CURP);
                        System.out.println(response);

                        ArrayList<String> persona = new ArrayList<String>();

                        persona.add(nombre);
                        persona.add(primer_Apellido);
                        persona.add(segundo_Apellido);
                        persona.add(sexo);
                        persona.add(estado_nacimiento);
                        persona.add(fecha_Nacimiento);
                        persona.add(String.valueOf(CURP));

                        System.out.println(persona);
                       // boolean respuesta = dao.savePerson(persona);

                        break;

                    case 2:

                        System.out.println("Ingrese Su CURP");
                        curp = leer.next();
                        System.out.println(dao.findPerson(curp));
                        break;
                    default:
                        System.out.println("No existe esa opción");
                        break;

                }
            } else {
                System.out.println("opción invalida ");
                System.out.println("Introduzca el Numero Solicitado");
            }

        } while (!opcion.equals("3"));

    }

    public static boolean isNumber(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String number) {
        try {
            Double.parseDouble(number);

            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}



























