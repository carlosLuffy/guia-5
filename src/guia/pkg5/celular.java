/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos o milton
 */
public class celular extends javax.swing.JFrame {
    public void pantalla(){
        double validar;
        if(!pantalla.getText().equals("")){
            validar=Double.parseDouble(pantalla.getText());
            if(validar>3 || validar <6.7){
                pantalla.setEditable(false);
            }
        }
        else{
            if(cpu.getText().equals("")){
                JOptionPane.showMessageDialog(null, "ingrese el numero de nucleos");
                cpu.requestFocus();
            }
            else {
               Double validar1;
               validar1=Double.parseDouble(cpu.getText());
               if(validar1>0 && validar1<13){
                   pantalla.setEditable(true);
                   pantalla.requestFocus();
               }
               else{
                     JOptionPane.showMessageDialog(null, "el numero de nucleos solo puede estar entre uno y doce");
                     cpu.setText("");
                     cpu.requestFocus();
                     
               }
            }
        }
    }
    public void ram(){
        double validar;
        if(!ram.getText().equals("")){
            validar=Double.parseDouble(pantalla.getText());
            if(validar>=0.5 && validar <=6){
                ram.setEditable(false);
            }
        }
        else{
            if(pantalla.getText().equals("")){
                JOptionPane.showMessageDialog(null, "ingrese el tamaño de la pantalla");
                pantalla.requestFocus();
            }
            else {
               Double validar1;
               validar1=Double.parseDouble(pantalla.getText());
               if(validar1>=3 && validar1<=6.7){
                   ram.setEditable(true);
                   ram.requestFocus();
               }
               else{
                     JOptionPane.showMessageDialog(null, " tamaño de pantalla invalido");
                     pantalla.setText("");
                     pantalla.requestFocus();
                     
               }
            }
        }
    }
    public void garantia(){
        double validar;
        if(!garantia.getText().equals("")){
            validar=Double.parseDouble(garantia.getText());
            if(validar >=1 || validar <=24){
                garantia.setEditable(false);
            }
        }
        else{
            if(ram.getText().equals("")){
                JOptionPane.showMessageDialog(null, "ingrese la cantidad de RAM");
                ram.requestFocus();
            }
            else {
               Double validar1;
               validar1=Double.parseDouble(ram.getText());
               if(validar1>=0.5 && validar1<=6){
                   garantia.setEditable(true);
                   garantia.requestFocus();
               }
               else{
                     JOptionPane.showMessageDialog(null, "cantidad de RAM invalida");
                     ram.setText("");
                     ram.requestFocus();
                     
               }
            }
        }
    }
    public void precio(){
        double validar;
        if(!precio.getText().equals("")){
            validar=Double.parseDouble(precio.getText());
            if(validar>0.01 || validar <999.99){
                precio.setEditable(false);
            }
        }
        else{
            if(garantia.getText().equals("")){
                JOptionPane.showMessageDialog(null, "¿cuantos años de garantia?");
                garantia.requestFocus();
            }
            else {
               Double validar1;
               validar1=Double.parseDouble(garantia.getText());
               if(validar1>=1 && validar1<=24){
                   precio.setEditable(true);
                   precio.requestFocus();
               }
               else{
                     JOptionPane.showMessageDialog(null, "la garantia debe estar entre 1 y 24 años");
                     garantia.setText("");
                     garantia.requestFocus();
                     
               }
            }
        }
    }
    
    public void pantalla_enter(){
        if(pantalla.getText().equals("")){
            JOptionPane.showMessageDialog(null, "ingrese el tamaño de la pantalla");
            pantalla.requestFocus();
        }
        else{
           double validar;
           validar=Double.parseDouble(pantalla.getText());
           if(validar>=3 && validar <=6.7){
               ram.setEditable(true);
               ram.requestFocus();
           }
           else{
               JOptionPane.showMessageDialog(null, "tamaño de pantalla invalido"); 
               pantalla.setText("");
               pantalla.requestFocus();
           }
        }
    }
    public void ram_enter(){
        if(ram.getText().equals("")){
            JOptionPane.showMessageDialog(null, "ingrese la cantidad de RAM");
            ram.requestFocus();
        }
        else{
           double validar;
           validar=Double.parseDouble(ram.getText());
           if(validar>=0.5 && validar <=6){
               garantia.setEditable(true);
               garantia.requestFocus();
           }
           else{
               JOptionPane.showMessageDialog(null, "cantidad de RAM invalida"); 
               ram.setText("");
               ram.requestFocus();
           }
        }
    }
    public void garantia_enter(){
        if(garantia.getText().equals("")){
            JOptionPane.showMessageDialog(null, "¿cuantos años de garantia?");
            garantia.requestFocus();
        }
        else{
           double validar;
           validar=Double.parseDouble(garantia.getText());
           if(validar>=1 && validar <=24){
               precio.setEditable(true);
               precio.requestFocus();
           }
           else{
               JOptionPane.showMessageDialog(null, "el tiempo de garantia no puede ser menor que 1 o mayor que 24"); 
               garantia.setText("");
               garantia.requestFocus();
           }
        }
    }
    public void precio_enter(){
        if(precio.getText().equals("")){
            JOptionPane.showMessageDialog(null, "ingrese el precio");
            precio.requestFocus();
        }
        else{
           double validar;
           validar=Double.parseDouble(precio.getText());
           if(validar>=0.01 && validar <=999.99){
               marcas.setEnabled(true);
               marcas.requestFocus();
           }
           else{
               JOptionPane.showMessageDialog(null, "ha ingresado un precio invalido"); 
               precio.setText("");
               precio.requestFocus();
           }
        }
    }
    
    /**
     * Creates new form celular
     */
    public celular() {
        initComponents();
        this.setLocationRelativeTo(null);
        pantalla.setEditable(false);
        ram.setEditable(false);
        garantia.setEditable(false);
        precio.setEditable(false);
        marcas.setEnabled(false);
        //principal.setEnabled(false);
        //secundaria.setEnabled(false);
        //flash.setEnabled(false);
        pixelesPrincipal.setEnabled(false);
        pixelesSecundarios.setEnabled(false);
        //ejecutar.setEnabled(false);
        mostrar.setEditable(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cpu = new javax.swing.JTextField();
        pantalla = new javax.swing.JTextField();
        ram = new javax.swing.JTextField();
        garantia = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        marcas = new javax.swing.JComboBox<>();
        principal = new javax.swing.JCheckBox();
        secundaria = new javax.swing.JCheckBox();
        flash = new javax.swing.JCheckBox();
        pixelesPrincipal = new javax.swing.JTextField();
        pixelesSecundarios = new javax.swing.JTextField();
        ejecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Cpu numero de nucleos");

        jLabel3.setText("tamaño de pantalla");

        jLabel4.setText("cantidad de RAM");

        jLabel5.setText("Tiempo de garantia");

        jLabel6.setText("precio");

        jLabel7.setText("marca");

        jLabel8.setText("camara");

        cpu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpuMouseClicked(evt);
            }
        });
        cpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpuActionPerformed(evt);
            }
        });
        cpu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpuKeyTyped(evt);
            }
        });

        pantalla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pantallaMouseClicked(evt);
            }
        });
        pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaActionPerformed(evt);
            }
        });
        pantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pantallaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pantallaKeyTyped(evt);
            }
        });

        ram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ramMouseClicked(evt);
            }
        });
        ram.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ramKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ramKeyTyped(evt);
            }
        });

        garantia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                garantiaMouseClicked(evt);
            }
        });
        garantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                garantiaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                garantiaKeyTyped(evt);
            }
        });

        precio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                precioMouseClicked(evt);
            }
        });
        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioKeyTyped(evt);
            }
        });

        marcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una marca", "NEXUS", "PIXIE", "LENOVO", "HUAWEI", "SONY", "APPLE", "SAMSUNG", "ALCATEL", "LG", " " }));
        marcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marcasMouseClicked(evt);
            }
        });
        marcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcasActionPerformed(evt);
            }
        });

        principal.setText("principal");
        principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principalMouseClicked(evt);
            }
        });

        secundaria.setText("secundaria");
        secundaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secundariaMouseClicked(evt);
            }
        });

        flash.setText("flash");
        flash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flashMouseClicked(evt);
            }
        });

        ejecutar.setText("ejecutar");
        ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarActionPerformed(evt);
            }
        });

        mostrar.setColumns(20);
        mostrar.setRows(5);
        jScrollPane1.setViewportView(mostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(marcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cpu)
                                .addComponent(pantalla)
                                .addComponent(ram)
                                .addComponent(garantia)
                                .addComponent(precio, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pixelesPrincipal))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(secundaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pixelesSecundarios))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(flash))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(ejecutar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(garantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(marcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(principal)
                    .addComponent(secundaria)
                    .addComponent(flash))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pixelesPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pixelesSecundarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(ejecutar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpuActionPerformed
        // TODO add your handling code here:
            
    }//GEN-LAST:event_cpuActionPerformed

    private void marcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcasActionPerformed

    private void cpuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpuKeyTyped
    int numeroCaracteres=1;
    if (cpu.getText().length()>numeroCaracteres){
        evt.consume();
        getToolkit().beep();
    }
    char validar=evt.getKeyChar();
    if((validar<'0' || validar>'9')) {
        getToolkit().beep();
        evt.consume();
    }
    }//GEN-LAST:event_cpuKeyTyped

    private void cpuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpuKeyPressed
        // TODO add your handling code here:
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                double validar=0;
        if(!cpu.getText().equals("")){
            validar=Double.parseDouble(cpu.getText());
            if((validar>0 && validar<13)){
              pantalla.setEditable(true);
              //cpu.setEditable(false);
              pantalla.requestFocus();
            }
            
            else{
                  JOptionPane.showMessageDialog(null, "el numero de nucleos solo puede estar entre uno y doce");
                cpu.requestFocus();
                cpu.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "debe ingresar el numero de nucleos");
        }
      }   
    }//GEN-LAST:event_cpuKeyPressed

    private void pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_pantallaActionPerformed

    private void pantallaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pantallaKeyPressed
        // TODO add your handling code here:
       if(evt.getKeyCode()== KeyEvent.VK_ENTER){
           pantalla_enter();
       }
       
       /*    pantalla();
                 double validar=0;
        if(!pantalla.getText().equals("")){
            validar=Double.parseDouble(pantalla.getText());
            if((validar<3 || validar>6.7)){
                JOptionPane.showMessageDialog(null, "tamaño de pantalla invalido");
                pantalla.requestFocus();
                pantalla.setText("");
            }
            
            else{
                ram.setEditable(true);
                pantalla.setEditable(false);
                ram.requestFocus();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "ingrese el tamaño de la pantalla");
            
        }
       }*/
           
    }//GEN-LAST:event_pantallaKeyPressed

    private void pantallaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pantallaMouseClicked
        // TODO add your handling code here:
        pantalla();    
    }//GEN-LAST:event_pantallaMouseClicked

    private void cpuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpuMouseClicked
        // TODO add your handling code here:
        if(cpu.getText().equals("")){
            
        }
        else{
            double validar;
            validar=Double.parseDouble(cpu.getText());
            if(validar<=0 || validar>=13){
                
            }
            else{
                cpu.setEditable(false);
            }
        }
    }//GEN-LAST:event_cpuMouseClicked

    private void ramKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ramKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            ram_enter();
        }
    }//GEN-LAST:event_ramKeyPressed

    private void garantiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_garantiaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            garantia_enter();
        }
    }//GEN-LAST:event_garantiaKeyPressed

    private void precioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            precio_enter();
        }
    }//GEN-LAST:event_precioKeyPressed

    private void ramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ramMouseClicked
        // TODO add your handling code here:
        ram();
    }//GEN-LAST:event_ramMouseClicked

    private void garantiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_garantiaMouseClicked
        // TODO add your handling code here:
        garantia();
    }//GEN-LAST:event_garantiaMouseClicked

    private void precioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioMouseClicked
        // TODO add your handling code here:
        precio();
    }//GEN-LAST:event_precioMouseClicked

    private void pantallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pantallaKeyTyped
        // TODO add your handling code here:
           int numeroCaracteres=2;
    if (pantalla.getText().length()>numeroCaracteres){
        evt.consume();
        getToolkit().beep();
    }
    char validar=evt.getKeyChar();
    if((validar<'0' || validar>'9') && (validar<'.' || validar>'.')) {
        getToolkit().beep();
        evt.consume();
    }
    }//GEN-LAST:event_pantallaKeyTyped

    private void ramKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ramKeyTyped
        // TODO add your handling code here:
                  int numeroCaracteres=2;
    if (ram.getText().length()>numeroCaracteres){
        evt.consume();
        getToolkit().beep();
    }
    char validar=evt.getKeyChar();
    if((validar<'0' || validar>'9') && (validar<'.' || validar>'.')) {
        getToolkit().beep();
        evt.consume();
    }
    }//GEN-LAST:event_ramKeyTyped

    private void garantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_garantiaKeyTyped
        // TODO add your handling code here:
                  int numeroCaracteres=1;
    if (garantia.getText().length()>numeroCaracteres){
        evt.consume();
        getToolkit().beep();
    }
    char validar=evt.getKeyChar();
    if((validar<'0' || validar>'9')) {
        getToolkit().beep();
        evt.consume();
    }
    }//GEN-LAST:event_garantiaKeyTyped

    private void precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyTyped
        // TODO add your handling code here:
                  int numeroCaracteres=5;
    if (precio.getText().length()>numeroCaracteres){
        evt.consume();
        getToolkit().beep();
    }
    char validar=evt.getKeyChar();
    if((validar<'0' || validar>'9') && (validar<'.' || validar>'.')) {
        getToolkit().beep();
        evt.consume();
    }
    }//GEN-LAST:event_precioKeyTyped

    private void marcasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marcasMouseClicked
        // TODO add your handling code here:
        if(precio.getText().equals("")){
            JOptionPane.showMessageDialog(null, "no hay un precio ingresado");
            
        }
        else{
           double validar;
           validar=Double.parseDouble(precio.getText());
           if(validar>=0.01 && validar<999.99){
               marcas.setEnabled(true);
               principal.setEnabled(true);
               secundaria.setEnabled(true);
               flash.setEnabled(true);
           }
           else{
               JOptionPane.showMessageDialog(null, "precio incorrecto");
           }
        }
    }//GEN-LAST:event_marcasMouseClicked

    private void principalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalMouseClicked
        // TODO add your handling code here:
        if(principal.isSelected()){
        pixelesPrincipal.setEnabled(true);
        }
        else{
            pixelesPrincipal.setEnabled(false);
        }
        String marca;
       marca=marcas.getSelectedItem().toString();
       if(marca.equals("Seleccione una marca")){
           JOptionPane.showMessageDialog(null ," seleccione una marca " );
       }
    }//GEN-LAST:event_principalMouseClicked

    private void secundariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secundariaMouseClicked
        // TODO add your handling code here:    String marca;
        if(secundaria.isSelected()){
            pixelesSecundarios.setEnabled(true);
        }
        else{
            pixelesSecundarios.setEnabled(false);
        }
        String marca;
       marca=marcas.getSelectedItem().toString();
       if(marca.equals("Seleccione una marca")){
           JOptionPane.showMessageDialog(null ," seleccione una marca " );
       }
           
    }//GEN-LAST:event_secundariaMouseClicked

    private void flashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flashMouseClicked
        // TODO add your handling code here:
            String marca;
       marca=marcas.getSelectedItem().toString();
       if(marca.equals("Seleccione una marca")){
           JOptionPane.showMessageDialog(null ," seleccione una marca " );
       }
    }//GEN-LAST:event_flashMouseClicked

    private void ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarActionPerformed
        // TODO add your handling code here:
        String marca;
        marca=marcas.getSelectedItem().toString();
        if(!cpu.getText().equals("") && !pantalla.getText().equals("") && !ram.getText().equals("") && !garantia.getText().equals("") && !precio.getText().equals("") && !marca.equals("Seleccione una marca")){
            if(principal.isSelected() && !pixelesPrincipal.getText().equals("") && secundaria.isSelected() && !pixelesSecundarios.getText().equals("") && flash.isSelected()){
              mostrar.setText("el numero de cpu es:"+ cpu.getText() +"\t" +"el tamaño de la pantalla es:"+pantalla.getText() +"\n"
              +"la memoria RAM es de:"+ram.getText() +"\t" +"la garantia es de:"+garantia.getText() +"\n" +"su precio es de:"+ precio.getText()
              +"\t" +"la marca es:"+marca+"\n" +"posee camara principal de "+pixelesPrincipal.getText()+" "+"pixeles"+"\n"+ "y camara secundaria de "+pixelesSecundarios.getText()
            +" "  +"pixeles" + "y flash");
            }
            else if(principal.isSelected() && !pixelesPrincipal.getText().equals("") && secundaria.isSelected() && !pixelesSecundarios.getText().equals("")){
                mostrar.setText("el numero de cpu es:"+ cpu.getText() +"\t" +"el tamaño de la pantalla es:"+pantalla.getText() +"\n"
              +"la memoria RAM es de:"+ram.getText() +"\t" +"la garantia es de:"+garantia.getText() +"\n" +"su precio es de:"+ precio.getText()
              +"\t" +"la marca es:"+marca+"\n" +"posee camara principal de "+pixelesPrincipal.getText()+" "+"pixeles"+"\n"+ "y camara secundaria de "+pixelesSecundarios.getText()
                 +" "       +"pixeles");
            }
            else if(principal.isSelected() && !pixelesPrincipal.getText().equals("") && flash.isSelected()){
                mostrar.setText("el numero de cpu es:"+ cpu.getText() +"\t" +"el tamaño de la pantalla es:"+pantalla.getText() +"\n"
              +"la memoria RAM es de:"+ram.getText() +"\t" +"la garantia es de:"+garantia.getText() +"\n" +"su precio es de:"+ precio.getText()
              +"\t" +"la marca es:"+marca+"\n" +"posee camara principal de "+pixelesPrincipal.getText()+" "+"pixeles" + "y flash");
            }
            else if(principal.isSelected() && !pixelesPrincipal.getText().equals("")){
                mostrar.setText("el numero de cpu es:"+ cpu.getText() +"\t" +"el tamaño de la pantalla es:"+pantalla.getText() +"\n"
              +"la memoria RAM es de:"+ram.getText() +"\t" +"la garantia es de:"+garantia.getText() +"\n" +"su precio es de:"+ precio.getText()
              +"\t" +"la marca es:"+marca+"\n" +"solo posee camara principal de " +pixelesPrincipal.getText()+" " +"pixeles");
            }
            else{
                JOptionPane.showMessageDialog(null, "faltan datos en la camara");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "falta algun dato");
        }
    }//GEN-LAST:event_ejecutarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(celular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(celular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(celular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(celular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new celular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpu;
    private javax.swing.JButton ejecutar;
    private javax.swing.JCheckBox flash;
    private javax.swing.JTextField garantia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> marcas;
    private javax.swing.JTextArea mostrar;
    private javax.swing.JTextField pantalla;
    private javax.swing.JTextField pixelesPrincipal;
    private javax.swing.JTextField pixelesSecundarios;
    private javax.swing.JTextField precio;
    private javax.swing.JCheckBox principal;
    private javax.swing.JTextField ram;
    private javax.swing.JCheckBox secundaria;
    // End of variables declaration//GEN-END:variables
}