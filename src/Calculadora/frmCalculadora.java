package Calculadora;

public class frmCalculadora extends javax.swing.JFrame {

    public frmCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanPantalla = new javax.swing.JPanel();
        txtOperaciones = new javax.swing.JLabel();
        txtResultados = new javax.swing.JLabel();
        PanBotones = new javax.swing.JPanel();
        rbtnSexages = new javax.swing.JRadioButton();
        rbtnRadianes = new javax.swing.JRadioButton();
        btnFlecha = new javax.swing.JButton();
        btnMmenos = new javax.swing.JButton();
        btnFactorial = new javax.swing.JButton();
        btnTangente1 = new javax.swing.JButton();
        btnTangente = new javax.swing.JButton();
        btnRaiz2 = new javax.swing.JButton();
        btnMS = new javax.swing.JButton();
        btnMmas = new javax.swing.JButton();
        btnRaiz3 = new javax.swing.JButton();
        btnCoseno1 = new javax.swing.JButton();
        btnSeno1 = new javax.swing.JButton();
        btnMC = new javax.swing.JButton();
        btnMR = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnCambioS = new javax.swing.JButton();
        btnCoseno = new javax.swing.JButton();
        btn_pi = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        btnLogaritmo = new javax.swing.JButton();
        btnPotencia2 = new javax.swing.JButton();
        btn10Potencia = new javax.swing.JButton();
        btnPotencia3 = new javax.swing.JButton();
        btnRaizY = new javax.swing.JButton();
        btn_e = new javax.swing.JButton();
        btnInversa = new javax.swing.JButton();
        btnSeno = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        btn_C = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnPotenciaY = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        btn_CE = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanPantalla.setBackground(new java.awt.Color(244, 253, 251));

        txtOperaciones.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtOperaciones.setForeground(new java.awt.Color(67, 75, 85));
        txtOperaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtOperaciones.setText("123*234");

        txtResultados.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        txtResultados.setForeground(new java.awt.Color(67, 75, 85));
        txtResultados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtResultados.setText("12345");

        javax.swing.GroupLayout PanPantallaLayout = new javax.swing.GroupLayout(PanPantalla);
        PanPantalla.setLayout(PanPantallaLayout);
        PanPantallaLayout.setHorizontalGroup(
            PanPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanPantallaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        PanPantallaLayout.setVerticalGroup(
            PanPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanPantallaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtOperaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(txtResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(PanPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 110));

        PanBotones.setBackground(new java.awt.Color(255, 255, 255));
        PanBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtnSexages.setForeground(new java.awt.Color(67, 75, 85));
        rbtnSexages.setText("Sexages");
        rbtnSexages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSexagesActionPerformed(evt);
            }
        });
        PanBotones.add(rbtnSexages, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        rbtnRadianes.setForeground(new java.awt.Color(67, 75, 85));
        rbtnRadianes.setText("Radianes");
        rbtnRadianes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRadianesActionPerformed(evt);
            }
        });
        PanBotones.add(rbtnRadianes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        btnFlecha.setBackground(new java.awt.Color(204, 204, 204));
        btnFlecha.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnFlecha.setForeground(new java.awt.Color(0, 153, 0));
        btnFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnFlecha.setText("←");
        btnFlecha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnFlecha.setFocusPainted(false);
        btnFlecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFlecha.setPreferredSize(new java.awt.Dimension(50, 50));
        btnFlecha.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnFlecha.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnFlecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlechaActionPerformed(evt);
            }
        });
        PanBotones.add(btnFlecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 50, 50));

        btnMmenos.setBackground(new java.awt.Color(204, 204, 204));
        btnMmenos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnMmenos.setForeground(new java.awt.Color(67, 75, 85));
        btnMmenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnMmenos.setText("M-");
        btnMmenos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMmenos.setFocusPainted(false);
        btnMmenos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMmenos.setPreferredSize(new java.awt.Dimension(50, 50));
        btnMmenos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnMmenos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnMmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMmenosActionPerformed(evt);
            }
        });
        PanBotones.add(btnMmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 50, 50));

        btnFactorial.setBackground(new java.awt.Color(204, 204, 204));
        btnFactorial.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnFactorial.setForeground(new java.awt.Color(67, 75, 85));
        btnFactorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnFactorial.setText("n!");
        btnFactorial.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnFactorial.setFocusPainted(false);
        btnFactorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFactorial.setPreferredSize(new java.awt.Dimension(50, 50));
        btnFactorial.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnFactorial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });
        PanBotones.add(btnFactorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 50, 50));

        btnTangente1.setBackground(new java.awt.Color(204, 204, 204));
        btnTangente1.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        btnTangente1.setForeground(new java.awt.Color(67, 75, 85));
        btnTangente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnTangente1.setText("tan^(-1)");
        btnTangente1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnTangente1.setFocusPainted(false);
        btnTangente1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTangente1.setPreferredSize(new java.awt.Dimension(50, 50));
        btnTangente1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnTangente1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnTangente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTangente1ActionPerformed(evt);
            }
        });
        PanBotones.add(btnTangente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 50, 50));

        btnTangente.setBackground(new java.awt.Color(204, 204, 204));
        btnTangente.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnTangente.setForeground(new java.awt.Color(67, 75, 85));
        btnTangente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnTangente.setText("tan");
        btnTangente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnTangente.setFocusPainted(false);
        btnTangente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTangente.setPreferredSize(new java.awt.Dimension(50, 50));
        btnTangente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnTangente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnTangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTangenteActionPerformed(evt);
            }
        });
        PanBotones.add(btnTangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 50, 50));

        btnRaiz2.setBackground(new java.awt.Color(204, 204, 204));
        btnRaiz2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRaiz2.setForeground(new java.awt.Color(67, 75, 85));
        btnRaiz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnRaiz2.setText("√");
        btnRaiz2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRaiz2.setFocusPainted(false);
        btnRaiz2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRaiz2.setPreferredSize(new java.awt.Dimension(50, 50));
        btnRaiz2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnRaiz2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnRaiz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiz2ActionPerformed(evt);
            }
        });
        PanBotones.add(btnRaiz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 50, 50));

        btnMS.setBackground(new java.awt.Color(204, 204, 204));
        btnMS.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnMS.setForeground(new java.awt.Color(67, 75, 85));
        btnMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnMS.setText("MS");
        btnMS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMS.setFocusPainted(false);
        btnMS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMS.setPreferredSize(new java.awt.Dimension(50, 50));
        btnMS.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnMS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMSActionPerformed(evt);
            }
        });
        PanBotones.add(btnMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 50, 50));

        btnMmas.setBackground(new java.awt.Color(204, 204, 204));
        btnMmas.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnMmas.setForeground(new java.awt.Color(67, 75, 85));
        btnMmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnMmas.setText("M+");
        btnMmas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMmas.setFocusPainted(false);
        btnMmas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMmas.setPreferredSize(new java.awt.Dimension(50, 50));
        btnMmas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnMmas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnMmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMmasActionPerformed(evt);
            }
        });
        PanBotones.add(btnMmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 50, 50));

        btnRaiz3.setBackground(new java.awt.Color(204, 204, 204));
        btnRaiz3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnRaiz3.setForeground(new java.awt.Color(67, 75, 85));
        btnRaiz3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnRaiz3.setText("3√x");
        btnRaiz3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRaiz3.setFocusPainted(false);
        btnRaiz3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRaiz3.setPreferredSize(new java.awt.Dimension(50, 50));
        btnRaiz3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnRaiz3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnRaiz3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiz3ActionPerformed(evt);
            }
        });
        PanBotones.add(btnRaiz3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 50, 50));

        btnCoseno1.setBackground(new java.awt.Color(204, 204, 204));
        btnCoseno1.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        btnCoseno1.setForeground(new java.awt.Color(67, 75, 85));
        btnCoseno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnCoseno1.setText("cos^(-1)");
        btnCoseno1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCoseno1.setFocusPainted(false);
        btnCoseno1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCoseno1.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCoseno1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnCoseno1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnCoseno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoseno1ActionPerformed(evt);
            }
        });
        PanBotones.add(btnCoseno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 50));

        btnSeno1.setBackground(new java.awt.Color(204, 204, 204));
        btnSeno1.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        btnSeno1.setForeground(new java.awt.Color(67, 75, 85));
        btnSeno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnSeno1.setText("sin^(-1)");
        btnSeno1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSeno1.setFocusPainted(false);
        btnSeno1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeno1.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSeno1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnSeno1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnSeno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeno1ActionPerformed(evt);
            }
        });
        PanBotones.add(btnSeno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 50, 50));

        btnMC.setBackground(new java.awt.Color(204, 204, 204));
        btnMC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnMC.setForeground(new java.awt.Color(67, 75, 85));
        btnMC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnMC.setText("MC");
        btnMC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMC.setFocusPainted(false);
        btnMC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMC.setPreferredSize(new java.awt.Dimension(50, 50));
        btnMC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnMC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCActionPerformed(evt);
            }
        });
        PanBotones.add(btnMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 50, 50));

        btnMR.setBackground(new java.awt.Color(204, 204, 204));
        btnMR.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnMR.setForeground(new java.awt.Color(67, 75, 85));
        btnMR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnMR.setText("MR");
        btnMR.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMR.setFocusPainted(false);
        btnMR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMR.setPreferredSize(new java.awt.Dimension(50, 50));
        btnMR.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnMR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRActionPerformed(evt);
            }
        });
        PanBotones.add(btnMR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 50, 50));

        btnPunto.setBackground(new java.awt.Color(204, 204, 204));
        btnPunto.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(67, 75, 85));
        btnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btnPunto.setText(".");
        btnPunto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPunto.setFocusPainted(false);
        btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPunto.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        PanBotones.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 50, 50));

        btnSuma.setBackground(new java.awt.Color(204, 204, 204));
        btnSuma.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(67, 75, 85));
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnSuma.setText("+");
        btnSuma.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSuma.setFocusPainted(false);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        PanBotones.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 50, 50));

        btnCambioS.setBackground(new java.awt.Color(204, 204, 204));
        btnCambioS.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCambioS.setForeground(new java.awt.Color(67, 75, 85));
        btnCambioS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnCambioS.setText("±");
        btnCambioS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCambioS.setFocusPainted(false);
        btnCambioS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambioS.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCambioS.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnCambioS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnCambioS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioSActionPerformed(evt);
            }
        });
        PanBotones.add(btnCambioS, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 50, 50));

        btnCoseno.setBackground(new java.awt.Color(204, 204, 204));
        btnCoseno.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCoseno.setForeground(new java.awt.Color(67, 75, 85));
        btnCoseno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnCoseno.setText("cos");
        btnCoseno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCoseno.setFocusPainted(false);
        btnCoseno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCoseno.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCoseno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnCoseno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnCoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosenoActionPerformed(evt);
            }
        });
        PanBotones.add(btnCoseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, 50));

        btn_pi.setBackground(new java.awt.Color(204, 204, 204));
        btn_pi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_pi.setForeground(new java.awt.Color(67, 75, 85));
        btn_pi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_pi.setText("π");
        btn_pi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pi.setFocusPainted(false);
        btn_pi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pi.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_pi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_pi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btn_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_piActionPerformed(evt);
            }
        });
        PanBotones.add(btn_pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 50));

        jButton27.setBackground(new java.awt.Color(204, 204, 204));
        jButton27.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jButton27.setForeground(new java.awt.Color(67, 75, 85));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        jButton27.setText("x^(-1)");
        jButton27.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton27.setFocusPainted(false);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton27.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        jButton27.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        PanBotones.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 50, 50));

        btnLogaritmo.setBackground(new java.awt.Color(204, 204, 204));
        btnLogaritmo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLogaritmo.setForeground(new java.awt.Color(67, 75, 85));
        btnLogaritmo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnLogaritmo.setText("log");
        btnLogaritmo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogaritmo.setFocusPainted(false);
        btnLogaritmo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogaritmo.setPreferredSize(new java.awt.Dimension(50, 50));
        btnLogaritmo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnLogaritmo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnLogaritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogaritmoActionPerformed(evt);
            }
        });
        PanBotones.add(btnLogaritmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 50, 50));

        btnPotencia2.setBackground(new java.awt.Color(204, 204, 204));
        btnPotencia2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnPotencia2.setForeground(new java.awt.Color(67, 75, 85));
        btnPotencia2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnPotencia2.setText("x^2");
        btnPotencia2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPotencia2.setFocusPainted(false);
        btnPotencia2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPotencia2.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPotencia2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnPotencia2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnPotencia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotencia2ActionPerformed(evt);
            }
        });
        PanBotones.add(btnPotencia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 50, 50));

        btn10Potencia.setBackground(new java.awt.Color(204, 204, 204));
        btn10Potencia.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btn10Potencia.setForeground(new java.awt.Color(67, 75, 85));
        btn10Potencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn10Potencia.setText("10^x");
        btn10Potencia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn10Potencia.setFocusPainted(false);
        btn10Potencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn10Potencia.setPreferredSize(new java.awt.Dimension(50, 50));
        btn10Potencia.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn10Potencia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btn10Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10PotenciaActionPerformed(evt);
            }
        });
        PanBotones.add(btn10Potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 50, 50));

        btnPotencia3.setBackground(new java.awt.Color(204, 204, 204));
        btnPotencia3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnPotencia3.setForeground(new java.awt.Color(67, 75, 85));
        btnPotencia3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnPotencia3.setText("x^3");
        btnPotencia3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPotencia3.setFocusPainted(false);
        btnPotencia3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPotencia3.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPotencia3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnPotencia3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnPotencia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotencia3ActionPerformed(evt);
            }
        });
        PanBotones.add(btnPotencia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 50, 50));

        btnRaizY.setBackground(new java.awt.Color(204, 204, 204));
        btnRaizY.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnRaizY.setForeground(new java.awt.Color(67, 75, 85));
        btnRaizY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnRaizY.setText("y√x");
        btnRaizY.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRaizY.setFocusPainted(false);
        btnRaizY.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRaizY.setPreferredSize(new java.awt.Dimension(50, 50));
        btnRaizY.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnRaizY.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnRaizY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizYActionPerformed(evt);
            }
        });
        PanBotones.add(btnRaizY, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 50, 50));

        btn_e.setBackground(new java.awt.Color(204, 204, 204));
        btn_e.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_e.setForeground(new java.awt.Color(67, 75, 85));
        btn_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_e.setText("e");
        btn_e.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_e.setFocusPainted(false);
        btn_e.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_e.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_e.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_e.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btn_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eActionPerformed(evt);
            }
        });
        PanBotones.add(btn_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 50));

        btnInversa.setBackground(new java.awt.Color(204, 204, 204));
        btnInversa.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnInversa.setForeground(new java.awt.Color(67, 75, 85));
        btnInversa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnInversa.setText("1/x");
        btnInversa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnInversa.setFocusPainted(false);
        btnInversa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInversa.setPreferredSize(new java.awt.Dimension(50, 50));
        btnInversa.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnInversa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInversaActionPerformed(evt);
            }
        });
        PanBotones.add(btnInversa, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 50, 50));

        btnSeno.setBackground(new java.awt.Color(204, 204, 204));
        btnSeno.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSeno.setForeground(new java.awt.Color(67, 75, 85));
        btnSeno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnSeno.setText("sin");
        btnSeno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSeno.setFocusPainted(false);
        btnSeno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeno.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSeno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnSeno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSenoActionPerformed(evt);
            }
        });
        PanBotones.add(btnSeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 50, 50));

        jButton36.setBackground(new java.awt.Color(204, 204, 204));
        jButton36.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton36.setForeground(new java.awt.Color(67, 75, 85));
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        jButton36.setText("EXP");
        jButton36.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton36.setFocusPainted(false);
        jButton36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton36.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton36.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        jButton36.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        PanBotones.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 50, 50));

        btn_C.setBackground(new java.awt.Color(204, 204, 204));
        btn_C.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_C.setForeground(new java.awt.Color(255, 51, 51));
        btn_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_C.setText("C");
        btn_C.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_C.setFocusPainted(false);
        btn_C.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_C.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_C.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_C.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CActionPerformed(evt);
            }
        });
        PanBotones.add(btn_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 50, 50));

        btnDivision.setBackground(new java.awt.Color(204, 204, 204));
        btnDivision.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(67, 75, 85));
        btnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnDivision.setText("/");
        btnDivision.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDivision.setFocusPainted(false);
        btnDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDivision.setPreferredSize(new java.awt.Dimension(50, 50));
        btnDivision.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnDivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        PanBotones.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 50, 50));

        btnPorcentaje.setBackground(new java.awt.Color(204, 204, 204));
        btnPorcentaje.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnPorcentaje.setForeground(new java.awt.Color(67, 75, 85));
        btnPorcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPorcentaje.setFocusPainted(false);
        btnPorcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorcentaje.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPorcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnPorcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        PanBotones.add(btnPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 50, 50));

        btnPotenciaY.setBackground(new java.awt.Color(204, 204, 204));
        btnPotenciaY.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnPotenciaY.setForeground(new java.awt.Color(67, 75, 85));
        btnPotenciaY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnPotenciaY.setText("x^y");
        btnPotenciaY.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPotenciaY.setFocusPainted(false);
        btnPotenciaY.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPotenciaY.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPotenciaY.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnPotenciaY.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnPotenciaY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaYActionPerformed(evt);
            }
        });
        PanBotones.add(btnPotenciaY, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 50, 50));

        btnMultiplicacion.setBackground(new java.awt.Color(204, 204, 204));
        btnMultiplicacion.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(67, 75, 85));
        btnMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnMultiplicacion.setText("*");
        btnMultiplicacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMultiplicacion.setFocusPainted(false);
        btnMultiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiplicacion.setPreferredSize(new java.awt.Dimension(50, 50));
        btnMultiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnMultiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        PanBotones.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 50, 50));

        btnResultado.setBackground(new java.awt.Color(204, 204, 204));
        btnResultado.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        btnResultado.setForeground(new java.awt.Color(255, 255, 255));
        btnResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3.png"))); // NOI18N
        btnResultado.setText("=");
        btnResultado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnResultado.setFocusPainted(false);
        btnResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResultado.setPreferredSize(new java.awt.Dimension(50, 50));
        btnResultado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnResultado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        PanBotones.add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 50, 50));

        btn_CE.setBackground(new java.awt.Color(204, 204, 204));
        btn_CE.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_CE.setForeground(new java.awt.Color(255, 153, 51));
        btn_CE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_CE.setText("CE");
        btn_CE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_CE.setFocusPainted(false);
        btn_CE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_CE.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_CE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_CE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btn_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CEActionPerformed(evt);
            }
        });
        PanBotones.add(btn_CE, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 50, 50));

        btn_9.setBackground(new java.awt.Color(204, 204, 204));
        btn_9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_9.setForeground(new java.awt.Color(67, 75, 85));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        PanBotones.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 50, 50));

        btn_4.setBackground(new java.awt.Color(204, 204, 204));
        btn_4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_4.setForeground(new java.awt.Color(67, 75, 85));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        PanBotones.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 50, 50));

        btn_5.setBackground(new java.awt.Color(204, 204, 204));
        btn_5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_5.setForeground(new java.awt.Color(67, 75, 85));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        PanBotones.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 50, 50));

        btn_6.setBackground(new java.awt.Color(204, 204, 204));
        btn_6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_6.setForeground(new java.awt.Color(67, 75, 85));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        PanBotones.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 50, 50));

        btn_8.setBackground(new java.awt.Color(204, 204, 204));
        btn_8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_8.setForeground(new java.awt.Color(67, 75, 85));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        PanBotones.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 50, 50));

        btn_7.setBackground(new java.awt.Color(204, 204, 204));
        btn_7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_7.setForeground(new java.awt.Color(67, 75, 85));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        PanBotones.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 50, 50));

        btn_1.setBackground(new java.awt.Color(204, 204, 204));
        btn_1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_1.setForeground(new java.awt.Color(67, 75, 85));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        PanBotones.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 50, 50));

        btn_2.setBackground(new java.awt.Color(204, 204, 204));
        btn_2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_2.setForeground(new java.awt.Color(67, 75, 85));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        PanBotones.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 50, 50));

        btn_3.setBackground(new java.awt.Color(204, 204, 204));
        btn_3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_3.setForeground(new java.awt.Color(67, 75, 85));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        PanBotones.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 50, 50));

        btn_0.setBackground(new java.awt.Color(204, 204, 204));
        btn_0.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_0.setForeground(new java.awt.Color(67, 75, 85));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        PanBotones.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 50, 50));

        btnResta.setBackground(new java.awt.Color(204, 204, 204));
        btnResta.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        btnResta.setForeground(new java.awt.Color(67, 75, 85));
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnResta.setText("-");
        btnResta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnResta.setFocusPainted(false);
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.setPreferredSize(new java.awt.Dimension(50, 50));
        btnResta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        btnResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1_pressed.png"))); // NOI18N
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        PanBotones.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 50, 50));

        getContentPane().add(PanBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 510, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnSexagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSexagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSexagesActionPerformed

    private void btn_piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_piActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_piActionPerformed

    private void rbtnRadianesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRadianesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnRadianesActionPerformed

    private void btnCosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCosenoActionPerformed

    private void btnSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSenoActionPerformed

    private void btnTangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTangenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTangenteActionPerformed

    private void btnCoseno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoseno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCoseno1ActionPerformed

    private void btnSeno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeno1ActionPerformed

    private void btnTangente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTangente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTangente1ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void btnPotenciaYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPotenciaYActionPerformed

    private void btn_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eActionPerformed

    private void btnRaizYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRaizYActionPerformed

    private void btnPotencia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotencia3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPotencia3ActionPerformed

    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFactorialActionPerformed

    private void btnRaiz3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiz3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRaiz3ActionPerformed

    private void btnPotencia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotencia2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPotencia2ActionPerformed

    private void btn10PotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10PotenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn10PotenciaActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void btnLogaritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogaritmoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogaritmoActionPerformed

    private void btnFlechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFlechaActionPerformed

    private void btn_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CEActionPerformed

    private void btn_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CActionPerformed

    private void btnCambioSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambioSActionPerformed

    private void btnRaiz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiz2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRaiz2ActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInversaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInversaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btnMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMCActionPerformed

    private void btnMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMRActionPerformed

    private void btnMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMSActionPerformed

    private void btnMmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMmasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMmasActionPerformed

    private void btnMmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMmenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMmenosActionPerformed

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
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanBotones;
    public javax.swing.JPanel PanPantalla;
    public javax.swing.JButton btn10Potencia;
    public javax.swing.JButton btnCambioS;
    public javax.swing.JButton btnCoseno;
    public javax.swing.JButton btnCoseno1;
    public javax.swing.JButton btnDivision;
    public javax.swing.JButton btnFactorial;
    public javax.swing.JButton btnFlecha;
    public javax.swing.JButton btnInversa;
    public javax.swing.JButton btnLogaritmo;
    public javax.swing.JButton btnMC;
    public javax.swing.JButton btnMR;
    public javax.swing.JButton btnMS;
    public javax.swing.JButton btnMmas;
    public javax.swing.JButton btnMmenos;
    public javax.swing.JButton btnMultiplicacion;
    public javax.swing.JButton btnPorcentaje;
    public javax.swing.JButton btnPotencia2;
    public javax.swing.JButton btnPotencia3;
    public javax.swing.JButton btnPotenciaY;
    public javax.swing.JButton btnPunto;
    public javax.swing.JButton btnRaiz2;
    public javax.swing.JButton btnRaiz3;
    public javax.swing.JButton btnRaizY;
    public javax.swing.JButton btnResta;
    public javax.swing.JButton btnResultado;
    public javax.swing.JButton btnSeno;
    public javax.swing.JButton btnSeno1;
    public javax.swing.JButton btnSuma;
    public javax.swing.JButton btnTangente;
    public javax.swing.JButton btnTangente1;
    public javax.swing.JButton btn_0;
    public javax.swing.JButton btn_1;
    public javax.swing.JButton btn_2;
    public javax.swing.JButton btn_3;
    public javax.swing.JButton btn_4;
    public javax.swing.JButton btn_5;
    public javax.swing.JButton btn_6;
    public javax.swing.JButton btn_7;
    public javax.swing.JButton btn_8;
    public javax.swing.JButton btn_9;
    public javax.swing.JButton btn_C;
    public javax.swing.JButton btn_CE;
    public javax.swing.JButton btn_e;
    public javax.swing.JButton btn_pi;
    public javax.swing.JButton jButton27;
    public javax.swing.JButton jButton36;
    public javax.swing.JRadioButton rbtnRadianes;
    public javax.swing.JRadioButton rbtnSexages;
    public javax.swing.JLabel txtOperaciones;
    public javax.swing.JLabel txtResultados;
    // End of variables declaration//GEN-END:variables
}
