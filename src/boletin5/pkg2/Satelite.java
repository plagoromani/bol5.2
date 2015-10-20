
package boletin5.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTierra;
    
    public Satelite(){
        meridiano = paralelo = distanciaTierra = 0;
    }
    public Satelite (double m, double p, double d){
        
        meridiano = m;
        paralelo = p;
        distanciaTierra = d;
        
    }
    public double getMeridiano(){
        return meridiano;
    }
    public double getParalelo(){
        return paralelo;
    }
    public double getDistanciaTierra(){
        return distanciaTierra;
    }
    public void verPosicion(){
        
    JOptionPane.showMessageDialog(null,"Satélite atópase paralelo"+ paralelo + "meridiano" + meridiano + "distanciaTierra" + distanciaTierra);    
    }
}
