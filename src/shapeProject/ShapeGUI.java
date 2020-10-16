
package shapeProject;
import BreezySwing.*;
import TurtleGraphics.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class ShapeGUI extends javax.swing.JFrame {
StandardPen p;
Shape s;
//int shape = 1; //1 = circle/wheel, 2 = rect, 2 = triangle
    public ShapeGUI() {
        initComponents();
        SketchPadWindow w = new SketchPadWindow(400,400);
        w.setLocation(15,275); //200.200
        p = new StandardPen(w);
        s = new Circle(0,0,0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        circlebtn = new javax.swing.JButton();
        wheelbtn = new javax.swing.JButton();
        rectbtn = new javax.swing.JButton();
        trianglebtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        movebtn = new javax.swing.JButton();
        resizebtn = new javax.swing.JButton();
        quitbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtinfo = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Shape Maker 2.0");

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select a Shape");
        jLabel1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        circlebtn.setBackground(new java.awt.Color(204, 255, 255));
        circlebtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        circlebtn.setText("Circle");
        circlebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circlebtnActionPerformed(evt);
            }
        });

        wheelbtn.setBackground(new java.awt.Color(204, 255, 255));
        wheelbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        wheelbtn.setText("Wheel");
        wheelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheelbtnActionPerformed(evt);
            }
        });

        rectbtn.setBackground(new java.awt.Color(204, 255, 255));
        rectbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rectbtn.setText("Rectangle");
        rectbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectbtnActionPerformed(evt);
            }
        });

        trianglebtn.setBackground(new java.awt.Color(204, 255, 255));
        trianglebtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        trianglebtn.setText("Triangle");
        trianglebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trianglebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(circlebtn)
                .addGap(18, 18, 18)
                .addComponent(wheelbtn)
                .addGap(18, 18, 18)
                .addComponent(rectbtn)
                .addGap(18, 18, 18)
                .addComponent(trianglebtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {circlebtn, rectbtn, trianglebtn, wheelbtn});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(circlebtn)
                    .addComponent(wheelbtn)
                    .addComponent(rectbtn)
                    .addComponent(trianglebtn))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        movebtn.setBackground(new java.awt.Color(204, 255, 255));
        movebtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        movebtn.setText("Move");
        movebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movebtnActionPerformed(evt);
            }
        });

        resizebtn.setBackground(new java.awt.Color(204, 255, 255));
        resizebtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        resizebtn.setText("Resize");
        resizebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizebtnActionPerformed(evt);
            }
        });

        quitbtn.setBackground(new java.awt.Color(204, 255, 255));
        quitbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        quitbtn.setText("Quit");
        quitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movebtn)
                    .addComponent(quitbtn)
                    .addComponent(resizebtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {movebtn, quitbtn, resizebtn});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(movebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resizebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quitbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {movebtn, quitbtn, resizebtn});

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Options");
        jLabel2.setOpaque(true);

        txtinfo.setColumns(20);
        txtinfo.setRows(5);
        jScrollPane1.setViewportView(txtinfo);

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Shape Details");
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitbtnActionPerformed
        System.exit(0); //shuts down program
    }//GEN-LAST:event_quitbtnActionPerformed

    private void circlebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circlebtnActionPerformed
        erase();
        s = new Circle(0,0,50);
        //shape = 1;
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_circlebtnActionPerformed

    private void movebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movebtnActionPerformed
        double x = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new x: ", "0"));
        double y = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new y: ", "0"));
        erase();
        s.move(x,y);
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_movebtnActionPerformed

    private void wheelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheelbtnActionPerformed
        erase();
        s = new Wheel(0,0,50,10);
        //shape = 1;
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_wheelbtnActionPerformed

    private void rectbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectbtnActionPerformed
        erase();
        s = new Rect(0,0,50,80);
        //shape = 2;
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_rectbtnActionPerformed

    private void trianglebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trianglebtnActionPerformed
        erase();
        s = new Rect(0,0,50,80); //change to triangle
        //shape = 3;
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_trianglebtnActionPerformed

    private void resizebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizebtnActionPerformed
        erase();
        double r = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new size: ", "0"));
        s.stretchBy(r);
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_resizebtnActionPerformed

    private void erase(){
        p.setColor(Color.white);
        s.draw(p);
        p.setColor(Color.blue);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton circlebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton movebtn;
    private javax.swing.JButton quitbtn;
    private javax.swing.JButton rectbtn;
    private javax.swing.JButton resizebtn;
    private javax.swing.JButton trianglebtn;
    private javax.swing.JTextArea txtinfo;
    private javax.swing.JButton wheelbtn;
    // End of variables declaration//GEN-END:variables
}
