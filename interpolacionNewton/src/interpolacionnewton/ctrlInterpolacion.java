package interpolacionnewton;

import javax.swing.table.DefaultTableModel;

public class ctrlInterpolacion {
    
    double datos[][] = new double[4][2];
    
    public void pasarDatos() {
        
        DefaultTableModel model = (DefaultTableModel) frmNewton.tablaDatos.getModel();
        model.getColumnCount(); //columnas 2
        model.getRowCount(); //filas 4
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                datos[i][j] = Double.parseDouble((String)frmNewton.tablaDatos.getValueAt(i, j));
            }
        }
        
         for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                System.out.print(i +" " + j + " " + datos[i][j] + " " );
            }
             System.out.println();
        }
    }
    
    public void calcular(){
        
        double Fp1 = (datos[1][1] - datos[0][1])/(datos[1][0]-datos[0][0]);
        double Fp2 = (datos[2][1] - datos[1][1])/(datos[2][0]-datos[1][0]);
        double Fp3 = (datos[3][1] - datos[2][1])/(datos[3][0]-datos[2][0]);
        
        double Fs1 = (Fp2 - Fp1)/(datos[2][0]-datos[0][0]);
        double Fs2 = (Fp3 - Fp2)/(datos[3][0]-datos[1][0]);
        
        double Ft1 = (Fs2- Fs1)/(datos[3][0]-datos[0][0]);
        
       frmNewton.lblFp1.setText(String.valueOf(String.format("%.2f", Fp1)));
       frmNewton.lblFp2.setText(String.valueOf(String.format("%.2f", Fp2)));
       frmNewton.lblFp3.setText(String.valueOf(String.format("%.2f", Fp3)));
       
       frmNewton.lblFs1.setText(String.valueOf(String.format("%.2f", Fs1)));
       frmNewton.lblFs2.setText(String.valueOf(String.format("%.2f", Fs2)));
       
       frmNewton.lblFt1.setText(String.valueOf(String.format("%.2f", Ft1)));
        

    }

}
