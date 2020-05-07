/*
 * Rafik H. 
 * April 20th,2020
 * To demonstrate understanding of unit concepts in a rock paper scissors game
 */

//import java.util.Random;
//Note: at the bottom is notes on this code
public class RockPaperScissors extends javax.swing.JFrame {
    double Userchoice = 0;
    int AIRWin =0;
    int AIGWin =0;
    int PlyrRWin=0;
    int PlyrGWin=0;
    int Round = 1;
    int RndDraw = 0;
    String[] Plyrchoice;
    boolean Rnd = true;
    //public double RNGNum;
    //public double AIchoice;
    public int Reset=0;
    
    /**
     *
     */
    public RockPaperScissors() {
        this.Plyrchoice = new String[3];
        //this.RNGNum = (Math.random() * (3)) + 1;
        //this.AIchoice = Math.round(RNGNum*100)/100;
        initComponents();
        RndResetBtn.setEnabled(false);
        GamewinBtn.setVisible(false);
        ReportBtn.setVisible(false);
}
    
    
    enum RNGChoice{
      Rock,Paper,Scissors
      
        }
    private RNGChoice getRandom(){
    RNGChoice RNG= RNGChoice.values()[Math.round((int)(Math.random()*3))];
    //Returns an integer from 1-3 and then is put into one of the RNGchoice values
            return RNG;
}
  
   
    
   
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ChoiceGroups = new javax.swing.ButtonGroup();
        BackgroundP = new javax.swing.JPanel();
        Title1 = new javax.swing.JLabel();
        SubT1 = new javax.swing.JLabel();
        InfoTl = new javax.swing.JLabel();
        Rule1lbl = new javax.swing.JLabel();
        Rule2lbl = new javax.swing.JLabel();
        Rule3lbl = new javax.swing.JLabel();
        RockIMG = new javax.swing.JLabel();
        PaperIMG = new javax.swing.JLabel();
        ScissorsIMG = new javax.swing.JLabel();
        AIRWins = new javax.swing.JLabel();
        AIGWins = new javax.swing.JLabel();
        StandingsTlbl = new javax.swing.JLabel();
        PlyrRWins = new javax.swing.JLabel();
        PlyrGWins = new javax.swing.JLabel();
        RockCBtn = new javax.swing.JButton();
        PaperCBtn = new javax.swing.JButton();
        ScissorsCBtn = new javax.swing.JButton();
        AIVal = new javax.swing.JLabel();
        Resultlbl = new javax.swing.JLabel();
        Phraselbl = new javax.swing.JLabel();
        ResetBtn = new javax.swing.JButton();
        Resetlbl = new javax.swing.JLabel();
        RndResetBtn = new javax.swing.JButton();
        PlyrVal = new javax.swing.JLabel();
        RndNum = new javax.swing.JLabel();
        RndDrawlbl = new javax.swing.JLabel();
        GamewinBtn = new javax.swing.JButton();
        Rule3lbl1 = new javax.swing.JLabel();
        ReportBtn = new javax.swing.JButton();
        WinInstlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundP.setBackground(new java.awt.Color(255, 255, 255));

        Title1.setFont(new java.awt.Font("Microsoft YaHei Light", 3, 18)); // NOI18N
        Title1.setForeground(new java.awt.Color(0, 204, 204));
        Title1.setText("Welcome to a Rock,Paper,Scissors game! ");

        SubT1.setFont(new java.awt.Font("Microsoft YaHei Light", 3, 12)); // NOI18N
        SubT1.setForeground(new java.awt.Color(0, 102, 255));
        SubT1.setText("CLick a button to choose rock paper or Scissors and beat the AI 5 times to win!");

        InfoTl.setText("Info:");

        Rule1lbl.setText("Rock beats Scissors");

        Rule2lbl.setText("Scissors beats Paper");

        Rule3lbl.setText("Paper beats Rock");

        RockIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hamzi\\Pictures\\rock2.jpg")); // NOI18N

        PaperIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hamzi\\Pictures\\paper2.png")); // NOI18N

        ScissorsIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hamzi\\Pictures\\Scissors2.png")); // NOI18N

        AIRWins.setText("AI round wins: 0");

        AIGWins.setText("AI game wins: 0");

        StandingsTlbl.setText("Standings:");

        PlyrRWins.setText("Player round wins: 0");

        PlyrGWins.setText("Player game wins: 0");

        RockCBtn.setBackground(new java.awt.Color(102, 102, 102));
        RockCBtn.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        RockCBtn.setText("Rock");
        RockCBtn.setBorderPainted(false);
        ChoiceGroups.add(RockCBtn);
        RockCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RockCBtnActionPerformed(evt);
            }
        });

        PaperCBtn.setBackground(new java.awt.Color(204, 204, 204));
        PaperCBtn.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        PaperCBtn.setText("Paper");
        ChoiceGroups.add(PaperCBtn);
        PaperCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaperCBtnActionPerformed(evt);
            }
        });

        ScissorsCBtn.setBackground(new java.awt.Color(0, 0, 0));
        ScissorsCBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        ScissorsCBtn.setForeground(new java.awt.Color(255, 255, 255));
        ScissorsCBtn.setText("Scissors");
        ChoiceGroups.add(ScissorsCBtn);
        ScissorsCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScissorsCBtnActionPerformed(evt);
            }
        });

        AIVal.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        AIVal.setText("AI choice: ");

        Resultlbl.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        Resultlbl.setText("Results:");

        Phraselbl.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N

        ResetBtn.setBackground(new java.awt.Color(255, 0, 0));
        ResetBtn.setFont(new java.awt.Font("Georgia", 3, 10)); // NOI18N
        ResetBtn.setText("Reset Standings");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        RndResetBtn.setBackground(new java.awt.Color(51, 255, 0));
        RndResetBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        RndResetBtn.setText("Next");
        RndResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RndResetBtnActionPerformed(evt);
            }
        });

        PlyrVal.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        PlyrVal.setText("Your choice: ");

        RndNum.setText("Round: 1");

        RndDrawlbl.setText("Round draws: 0");

        GamewinBtn.setBackground(new java.awt.Color(255, 255, 0));
        GamewinBtn.setFont(new java.awt.Font("Segoe UI Symbol", 3, 12)); // NOI18N
        GamewinBtn.setText("Continue?");
        GamewinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GamewinBtnActionPerformed(evt);
            }
        });

        Rule3lbl1.setText("AI is passive agressive");

        ReportBtn.setBackground(new java.awt.Color(255, 0, 0));
        ReportBtn.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        ReportBtn.setText("Report AI");
        ReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundPLayout = new javax.swing.GroupLayout(BackgroundP);
        BackgroundP.setLayout(BackgroundPLayout);
        BackgroundPLayout.setHorizontalGroup(
            BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPLayout.createSequentialGroup()
                .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundPLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundPLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPLayout.createSequentialGroup()
                                    .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Rule1lbl)
                                        .addComponent(InfoTl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Rule3lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Rule2lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Rule3lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ReportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(249, 249, 249)
                                    .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(StandingsTlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PlyrRWins, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RndDrawlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PlyrGWins, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(BackgroundPLayout.createSequentialGroup()
                                            .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(RndNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(AIRWins, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(AIGWins, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(BackgroundPLayout.createSequentialGroup()
                                    .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BackgroundPLayout.createSequentialGroup()
                                            .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(PlyrVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Resultlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(AIVal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(BackgroundPLayout.createSequentialGroup()
                                                    .addGap(46, 46, 46)
                                                    .addComponent(Resetlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(RndResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(GamewinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(BackgroundPLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(WinInstlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(BackgroundPLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(Phraselbl, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 46, Short.MAX_VALUE)))
                            .addGroup(BackgroundPLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RockCBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RockIMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(70, 70, 70)
                                .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PaperIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PaperCBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ScissorsIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ScissorsCBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(BackgroundPLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(SubT1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundPLayout.setVerticalGroup(
            BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubT1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InfoTl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StandingsTlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rule1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RndNum, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BackgroundPLayout.createSequentialGroup()
                        .addComponent(AIRWins, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AIGWins, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlyrRWins, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlyrGWins, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RndDrawlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundPLayout.createSequentialGroup()
                        .addComponent(Rule2lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rule3lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rule3lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ReportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ScissorsIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PaperIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RockIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RockCBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaperCBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScissorsCBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Resetlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RndResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlyrVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GamewinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AIVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WinInstlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Resultlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Phraselbl, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportBtnActionPerformed
        Phraselbl.setText(String.valueOf("Did you really think you can win by reporting me? Well then suffer the game is now broken."));
        //while(Round>=0){
            RockCBtn.setEnabled(false);
            PaperCBtn.setEnabled(false);
            ScissorsCBtn.setEnabled(false);
            RndResetBtn.setEnabled(false);
            ResetBtn.setEnabled(false);
            GamewinBtn.setEnabled(false);
            ReportBtn.setEnabled(false);
            //}
            //the while loops for some reason break the game and this was my original plan but text does not apear if the while loop is true
    }//GEN-LAST:event_ReportBtnActionPerformed

    private void GamewinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GamewinBtnActionPerformed
            //Below is more as a secondairy reset button to add score to either the AI or player
        if (PlyrRWin==5){
            PlyrGWin=PlyrGWin+1;
            PlyrGWins.setText(String.valueOf("Player game wins: "+PlyrGWin));
            RockCBtn.setEnabled(true);
            PaperCBtn.setEnabled(true);
            ScissorsCBtn.setEnabled(true);
            ResetBtn.setEnabled(true);
            RndDraw=0;
            PlyrRWin =0;
            AIRWin=0;
            Round=1;
            
        }
        if (AIRWin==5){
            AIGWin=AIGWin+1;
            AIGWins.setText(String.valueOf("AI game wins: "+AIGWin));
            RockCBtn.setEnabled(true);
            PaperCBtn.setEnabled(true);
            ScissorsCBtn.setEnabled(true);
            ResetBtn.setEnabled(true);
            RndDraw=0;
            PlyrRWin =0;
            AIRWin=0;
            Round=1;

        }
        

        GamewinBtn.setVisible(false);
        AIRWins.setText(String.valueOf("AI round wins: "+AIRWin));
        PlyrRWins.setText(String.valueOf("Player round wins: "+PlyrRWin));
        RndDrawlbl.setText(String.valueOf("Round draws: "+RndDraw));
        RndNum.setText(String.valueOf("Round: "+Round));
        Resultlbl.setText(String.valueOf("Results: "));
        AIVal.setText(String.valueOf("AI choice: "));
        PlyrVal.setText(String.valueOf("Your choice: "));
        Resetlbl.setText(String.valueOf(" "));
        Phraselbl.setText(String.valueOf(" "));
        ReportBtn.setVisible(false);
        WinInstlbl.setText(String.valueOf(" "));
        //this is to set everything to it's initial state
    }//GEN-LAST:event_GamewinBtnActionPerformed

    private void RndResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RndResetBtnActionPerformed
        //RNGNum=0;
        // AIchoice=0;
        // int round = 0;

        RockCBtn.setEnabled(true);
        PaperCBtn.setEnabled(true);
        ScissorsCBtn.setEnabled(true);

        // double RNGNum =(Math.random() * (3)) + 1;
        // double AIchoice = Math.round(RNGNum*100)/100;
        //These comented lines of code used to be the rng calculator but it did not work out so i tried using the enum method and that seemed to fix things
        Round=Round+1;
        RndNum.setText(String.valueOf("Round: "+Round));
        

        AIRWins.setText(String.valueOf("AI round wins: "+AIRWin));
        PlyrRWins.setText(String.valueOf("Player round wins: "+PlyrRWin));
        RndDrawlbl.setText(String.valueOf("Round draws: "+RndDraw));
        RndResetBtn.setEnabled(false);
        Resultlbl.setText(String.valueOf("Results: "));
        AIVal.setText(String.valueOf("AI choice: "));
        PlyrVal.setText(String.valueOf("Your choice: "));
        Resetlbl.setText(String.valueOf(" "));
        Phraselbl.setText(String.valueOf(" "));
        ReportBtn.setVisible(false);
        //Again just to reset values to original states
        if (PlyrRWin==5){

            GamewinBtn.setVisible(true);
            RockCBtn.setEnabled(false);
            PaperCBtn.setEnabled(false);
            ScissorsCBtn.setEnabled(false);
            ResetBtn.setEnabled(false);
            Phraselbl.setText(String.valueOf("Okbuddycheater. You can continue with your ''win'' or reset the game and make it fair."));
            WinInstlbl.setText(String.valueOf("If you want to continue click above, if you want to restart click above then reset standings."));
            //More instructions for the user and the passive agressive messages from the AI
        }
        if (AIRWin==5){

            GamewinBtn.setVisible(true);
            RockCBtn.setEnabled(false);
            PaperCBtn.setEnabled(false);
            ScissorsCBtn.setEnabled(false);
            ResetBtn.setEnabled(false);
            Phraselbl.setText(String.valueOf("I win and you lose hahaha,you can reset if you want like a cheater or continue with my fair win."));
            WinInstlbl.setText(String.valueOf("If you want to continue click above, if you want to restart click above then reset standings."));
            //Same as player wins but for the AI
        }
        if (RndDraw==10){
            
            RockCBtn.setEnabled(true);
            PaperCBtn.setEnabled(true);
            ScissorsCBtn.setEnabled(true);
            ResetBtn.setEnabled(true);
            Phraselbl.setText(String.valueOf("Did you seriously copy me 10 times? That's just boring, try not to copy me next time."));
            //This was more for fun if the user can make the game extend this long

        }

    }//GEN-LAST:event_RndResetBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        RndDraw=0;
        PlyrRWin =0;
        PlyrGWin =0;
        AIRWin=0;
        AIGWin=0;

        Round=1;
        AIRWins.setText(String.valueOf("AI round wins: "+AIRWin));
        AIGWins.setText(String.valueOf("AI game wins: "+AIGWin));
        PlyrRWins.setText(String.valueOf("Player round wins: "+PlyrRWin));
        PlyrGWins.setText(String.valueOf("Player game wins: "+PlyrGWin));
        RndDrawlbl.setText(String.valueOf("Round draws: "+RndDraw));
        RndNum.setText(String.valueOf("Round: "+Round));
        Resultlbl.setText(String.valueOf("Results: "));
        AIVal.setText(String.valueOf("AI choice: "));
        PlyrVal.setText(String.valueOf("Your choice: "));
        Resetlbl.setText(String.valueOf(" "));
        RockCBtn.setEnabled(true);
        PaperCBtn.setEnabled(true);
        ScissorsCBtn.setEnabled(true);
        ReportBtn.setVisible(false);
        RndResetBtn.setEnabled(false);
        Phraselbl.setText(String.valueOf(" "));
        //This is just to put all of the game back to it's begining state
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void ScissorsCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScissorsCBtnActionPerformed
        // TODO add your handling code here:
        Plyrchoice[2]="Scissors";
        
        PlyrVal.setText(String.valueOf("Your choice: "+ Plyrchoice[2]));
        Resetlbl.setText(String.valueOf("Click next to start the next round."));
        
        RNGChoice AIchoice;
        AIchoice = getRandom();
        //This is to call a random value from the enum portion of the code
        if (AIchoice==RNGChoice.Rock){
            Resultlbl.setText(String.valueOf("Results: You lose"));
            AIVal.setText(String.valueOf("AI choice: Rock"));
            Phraselbl.setText(String.valueOf("You absolute buffoon how could you not beat my rock."));
            AIRWin=AIRWin+1;
            RndResetBtn.setEnabled(true);
            

        }else if(AIchoice==RNGChoice.Paper){
            PlyrRWin=PlyrRWin+1;
            Resultlbl.setText(String.valueOf("Results: You win"));
            AIVal.setText(String.valueOf("AI choice: Paper"));
            Phraselbl.setText(String.valueOf("I was only drawing how dare you cut my paper!"));
            RndResetBtn.setEnabled(true);
            
        }else{
            Resultlbl.setText(String.valueOf("Results: You tied"));
            AIVal.setText(String.valueOf("AI choice: Scissors"));
            Phraselbl.setText(String.valueOf("What could have happened had you not copied me?"));
            RndDraw=RndDraw+1;
            RndResetBtn.setEnabled(true);
            //Just basic if else statements

        }

        RockCBtn.setEnabled(false);
        PaperCBtn.setEnabled(false);
        ScissorsCBtn.setEnabled(false);
        //this bottom piece is just to force the user to click next and not a second option on the same round
    }//GEN-LAST:event_ScissorsCBtnActionPerformed

    private void PaperCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaperCBtnActionPerformed
        // TODO add your handling code here:
        Plyrchoice[1]="Paper";
        PlyrVal.setText(String.valueOf("Your choice: "+Plyrchoice[1]));
        Resetlbl.setText(String.valueOf("Click next to start the next round."));
        RNGChoice AIchoice;
        AIchoice= getRandom();

        if (AIchoice==RNGChoice.Rock){
            Resultlbl.setText(String.valueOf("Results: You win"));
            AIVal.setText(String.valueOf("AI choice: Rock"));
            Phraselbl.setText(String.valueOf("Literally reported."));
            RndResetBtn.setEnabled(true);
            PlyrRWin=PlyrRWin+1;

        }else if(AIchoice==RNGChoice.Paper){
            Resultlbl.setText(String.valueOf("Results: You tied"));
            AIVal.setText(String.valueOf("AI choice: Paper"));
            RndDraw=RndDraw+1;
            RndResetBtn.setEnabled(true);
            Phraselbl.setText(String.valueOf("We can do origami instead since you don't want to play the game."));
            
        }else{
            Resultlbl.setText(String.valueOf("Results: You lose"));
            Phraselbl.setText(String.valueOf("Now it's my turn to ruin your drawings, hahaha."));
            AIVal.setText(String.valueOf("AI choice: Scissors"));
            RndResetBtn.setEnabled(true);
            AIRWin=AIRWin+1;
          //PaperIMG.setText(String.valueOf(Round));


        }
        //PaperIMG.setText(String.valueOf(Round));
        //Rnd=false;
        RockCBtn.setEnabled(false);
        PaperCBtn.setEnabled(false);
        ScissorsCBtn.setEnabled(false);
        //Mostly the same as above
    }//GEN-LAST:event_PaperCBtnActionPerformed

    private void RockCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RockCBtnActionPerformed

        //RockIMG.setText(String.valueOf(null));
        //^testing purposes
        Plyrchoice[0]="Rock";
        PlyrVal.setText(String.valueOf("Your choice: "+Plyrchoice[0]));
        Resetlbl.setText(String.valueOf("Click next to start the next round."));
        RNGChoice AIchoice;
        AIchoice= getRandom();

        if (AIchoice==RNGChoice.Rock){
            Resultlbl.setText(String.valueOf("Results: You tied"));
            AIVal.setText(String.valueOf("AI choice: Rock"));
            Phraselbl.setText(String.valueOf("Hitting two rocks together doesn't make fire, you know that right?"));
            RndResetBtn.setEnabled(true);
            RndDraw=RndDraw+1;
        }else if(AIchoice==RNGChoice.Paper){
            Resultlbl.setText(String.valueOf("Results: You lose"));
            AIVal.setText(String.valueOf("AI choice: Paper"));
            Phraselbl.setText(String.valueOf("What are you going to do about it, report me?"));
            RndResetBtn.setEnabled(true);
            ReportBtn.setVisible(true);
            AIRWin=AIRWin+1;
            //This was fun on my end to make the user get curious and then lose progress if they had any
            
        }else{
            Resultlbl.setText(String.valueOf("Results: You win"));
            AIVal.setText(String.valueOf("AI choice: Scissors"));
            Phraselbl.setText(String.valueOf("You almost hit me with that, stop throwing rocks."));
            RndResetBtn.setEnabled(true);
            PlyrRWin=PlyrRWin+1;
            //PaperIMG.setText(String.valueOf(Round));
        }
        RockCBtn.setEnabled(false);
        PaperCBtn.setEnabled(false);
        ScissorsCBtn.setEnabled(false);
    }//GEN-LAST:event_RockCBtnActionPerformed
    
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
            java.util.logging.Logger.getLogger(RockPaperScissors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RockPaperScissors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RockPaperScissors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RockPaperScissors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RockPaperScissors().setVisible(true);
            }
        });
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AIGWins;
    private javax.swing.JLabel AIRWins;
    private javax.swing.JLabel AIVal;
    private javax.swing.JPanel BackgroundP;
    private javax.swing.ButtonGroup ChoiceGroups;
    private javax.swing.JButton GamewinBtn;
    private javax.swing.JLabel InfoTl;
    private javax.swing.JButton PaperCBtn;
    private javax.swing.JLabel PaperIMG;
    private javax.swing.JLabel Phraselbl;
    private javax.swing.JLabel PlyrGWins;
    private javax.swing.JLabel PlyrRWins;
    private javax.swing.JLabel PlyrVal;
    private javax.swing.JButton ReportBtn;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel Resetlbl;
    private javax.swing.JLabel Resultlbl;
    private javax.swing.JLabel RndDrawlbl;
    private javax.swing.JLabel RndNum;
    private javax.swing.JButton RndResetBtn;
    private javax.swing.JButton RockCBtn;
    private javax.swing.JLabel RockIMG;
    private javax.swing.JLabel Rule1lbl;
    private javax.swing.JLabel Rule2lbl;
    private javax.swing.JLabel Rule3lbl;
    private javax.swing.JLabel Rule3lbl1;
    private javax.swing.JButton ScissorsCBtn;
    private javax.swing.JLabel ScissorsIMG;
    private javax.swing.JLabel StandingsTlbl;
    private javax.swing.JLabel SubT1;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel WinInstlbl;
    // End of variables declaration//GEN-END:variables

}
//Everything below here is code that did not work for one reason or another but what i'd like to work on in the future
//





//an array would not work in a public/private class, it could be started but i could not have values as well
    //int[] Standings = new int[4];
    //Standings[0] = 0;
    //Standings[1] = 0;
    //Standings[2] = 0;
    //Standings[3] = 0;
// My original idea was to have a seperate method to do the random AI choice but i could not figure out how to call it back
//feedback on how i'd do that would be apreciated 



 // enum Choices{
     //       Rock,Paper,Scissors}
     //private Choices getRandom(){
     //    Choices AIChoice;
     //   AIChoice = Choices.values()[Math.round((float)(Math.random()*2))];
         
     //   return AIChoice;
     //above was just to test the enum that did not work

   // }
   // public class Area extends javax.swing.JFrame {
    //public double RNGNum =(Math.random() * ((3))) + 1;
    //public double AI = Math.round(RNGNum*100)/100;}
    // This was the original RNG choice code, which did work and give a random number between 1 and 3 but it could only do it once.
    //There was an alternative which was to copy and paste those lines into each button but i wanted to have some incorperation of what we learned in lessons 4 and 5'
    
                //while(Round<=5){
                    //if (AIchoice==1){
                      //  RockIMG.setText(String.valueOf("tie"));

                    //}else if(AIchoice==2){
                      //  RockIMG.setText(String.valueOf("lose"));

                    //}else{
                      //  RockIMG.setText(String.valueOf("win"));
                        //PaperIMG.setText(String.valueOf(Round));
                    //}}
                    //Above is what i tried but as i learned placing this inside a button makes the program crash
                    // I as well tried a for loop using i=0, and Round<=5 so it wouldn't increase unless the button was clicked
                    //In the GUI i had trouble putting the loops into aplication as they worked in testing but not in a button
                    //It would be nice to have feed back on how i could have used my original RNG choice claculation more than once
                    //double RNGNum =(Math.random() * (3)) + 1;
                    //AIchoice = Math.round(RNGNum*100)/100;}