
package es.medac.ejdelmartescambmin;

/**
 *
 * @author asier.ruiz
 */
public class EjDelMartesCambMin {

    public static void main(String[] args) {
        int precio = 65; // Precio del producto en céntimos
        int pagado = 100; // Cantidad pagada por el usuario en céntimos
        calcularCambio(precio, pagado);
    }

    private static void calcularCambio(int precio, int pagado) {
        int cambio = pagado - precio;
        int[] monedas = {25,10,5,1}; // denominaciones de monedas en céntimos
        int[] cantidad = new int[monedas.length]; // almacenará cuántas monedas de cada tipo
        
        System.out.println("Cambio total a devolver " + cambio + " céntimos");
        for(int i =0; i<monedas.length; i++) {
            cantidad[i]=cambio/monedas[i]; // división entera
            cambio %= monedas[i];
            System.out.println(cantidad[i]+ " monedas de " + monedas [i] + " céntimos");
        }
    }
}
