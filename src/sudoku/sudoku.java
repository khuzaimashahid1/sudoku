package sudoku;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
public class sudoku extends javax.swing.JFrame {
    public static int[][] a = new int[9][9];
    public static String[][] b = new String[9][9];
    public static int[][] sudoku = new int[9][9];
    public static int[][] puzzle = new int[9][9];
    public static int[] row = new int[9];
    public static int[] column = new int[9];
    public static Random rand = new Random();
    public static int strt=0;
    public static int counter;
    public static int totalcounter=0;
    public static int bcounter;
    public static int tries;
    public static int hints;
    public static int initialtime;
    public static int finaltime;
    public static int time;
    public static int forfeit=0;
    
    public sudoku() {
        initComponents();
        this.getContentPane().setBackground(new Color(0,153,255));
    }
 private void initComponents() {

        Start = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        check = new javax.swing.JButton();
        solved = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        solve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));
        setForeground(java.awt.Color.cyan);

        Start.setBackground(new java.awt.Color(0, 153, 255));
        Start.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        Start.setBorder(new LineBorder(Color.BLACK,2));
        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));

        jButton71.setBackground(new java.awt.Color(0, 0, 0));
        jButton71.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton71.setForeground(new java.awt.Color(51, 153, 255));
        jButton71.setText("-");
        jButton71.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton71.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton71.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });

        jButton72.setBackground(new java.awt.Color(0, 0, 0));
        jButton72.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton72.setForeground(new java.awt.Color(51, 153, 255));
        jButton72.setText("-");
        jButton72.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton72.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton72.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });

        jButton73.setBackground(new java.awt.Color(0, 0, 0));
        jButton73.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton73.setForeground(new java.awt.Color(51, 153, 255));
        jButton73.setText("-");
        jButton73.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton73.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton73.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton74.setBackground(new java.awt.Color(0, 0, 0));
        jButton74.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton74.setForeground(new java.awt.Color(51, 153, 255));
        jButton74.setText("-");
        jButton74.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton74.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton74.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(0, 0, 0));
        jButton32.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton32.setForeground(new java.awt.Color(51, 153, 255));
        jButton32.setText("-");
        jButton32.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton32.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton32.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton75.setBackground(new java.awt.Color(0, 0, 0));
        jButton75.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton75.setForeground(new java.awt.Color(51, 153, 255));
        jButton75.setText("-");
        jButton75.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton75.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton75.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });

        jButton33.setBackground(new java.awt.Color(0, 0, 0));
        jButton33.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton33.setForeground(new java.awt.Color(51, 153, 255));
        jButton33.setText("-");
        jButton33.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton33.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton33.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton76.setBackground(new java.awt.Color(0, 0, 0));
        jButton76.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton76.setForeground(new java.awt.Color(51, 153, 255));
        jButton76.setText("-");
        jButton76.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton76.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton76.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(0, 0, 0));
        jButton34.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton34.setForeground(new java.awt.Color(51, 153, 255));
        jButton34.setText("-");
        jButton34.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton34.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton34.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton77.setBackground(new java.awt.Color(0, 0, 0));
        jButton77.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton77.setForeground(new java.awt.Color(51, 153, 255));
        jButton77.setText("-");
        jButton77.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton77.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton77.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });

        jButton35.setBackground(new java.awt.Color(0, 0, 0));
        jButton35.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton35.setForeground(new java.awt.Color(51, 153, 255));
        jButton35.setText("-");
        jButton35.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton35.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton35.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton78.setBackground(new java.awt.Color(0, 0, 0));
        jButton78.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton78.setForeground(new java.awt.Color(51, 153, 255));
        jButton78.setText("-");
        jButton78.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton78.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton78.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });

        jButton36.setBackground(new java.awt.Color(0, 0, 0));
        jButton36.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton36.setForeground(new java.awt.Color(51, 153, 255));
        jButton36.setText("-");
        jButton36.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton36.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton36.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton79.setBackground(new java.awt.Color(0, 0, 0));
        jButton79.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton79.setForeground(new java.awt.Color(51, 153, 255));
        jButton79.setText("-");
        jButton79.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton79.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton79.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });

        jButton80.setBackground(new java.awt.Color(0, 0, 0));
        jButton80.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton80.setForeground(new java.awt.Color(51, 153, 255));
        jButton80.setText("-");
        jButton80.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton80.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton80.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });

        jButton37.setBackground(new java.awt.Color(0, 0, 0));
        jButton37.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton37.setForeground(new java.awt.Color(51, 153, 255));
        jButton37.setText("-");
        jButton37.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton37.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton37.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setBackground(new java.awt.Color(0, 0, 0));
        jButton38.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton38.setForeground(new java.awt.Color(51, 153, 255));
        jButton38.setText("-");
        jButton38.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton38.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton38.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setBackground(new java.awt.Color(0, 0, 0));
        jButton39.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton39.setForeground(new java.awt.Color(51, 153, 255));
        jButton39.setText("-");
        jButton39.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton39.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton39.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setBackground(new java.awt.Color(0, 0, 0));
        jButton40.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton40.setForeground(new java.awt.Color(51, 153, 255));
        jButton40.setText("-");
        jButton40.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton40.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton40.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton2.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton2.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton2.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton2.setForeground(new java.awt.Color(51, 153, 255));
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton41.setBackground(new java.awt.Color(0, 0, 0));
        jButton41.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton41.setForeground(new java.awt.Color(51, 153, 255));
        jButton41.setText("-");
        jButton41.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton41.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton41.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setBackground(new java.awt.Color(0, 0, 0));
        jButton42.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton42.setForeground(new java.awt.Color(51, 153, 255));
        jButton42.setText("-");
        jButton42.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton42.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton42.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setBackground(new java.awt.Color(0, 0, 0));
        jButton43.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton43.setForeground(new java.awt.Color(51, 153, 255));
        jButton43.setText("-");
        jButton43.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton43.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton43.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setBackground(new java.awt.Color(0, 0, 0));
        jButton44.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton44.setForeground(new java.awt.Color(51, 153, 255));
        jButton44.setText("-");
        jButton44.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton44.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton44.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton3.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton3.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton3.setForeground(new java.awt.Color(51, 153, 255));
        jButton3.setText("-");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton45.setBackground(new java.awt.Color(0, 0, 0));
        jButton45.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton45.setForeground(new java.awt.Color(51, 153, 255));
        jButton45.setText("-");
        jButton45.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton45.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton45.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton4.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton4.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton4.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton4.setForeground(new java.awt.Color(51, 153, 255));
        jButton4.setText("-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton46.setBackground(new java.awt.Color(0, 0, 0));
        jButton46.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton46.setForeground(new java.awt.Color(51, 153, 255));
        jButton46.setText("-");
        jButton46.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton46.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton46.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton5.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton5.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton5.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton5.setForeground(new java.awt.Color(51, 153, 255));
        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton47.setBackground(new java.awt.Color(0, 0, 0));
        jButton47.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton47.setForeground(new java.awt.Color(51, 153, 255));
        jButton47.setText("-");
        jButton47.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton47.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton47.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton6.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton6.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton6.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton6.setForeground(new java.awt.Color(51, 153, 255));
        jButton6.setText("-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton48.setBackground(new java.awt.Color(0, 0, 0));
        jButton48.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton48.setForeground(new java.awt.Color(51, 153, 255));
        jButton48.setText("-");
        jButton48.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton48.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton48.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton81.setBackground(new java.awt.Color(0, 0, 0));
        jButton81.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton81.setForeground(new java.awt.Color(51, 153, 255));
        jButton81.setText("-");
        jButton81.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton81.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton81.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton7.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton7.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton7.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton7.setForeground(new java.awt.Color(51, 153, 255));
        jButton7.setText("-");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton49.setBackground(new java.awt.Color(0, 0, 0));
        jButton49.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton49.setForeground(new java.awt.Color(51, 153, 255));
        jButton49.setText("-");
        jButton49.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton49.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton49.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton8.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton8.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton8.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton8.setForeground(new java.awt.Color(51, 153, 255));
        jButton8.setText("-");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton50.setBackground(new java.awt.Color(0, 0, 0));
        jButton50.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton50.setForeground(new java.awt.Color(51, 153, 255));
        jButton50.setText("-");
        jButton50.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton50.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton50.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton9.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton9.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton9.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton9.setForeground(new java.awt.Color(51, 153, 255));
        jButton9.setText("-");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton10.setForeground(new java.awt.Color(51, 153, 255));
        jButton10.setText("-");
        jButton10.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton10.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton10.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton11.setForeground(new java.awt.Color(51, 153, 255));
        jButton11.setText("-");
        jButton11.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton11.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton11.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 0, 0));
        jButton12.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton12.setForeground(new java.awt.Color(51, 153, 255));
        jButton12.setText("-");
        jButton12.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton12.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton12.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton51.setBackground(new java.awt.Color(0, 0, 0));
        jButton51.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton51.setForeground(new java.awt.Color(51, 153, 255));
        jButton51.setText("-");
        jButton51.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton51.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton51.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jButton52.setBackground(new java.awt.Color(0, 0, 0));
        jButton52.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton52.setForeground(new java.awt.Color(51, 153, 255));
        jButton52.setText("-");
        jButton52.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton52.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton52.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.setBackground(new java.awt.Color(0, 0, 0));
        jButton53.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton53.setForeground(new java.awt.Color(51, 153, 255));
        jButton53.setText("-");
        jButton53.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton53.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton53.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jButton54.setBackground(new java.awt.Color(0, 0, 0));
        jButton54.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton54.setForeground(new java.awt.Color(51, 153, 255));
        jButton54.setText("-");
        jButton54.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton54.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton54.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 0, 0));
        jButton13.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton13.setForeground(new java.awt.Color(51, 153, 255));
        jButton13.setText("-");
        jButton13.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton13.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton13.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton55.setBackground(new java.awt.Color(0, 0, 0));
        jButton55.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton55.setForeground(new java.awt.Color(51, 153, 255));
        jButton55.setText("-");
        jButton55.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton55.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton55.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 0, 0));
        jButton14.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton14.setForeground(new java.awt.Color(51, 153, 255));
        jButton14.setText("-");
        jButton14.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton14.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton14.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton56.setBackground(new java.awt.Color(0, 0, 0));
        jButton56.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton56.setForeground(new java.awt.Color(51, 153, 255));
        jButton56.setText("-");
        jButton56.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton56.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton56.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 0, 0));
        jButton15.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton15.setForeground(new java.awt.Color(51, 153, 255));
        jButton15.setText("-");
        jButton15.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton15.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton15.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton57.setBackground(new java.awt.Color(0, 0, 0));
        jButton57.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton57.setForeground(new java.awt.Color(51, 153, 255));
        jButton57.setText("-");
        jButton57.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton57.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton57.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 0, 0));
        jButton16.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton16.setForeground(new java.awt.Color(51, 153, 255));
        jButton16.setText("-");
        jButton16.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton16.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton16.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton58.setBackground(new java.awt.Color(0, 0, 0));
        jButton58.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton58.setForeground(new java.awt.Color(51, 153, 255));
        jButton58.setText("-");
        jButton58.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton58.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton58.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(0, 0, 0));
        jButton17.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton17.setForeground(new java.awt.Color(51, 153, 255));
        jButton17.setText("-");
        jButton17.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton17.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton17.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton59.setBackground(new java.awt.Color(0, 0, 0));
        jButton59.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton59.setForeground(new java.awt.Color(51, 153, 255));
        jButton59.setText("-");
        jButton59.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton59.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton59.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(0, 0, 0));
        jButton18.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton18.setForeground(new java.awt.Color(51, 153, 255));
        jButton18.setText("-");
        jButton18.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton18.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton18.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton60.setBackground(new java.awt.Color(0, 0, 0));
        jButton60.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton60.setForeground(new java.awt.Color(51, 153, 255));
        jButton60.setText("-");
        jButton60.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton60.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton60.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(0, 0, 0));
        jButton19.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton19.setForeground(new java.awt.Color(51, 153, 255));
        jButton19.setText("-");
        jButton19.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton19.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton19.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(0, 0, 0));
        jButton20.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton20.setForeground(new java.awt.Color(51, 153, 255));
        jButton20.setText("-");
        jButton20.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton20.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton20.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(0, 0, 0));
        jButton21.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton21.setForeground(new java.awt.Color(51, 153, 255));
        jButton21.setText("-");
        jButton21.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton21.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton21.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(0, 0, 0));
        jButton22.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton22.setForeground(new java.awt.Color(51, 153, 255));
        jButton22.setText("-");
        jButton22.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton22.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton22.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton61.setBackground(new java.awt.Color(0, 0, 0));
        jButton61.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton61.setForeground(new java.awt.Color(51, 153, 255));
        jButton61.setText("-");
        jButton61.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton61.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton61.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        jButton62.setBackground(new java.awt.Color(0, 0, 0));
        jButton62.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton62.setForeground(new java.awt.Color(51, 153, 255));
        jButton62.setText("-");
        jButton62.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton62.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton62.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton63.setBackground(new java.awt.Color(0, 0, 0));
        jButton63.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton63.setForeground(new java.awt.Color(51, 153, 255));
        jButton63.setText("-");
        jButton63.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton63.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton63.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        jButton64.setBackground(new java.awt.Color(0, 0, 0));
        jButton64.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton64.setForeground(new java.awt.Color(51, 153, 255));
        jButton64.setText("-");
        jButton64.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton64.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton64.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(0, 0, 0));
        jButton23.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton23.setForeground(new java.awt.Color(51, 153, 255));
        jButton23.setText("-");
        jButton23.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton23.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton23.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton65.setBackground(new java.awt.Color(0, 0, 0));
        jButton65.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton65.setForeground(new java.awt.Color(51, 153, 255));
        jButton65.setText("-");
        jButton65.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton65.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton65.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(0, 0, 0));
        jButton24.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton24.setForeground(new java.awt.Color(51, 153, 255));
        jButton24.setText("-");
        jButton24.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton24.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton24.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton66.setBackground(new java.awt.Color(0, 0, 0));
        jButton66.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton66.setForeground(new java.awt.Color(51, 153, 255));
        jButton66.setText("-");
        jButton66.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton66.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton66.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(0, 0, 0));
        jButton25.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton25.setForeground(new java.awt.Color(51, 153, 255));
        jButton25.setText("-");
        jButton25.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton25.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton25.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton67.setBackground(new java.awt.Color(0, 0, 0));
        jButton67.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton67.setForeground(new java.awt.Color(51, 153, 255));
        jButton67.setText("-");
        jButton67.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton67.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton67.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(0, 0, 0));
        jButton26.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton26.setForeground(new java.awt.Color(51, 153, 255));
        jButton26.setText("-");
        jButton26.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton26.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton26.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton68.setBackground(new java.awt.Color(0, 0, 0));
        jButton68.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton68.setForeground(new java.awt.Color(51, 153, 255));
        jButton68.setText("-");
        jButton68.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton68.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton68.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });

        jButton69.setBackground(new java.awt.Color(0, 0, 0));
        jButton69.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton69.setForeground(new java.awt.Color(51, 153, 255));
        jButton69.setText("-");
        jButton69.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton69.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton69.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(0, 0, 0));
        jButton27.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton27.setForeground(new java.awt.Color(51, 153, 255));
        jButton27.setText("-");
        jButton27.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton27.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton27.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton70.setBackground(new java.awt.Color(0, 0, 0));
        jButton70.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton70.setForeground(new java.awt.Color(51, 153, 255));
        jButton70.setText("-");
        jButton70.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton70.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton70.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(0, 0, 0));
        jButton28.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton28.setForeground(new java.awt.Color(51, 153, 255));
        jButton28.setText("-");
        jButton28.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton28.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton28.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(0, 0, 0));
        jButton29.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton29.setForeground(new java.awt.Color(51, 153, 255));
        jButton29.setText("-");
        jButton29.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton29.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton29.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(0, 0, 0));
        jButton30.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton30.setForeground(new java.awt.Color(51, 153, 255));
        jButton30.setText("-");
        jButton30.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton30.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton30.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(0, 0, 0));
        jButton31.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton31.setForeground(new java.awt.Color(51, 153, 255));
        jButton31.setText("-");
        jButton31.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton31.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton31.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(135, 41));
        jButton1.setMinimumSize(new java.awt.Dimension(135, 41));
        jButton1.setPreferredSize(new java.awt.Dimension(135, 41));
        jButton1.setForeground(new java.awt.Color(51, 153, 255));
        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(9, 9, 9)
                                .addComponent(jButton7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addGap(9, 9, 9)
                                .addComponent(jButton9)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        check.setBackground(new java.awt.Color(0, 153, 255));
        check.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        check.setText("Check");
        check.setMaximumSize(new java.awt.Dimension(125, 65));
        check.setMinimumSize(new java.awt.Dimension(125, 65));
        check.setPreferredSize(new java.awt.Dimension(125, 65));
        check.setBorder(new LineBorder(Color.BLACK,2));
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        solved.setBackground(new java.awt.Color(0, 153, 255));
        solved.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        solved.setMaximumSize(new java.awt.Dimension(125, 65));
        solved.setMinimumSize(new java.awt.Dimension(125, 65));
        solved.setPreferredSize(new java.awt.Dimension(125, 65));
        solved.setBorder(new LineBorder(Color.BLACK,2));
        solved.setText("Hints ("+hints+")");
        solved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solvedActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setForeground(new java.awt.Color(51, 153, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 153, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 2, 42)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Wrong Inputs\n          0");
        jTextArea2.setMargin(new java.awt.Insets(2, 14, 2, 14));
        jTextArea2.setMaximumSize(new java.awt.Dimension(125, 65));
        jTextArea2.setMinimumSize(new java.awt.Dimension(125, 65));
        jTextArea2.setName("");
        jScrollPane2.setViewportView(jTextArea2);
        jTextArea2.setEditable(false);
        jTextArea2.setBorder(new LineBorder(Color.BLACK,2));

        jScrollPane3.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setForeground(new java.awt.Color(224, 255, 255));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea3.setBackground(new java.awt.Color(0, 153, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Times New Roman", 2, 42)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setMargin(new java.awt.Insets(2, 14, 2, 14));
        jTextArea3.setMaximumSize(new java.awt.Dimension(125, 65));
        jTextArea3.setMinimumSize(new java.awt.Dimension(125, 65));
        jTextArea3.setText("Total Blanks\n         "+bcounter);
        jTextArea3.setName("");
        jTextArea3.setBorder(new LineBorder(Color.BLACK,2));
        jScrollPane3.setViewportView(jTextArea3);
        jTextArea3.setEditable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setBackground(new java.awt.Color(0, 153, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 3, 75)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("                   Sudoku By Khuzaima Shahid");
        jTextArea1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.setEditable(false);
        jTextArea1.setBorder(new LineBorder(Color.BLACK,2));

        jScrollPane4.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane4.setForeground(new java.awt.Color(224, 255, 255));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea4.setBackground(new java.awt.Color(0, 153, 255));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Times New Roman", 2, 42)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("Total Tries\n        0");
        jTextArea4.setMargin(new java.awt.Insets(2, 14, 2, 14));
        jTextArea4.setMaximumSize(new java.awt.Dimension(125, 65));
        jTextArea4.setMinimumSize(new java.awt.Dimension(125, 65));
        jTextArea4.setName("");
        jTextArea4.setBorder(new LineBorder(Color.BLACK,2));
        jScrollPane4.setViewportView(jTextArea4);
        jTextArea4.setEditable(false);

        solve.setBackground(new java.awt.Color(0, 153, 255));
        solve.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        solve.setText("I GIVE UP");
        solve.setBorder(new LineBorder(Color.BLACK,2));
        solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(solved, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(solve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(solved, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(solve, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
generateGame();
strt=1;
buttonText();
totalcounter=0;
tries=0;
hints=3;
checkBlanks();
initialtime=(int) System.currentTimeMillis();
jTextArea3.setText("Total Blanks\n         "+bcounter);
jTextArea3.setEditable(false);
jTextArea4.setText("Total Tries\n          "+tries);
jTextArea4.setEditable(false);
jTextArea2.setText("Wrong Inputs\n         "+totalcounter);
jTextArea2.setEditable(false);
solved.setText("Hints ("+hints+")");



    }//GEN-LAST:event_StartActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              
              if(jButton1.getText().equals("0"))
        {
         editNumber(1);
        }
           
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
              if(jButton2.getText().equals("0"))
        {
         editNumber(2);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              if(jButton3.getText().equals("0"))
        {
         editNumber(3);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
              if(jButton4.getText().equals("0"))
        {
         editNumber(4);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
              if(jButton5.getText().equals("0"))
        {
         editNumber(5);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
              if(jButton6.getText().equals("0"))
        {
         editNumber(6);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
              if(jButton7.getText().equals("0"))
        {
         editNumber(7);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
              if(jButton8.getText().equals("0"))
        {
         editNumber(8);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
              if(jButton9.getText().equals("0"))
        {
         editNumber(9);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
              if(jButton10.getText().equals("0"))
        {
         editNumber(10);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
              if(jButton11.getText().equals("0"))
        {
         editNumber(11);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
              if(jButton12.getText().equals("0"))
        {
         editNumber(12);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
              if(jButton13.getText().equals("0"))
        {
         editNumber(13);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
              if(jButton14.getText().equals("0"))
        {
         editNumber(14);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
              if(jButton15.getText().equals("0"))
        {
         editNumber(15);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
              if(jButton16.getText().equals("0"))
        {
         editNumber(16);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
              if(jButton17.getText().equals("0"))
        {
         editNumber(17);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
              if(jButton18.getText().equals("0"))
        {
         editNumber(18);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
              if(jButton19.getText().equals("0"))
        {
         editNumber(19);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
              if(jButton20.getText().equals("0"))
        {
         editNumber(20);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
              if(jButton21.getText().equals("0"))
        {
         editNumber(21);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
              if(jButton22.getText().equals("0"))
        {
         editNumber(22);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
              if(jButton23.getText().equals("0"))
        {
         editNumber(23);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
              if(jButton24.getText().equals("0"))
        {
         editNumber(24);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
              if(jButton25.getText().equals("0"))
        {
         editNumber(25);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
              if(jButton26.getText().equals("0"))
        {
         editNumber(26);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
              if(jButton27.getText().equals("0"))
        {
         editNumber(27);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
              if(jButton28.getText().equals("0"))
        {
         editNumber(28);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
              if(jButton29.getText().equals("0"))
        {
         editNumber(29);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
              if(jButton30.getText().equals("0"))
        {
         editNumber(30);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
              if(jButton31.getText().equals("0"))
        {
         editNumber(31);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
              if(jButton32.getText().equals("0"))
        {
         editNumber(32);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
              if(jButton33.getText().equals("0"))
        {
         editNumber(33);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
              if(jButton34.getText().equals("0"))
        {
         editNumber(34);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
              if(jButton35.getText().equals("0"))
        {
         editNumber(35);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
              if(jButton36.getText().equals("0"))
        {
         editNumber(36);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
              if(jButton37.getText().equals("0"))
        {
         editNumber(37);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
              if(jButton38.getText().equals("0"))
        {
         editNumber(38);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
              if(jButton39.getText().equals("0"))
        {
         editNumber(39);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
              if(jButton40.getText().equals("0"))
        {
         editNumber(40);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
              if(jButton41.getText().equals("0"))
        {
         editNumber(41);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
              if(jButton42.getText().equals("0"))
        {
         editNumber(42);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
              if(jButton43.getText().equals("0"))
        {
         editNumber(43);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
              if(jButton44.getText().equals("0"))
        {
         editNumber(44);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
              if(jButton45.getText().equals("0"))
        {
         editNumber(45);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
              if(jButton46.getText().equals("0"))
        {
         editNumber(46);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
              if(jButton47.getText().equals("0"))
        {
         editNumber(47);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
              if(jButton48.getText().equals("0"))
        {
         editNumber(48);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
              if(jButton49.getText().equals("0"))
        {
         editNumber(49);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
              if(jButton50.getText().equals("0"))
        {
         editNumber(50);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
              if(jButton51.getText().equals("0"))
        {
         editNumber(51);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
              if(jButton52.getText().equals("0"))
        {
         editNumber(52);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
              if(jButton53.getText().equals("0"))
        {
         editNumber(53);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
              if(jButton54.getText().equals("0"))
        {
         editNumber(54);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
              if(jButton55.getText().equals("0"))
        {
         editNumber(55);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
              if(jButton56.getText().equals("0"))
        {
         editNumber(56);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
              if(jButton57.getText().equals("0"))
        {
         editNumber(57);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
              if(jButton58.getText().equals("0"))
        {
         editNumber(58);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
              if(jButton59.getText().equals("0"))
        {
         editNumber(59);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
              if(jButton60.getText().equals("0"))
        {
         editNumber(60);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
              if(jButton61.getText().equals("0"))
        {
         editNumber(61);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
              if(jButton62.getText().equals("0"))
        {
         editNumber(62);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
              if(jButton63.getText().equals("0"))
        {
         editNumber(63);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
              if(jButton64.getText().equals("0"))
        {
         editNumber(64);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
              if(jButton65.getText().equals("0"))
        {
         editNumber(65);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
              if(jButton66.getText().equals("0"))
        {
         editNumber(66);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
              if(jButton67.getText().equals("0"))
        {
         editNumber(67);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
              if(jButton68.getText().equals("0"))
        {
         editNumber(68);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
              if(jButton69.getText().equals("0"))
        {
         editNumber(69);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
              if(jButton71.getText().equals("0"))
        {
         editNumber(71);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
              if(jButton71.getText().equals("0"))
        {
         editNumber(71);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
              if(jButton72.getText().equals("0"))
        {
         editNumber(72);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
              if(jButton73.getText().equals("0"))
        {
         editNumber(73);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
              if(jButton74.getText().equals("0"))
        {
         editNumber(74);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
              if(jButton75.getText().equals("0"))
        {
         editNumber(75);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
              if(jButton76.getText().equals("0"))
        {
         editNumber(76);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
              if(jButton77.getText().equals("0"))
        {
         editNumber(77);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
              if(jButton78.getText().equals("0"))
        {
         editNumber(78);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
              if(jButton79.getText().equals("0"))
        {
         editNumber(79);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
              if(jButton80.getText().equals("0"))
        {
         editNumber(80);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
              if(jButton81.getText().equals("0"))
        {
         editNumber(81);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton81ActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
         checkPuzzle();
         checkBlanks();
         tries++;
         String temp1="Wrong inputs in this turn : "+counter;
         String temp2="Conratulations !\n You have 0 wrong inputs in this turn";
         JFrame frame = new JFrame();
         frame.setLayout(null);
         frame.setSize(1000,1000);
         frame. setLocation(1800,0);
         frame.getContentPane().setBackground(new Color(0,153,255));
        JTextArea area1 = new JTextArea(temp1,1000,1000);  
        JTextArea area2 = new JTextArea(temp2,1000,1000); 
        Font font = new Font("Times New Roman", Font.BOLD, 50);
         area1.setBounds(10,30,1000,1000);
         area2.setBounds(10,30,1000,1000);
         area1.setFont(font);
         area2.setFont(font);
         area1.setBackground(new Color(0,153,255));
         area2.setBackground(new Color(0,153,255));

         if(bcounter==0)
         {
             finaltime=(int) System.currentTimeMillis();
             time=finaltime-initialtime;
             int h=0,m=0,s=0;
             time=time/1000;
             m=time/60;
             s=time%60;
             
         String temp3="\n\n\n                       CONGRATULATIONS !\n\n             You have successfully wasted "+m+" minutes\n                         "+s+" seconds of your life\n\n\n                          STATISTICS\n\n        Total Tries : "+tries+"\n\n        Wrong Inputs : "+totalcounter+"\n\n        Hints Used : "+(3-hints)+"\n\n        Time Taken : "+time;
         String temp4="\n\n\n                       COMISSERATIONS !\n\n             You Gave Up !\n\n             You just wasted "+m+" minutes "+s+" seconds \n             of your life for no apparent reason\n\n\n                         Better Luck Next Time";
         JFrame frame1 = new JFrame();
         frame1.setLayout(null);
         frame1.setSize(1650,1600);
         frame1. setLocation(0,0);
         frame1.getContentPane().setBackground(new Color(0,153,255));
         if(forfeit==0)
         {
         JTextArea area3 = new JTextArea(temp3,1000,1000);
         area3.setBounds(0,0,1500,1400);
         area3.setFont(new Font("Times New Roman", Font.BOLD, 75));
         area3.setBackground(new Color(0,153,255));
         frame1.add(area3);
         frame1.setVisible(true);
         }
         else {
             JTextArea area3 = new JTextArea(temp4,1000,1000);
         area3.setBounds(0,0,1500,1400);
         area3.setFont(new Font("Times New Roman", Font.BOLD, 75));
         area3.setBackground(new Color(0,153,255));
         frame1.add(area3);
         frame1.setVisible(true);
         }
         
         }
         else
         {
                      
         if(counter==0)
         {
           frame.add(area2);
           frame.setVisible(true);
           new Timer().schedule(new TimerTask() {
    public void run() {
            frame.setVisible(false);
    }
}, 3000);
           
         }
         else
         {

           frame.add(area1);
           frame.setVisible(true);
           new Timer().schedule(new TimerTask() {
    public void run() {
            frame.setVisible(false);
    }
}, 3000);
         }
         jTextArea2.setText("Wrong Inputs\n          "+totalcounter);
         jTextArea2.setEditable(false);
         
         jTextArea3.setText("Total Blanks\n          "+bcounter);
         jTextArea3.setEditable(false);
         jTextArea4.setText("Total Tries\n           "+tries);
         jTextArea4.setEditable(false);
         }
         

        
    }//GEN-LAST:event_checkActionPerformed

    private void solvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solvedActionPerformed
         JFrame frame = new JFrame();
         frame.setSize(1000,1000);
         frame. setLocation(1800,0);
        JTextArea area1 = new JTextArea();
        frame.getContentPane().setBackground(new Color(0,153,255));
        area1.setRows(1000);
        area1.setColumns(1000);
        Font font = new Font("Times New Roman", Font.BOLD, 50);
         area1.setBounds(10,30,1000,1000);
         area1.setFont(font); 
         area1.setBackground(new Color(0,153,255));
          StringBuilder temp = new StringBuilder();
         
        for(int i=0;i<sudoku.length;i++)
             {
                 
                 for(int j=0;j<sudoku[0].length;j++)
                 {
                     temp.append("   "+sudoku[i][j]+"  ");
                 }
                 temp.append("\n");
                
             }
        area1.setText(temp.toString());
        
         frame.add(area1);
         if(hints>0)
         {
             frame.setVisible(true); 
           new Timer().schedule(new TimerTask() {
    public void run() {
            frame.setVisible(false);
    }
}, 3000);
           hints--;
         }
         solved.setText("Hints ("+hints+")");

             
         
           
    }//GEN-LAST:event_solvedActionPerformed

    private void solveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveActionPerformed
        solve();
        forfeit=1;
    }//GEN-LAST:event_solveActionPerformed
       
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sudoku().setVisible(true);
                
            }
        });
    }
    public static void generateSeed()
{
   int k=1,n=1;
   for(int i=0;i<9;i++)
   {
      k=n;
      for(int j=0;j<9;j++)
      {
          if(k<=9){
              a[i][j]=k;
              k++;
          }else{
           k=1;
           a[i][j]=k;
           k++;
          }
      }
      n=k+3;
      if(k==10)
      n=4;
      if(n>9)
      n=(n%9)+1;
   }
   
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[0].length;j++)
        {
            int temp1=a[i][j];
            String temp2 = null;
            switch (temp1) {
                case 1:
                    temp2="a";
                    break;
                case 2:
                    temp2="b";
                    break;
                case 3:
                    temp2="c";
                    break;
                case 4:
                    temp2="d";
                    break;
                case 5:
                    temp2="e";
                    break;
                case 6:
                    temp2="f";
                    break;
                case 7:
                    temp2="g";
                    break;
                case 8:
                    temp2="h";
                    break;
                case 9:
                    temp2="i";
                    break;
                default:
                    break;
            }
            b[i][j]=temp2;

        }
    }
    for(int i=0;i<b.length;i++)
             {
                 for(int j=0;j<b[0].length;j++)
                 {
                     if(b[i][j]==null)
                         generateSeed();
                     else
                         continue;
                 }
                 
             }
}
    public static void permutationRow(int r1,int r2){
   String temp;
   for(int j=0;j<9;j++)
   {
      temp=b[r1][j];
      b[r1][j]=b[r2][j];
      b[r2][j]=temp;
   }
}
    public static void permutationColumn(int c1,int c2)
    {
        
   String temp;
   for(int j=0;j<9;j++)
   {
      temp=b[j][c1];
      b[j][c1]=b[j][c2];
      b[j][c2]=temp;
   }
}
    public static void rowChange(int r1,int r2)
{
   String temp;
   for(int n=1;n<=3;n++)
   {
      for(int i=0;i<9;i++)
      {
         temp=b[r1][i];
         b[r1][i]=b[r2][i];
         b[r2][i]=temp;
      }
      r1++;
      r2++;
   }
}
public static void colChange(int c1,int c2)
{
   String temp;
   for(int n=1;n<=3;n++)
   {
      for(int i=0;i<9;i++)
      {
         temp=b[i][c1];
         b[i][c1]=b[i][c2];
         b[i][c2]=temp;
      }
      c1++;
      c2++;
   }
}

   public static void rotateArray()
    {
        int temp1=1+rand.nextInt(4);
        int count=1;
        String[][] temp = new String[9][9];
        while(count<=temp1)
        {
          for(int i = 0; i < 9;i++) {
             for(int j = 0; j < 9; j++) {
             temp[i][j] = b[9 - j - 1][i];
         }
      }
          count++;
        }
      
      b=temp;
  
    }
   
    public static void transposeMatrix()
   {
    String[][] tMatrix = new String[9][9];

    for(int x = 0; x < 9; x++)
    {
        for(int y = 0; y < 9; y++)
        {
            tMatrix[x][y] = b[y][x];
        }
    }
     b=tMatrix;
    
}
    public static void finalShuffle()
    {
         Integer [] temp =new Integer[9] ;
        for(int i=0;i<temp.length;i++)
            temp[i]=i+1;
        Collections.shuffle(Arrays.asList(temp));
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                    switch (b[i][j]) {
                    case "a":
                        sudoku[i][j]=temp[0];
                        break;
                    case "b":
                        sudoku[i][j]=temp[1];
                        break;
                    case "c":
                        sudoku[i][j]=temp[2];
                        break;
                    case "d":
                        sudoku[i][j]=temp[3];
                        break;
                    case "e":
                        sudoku[i][j]=temp[4];
                        break;
                    case "f":
                        sudoku[i][j]=temp[5];
                        break;
                    case "g":
                        sudoku[i][j]=temp[6];
                        break;
                    case "h":
                        sudoku[i][j]=temp[7];
                        break;
                    case "i":
                        sudoku[i][j]=temp[8];
                        break;
                    
                }
                                
            }
        }
        
        
    }
    
    public static void strikeOut(int k1,int k2)
{
   int row_from;
   int row_to;
   int col_from;
   int col_to;
   int i,j,b,c;
   int rem1,rem2;
   int flag;
   int temp=puzzle[k1][k2];
   int count=9;
   for(i=1;i<=9;i++)
   { flag=1;
      for(j=0;j<9;j++)
      {
         if(j!=k2)
        {
           if(i!=puzzle[k1][j])
           {
              continue;
           }
           else
           {
              flag=0;
              break;
           }
        } 
     }
     if(flag==1)
     {
        for(c=0;c<9;c++)
        {
           if(c!=k1)
           {
              if(i!=puzzle[c][k2])
              {
                 continue;
              }
              else
              {
              flag=0;
              break; 
              }
           }
       }
    }
    if(flag==1)
    {
       rem1=k1%3; rem2=k2%3;
       row_from=k1-rem1;
       row_to=k1+(2-rem1);
       col_from=k2-rem2;
       col_to=k2+(2-rem2);
       for(c=row_from;c<=row_to;c++)
       {
          for(b=col_from;b<=col_to;b++)
          {
             if(c!=k1 && b!=k2)
             {
                if(i!=puzzle[c][b])
                continue;
                else{
                   flag=0;
                   break;
                }
            }
         }
      }
   }
   if(flag==0)
   count--;
  }

  if(count==1)
  { 
     puzzle[k1][k2]=0;
     count--;
  }
}

    public static void generateGame()
    {
        generateSeed();
        int n1=0,n2=0,count=0;
        int n[]={0,3,6};
          for(int i=0;i<4;i++)
       {
         n1=n[rand.nextInt(n.length)];
         do
          {
             n2=n[rand.nextInt(n.length)];
          }  while(n1==n2);
         if(count<2)
             rowChange(n1,n2);
             else
             colChange(n1,n2);
             count++;
       }
          count=0;
        for(int i=0;i<4;i++)
       {
         n1=rand.nextInt(9);;
         do
          {
             n2=rand.nextInt(9);
          }  while(n1==n2);
         if(count<2)
          permutationRow(n1,n2);
             else
             permutationColumn(n1,n2);
             count++;
        }
        int temp=1+rand.nextInt(3);
        for(int i=0;i<temp;i++)
        {
          rotateArray();    
        }
        
        transposeMatrix();
                     
                     
        finalShuffle();
        for(int i=0;i<sudoku.length;i++)
        {
            for(int j=0;j<sudoku[0].length;j++)
                    {
                        puzzle[j][i]=sudoku[j][i];
                    }
        }
        bcounter=0;
        for(int i=0;i<9;i++)
    {
       for(int j=0;j<9;j++)
       strikeOut(i,j);
     }
    }
    public void buttonText()
    {
        if(strt==1)
                {
                    jButton1.setText(Integer.toString(puzzle[0][0]));
                    jButton2.setText(Integer.toString(puzzle[0][1]));
                    jButton3.setText(Integer.toString(puzzle[0][2]));
                    jButton4.setText(Integer.toString(puzzle[0][3]));
                    jButton5.setText(Integer.toString(puzzle[0][4]));
                    jButton6.setText(Integer.toString(puzzle[0][5]));
                    jButton7.setText(Integer.toString(puzzle[0][6]));
                    jButton8.setText(Integer.toString(puzzle[0][7]));
                    jButton9.setText(Integer.toString(puzzle[0][8]));
                    jButton10.setText(Integer.toString(puzzle[1][0]));
                    jButton11.setText(Integer.toString(puzzle[1][1]));
                    jButton12.setText(Integer.toString(puzzle[1][2]));
                    jButton13.setText(Integer.toString(puzzle[1][3]));
                    jButton14.setText(Integer.toString(puzzle[1][4]));
                    jButton15.setText(Integer.toString(puzzle[1][5]));
                    jButton16.setText(Integer.toString(puzzle[1][6]));
                    jButton17.setText(Integer.toString(puzzle[1][7]));
                    jButton18.setText(Integer.toString(puzzle[1][8]));
                    jButton19.setText(Integer.toString(puzzle[2][0]));
                    jButton20.setText(Integer.toString(puzzle[2][1]));
                    jButton21.setText(Integer.toString(puzzle[2][2]));
                    jButton22.setText(Integer.toString(puzzle[2][3]));
                    jButton23.setText(Integer.toString(puzzle[2][4]));
                    jButton24.setText(Integer.toString(puzzle[2][5]));
                    jButton25.setText(Integer.toString(puzzle[2][6]));
                    jButton26.setText(Integer.toString(puzzle[2][7]));
                    jButton27.setText(Integer.toString(puzzle[2][8]));
                    jButton28.setText(Integer.toString(puzzle[3][0]));
                    jButton29.setText(Integer.toString(puzzle[3][1]));
                    jButton30.setText(Integer.toString(puzzle[3][2]));
                    jButton31.setText(Integer.toString(puzzle[3][3]));
                    jButton32.setText(Integer.toString(puzzle[3][4]));
                    jButton33.setText(Integer.toString(puzzle[3][5]));
                    jButton34.setText(Integer.toString(puzzle[3][6]));
                    jButton35.setText(Integer.toString(puzzle[3][7]));
                    jButton36.setText(Integer.toString(puzzle[3][8]));
                    jButton37.setText(Integer.toString(puzzle[4][0]));
                    jButton38.setText(Integer.toString(puzzle[4][1]));
                    jButton39.setText(Integer.toString(puzzle[4][2]));
                    jButton40.setText(Integer.toString(puzzle[4][3]));
                    jButton41.setText(Integer.toString(puzzle[4][4]));
                    jButton42.setText(Integer.toString(puzzle[4][5]));
                    jButton43.setText(Integer.toString(puzzle[4][6]));
                    jButton44.setText(Integer.toString(puzzle[4][7]));
                    jButton45.setText(Integer.toString(puzzle[4][8]));
                    jButton46.setText(Integer.toString(puzzle[5][0]));
                    jButton47.setText(Integer.toString(puzzle[5][1]));
                    jButton48.setText(Integer.toString(puzzle[5][2]));
                    jButton49.setText(Integer.toString(puzzle[5][3]));
                    jButton50.setText(Integer.toString(puzzle[5][4]));
                    jButton51.setText(Integer.toString(puzzle[5][5]));
                    jButton52.setText(Integer.toString(puzzle[5][6]));
                    jButton53.setText(Integer.toString(puzzle[5][7]));
                    jButton54.setText(Integer.toString(puzzle[5][8]));
                    jButton55.setText(Integer.toString(puzzle[6][0]));
                    jButton56.setText(Integer.toString(puzzle[6][1]));
                    jButton57.setText(Integer.toString(puzzle[6][2]));
                    jButton58.setText(Integer.toString(puzzle[6][3]));
                    jButton59.setText(Integer.toString(puzzle[6][4]));
                    jButton60.setText(Integer.toString(puzzle[6][5]));
                    jButton61.setText(Integer.toString(puzzle[6][6]));
                    jButton62.setText(Integer.toString(puzzle[6][7]));
                    jButton63.setText(Integer.toString(puzzle[6][8]));
                    jButton64.setText(Integer.toString(puzzle[7][0]));
                    jButton65.setText(Integer.toString(puzzle[7][1]));
                    jButton66.setText(Integer.toString(puzzle[7][2]));
                    jButton67.setText(Integer.toString(puzzle[7][3]));
                    jButton68.setText(Integer.toString(puzzle[7][4]));
                    jButton69.setText(Integer.toString(puzzle[7][5]));
                    jButton70.setText(Integer.toString(puzzle[7][6]));
                    jButton71.setText(Integer.toString(puzzle[7][7]));
                    jButton72.setText(Integer.toString(puzzle[7][8]));               
                    jButton73.setText(Integer.toString(puzzle[8][0]));
                    jButton74.setText(Integer.toString(puzzle[8][1]));
                    jButton75.setText(Integer.toString(puzzle[8][2]));
                    jButton76.setText(Integer.toString(puzzle[8][3]));
                    jButton77.setText(Integer.toString(puzzle[8][4]));
                    jButton78.setText(Integer.toString(puzzle[8][5]));
                    jButton79.setText(Integer.toString(puzzle[8][6]));
                    jButton80.setText(Integer.toString(puzzle[8][7]));
                    jButton81.setText(Integer.toString(puzzle[8][8]));
                    
                }
    }
    public void checkPuzzle()
    {
        counter=0;
        if((Integer.parseInt(jButton1.getText())!=sudoku[0][0])&&(Integer.parseInt(jButton1.getText())!=0))
        {
            jButton1.setText("0");
            jButton1.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
        else
           jButton1.setBorder(null);
        
                if(Integer.parseInt(jButton2.getText())!=sudoku[0][1]&&(Integer.parseInt(jButton2.getText())!=0))
        {
            jButton2.setText("0");
            jButton2.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton2.setBorder(null);
        }
           if(Integer.parseInt(jButton3.getText())!=sudoku[0][2]&&(Integer.parseInt(jButton3.getText())!=0))
        {
            jButton3.setText("0");
            jButton3.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                        else
        {
             
            jButton3.setBorder(null);
        }
                if(Integer.parseInt(jButton4.getText())!=sudoku[0][3]&&(Integer.parseInt(jButton4.getText())!=0))
        {
            jButton4.setText("0");
            jButton4.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton4.setBorder(null);
        }
                        if(Integer.parseInt(jButton5.getText())!=sudoku[0][4]&&(Integer.parseInt(jButton5.getText())!=0))
        {
            jButton5.setText("0");
            jButton5.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton5.setBorder(null);
        }
                if(Integer.parseInt(jButton6.getText())!=sudoku[0][5]&&(Integer.parseInt(jButton6.getText())!=0))
        {
            jButton6.setText("0");
            jButton6.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton6.setBorder(null);
        }
                        if(Integer.parseInt(jButton7.getText())!=sudoku[0][6]&&(Integer.parseInt(jButton7.getText())!=0))
        {
            jButton7.setText("0");
            jButton7.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton7.setBorder(null);
        }
                if(Integer.parseInt(jButton8.getText())!=sudoku[0][7]&&(Integer.parseInt(jButton8.getText())!=0))
        {
            jButton8.setText("0");
            jButton8.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton8.setBorder(null);
        }
                if(Integer.parseInt(jButton9.getText())!=sudoku[0][8]&&(Integer.parseInt(jButton9.getText())!=0))
        {
            jButton9.setText("0");
            jButton9.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton9.setBorder(null);
        }  
        if(Integer.parseInt(jButton10.getText())!=sudoku[1][0]&&(Integer.parseInt(jButton10.getText())!=0))
        {
            jButton10.setText("0");
            jButton10.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
        
                else
        {
             
            jButton10.setBorder(null);
        }
                if(Integer.parseInt(jButton11.getText())!=sudoku[1][1]&&(Integer.parseInt(jButton11.getText())!=0))
        {
            jButton11.setText("0");
            jButton11.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton11.setBorder(null);
        }
                        if(Integer.parseInt(jButton12.getText())!=sudoku[1][2]&&(Integer.parseInt(jButton12.getText())!=0))
        {
            jButton12.setText("0");
            jButton12.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton12.setBorder(null);
        }
                if(Integer.parseInt(jButton13.getText())!=sudoku[1][3]&&(Integer.parseInt(jButton13.getText())!=0))
        {
            jButton13.setText("0");
            jButton13.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton13.setBorder(null);
        }
                        if(Integer.parseInt(jButton14.getText())!=sudoku[1][4]&&(Integer.parseInt(jButton14.getText())!=0))
        {
            jButton14.setText("0");
            jButton14.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton14.setBorder(null);
        }
                if(Integer.parseInt(jButton15.getText())!=sudoku[1][5]&&(Integer.parseInt(jButton15.getText())!=0))
        {
            jButton15.setText("0");
            jButton15.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton15.setBorder(null);
        }
                        if(Integer.parseInt(jButton16.getText())!=sudoku[1][6]&&(Integer.parseInt(jButton16.getText())!=0))
        {
            jButton16.setText("0");
            jButton16.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton16.setBorder(null);
        }
                if(Integer.parseInt(jButton17.getText())!=sudoku[1][7]&&(Integer.parseInt(jButton17.getText())!=0))
        {
            jButton17.setText("0");
            jButton17.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton17.setBorder(null);
        }
                if(Integer.parseInt(jButton18.getText())!=sudoku[1][8]&&(Integer.parseInt(jButton18.getText())!=0))
        {
            jButton18.setText("0");
            jButton18.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton18.setBorder(null);
        }
        if(Integer.parseInt(jButton19.getText())!=sudoku[2][0]&&(Integer.parseInt(jButton19.getText())!=0))
        {
            jButton19.setText("0");
            jButton19.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton19.setBorder(null);
        }
                if(Integer.parseInt(jButton20.getText())!=sudoku[2][1]&&(Integer.parseInt(jButton20.getText())!=0))
        {
            jButton20.setText("0");
            jButton20.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton20.setBorder(null);
        }
                        if(Integer.parseInt(jButton21.getText())!=sudoku[2][2]&&(Integer.parseInt(jButton21.getText())!=0))
        {
            jButton21.setText("0");
            jButton21.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton21.setBorder(null);
        }
                if(Integer.parseInt(jButton22.getText())!=sudoku[2][3]&&(Integer.parseInt(jButton22.getText())!=0))
        {
            jButton22.setText("0");
            jButton22.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton22.setBorder(null);
        }
                        if(Integer.parseInt(jButton23.getText())!=sudoku[2][4]&&(Integer.parseInt(jButton23.getText())!=0))
        {
            jButton23.setText("0");
            jButton23.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton23.setBorder(null);
        }
                if(Integer.parseInt(jButton24.getText())!=sudoku[2][5]&&(Integer.parseInt(jButton24.getText())!=0))
        {
            jButton24.setText("0");
            jButton24.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton24.setBorder(null);
        }
                        if(Integer.parseInt(jButton25.getText())!=sudoku[2][6]&&(Integer.parseInt(jButton25.getText())!=0))
        {
            jButton25.setText("0");
            jButton25.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton25.setBorder(null);
        }
                if(Integer.parseInt(jButton26.getText())!=sudoku[2][7]&&(Integer.parseInt(jButton26.getText())!=0))
        {
            jButton26.setText("0");
            jButton26.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton26.setBorder(null);
        }
                if(Integer.parseInt(jButton27.getText())!=sudoku[2][8]&&(Integer.parseInt(jButton27.getText())!=0))
        {
            jButton27.setText("0");
            jButton27.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton27.setBorder(null);
        }                
        if(Integer.parseInt(jButton28.getText())!=sudoku[3][0]&&(Integer.parseInt(jButton28.getText())!=0))
        {
            jButton28.setText("0");
            jButton28.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton28.setBorder(null);
        }
                if(Integer.parseInt(jButton29.getText())!=sudoku[3][1]&&(Integer.parseInt(jButton29.getText())!=0))
        {
            jButton29.setText("0");
            jButton29.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton29.setBorder(null);
        }
                        if(Integer.parseInt(jButton30.getText())!=sudoku[3][2]&&(Integer.parseInt(jButton30.getText())!=0))
        {
            jButton30.setText("0");
            jButton30.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton30.setBorder(null);
        }
                if(Integer.parseInt(jButton31.getText())!=sudoku[3][3]&&(Integer.parseInt(jButton31.getText())!=0))
        {
            jButton31.setText("0");
            jButton31.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }                else
        {
             
            jButton31.setBorder(null);
        }
                        if(Integer.parseInt(jButton32.getText())!=sudoku[3][4]&&(Integer.parseInt(jButton32.getText())!=0))
        {
            jButton32.setText("0");
            jButton32.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }                else
        {
             
            jButton32.setBorder(null);
        }
                if(Integer.parseInt(jButton33.getText())!=sudoku[3][5]&&(Integer.parseInt(jButton33.getText())!=0))
        {
            jButton33.setText("0");
            jButton33.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }                else
        {
             
            jButton33.setBorder(null);
        }
                        if(Integer.parseInt(jButton34.getText())!=sudoku[3][6]&&(Integer.parseInt(jButton34.getText())!=0))
        {
            jButton34.setText("0");
            jButton34.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }                else
        {
             
            jButton34.setBorder(null);
        }
                if(Integer.parseInt(jButton35.getText())!=sudoku[3][7]&&(Integer.parseInt(jButton35.getText())!=0))
        {
            jButton35.setText("0");
            jButton35.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }                else
        {
             
            jButton35.setBorder(null);
        }
                if(Integer.parseInt(jButton36.getText())!=sudoku[3][8]&&(Integer.parseInt(jButton36.getText())!=0))
        {
            jButton36.setText("0");
            jButton36.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }                else
        {
             
            jButton36.setBorder(null);
        }
        if(Integer.parseInt(jButton37.getText())!=sudoku[4][0]&&(Integer.parseInt(jButton37.getText())!=0))
        {
            jButton37.setText("0");
            jButton37.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }                else
        {
             
            jButton37.setBorder(null);
        }
                if(Integer.parseInt(jButton38.getText())!=sudoku[4][1]&&(Integer.parseInt(jButton38.getText())!=0))
        {
            jButton38.setText("0");
            jButton38.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }                else
        {
             
            jButton38.setBorder(null);
        }
                        if(Integer.parseInt(jButton39.getText())!=sudoku[4][2]&&(Integer.parseInt(jButton39.getText())!=0))
        {
            jButton39.setText("0");
            jButton39.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }                else
        {
             
            jButton39.setBorder(null);
        }
                if(Integer.parseInt(jButton40.getText())!=sudoku[4][3]&&(Integer.parseInt(jButton40.getText())!=0))
        {
            jButton40.setText("0");
            jButton40.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton40.setBorder(null);
        }
                        if(Integer.parseInt(jButton41.getText())!=sudoku[4][4]&&(Integer.parseInt(jButton41.getText())!=0))
        {
            jButton41.setText("0");
            jButton41.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton41.setBorder(null);
        }
                if(Integer.parseInt(jButton42.getText())!=sudoku[4][5]&&(Integer.parseInt(jButton42.getText())!=0))
        {
            jButton42.setText("0");
            jButton42.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton42.setBorder(null);
        }
                        if(Integer.parseInt(jButton43.getText())!=sudoku[4][6]&&(Integer.parseInt(jButton43.getText())!=0))
        {
            jButton43.setText("0");
            jButton43.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton43.setBorder(null);
        }
                if(Integer.parseInt(jButton44.getText())!=sudoku[4][7]&&(Integer.parseInt(jButton44.getText())!=0))
        {
            jButton44.setText("0");
            jButton44.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton44.setBorder(null);
        }
                if(Integer.parseInt(jButton45.getText())!=sudoku[4][8]&&(Integer.parseInt(jButton45.getText())!=0))
        {
            jButton45.setText("0");
            jButton45.setBorder(new LineBorder(Color.RED,6));
            counter++;
        } 
                else
        {
             
            jButton45.setBorder(null);
        }
        if(Integer.parseInt(jButton46.getText())!=sudoku[5][0]&&(Integer.parseInt(jButton46.getText())!=0))
        {
            jButton46.setText("0");
            jButton46.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton46.setBorder(null);
        }
                if(Integer.parseInt(jButton47.getText())!=sudoku[5][1]&&(Integer.parseInt(jButton47.getText())!=0))
        {
            jButton47.setText("0");
            jButton47.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton47.setBorder(null);
        }
                        if(Integer.parseInt(jButton48.getText())!=sudoku[5][2]&&(Integer.parseInt(jButton48.getText())!=0))
        {
            jButton48.setText("0");
            jButton48.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton48.setBorder(null);
        }
                if(Integer.parseInt(jButton49.getText())!=sudoku[5][3]&&(Integer.parseInt(jButton49.getText())!=0))
        {
            jButton49.setText("0");
            jButton49.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton49.setBorder(null);
        }
                        if(Integer.parseInt(jButton50.getText())!=sudoku[5][4]&&(Integer.parseInt(jButton50.getText())!=0))
        {
            jButton50.setText("0");
            jButton50.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton50.setBorder(null);
        }
                if(Integer.parseInt(jButton51.getText())!=sudoku[5][5]&&(Integer.parseInt(jButton51.getText())!=0))
        {
            jButton51.setText("0");
            jButton51.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton51.setBorder(null);
        }
                        if(Integer.parseInt(jButton52.getText())!=sudoku[5][6]&&(Integer.parseInt(jButton52.getText())!=0))
        {
            jButton52.setText("0");
            jButton52.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton52.setBorder(null);
        }
                if(Integer.parseInt(jButton53.getText())!=sudoku[5][7]&&(Integer.parseInt(jButton53.getText())!=0))
        {
            jButton53.setText("0");
            jButton53.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton53.setBorder(null);
        }
                if(Integer.parseInt(jButton54.getText())!=sudoku[5][8]&&(Integer.parseInt(jButton54.getText())!=0))
        {
            jButton54.setText("0");
            jButton54.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton54.setBorder(null);
        }                
        if(Integer.parseInt(jButton55.getText())!=sudoku[6][0]&&(Integer.parseInt(jButton55.getText())!=0))
        {
            jButton55.setText("0");
            jButton55.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton55.setBorder(null);
        }
                if(Integer.parseInt(jButton56.getText())!=sudoku[6][1]&&(Integer.parseInt(jButton56.getText())!=0))
        {
            jButton56.setText("0");
            jButton56.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton56.setBorder(null);
        }
                        if(Integer.parseInt(jButton57.getText())!=sudoku[6][2]&&(Integer.parseInt(jButton57.getText())!=0))
        {
            jButton57.setText("0");
            jButton57.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton57.setBorder(null);
        }
                if(Integer.parseInt(jButton58.getText())!=sudoku[6][3]&&(Integer.parseInt(jButton58.getText())!=0))
        {
            jButton58.setText("0");
            jButton58.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton58.setBorder(null);
        }
                        if(Integer.parseInt(jButton59.getText())!=sudoku[6][4]&&(Integer.parseInt(jButton59.getText())!=0))
        {
            jButton59.setText("0");
            jButton59.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton59.setBorder(null);
        }
                if(Integer.parseInt(jButton60.getText())!=sudoku[6][5]&&(Integer.parseInt(jButton60.getText())!=0))
        {
            jButton60.setText("0");
            jButton60.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton60.setBorder(null);
        }
                        if(Integer.parseInt(jButton61.getText())!=sudoku[6][6]&&(Integer.parseInt(jButton61.getText())!=0))
        {
            jButton61.setText("0");
            jButton61.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton61.setBorder(null);
        }
                if(Integer.parseInt(jButton62.getText())!=sudoku[6][7]&&(Integer.parseInt(jButton62.getText())!=0))
        {
            jButton62.setText("0");
            jButton62.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton62.setBorder(null);
        }
                if(Integer.parseInt(jButton63.getText())!=sudoku[6][8]&&(Integer.parseInt(jButton63.getText())!=0))
        {
            jButton63.setText("0");
            jButton63.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton63.setBorder(null);
        }                
        if(Integer.parseInt(jButton64.getText())!=sudoku[7][0]&&(Integer.parseInt(jButton64.getText())!=0))
        {
            jButton64.setText("0");
            jButton64.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton64.setBorder(null);
        }
                if(Integer.parseInt(jButton65.getText())!=sudoku[7][1]&&(Integer.parseInt(jButton65.getText())!=0))
        {
            jButton65.setText("0");
            jButton65.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton65.setBorder(null);
        }
                        if(Integer.parseInt(jButton66.getText())!=sudoku[7][2]&&(Integer.parseInt(jButton66.getText())!=0))
        {
            jButton66.setText("0");
            jButton66.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton66.setBorder(null);
        }
                if(Integer.parseInt(jButton67.getText())!=sudoku[7][3]&&(Integer.parseInt(jButton67.getText())!=0))
        {
            jButton67.setText("0");
            jButton67.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton67.setBorder(null);
        }
                        if(Integer.parseInt(jButton68.getText())!=sudoku[7][4]&&(Integer.parseInt(jButton68.getText())!=0))
        {
            jButton68.setText("0");
            jButton68.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton68.setBorder(null);
        }
                if(Integer.parseInt(jButton69.getText())!=sudoku[7][5]&&(Integer.parseInt(jButton69.getText())!=0))
        {
            jButton69.setText("0");
            jButton69.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton69.setBorder(null);
        }
                        if(Integer.parseInt(jButton70.getText())!=sudoku[7][6]&&(Integer.parseInt(jButton70.getText())!=0))
        {
            jButton70.setText("0");
            jButton70.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton70.setBorder(null);
        }
                if(Integer.parseInt(jButton71.getText())!=sudoku[7][7]&&(Integer.parseInt(jButton71.getText())!=0))
        {
            jButton71.setText("0");
            jButton71.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton71.setBorder(null);
        }
                if(Integer.parseInt(jButton72.getText())!=sudoku[7][8]&&(Integer.parseInt(jButton72.getText())!=0))
        {
            jButton72.setText("0");
            jButton72.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton72.setBorder(null);
        }
        if(Integer.parseInt(jButton73.getText())!=sudoku[8][0]&&(Integer.parseInt(jButton73.getText())!=0))
        {
            jButton73.setText("0");
            jButton73.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton73.setBorder(null);
        }
                if(Integer.parseInt(jButton74.getText())!=sudoku[8][1]&&(Integer.parseInt(jButton74.getText())!=0))
        {
            jButton74.setText("0");
            jButton74.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton74.setBorder(null);
        }
                        if(Integer.parseInt(jButton75.getText())!=sudoku[8][2]&&(Integer.parseInt(jButton75.getText())!=0))
        {
            jButton75.setText("0");
            jButton75.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton75.setBorder(null);
        }
                if(Integer.parseInt(jButton76.getText())!=sudoku[8][3]&&(Integer.parseInt(jButton76.getText())!=0))
        {
            jButton76.setText("0");
            jButton76.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton76.setBorder(null);
        }
                        if(Integer.parseInt(jButton77.getText())!=sudoku[8][4]&&(Integer.parseInt(jButton77.getText())!=0))
        {
            jButton77.setText("0");
            jButton77.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton77.setBorder(null);
        }
                if(Integer.parseInt(jButton78.getText())!=sudoku[8][5]&&(Integer.parseInt(jButton78.getText())!=0))
        {
            jButton78.setText("0");
            jButton78.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton78.setBorder(null);
        }
                        if(Integer.parseInt(jButton79.getText())!=sudoku[8][6]&&(Integer.parseInt(jButton79.getText())!=0))
        {
            jButton79.setText("0");
            jButton79.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton79.setBorder(null);
        }
                if(Integer.parseInt(jButton80.getText())!=sudoku[8][7]&&(Integer.parseInt(jButton80.getText())!=0))
        {
            jButton80.setText("0");
            jButton80.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton80.setBorder(null);
        }
                if(Integer.parseInt(jButton81.getText())!=sudoku[8][8]&&(Integer.parseInt(jButton81.getText())!=0))
        {
            jButton81.setText("0");
            jButton81.setBorder(new LineBorder(Color.RED,6));
            counter++;
        }
                else
        {
             
            jButton81.setBorder(null);
        }                
         totalcounter=totalcounter+counter;       
    }
    
    public void checkBlanks()
    {   
        bcounter=0;
        if(Integer.parseInt(jButton1.getText())==0)
        
            bcounter++;
        
                if((Integer.parseInt(jButton2.getText())==0))
        
            bcounter++;
                       if((Integer.parseInt(jButton3.getText())==0))
        bcounter++;
        
                if((Integer.parseInt(jButton4.getText())==0))
            bcounter++;
        
                        if((Integer.parseInt(jButton5.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton6.getText())==0))
            bcounter++;
        
                        if((Integer.parseInt(jButton7.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton8.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton9.getText())==0))
            bcounter++;
          
        if((Integer.parseInt(jButton10.getText())==0))
            bcounter++;
                if((Integer.parseInt(jButton11.getText())==0))
            bcounter++;
                        if((Integer.parseInt(jButton12.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton13.getText())==0))
            bcounter++;
         
                        if((Integer.parseInt(jButton14.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton15.getText())==0))
            bcounter++;
        
                        if((Integer.parseInt(jButton16.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton17.getText())==0))
            bcounter++;
        
         
                if((Integer.parseInt(jButton18.getText())==0))
            bcounter++;
        
        if((Integer.parseInt(jButton19.getText())==0))
        
            bcounter++;
        
                if((Integer.parseInt(jButton20.getText())==0))
        
            bcounter++;
        
                        if((Integer.parseInt(jButton21.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton22.getText())==0))
            bcounter++;
                       if((Integer.parseInt(jButton23.getText())==0))
            bcounter++;
        
         
                if((Integer.parseInt(jButton24.getText())==0))
            bcounter++;
        
                        if((Integer.parseInt(jButton25.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton26.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton27.getText())==0))
            bcounter++;
        
                         
        if((Integer.parseInt(jButton28.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton29.getText())==0))
            bcounter++;
                        if((Integer.parseInt(jButton30.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton31.getText())==0))
            bcounter++;
                       if((Integer.parseInt(jButton32.getText())==0))
            bcounter++;
               if((Integer.parseInt(jButton33.getText())==0))
            bcounter++;
                       if((Integer.parseInt(jButton34.getText())==0))
            bcounter++;
               if((Integer.parseInt(jButton35.getText())==0))
            bcounter++;
               if((Integer.parseInt(jButton36.getText())==0))
            bcounter++;
        
        if( (Integer.parseInt(jButton37.getText())==0))
            bcounter++;
               if( (Integer.parseInt(jButton38.getText())==0))
            bcounter++;
                       if( (Integer.parseInt(jButton39.getText())==0))
            bcounter++;
        
                if( (Integer.parseInt(jButton40.getText())==0))
            bcounter++;
        
                        if( (Integer.parseInt(jButton41.getText())==0))
            bcounter++;
        
                if( (Integer.parseInt(jButton42.getText())==0))
            bcounter++;
        
                        if((Integer.parseInt(jButton43.getText())==0))
            bcounter++;
        
         
                if((Integer.parseInt(jButton44.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton45.getText())==0))
            bcounter++;
        
        if((Integer.parseInt(jButton46.getText())==0))
            bcounter++;
                if((Integer.parseInt(jButton47.getText())==0))
            bcounter++;
        
                       if((Integer.parseInt(jButton48.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton49.getText())==0))
            bcounter++;
        
                        if((Integer.parseInt(jButton50.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton51.getText())==0))
            bcounter++;
                        if((Integer.parseInt(jButton52.getText())==0))
            bcounter++;
        
         
                if((Integer.parseInt(jButton53.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton54.getText())==0))
            bcounter++;
                        
        if((Integer.parseInt(jButton55.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton56.getText())==0))
            bcounter++;
        
                        if((Integer.parseInt(jButton57.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton58.getText())==0))
            bcounter++;
        
                        if((Integer.parseInt(jButton59.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton60.getText())==0))
            bcounter++;
        
                        if((Integer.parseInt(jButton61.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton62.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton63.getText())==0))
            bcounter++;
                        
        if((Integer.parseInt(jButton64.getText())==0))
            bcounter++;
        
               if((Integer.parseInt(jButton65.getText())==0))
            bcounter++;
        
                        if((Integer.parseInt(jButton66.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton67.getText())==0))
            bcounter++;
        
                        if((Integer.parseInt(jButton68.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton69.getText())==0))
            bcounter++;
        
                        if((Integer.parseInt(jButton70.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton71.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton72.getText())==0))
            bcounter++;
        
         
        if((Integer.parseInt(jButton73.getText())==0))
        
            bcounter++;
        
                if((Integer.parseInt(jButton74.getText())==0))
            bcounter++;
        
                        if((Integer.parseInt(jButton75.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton76.getText())==0))
            bcounter++;
        
                        if((Integer.parseInt(jButton77.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton78.getText())==0))
            bcounter++;
        
                        if((Integer.parseInt(jButton79.getText())==0))
            bcounter++;
        
                if((Integer.parseInt(jButton80.getText())==0))
            bcounter++;
        
         
                if((Integer.parseInt(jButton81.getText())==0))
            bcounter++;
            

    }
    public void editNumber(int a)
    {
         int temp=a;
         JTextArea area = new javax.swing.JTextArea();
         area.setBorder(new LineBorder(Color.BLACK,2));
         area.setBackground(new Color(0,153,255));
         area.setColumns(20);
         area.setFont(new java.awt.Font("Times New Roman", 2, 50));
         area.setText("    Please Enter a Number Between 1 and 9 ");
         area.setRows(5);
         area.setBounds(20,300,10,20);
         area.setSize(900,200);
         area.setEditable(false);
         JFrame frame = new JFrame();
         frame.getContentPane().setBackground(new Color(0,153,255));
         frame.setLayout(null);
         frame.setSize(1000,1000);
         frame. setLocation(1800,0);
         JTextField edit = new JTextField();
         edit.setBorder(new LineBorder(Color.BLACK,2));
         edit.setBackground(new Color(0,153,255));
         edit.setBounds(82,10,10,20);
         edit.setSize(200,200);
         frame.add(edit);
         frame.add(area);
         JButton btn = new JButton("SUBMIT");
         btn.setBorder(new LineBorder(Color.BLACK,2));
         btn.setBounds(300,10,100,20);
         btn.setSize(200,200);
         btn.setBackground(new Color(0,153,255));
         frame.add(btn);
         frame.setVisible(true);
         Font font1 = new Font("Times New Roman", Font.BOLD, 32);
         Font font2 = new Font("Times New Roman", Font.BOLD, 50);
         edit.setFont(font2);
         btn.setFont(font1);
         
         btn.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
            {
              final String text = edit.getText();
              int tempText = Integer.parseInt(text);
              frame.setVisible(false);
              if(tempText<1||tempText>9)
                  editNumber(temp);
              else
              {
                  switch(a){
                case 1:
                    jButton1.setText(text);
                    break;
                case 2:
                    jButton2.setText(text);
                    break;
                    case 3:
                    jButton3.setText(text);
                    break;
                case 4:
                    jButton4.setText(text);
                    break;
                case 5:
                    jButton5.setText(text);
                    break;
                case 6:
                    jButton6.setText(text);
                    break;
                    case 7:
                    jButton7.setText(text);
                    break;
                case 8:
                    jButton8.setText(text);
                    break; 
                case 9:
                    jButton9.setText(text);
                    break;
                case 10:
                    jButton10.setText(text);
                    break;
                case 11:
                    jButton11.setText(text);
                    break;
                case 12:
                    jButton12.setText(text);
                    break;
                case 13:
                    jButton13.setText(text);
                    break;
                case 14:
                    jButton14.setText(text);
                    break;
                case 15:
                    jButton15.setText(text);
                    break;
                case 16:
                    jButton16.setText(text);
                    break;    
                case 17:
                    jButton17.setText(text);
                    break;
                case 18:
                    jButton18.setText(text);
                    break;
                    case 19:
                    jButton19.setText(text);
                    break;
                case 20:
                    jButton20.setText(text);
                    break;
                case 21:
                    jButton21.setText(text);
                    break;
                case 22:
                    jButton22.setText(text);
                    break;
                    case 23:
                    jButton23.setText(text);
                    break;
                case 24:
                    jButton24.setText(text);
                    break; 
                case 25:
                    jButton25.setText(text);
                    break;
                case 26:
                    jButton26.setText(text);
                    break;
                case 27:
                    jButton27.setText(text);
                    break;
                case 28:
                    jButton28.setText(text);
                    break;
                case 29:
                    jButton29.setText(text);
                    break;
                case 30:
                    jButton30.setText(text);
                    break;
                case 31:
                    jButton31.setText(text);
                    break;
                case 32:
                    jButton32.setText(text);
                    break;
                case 33:
                    jButton33.setText(text);
                    break;
                case 34:
                    jButton34.setText(text);
                    break;
                    case 35:
                    jButton35.setText(text);
                    break;
                case 36:
                    jButton36.setText(text);
                    break;
                case 37:
                    jButton37.setText(text);
                    break;
                case 38:
                    jButton38.setText(text);
                    break;
                    case 39:
                    jButton39.setText(text);
                    break;
                case 40:
                    jButton40.setText(text);
                    break; 
                case 41:
                    jButton41.setText(text);
                    break;
                case 42:
                    jButton42.setText(text);
                    break;
                case 43:
                    jButton43.setText(text);
                    break;
                case 44:
                    jButton44.setText(text);
                    break;
                case 45:
                    jButton45.setText(text);
                    break;
                case 46:
                    jButton46.setText(text);
                    break;
                case 47:
                    jButton47.setText(text);
                    break;
                case 48:
                    jButton48.setText(text);
                    break;    
                case 49:
                    jButton49.setText(text);
                    break;
                case 50:
                    jButton50.setText(text);
                    break;
                    case 51:
                    jButton51.setText(text);
                    break;
                case 52:
                    jButton52.setText(text);
                    break;
                case 53:
                    jButton53.setText(text);
                    break;
                case 54:
                    jButton54.setText(text);
                    break;
                    case 55:
                    jButton55.setText(text);
                    break;
                case 56:
                    jButton56.setText(text);
                    break; 
                case 57:
                    jButton57.setText(text);
                    break;
                case 58:
                    jButton58.setText(text);
                    break;
                case 59:
                    jButton59.setText(text);
                    break;
                case 60:
                    jButton60.setText(text);
                    break;
                case 61:
                    jButton61.setText(text);
                    break;
                case 62:
                    jButton62.setText(text);
                    break;
                case 63:
                    jButton63.setText(text);
                    break;
                case 64:
                    jButton64.setText(text);
                    break;
                case 65:
                    jButton65.setText(text);
                    break;
                case 66:
                    jButton66.setText(text);
                    break;
                    case 67:
                    jButton67.setText(text);
                    break;
                case 68:
                    jButton68.setText(text);
                    break;
                case 69:
                    jButton69.setText(text);
                    break;
                case 70:
                    jButton70.setText(text);
                    break;
                    case 71:
                    jButton71.setText(text);
                    break;
                case 72:
                    jButton72.setText(text);
                    break; 
                case 73:
                    jButton73.setText(text);
                    break;
                case 74:
                    jButton74.setText(text);
                    break;
                case 75:
                    jButton75.setText(text);
                    break;
                case 76:
                    jButton76.setText(text);
                    break;
                case 77:
                    jButton77.setText(text);
                    break;
                case 78:
                    jButton78.setText(text);
                    break;
                case 79:
                    jButton79.setText(text);
                    break;
                case 80:
                    jButton80.setText(text);
                    break;    
                case 81:
                    jButton81.setText(text);
                    break;                    
            }
              }
              
              
           }
            });
         frame.getRootPane().setDefaultButton(btn);
        
    }
    public void solve()
    {
                            jButton1.setText(Integer.toString(sudoku[0][0]));
                    jButton2.setText(Integer.toString(sudoku[0][1]));
                    jButton3.setText(Integer.toString(sudoku[0][2]));
                    jButton4.setText(Integer.toString(sudoku[0][3]));
                    jButton5.setText(Integer.toString(sudoku[0][4]));
                    jButton6.setText(Integer.toString(sudoku[0][5]));
                    jButton7.setText(Integer.toString(sudoku[0][6]));
                    jButton8.setText(Integer.toString(sudoku[0][7]));
                    jButton9.setText(Integer.toString(sudoku[0][8]));
                    jButton10.setText(Integer.toString(sudoku[1][0]));
                    jButton11.setText(Integer.toString(sudoku[1][1]));
                    jButton12.setText(Integer.toString(sudoku[1][2]));
                    jButton13.setText(Integer.toString(sudoku[1][3]));
                    jButton14.setText(Integer.toString(sudoku[1][4]));
                    jButton15.setText(Integer.toString(sudoku[1][5]));
                    jButton16.setText(Integer.toString(sudoku[1][6]));
                    jButton17.setText(Integer.toString(sudoku[1][7]));
                    jButton18.setText(Integer.toString(sudoku[1][8]));
                    jButton19.setText(Integer.toString(sudoku[2][0]));
                    jButton20.setText(Integer.toString(sudoku[2][1]));
                    jButton21.setText(Integer.toString(sudoku[2][2]));
                    jButton22.setText(Integer.toString(sudoku[2][3]));
                    jButton23.setText(Integer.toString(sudoku[2][4]));
                    jButton24.setText(Integer.toString(sudoku[2][5]));
                    jButton25.setText(Integer.toString(sudoku[2][6]));
                    jButton26.setText(Integer.toString(sudoku[2][7]));
                    jButton27.setText(Integer.toString(sudoku[2][8]));
                    jButton28.setText(Integer.toString(sudoku[3][0]));
                    jButton29.setText(Integer.toString(sudoku[3][1]));
                    jButton30.setText(Integer.toString(sudoku[3][2]));
                    jButton31.setText(Integer.toString(sudoku[3][3]));
                    jButton32.setText(Integer.toString(sudoku[3][4]));
                    jButton33.setText(Integer.toString(sudoku[3][5]));
                    jButton34.setText(Integer.toString(sudoku[3][6]));
                    jButton35.setText(Integer.toString(sudoku[3][7]));
                    jButton36.setText(Integer.toString(sudoku[3][8]));
                    jButton37.setText(Integer.toString(sudoku[4][0]));
                    jButton38.setText(Integer.toString(sudoku[4][1]));
                    jButton39.setText(Integer.toString(sudoku[4][2]));
                    jButton40.setText(Integer.toString(sudoku[4][3]));
                    jButton41.setText(Integer.toString(sudoku[4][4]));
                    jButton42.setText(Integer.toString(sudoku[4][5]));
                    jButton43.setText(Integer.toString(sudoku[4][6]));
                    jButton44.setText(Integer.toString(sudoku[4][7]));
                    jButton45.setText(Integer.toString(sudoku[4][8]));
                    jButton46.setText(Integer.toString(sudoku[5][0]));
                    jButton47.setText(Integer.toString(sudoku[5][1]));
                    jButton48.setText(Integer.toString(sudoku[5][2]));
                    jButton49.setText(Integer.toString(sudoku[5][3]));
                    jButton50.setText(Integer.toString(sudoku[5][4]));
                    jButton51.setText(Integer.toString(sudoku[5][5]));
                    jButton52.setText(Integer.toString(sudoku[5][6]));
                    jButton53.setText(Integer.toString(sudoku[5][7]));
                    jButton54.setText(Integer.toString(sudoku[5][8]));
                    jButton55.setText(Integer.toString(sudoku[6][0]));
                    jButton56.setText(Integer.toString(sudoku[6][1]));
                    jButton57.setText(Integer.toString(sudoku[6][2]));
                    jButton58.setText(Integer.toString(sudoku[6][3]));
                    jButton59.setText(Integer.toString(sudoku[6][4]));
                    jButton60.setText(Integer.toString(sudoku[6][5]));
                    jButton61.setText(Integer.toString(sudoku[6][6]));
                    jButton62.setText(Integer.toString(sudoku[6][7]));
                    jButton63.setText(Integer.toString(sudoku[6][8]));
                    jButton64.setText(Integer.toString(sudoku[7][0]));
                    jButton65.setText(Integer.toString(sudoku[7][1]));
                    jButton66.setText(Integer.toString(sudoku[7][2]));
                    jButton67.setText(Integer.toString(sudoku[7][3]));
                    jButton68.setText(Integer.toString(sudoku[7][4]));
                    jButton69.setText(Integer.toString(sudoku[7][5]));
                    jButton70.setText(Integer.toString(sudoku[7][6]));
                    jButton71.setText(Integer.toString(sudoku[7][7]));
                    jButton72.setText(Integer.toString(sudoku[7][8]));               
                    jButton73.setText(Integer.toString(sudoku[8][0]));
                    jButton74.setText(Integer.toString(sudoku[8][1]));
                    jButton75.setText(Integer.toString(sudoku[8][2]));
                    jButton76.setText(Integer.toString(sudoku[8][3]));
                    jButton77.setText(Integer.toString(sudoku[8][4]));
                    jButton78.setText(Integer.toString(sudoku[8][5]));
                    jButton79.setText(Integer.toString(sudoku[8][6]));
                    jButton80.setText(Integer.toString(sudoku[8][7]));
                    jButton81.setText(Integer.toString(sudoku[8][8]));

    }

        

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Start;
    private javax.swing.JButton check;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JButton solve;
    private javax.swing.JButton solved;
    // End of variables declaration//GEN-END:variables
}
