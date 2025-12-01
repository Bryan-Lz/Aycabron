
package UNIDAD_4;

/**
 *
 * @author lpmmc
 */
import javax.swing.JOptionPane;
public class P1 {
    public static void main(String[] args) {
        double c1, c2, c3, prom;
        
        c1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la primera calificacion: "));
        c2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la segunda calificacion: "));
        c3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la tercer calificacion: "));
        prom = (c1+c2+c3)/3;
        
        if(prom>70){
            JOptionPane.showMessageDialog(null,"APROBADO: "+prom);
        }else{
            JOptionPane.showMessageDialog(null,"REPROBADO: "+prom);
        }
    }
}
