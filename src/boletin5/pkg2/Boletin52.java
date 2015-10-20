
package boletin5.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Boletin52 {

    public static void main(String[] args) {
           
            Satelite obx = new Satelite();
    JOptionPane.showMessageDialog(null,"valor meridiano"+obx.getMeridiano()+ "valor paralelo"+obx.getParalelo()+ "valor distanciaTierra" + obx.getDistanciaTierra());
    
            Satelite obx2 = new Satelite(6,8,14);
            obx2.verPosicion();
        
    }
    
}
