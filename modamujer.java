import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class modamujer {
    //FUNCION DE OECHSLE

    String [] OPCIONES ={"jeans skinny flerche ==> S/ 119.00","jeans palazo madison==> S/.29.95", "jeans jogger  ==> S/95.00"};
    double [] precio_OPCIONES ={119.00,29.95,95.00};
    double[] subtotal_combos={0,0,0,0,0};
    double igv, subtotal,subtotal0,totalpagar;
    int [] carrito =new int[OPCIONES.length];
    String respuesta;
    Double IGV = 0.18;
    String metodo_pago_seleccionado ;
    int op,cantidad;

    Scanner modamujer= new Scanner(System.in);

    public String oechsle () {

        System.out.println("------jeans-----");
        System.out.println("ESCOJA ENTRE LAS SIGUIENTES OPCIONES:");
        for(int i = 0 ; i<OPCIONES.length ; i++ ){
            System.out.println("Opción "+(i+1)+":"+OPCIONES[i]);
        }
        op = modamujer.nextInt();

        switch (op) {
            case 1:
                jeans();
                break;

            case 2:
                hypnotic();
                break;
            case 3:
                marcas_mujer ();
                break;
        }
        return null;
    }
    // FUNCION DE MARCAS MUJER 1
    public String jeans() {

        System.out.println("BUENA OPCION ");
        System.out.println(OPCIONES[0]);
        System.out.println("LA PRENDA MAS PEDIDA ES ");
        System.out.println("PIJAMA 2 PIEZAS PARA RECEIN NACIDO BABY CIRCUS PANTALON");
        System.out.println("ELIJA EL METODO DE PAGO");
        System.out.println("1. TARJETA");
        System.out.println("2. EFECTIVO");
        op = modamujer.nextInt();

        switch (op) {


            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad= modamujer.nextInt();
                carrito[0]+=cantidad;
                System.out.println("Ud ha pedido "+carrito[0]+" "+OPCIONES[0]);
                System.out.println("¿Desea elegir otra opcion más?  1 SI/ 2 NO / 3 Menu Principal");
                op= modamujer.nextInt();
                modamujer.nextLine();
                if(op==1)
                {
                    System.out.println("Volviendo a la opción moda mujer");
                    this.oechsle();
                }
                else if (op==2){
                    this.PagoMODA();

                }
                else if (op==3){
                    //this.FMENU();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:
                System.out.println("¿Cuantas prendas? Ingrese la cantidad");
                cantidad= modamujer.nextInt();
                carrito[0]+=cantidad;
                System.out.println("Ud ha pedido "+carrito[0]+OPCIONES[0]);
                System.out.println("¿Desea elegir otra opcion más?  1 SI/ 2 NO / 3 Menu Principal");
                op= modamujer.nextInt();
                modamujer.nextLine();
                if(op==1)
                {
                    System.out.println("Volviendo a la opción de combos");
                    this.oechsle();
                }
                else if (op==2){
                    this.PagoMODA();

                }
                else if (op==3){
                    //this.FMENU();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;
        }
        return null;
    }
    // marcas mujer 2
    public String hypnotic() {

        System.out.println(" buena eleccion");
        System.out.println("la mas pedida es :");
        System.out.println("chaleco hypnotic a===> 129.00");
        System.out.println("ELIJA LA OPCIÓN DE METODO DE PAGO");
        System.out.println("1. TARJETA");
        System.out.println("2." + " EFECTIVO ");
        op = modamujer.nextInt();

        switch (op) {

            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad= modamujer.nextInt();
                carrito[0]+=cantidad;
                System.out.println("Ud ha pedido "+carrito[0]+OPCIONES[0]);
                System.out.println("¿Desea elegir otra opcion más?  1 SI/ 2 NO / 3 Menu Principal");
                op= modamujer.nextInt();
                modamujer.nextLine();
                if(op==1)
                {
                    System.out.println("Volviendo ");
                    this.oechsle();
                }
                else if (op==2){
                    this.PagoMODA();

                }
                else if (op==3){
                    //this.FMENU();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;
            case 2:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad= modamujer.nextInt();
                carrito[0]+=cantidad;
                System.out.println("Ud ha pedido "+carrito[0]+OPCIONES[0]);
                System.out.println("¿Desea elegir otra opcion más?  1 SI/ 2 NO / 3 Menu Principal");
                op= modamujer.nextInt();
                modamujer.nextLine();
                if(op==1)
                {
                    System.out.println("Volviendo ");
                    this.oechsle();
                }
                else if (op==2){
                    this.PagoMODA();

                }
                else if (op==3){
                    //this.FMENU();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;
        }
        return null;
    }
    // FUNCION DE ZAPATOS OP 3
    public String marcas_mujer() {

        System.out.println("ELIGIO marcas_mujer");
        System.out.println("EL MAS PEDIDO ES ");
        System.out.println("hypnotic green pit a==> 69.96");
        System.out.println("ELIJA LA OPCIÓN DE METODO DE PAGO");
        System.out.println("1. TARJETA");
        System.out.println("2. EFECTIVO");
        op = modamujer.nextInt();
        switch (op) {
            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad= modamujer.nextInt();
                carrito[0]+=cantidad;
                System.out.println("Ud ha pedido "+carrito[0]+OPCIONES[0]);
                System.out.println("¿Desea elegir otra opcion más?  1 SI/ 2 NO / 3 Menu Principal");
                op= modamujer.nextInt();
                modamujer.nextLine();
                if(op==1)
                {
                    System.out.println("Volviendo ");
                    this.oechsle();
                }
                else if (op==2){
                    this.PagoMODA();

                }
                else if (op==3){
                    //this.FMODA();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;
            case 2:
                double precio_tienda= 24.90;
                double total_pagartienda;
                double IGV = 0.18;
                double factura;
                int cantidad_tienda;

                System.out.println("CUANTAS PRENDAS DESEA LLEVAR");
                cantidad_tienda = modamujer.nextInt();
                total_pagartienda = precio_tienda * cantidad_tienda;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                System.out.println("EL TOTAL ES :");
                factura = total_pagartienda * IGV;
                factura = factura + total_pagartienda ;
                System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                System.out.println("IGV = 18%");
                System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                System.out.println("GRACIAS POR PREFERIRNOS CONTIGO SIEMPRE OECHSLE");
                break;
        }
        return null;
    }

    //EXPORTAR BOLETA
    public String ExportarBoleta() {
        try {
            File archivo = new File("C1:\\boleta.txt");
            FileWriter escritor = new FileWriter(archivo);
            escritor.write("----BOLETA DE VENTA---------");
            escritor.write(" SUBTOTAL :" + subtotal);
            escritor.write(" IGV :" + igv);
            escritor.write(" TOTAL :" + totalpagar);
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al exportar la factura.");
            e.printStackTrace();

        }
        return null;
    }
    // pago MODAS
    public double PagoMODA(){
        double cantidadtotalmenus=Arrays.stream(carrito).sum();


        igv= subtotal0* precio_OPCIONES[1];
        subtotal=subtotal0-igv;
        totalpagar=subtotal+igv;
        System.out.println("----BOLETA DE VENTA---------");
        System.out.println(" SUBTOTAL :"+subtotal);
        System.out.println(" IGV :"+igv);
        System.out.println(" TOTAL :"+totalpagar);
        this.ExportarBoleta();
        return totalpagar;
    }
    public static void main (String[]args){
        modamujer moda = new modamujer();
        moda.oechsle();

    }

}



