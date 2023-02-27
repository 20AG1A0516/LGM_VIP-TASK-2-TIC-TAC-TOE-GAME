import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class TicTacToe extends javax.swing.JFrame {
    static int chance = 0;
    static int[][] board = new int[3][3];
    static int[] blank = new int[9];
    static List H = new ArrayList();
    static List C = new ArrayList();
    static int[] magicSq = new int[9];
    static int h = 0;
    private String startGame = "X";   // Creates new form TicTacToe
    static int hCount = 0;
    static int cCount = 0;
    static int t = 0;
    public TicTacToe() {
        initComponents();
        setSize(1200, 600);
        setLocationRelativeTo(null);
    }
    private void gameScore() {
        jlblPlayerX.setText(String.valueOf(hCount));
        jlblPlayerO.setText(String.valueOf(cCount));
    }
    private void choose_a_Player() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jlblPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btn5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btn6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jlblPlayerO = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        btn8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        btn9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jbtnnreset = new javax.swing.JButton();
        tie = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jbtnnexit = new javax.swing.JButton();
        lble = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setSize(new java.awt.Dimension(400, 400));
        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);
        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));
        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());
        btn1.setFont(new java.awt.Font("Tahoma", 1, 75));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn1, java.awt.BorderLayout.CENTER);
        jPanel2.add(jPanel3);
        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());
        btn2.setFont(new java.awt.Font("Tahoma", 1, 75));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel4.add(btn2, java.awt.BorderLayout.CENTER);
        jPanel2.add(jPanel4);
        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());
        btn3.setFont(new java.awt.Font("Tahoma", 1, 75)); // 
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel5.add(btn3, java.awt.BorderLayout.CENTER);
        jPanel2.add(jPanel5);
        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // 
        jLabel4.setText("User:");
        jPanel6.add(jLabel4, java.awt.BorderLayout.CENTER);
        jPanel2.add(jPanel6);
        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());
        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 36)); // 
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jPanel7.add(jlblPlayerX, java.awt.BorderLayout.CENTER);
        jPanel2.add(jPanel7);
        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        btn4.setFont(new java.awt.Font("Tahoma", 1, 75)); // 
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel8.add(btn4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        btn5.setFont(new java.awt.Font("Tahoma", 1, 75)); // 
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel9.add(btn5, java.awt.BorderLayout.CENTER);
        jPanel2.add(jPanel9);
        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());
        btn6.setFont(new java.awt.Font("Tahoma", 1, 75)); // 
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel10.add(btn6, java.awt.BorderLayout.CENTER);
        jPanel2.add(jPanel10);
        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // 
        jLabel5.setText("Computer:");
        jPanel11.add(jLabel5, java.awt.BorderLayout.CENTER);
        jPanel2.add(jPanel11);
        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());
        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 36)); // 
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jPanel12.add(jlblPlayerO, java.awt.BorderLayout.CENTER);
        jPanel2.add(jPanel12);
        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());
        btn7.setFont(new java.awt.Font("Tahoma", 1, 75)); // 
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel13.add(btn7, java.awt.BorderLayout.CENTER);
        jPanel2.add(jPanel13);
        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());
        btn8.setFont(new java.awt.Font("Tahoma", 1, 75)); // 
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel14.add(btn8, java.awt.BorderLayout.CENTER);
        jPanel2.add(jPanel14);
        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());
        btn9.setFont(new java.awt.Font("Tahoma", 1, 75)); // 
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel15.add(btn9, java.awt.BorderLayout.CENTER);
        jPanel2.add(jPanel15);
        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());
        jbtnnreset.setFont(new java.awt.Font("Tahoma", 1, 36)); // 
        jbtnnreset.setText("Reset");
        jbtnnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnresetActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnnreset, java.awt.BorderLayout.CENTER);
        tie.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // 
        tie.setForeground(new java.awt.Color(102, 0, 102));
        tie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tie.setText("Ties: 0");
        jPanel16.add(tie, java.awt.BorderLayout.PAGE_START);
        jPanel2.add(jPanel16);
        jPanel17.setBackground(new java.awt.Color(204, 255, 204));
        jPanel17.setLayout(new java.awt.BorderLayout());
        jbtnnexit.setFont(new java.awt.Font("Tahoma", 1, 24)); // 
        jbtnnexit.setText("Start Game");
        jbtnnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnexitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnnexit, java.awt.BorderLayout.CENTER);
        lble.setBackground(new java.awt.Color(204, 204, 255));
        lble.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // 
        lble.setForeground(new java.awt.Color(153, 0, 153));
        lble.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lble.setText("Start the Game here!!");
        jPanel17.add(lble, java.awt.BorderLayout.PAGE_START);
        jPanel2.add(jPanel17);
        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);
        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
        pack();
    }
    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {
        btn6.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn6.setForeground(Color.red);
        } else {
            btn6.setForeground(Color.GREEN);
        }
        choose_a_Player();
        chance++;
        if (win(6) == 1) {
            JOptionPane.showMessageDialog(this, "User Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            hCount++;

        } else if (chance % 2 == 0 && h == 0) {
            H.add(6);
            blank[5] = 1;
            gamec(chance);
        } else if (chance % 2 != 0 && h == 1) {
            H.add(6);
            blank[5] = 1;
            game(chance);
        }
        btn6.setEnabled(false);
    }
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {
        btn4.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn4.setForeground(Color.red);
        } else {
            btn4.setForeground(Color.GREEN);
        }
        choose_a_Player();
        chance++;
        if (win(4) == 1) {
            JOptionPane.showMessageDialog(this, "User Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            hCount++;
        } else if (chance % 2 == 0 && h == 0) {
            H.add(4);
            blank[3] = 1;
            gamec(chance);
        } else if (chance % 2 != 0 && h == 1) {
            H.add(4);
            blank[3] = 1;
            game(chance);
        }
        btn4.setEnabled(false);
    }
    private JFrame frame;
    private void jbtnnexitActionPerformed(java.awt.event.ActionEvent evt) {
        frame = new JFrame("Exit");
        if (jbtnnexit.getText() == "Start Game") {
            if (JOptionPane.showConfirmDialog(frame, "Do you want to Play first?", "Tic Tac Toe",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
                h = 1;
            if (h == 0) {
                gamec(0);
            }
            jbtnnexit.setText("Exit");
            lble.setText("Exit Game here!!");
        } else {
            if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit the Game", "Tic Tac Toe",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                System.exit(0);
            }
        }
    }
    private void jbtnnresetActionPerformed(java.awt.event.ActionEvent evt) {
        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
        btn1.setBackground(Color.LIGHT_GRAY);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn3.setBackground(Color.LIGHT_GRAY);
        btn4.setBackground(Color.LIGHT_GRAY);
        btn5.setBackground(Color.LIGHT_GRAY);
        btn6.setBackground(Color.LIGHT_GRAY);
        btn7.setBackground(Color.LIGHT_GRAY);
        btn8.setBackground(Color.LIGHT_GRAY);
        btn9.setBackground(Color.LIGHT_GRAY);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        chance = 0;
        H.clear();
        C.clear();
        h = 0;
        choose_a_Player();
        for (int i = 0; i < 9; i++) {

            blank[i] = -1;
        }
        if (JOptionPane.showConfirmDialog(frame, "Do you want to Play first?", "Tic Tac Toe",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
            h = 1;
        if (h == 0) {
            gamec(0);
        }
    }
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {
        chance++;
        btn1.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn1.setForeground(Color.red);
        } else {
            btn1.setForeground(Color.GREEN);
        }
        choose_a_Player();
        if (win(1) == 1) {
            JOptionPane.showMessageDialog(this, "User Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            hCount++;
            gameScore();
        } else if (chance % 2 == 0 && h == 0) {
            H.add(1);
            blank[0] = 1;
            gamec(chance);
        } else if (chance % 2 != 0 && h == 1) {
            H.add(1);
            blank[0] = 1;
            game(chance);
        }
        btn1.setEnabled(false);
    }
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {
        chance++;
        btn2.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn2.setForeground(Color.red);
        } else {
            btn2.setForeground(Color.GREEN);
        }
        choose_a_Player();
        if (win(2) == 1) {
            JOptionPane.showMessageDialog(this, "User Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            hCount++;
            gameScore();
        } else if (chance % 2 == 0 && h == 0) {
            H.add(2);
            blank[1] = 1;
            gamec(chance);
        } else if (chance % 2 != 0 && h == 1) {
            H.add(2);
            blank[1] = 1;
            game(chance);
        }
        btn2.setEnabled(false);
    }
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn3ActionPerformed
        btn3.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn3.setForeground(Color.red);
        } else {
            btn3.setForeground(Color.GREEN);
        }
        choose_a_Player();
        chance++;
        if (win(3) == 1) {
            JOptionPane.showMessageDialog(this, "User Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            hCount++;
            gameScore();
        } else if (chance % 2 == 0 && h == 0) {
            H.add(3);
            blank[2] = 1;
            gamec(chance);
        } else if (chance % 2 != 0 && h == 1) {
            H.add(3);
            blank[2] = 1;
            game(chance);
        }
        btn3.setEnabled(false);
    }
    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {
        btn5.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn5.setForeground(Color.red);
        } else {
            btn5.setForeground(Color.GREEN);
        }
        choose_a_Player();
        chance++;
        if (win(5) == 1) {
            JOptionPane.showMessageDialog(this, "User Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            hCount++;
            gameScore();
        } else if (chance % 2 == 0 && h == 0) {
            H.add(5);
            blank[4] = 1;
            gamec(chance);
        } else if (chance % 2 != 0 && h == 1) {
            H.add(5);
            blank[4] = 1;
            game(chance);
        }
        btn5.setEnabled(false);
    }
    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {
        btn7.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn7.setForeground(Color.red);
        } else {
            btn7.setForeground(Color.GREEN);
        }
        choose_a_Player();
        chance++;
        if (win(7) == 1) {
            JOptionPane.showMessageDialog(this, "User Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            hCount++;
        } else if (chance % 2 == 0 && h == 0) {
            H.add(7);
            blank[6] = 1;
            gamec(chance);
        } else if (chance % 2 != 0 && h == 1) {
            H.add(7);
            blank[6] = 1;
            game(chance);
        }
        btn7.setEnabled(false);
    }
    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {
        btn8.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn8.setForeground(Color.red);
        } else {
            btn8.setForeground(Color.GREEN);
        }
        choose_a_Player();
        chance++;
        if (win(8) == 1) {
            JOptionPane.showMessageDialog(this, "User Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            hCount++;
            gameScore();
        } else if (chance % 2 == 0 && h == 0) {
            H.add(8);
            blank[7] = 1;
            gamec(chance);
        } else if (chance % 2 != 0 && h == 1) {
            H.add(8);
            blank[7] = 1;
            game(chance);
        }
        btn8.setEnabled(false);
    }
    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {
        btn9.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            btn9.setForeground(Color.red);
        } else {
            btn9.setForeground(Color.GREEN);
        }
        choose_a_Player();
        chance++;
        if (win(9) == 1) {
            JOptionPane.showMessageDialog(this, "User Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            hCount++;
        } else if (chance % 2 == 0 && h == 0) {
            H.add(9);
            blank[8] = 1;
            gamec(chance);
        } else if (chance % 2 != 0 && h == 1) {
            H.add(9);
            blank[8] = 1;
            game(chance);
        }
        btn9.setEnabled(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        magicSq = magicSquare();
        for (int i = 0; i < 9; i++) {
            System.out.println(magicSq[i]);
            blank[i] = -1;
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);

            }
        });
    }
    public void gamec(int x) {
        if (x == 0) {
            System.out.println("Move 1: Computer's Chance");

            if (!H.contains(5)) {
                if (go(4, 0)) {
                    C.add(5);
                    blank[4] = 0;
                    cli(5);
                }
            }
        }
        if (x == 2) {
            if (!H.contains(9)) {
                if (go(8, 0)) {
                    C.add(9);
                    blank[8] = 0;
                    cli(9);
                }
            } else {
                go(Make_2(0) - 1, 0);
                blank[Make_2(0) - 1] = 0;
                C.add(Make_2(0));
                cli(Make_2(0));
            }
        }
        if (x == 4) {
            int b = PossWin(C);
            if (b != 0) {
                go(b - 1, 0);
                C.add(b);
                blank[b - 1] = 0;
                cli(b);
                JOptionPane.showMessageDialog(this, "Computer Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                cCount++;
                gameScore();
            } else {
                int e = PossWin(H);

                if (e != 0) {
                    go(e - 1, 0);
                    C.add(e);
                    blank[e - 1] = 0;
                    cli(e);
                } else {
                    if (blank[6] == -1) {
                        go(6, 0);
                        blank[6] = 0;
                        C.add(7);
                        cli(7);
                    } else {
                        go(Make_2(0) - 1, 0);
                        blank[Make_2(0) - 1] = 0;

                        C.add(Make_2(0));
                        System.out.println(Make_2(0));
                        cli(Make_2(0));
                    }
                }

            }
        }
        if (x == 6) {
            int d = PossWin(C);
            System.out.print(d);
            if (d != 0) {
                go(d - 1, 0);
                C.add(d);
                blank[d - 1] = 0;
                cli(d);
                JOptionPane.showMessageDialog(this, "Computer Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                cCount++;
                gameScore();
            } else {
                int e = PossWin(H);
                if (e != 0) {
                    go(e - 1, 0);
                    C.add(e);
                    blank[e - 1] = 0;
                    cli(e);
                } else {
                    int move = goAny(0);
                    blank[move] = 0;
                    C.add(move + 1);
                    cli(move + 1);
                }
            }
        }
        if (x == 8) {
            System.out.println("Move 9: Computer's Chance");
            int k = PossWin(C);
            if (k != 0) {
                go(k - 1, 0);
                C.add(k);
                blank[k - 1] = 0;
                cli(k);
                JOptionPane.showMessageDialog(this, "Computer Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                cCount++;
                gameScore();
            } else {
                int e = PossWin(H);
                if (e != 0) {
                    go(e - 1, 0);
                    C.add(e);
                    blank[e - 1] = 0;
                    cli(e);
                } else {
                    int move = goAny(0);
                    blank[move] = 0;
                    C.add(move + 1);
                    cli(move + 1);
                }
            }
            JOptionPane.showMessageDialog(this, "It's a Tie!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            t++;
            tie.setText("Ties: " + t);
        }
    }
    public void game(int x) {
        if (x == 1) {
            if (!H.contains(5)) {
                if (go(4, 0)) {
                    C.add(5);
                    cli(5);
                    blank[4] = 0;
                }
            } else {
                if (go(0, 0)) {
                    C.add(1);
                    cli(1);
                    blank[0] = 0;
                }
            }
        }
        if (x == 3) {
            int k = PossWin(H);
            if (k != 0) {
                go(k - 1, 0);
                C.add(k);
                cli(k);
                blank[k - 1] = 0;
            } else {
                int ma = Make_2(0);
                go(ma - 1, 0);
                blank[ma - 1] = 0;
                C.add(ma);
                cli(ma);
                System.out.println(ma);
            }
        }
        if (x == 5) {
            int b = PossWin(C);
            if (b != 0) {
                go(b - 1, 0);
                C.add(b);
                blank[b - 1] = 0;
                cli(b);
                JOptionPane.showMessageDialog(this, "Computer Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                cCount++;
                gameScore();
            } else {
                int o = PossWin(H);
                if (o != 0) {
                    go(o - 1, 0);
                    C.add(o);
                    blank[o - 1] = 0;
                    cli(o);
                } else {
                    int move = goAny(0);
                    go(move, 0);
                    C.add(move + 1);
                    blank[move] = 0;
                    cli(move + 1);
                }
            }
        }
        if (x == 7) {
            int p = PossWin(C);
            if (p != 0) {
                go(p - 1, 0);
                C.add(p);
                blank[p - 1] = 0;
                cli(p);
                JOptionPane.showMessageDialog(this, "Computer Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                cCount++;
                gameScore();
            } else {
                int d = PossWin(H);
                if (d != 0) {
                    go(d - 1, 0);
                    C.add(d);
                    blank[d - 1] = 0;
                    cli(d);
                } else {
                    int move = goAny(0);
                    blank[move] = 0;
                    C.add(move + 1);
                    cli(move + 1);
                }
            }
        }
        if (x == 9) {
            JOptionPane.showMessageDialog(this, "Its a Tie!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            t++;
            tie.setText("Ties: " + t);
        }
    }
    public static boolean go(int i, int a) {
        if (blank[i] == -1) {
            blank[i] = a;
            return true;
        }
        return false;
    }
    public static int Make_2(int a) {
        if (blank[4] == -1) {
            go(4, a);
            return 5;
        }
        if (blank[0] == -1) {
            go(0, a);
            return 1;
        }
        if (blank[2] == -1) {
            go(2, a);
            System.out.println("Hey");
            return 3;
        }
        if (blank[6] == -1) {
            go(6, a);
            return 7;
        }
        if (blank[8] == -1) {
            go(8, a);
            return 9;
        }
        return 0;
    }
    public void cli(int k) {
        if (k == 1) {
            btn1.doClick();
        }
        if (k == 2) {
            btn2.doClick();
        }
        if (k == 3) {
            btn3.doClick();
        }
        if (k == 4) {
            btn4.doClick();
        }
        if (k == 5) {
            btn5.doClick();
        }
        if (k == 6) {
            btn6.doClick();
        }
        if (k == 7) {
            btn7.doClick();
        }
        if (k == 8) {
            btn8.doClick();
        }
        if (k == 9) {
            btn9.doClick();
        }
    }
    public static int PossWin(List l) {
        int len = l.size();
        int a;
        int b;
        int x;
        int y;
        int flag = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                a = (int) (l.get(i));
                b = (int) (l.get(j));
                x = magicSq[a - 1] + magicSq[b - 1];
                y = 15 - x;
                System.out.println(y);
                if (y > 0 && y < 10) {
                    if (blank[returnIndex(y)] == -1) {
                        System.out.println(returnIndex(y));
                        flag = 1;
                        return returnIndex(y) + 1;
                    }
                }
            }
        }
        if (flag == 0) {
            return 0;
        }
        return 0;
    }
    public static int goAny(int a) {
        for (int i = 0; i < 9; i++) {
            if (blank[i] != -1) {
                continue;
            } else {
                return i;
            }
        }
        return 0;
    }
    public static int[] magicSquare() {
        int num = 3;
        int[][] arr = new int[num][num];
        int i = num / 2;
        int j = num - 1;
        for (int x = 0; x < num; x++) {
            for (int y = 0; y < num; y++) {
                arr[x][y] = -1;
            }
        }
        int a = 1;
        int k = 0;
        for (a = 1; a <= num * num;) {
            if (i == -1 && j == num) {
                j = num - 2;
                i = 0;
            } else {
                if (j == num) {
                    j = 0;
                }
                if (i == -1) {
                    i = num - 1;
                }
            }
            if (arr[i][j] != -1) {
                j = j - 2;
                i = i + 1;
                continue;
            } else {
                arr[i][j] = a;
                a = a + 1;
            }
            j = j + 1;
            i = i - 1;
        }
        int z = 0;
        for (int x = 0; x < num; x++) {
            for (int y = 0; y < num; y++) {
                magicSq[z] = arr[x][y];
                z++;
            }
        }
        return magicSq;
    }
    public static int returnIndex(int a) {
        for (int i = 0; i < 9; i++) {
            if (magicSq[i] == a)
                return i;
        }
        return -1;
    }
    public static int win(int l) {
        int wi = PossWin(H);
        if (wi == l) {
            return 1;
        }
        return 0;
    }
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnnexit;
    private javax.swing.JButton jbtnnreset;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    private javax.swing.JLabel lble;
    private javax.swing.JLabel tie;
}