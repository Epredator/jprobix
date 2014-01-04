/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jprobix.ui;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static jprobix.ui.SPlotFinal.creteDemoPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 *
 * @author epredator
 */
public class UI extends javax.swing.JFrame {
    int n =100;
    int k =10;
    int bigSize =0;
    ArrayList<Integer> uList = new ArrayList<Integer>();
    
    int m = 1;
    int c = 0;
    
    ArrayList<Integer> ziarno = new ArrayList<Integer>();
    int size = 1000;
    private Integer a1 = 0;
    private Integer a2 = 0;
    private Integer a3 = 0;
    private Integer a4 = 0;
    
    private Integer x1 = 0;
    private Integer x2 = 0;
    private Integer x3 = 0;
    private Integer x4 = 0;
    
     private Integer rozkladI = 0;
     private Integer rozkladJ = 100;
     
             
        
    XYDataset ds = createDataset();
    JFreeChart chart = ChartFactory.createScatterPlot
        (
                "Test Chart",
                "x",
                "y",
                ds,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
    XYPlot xyPlot = (XYPlot) chart.getPlot();
    XYItemRenderer renderer = xyPlot.getRenderer(); 
    ChartPanel cp = new ChartPanel(chart);
    
    
   IntervalXYDataset cdb = createDatasetBar();
   JFreeChart chartBar = ChartFactory.createXYBarChart(
            "Bar Chart Demo 1",       // chart title
            "Category",               // domain axis label
            false,
            "Value",                  // range axis label
            cdb,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );
    XYPlot PlotBar = (XYPlot) chartBar.getPlot();
    XYBarRenderer rendererBar = (XYBarRenderer) PlotBar.getRenderer();
    ChartPanel chartPanelBar = new ChartPanel(chartBar);

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
        setTitle("Zadanie 1.4 Komputerowe generatory liczb losowych");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(800,480);
        setLocationRelativeTo(null);
        //jPanelCrossPoints.add(cp);
      
       // scatterplotdemo4.pack();
        //RefineryUtilities.centerFrameOnScreen(scatterplotdemo4);
        //scatterplotdemo4.setVisible(true);
        
    }
    
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aView1 = new javax.swing.JTextField();
        cView = new javax.swing.JTextField();
        mView = new javax.swing.JTextField();
        xView1 = new javax.swing.JTextField();
        iView = new javax.swing.JTextField();
        sizeView = new javax.swing.JTextField();
        jButtonRun = new javax.swing.JButton();
        aView2 = new javax.swing.JTextField();
        aView3 = new javax.swing.JTextField();
        aView4 = new javax.swing.JTextField();
        xView2 = new javax.swing.JTextField();
        xView3 = new javax.swing.JTextField();
        xView4 = new javax.swing.JTextField();
        jView = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel9.setText("jLabel9");
        jTabbedPane1.addTab("tab1", jLabel9);

        jLabel12.setText("jLabel12");
        jTabbedPane1.addTab("tab2", jLabel12);

        jScrollPane1.setViewportView(jTextPane1);

        jTabbedPane1.addTab("tab3", jScrollPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Podaj parametry a1 a2 a3 a4 :");

        jLabel7.setText("Podaj parametr c (domyślnie 0) :");

        jLabel8.setText("Podaj parametr m (domyślnie 1) :");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Wartości początkowe generatora (ziarno):");

        jLabel2.setText("Parametry rozkładu jednostajnego U(i,j) :");

        jLabel3.setText("Liczba wygenerowanych zmiennych:");

        aView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aView1ActionPerformed(evt);
            }
        });
        aView1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aView1FocusLost(evt);
            }
        });

        cView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cViewActionPerformed(evt);
            }
        });
        cView.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cViewFocusLost(evt);
            }
        });

        mView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mViewActionPerformed(evt);
            }
        });
        mView.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mViewFocusLost(evt);
            }
        });

        xView1.setToolTipText("podaj poczatkowe ziarno x1");
        xView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xView1ActionPerformed(evt);
            }
        });
        xView1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                xView1FocusLost(evt);
            }
        });

        iView.setToolTipText("podaj parametr a");
        iView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iViewActionPerformed(evt);
            }
        });
        iView.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                iViewFocusLost(evt);
            }
        });

        sizeView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeViewActionPerformed(evt);
            }
        });
        sizeView.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sizeViewFocusLost(evt);
            }
        });

        jButtonRun.setText("WYGENERUJ");
        jButtonRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRunActionPerformed(evt);
            }
        });

        aView2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aView2ActionPerformed(evt);
            }
        });
        aView2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aView2FocusLost(evt);
            }
        });

        aView3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aView3ActionPerformed(evt);
            }
        });
        aView3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aView3FocusLost(evt);
            }
        });

        aView4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aView4ActionPerformed(evt);
            }
        });
        aView4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aView4FocusLost(evt);
            }
        });

        xView2.setToolTipText("podaj poczatkowe ziarno x2");
        xView2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xView2ActionPerformed(evt);
            }
        });
        xView2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                xView2FocusLost(evt);
            }
        });

        xView3.setToolTipText("podaj poczatkowe ziarno x3");
        xView3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xView3ActionPerformed(evt);
            }
        });
        xView3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                xView3FocusLost(evt);
            }
        });

        xView4.setToolTipText("podaj poczatkowe ziarno x4");
        xView4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xView4ActionPerformed(evt);
            }
        });
        xView4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                xView4FocusLost(evt);
            }
        });

        jView.setToolTipText("podaj parametr b");
        jView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewActionPerformed(evt);
            }
        });
        jView.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jViewFocusLost(evt);
            }
        });

        jLabel4.setText("a1");

        jLabel5.setText("a2");

        jLabel10.setText("a3");

        jLabel11.setText("a4");

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane2.addTab("wygenerowane punkty", cp);
        jTabbedPane2.addTab("histogram", chartPanelBar);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("O programie");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sizeView)
                    .addComponent(cView)
                    .addComponent(mView)
                    .addComponent(jButtonRun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aView1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aView2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aView3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aView4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(xView1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xView2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iView)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jView)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xView3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xView4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(12, 12, 12)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aView1)
                    .addComponent(aView2)
                    .addComponent(aView3)
                    .addComponent(aView4))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cView)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mView)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xView1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xView2)
                    .addComponent(xView3)
                    .addComponent(xView4))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iView)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jView))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeView)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButtonRun, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("Wartości początkowe \ngeneratora (ziarno):");
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aView1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aView1ActionPerformed

    private void cViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cViewActionPerformed

    private void mViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mViewActionPerformed

    private void xView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xView1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xView1ActionPerformed

    private void iViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iViewActionPerformed

    private void sizeViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeViewActionPerformed

    private void aView1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aView1FocusLost
      try{
        a1 = Integer.parseInt(aView1.getText().trim());
        System.out.println("Variable a1 is set " + a1);
        }catch(NumberFormatException nfe){
             System.out.println("cannot enter variable" + nfe);
             a1 = 0;
        }
    }//GEN-LAST:event_aView1FocusLost

    private void mViewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mViewFocusLost
        
        try{
        m = Integer.parseInt(mView.getText().trim());
        System.out.println("Variable m is set " + m);
        }catch(NumberFormatException nfe){
             System.out.println("cannot enter variable" + nfe);
        }
    }//GEN-LAST:event_mViewFocusLost

    private void cViewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cViewFocusLost
         try{
        c = Integer.parseInt(cView.getText().trim());
        System.out.println("Variable c is set to " + c);
        }catch(NumberFormatException nfe){
             System.out.println("cannot enter variable" + nfe);
        }
    }//GEN-LAST:event_cViewFocusLost

    private void xView1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xView1FocusLost
      try{
        x1 = Integer.parseInt(xView1.getText().trim());
        System.out.println("Variable x1 is set " + x1);
        }catch(NumberFormatException nfe){
             System.out.println("cannot enter variable" + nfe);
             x1 = 0;
        }
       
    }//GEN-LAST:event_xView1FocusLost

    @SuppressWarnings("empty-statement")
    private void jButtonRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRunActionPerformed
      uList.clear();
      ziarno.clear();  
      
      
      ziarno.add(x1);
      ziarno.add(x2);
      ziarno.add(x3);
      ziarno.add(x4);
      
      if(size>0){
      uList.add(a1);
      uList.add(a2);
      uList.add(a3);
      uList.add(a4);
      }
      
       int xN = 0;
      
        if(size>0){
            int i = 0;
        while ( i < (size - (ziarno.size())) ){
           int ij;
            ij = ((ziarno.get(ziarno.size()-1) * uList.get(uList.size()-1) +  ziarno.get(ziarno.size()-2) * uList.get(uList.size()-2) +  ziarno.get(ziarno.size()-3) * uList.get(uList.size()-3) +  ziarno.get(ziarno.size()-4) * uList.get(uList.size()-4))  + c) % m;
       
       if (ij >= rozkladI ){
             uList.add(ij);
       }else{
           ij = ij + rozkladI;
           
           uList.add(ij);
           
       }
        i++;
       
         }
        }
       System.out.println( uList);
                
       
        JPanel jpanel3 = creteDemoPanel();
        jpanel3.setPreferredSize(new Dimension(640, 480));  
       
         ds = createDataset();
         cp.repaint();
         chart = ChartFactory.createScatterPlot
          (
                  "Test Chart",
                  "x",
                  "y",
                  ds,
                  PlotOrientation.VERTICAL,
                  true,
                  true,
                  false
          );
    
     xyPlot = (XYPlot) chart.getPlot();
     renderer = xyPlot.getRenderer();
   
     cp.repaint();
    
     cp = new ChartPanel(chart);
     cp.repaint();
    
     jTabbedPane2.removeAll();
     jTabbedPane2.addTab("wygenerowane punkty", cp);

    cp.setMouseWheelEnabled(true);
    
    
   cdb = createDatasetBar();
   chartBar = ChartFactory.createXYBarChart(
            "Bar Chart Demo 1",       // chart title
            "Category",               // domain axis label
            false,
            "Value",                  // range axis label
            cdb,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );
    PlotBar = (XYPlot) chartBar.getPlot();
    rendererBar = (XYBarRenderer) PlotBar.getRenderer();
    chartPanelBar = new ChartPanel(chartBar);
    jTabbedPane2.addTab("histogram", chartPanelBar);
        
    }//GEN-LAST:event_jButtonRunActionPerformed

    private void sizeViewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sizeViewFocusLost
         try{
        size = Integer.parseInt(sizeView.getText().trim());
        System.out.println("Variable size is set " + size);
        }catch(NumberFormatException nfe){
             System.out.println("cannot enter variable" + nfe);
        }
    }//GEN-LAST:event_sizeViewFocusLost

    private void aView2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aView2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aView2ActionPerformed

    private void aView2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aView2FocusLost
        try{
        a2 = Integer.parseInt(aView2.getText().trim());
        System.out.println("Variable a2 is set " + a2);
        }catch(NumberFormatException nfe){
             System.out.println("cannot enter variable" + nfe);
             a2 = 0;
        }
    }//GEN-LAST:event_aView2FocusLost

    private void aView3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aView3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aView3ActionPerformed

    private void aView3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aView3FocusLost
        try{
        a3 = Integer.parseInt(aView3.getText().trim());
        System.out.println("Variable a3 is set " + a3);
        }catch(NumberFormatException nfe){
             System.out.println("cannot enter variable" + nfe);
             a3 = 0;
        }
    }//GEN-LAST:event_aView3FocusLost

    private void aView4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aView4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aView4ActionPerformed

    private void aView4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aView4FocusLost
       try{
        a4 = Integer.parseInt(aView4.getText().trim());
        System.out.println("Variable a4 is set " + a4);
        }catch(NumberFormatException nfe){
             System.out.println("cannot enter variable" + nfe);
             a4 = 0;
        }
    }//GEN-LAST:event_aView4FocusLost

    private void xView2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xView2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xView2ActionPerformed

    private void xView2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xView2FocusLost
        try{
        x2 = Integer.parseInt(xView2.getText().trim());
        System.out.println("Variable x2 is set " + x2);
        }catch(NumberFormatException nfe){
             System.out.println("cannot enter variable" + nfe);
             x2 = 0;
        }
    }//GEN-LAST:event_xView2FocusLost

    private void xView3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xView3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xView3ActionPerformed

    private void xView3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xView3FocusLost
        try{
        x3 = Integer.parseInt(xView3.getText().trim());
        System.out.println("Variable x3 is set " + x3);
        }catch(NumberFormatException nfe){
             System.out.println("cannot enter variable" + nfe);
             x3 = 0;
        }
    }//GEN-LAST:event_xView3FocusLost

    private void xView4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xView4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xView4ActionPerformed

    private void xView4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xView4FocusLost
        try{
        x4 = Integer.parseInt(xView4.getText().trim());
        System.out.println("Variable x4 is set " + x4);
        }catch(NumberFormatException nfe){
             System.out.println("cannot enter variable" + nfe);
             x4 = 0;
        }
    }//GEN-LAST:event_xView4FocusLost

    private void jViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jViewActionPerformed

    private void iViewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iViewFocusLost
        try{
        rozkladI = Integer.parseInt(iView.getText().trim());
        System.out.println("Variable rozkladI is set " + rozkladI);
        }catch(NumberFormatException nfe){
             System.out.println("cannot enter variable" + nfe);
        }
    }//GEN-LAST:event_iViewFocusLost

    private void jViewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jViewFocusLost
          try{
        rozkladJ = Integer.parseInt(jView.getText().trim());
        System.out.println("Variable rozkladJ is set " + rozkladJ);
        }catch(NumberFormatException nfe){
             System.out.println("cannot enter variable" + nfe);
        }
    }//GEN-LAST:event_jViewFocusLost

    
 

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aView1;
    private javax.swing.JTextField aView2;
    private javax.swing.JTextField aView3;
    private javax.swing.JTextField aView4;
    private javax.swing.JTextField cView;
    private javax.swing.JTextField iView;
    private javax.swing.JButton jButtonRun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField jView;
    private javax.swing.JTextField mView;
    private javax.swing.JTextField sizeView;
    private javax.swing.JTextField xView1;
    private javax.swing.JTextField xView2;
    private javax.swing.JTextField xView3;
    private javax.swing.JTextField xView4;
    // End of variables declaration//GEN-END:variables

    private XYDataset createDataset() {
        
        int cols = 100;
        int rows = 100;
        double[][]values  = new double[cols][rows];
        
        XYSeriesCollection xySeriesCollection = new XYSeriesCollection();
        XYSeries series = new XYSeries("Random");
        
        Random rand = new Random();
        for(int i = 0 ; i < uList.size() ; i = i+3){
            
                int x = uList.get(i);
                System.out.println(x);
                int y = uList.get(i+1);
                 System.out.println(y);
                
                series.add(x,y);
            
        }
        
        xySeriesCollection.addSeries(series);
        System.out.println(xySeriesCollection);
        return xySeriesCollection;
    }

    private  IntervalXYDataset createDatasetBar() {
        final XYSeries series = new XYSeries("Data");
        
         for(int i = 0 ; i < uList.size() ; i = i+3){
            
                int x = uList.get(i);
                System.out.println(x);
                int y = i;
                 System.out.println(y);
                
                series.add(x,y);
            
        }
        
       
        
        final XYSeriesCollection dataset = new XYSeriesCollection(series);
        return dataset;
        

//        // row keys...
//        String series1 = "First";
//        
//
//        // column keys...
//        String category1 = "Category 1";
//
//
//
//        // create the dataset...
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//
//        for(int i = 0 ; i < uList.size() ;  i++){
//            
//               int x = uList.get(i);
////                System.out.println(x);
//              
//               String series1 = "First";
//               dataset.addValue(x, series1, category1);
//                
//            
//        }

//        
//
//        return dataset;
        
        // row keys...
//        String series1 = "First";
//        String series2 = "Second";
//        String series3 = "Third";
//
//        // column keys...
//        String category1 = "Category 1";
//  
//
//        // create the dataset...
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//
//        dataset.addValue(1.0, series1, category1);
//        dataset.addValue(45.0, series1, category1);
//        dataset.addValue(345.0, series1, category1);
//        dataset.addValue(3450, series1, category1);
//        dataset.addValue(56.0, series1, category1);
//
//        dataset.addValue(5.0, series1, category1);
//        dataset.addValue(7.0, series1, category1);
//        dataset.addValue(6.0, series1, category1);
//        dataset.addValue(8.0, series1, category1);
//        dataset.addValue(4.0, series1, category1);
//
//        dataset.addValue(4.0, series1, category1);
//        dataset.addValue(3.0, series1, category1);
//        dataset.addValue(2.0, series3, category1);
//        dataset.addValue(3.0, series2, category1);
//        dataset.addValue(343.0, series1, category1);
//
//       return dataset;

    }

 

   
}
