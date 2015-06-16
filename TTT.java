import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class TTT implements ActionListener{
	
	
    public void check(byte a, byte b, byte c){
    	if(a==1&&b==1&&c==1){
    		result.setText(n2+" is Winner");game=false;result.setForeground(Color.RED);
    		turn.setText("Over");turn.setForeground(Color.GRAY);
    		status.setForeground(Color.ORANGE);status.setText("Game Over.");
    		JOptionPane.showMessageDialog(null,n2+" is Winner. Game Over.");
    		nn1+=1;winner=true;wins=1;pwins[run]=1;
    	}
    	else if(a==2&&b==2&&c==2){
    		result.setText(n1+" is Winner");game=false;result.setForeground(Color.BLUE);
    		turn.setText("Over");turn.setForeground(Color.GRAY);
    		status.setForeground(Color.ORANGE);status.setText("Game Over.");
    		JOptionPane.showMessageDialog(null,n1+" is Winner.Game Over.");
    		nn2+=1;winner=true;wins=2;pwins[run]=2;

    	}
    	else if(winner==false){
    		result.setText("No Winner Yet.");winner=false;
    		if(pwins[run]==2)
    			pwins[run]=1;
    		else
    			pwins[run]=2;
    		
    	}
    }
    
    
    JFrame f=new JFrame("Tic Tac Toe by Tanweer");
    JButton a1=new JButton();
    JButton a2=new JButton();
    JButton a3=new JButton();
    JButton b1=new JButton();
    JButton b2=new JButton();
    JButton b3=new JButton();
    JButton c1=new JButton();
    JButton c2=new JButton();
    JButton c3=new JButton();
    JButton exit=new JButton("Exit");
    JButton start=new JButton("Start/Reset");
    Boolean game=false;
    Boolean p1=false;
    Boolean p2=false;
    Boolean a11=true;
    Boolean a21=true;
    Boolean a31=true;
    Boolean b11=true;
    Boolean b21=true;
    Boolean b31=true;
    Boolean c11=true;
    Boolean c21=true;
    Boolean c31=true;
    byte marka1;
    byte marka2;
    byte marka3;
    byte markb1;
    byte markb2;
    byte markb3;
    byte markc1;
    byte markc2;
    byte markc3;
    Boolean winner;
    short wins=0;
    JLabel status=new JLabel();
    JLabel result=new JLabel();
    JLabel turn=new JLabel();
    JLabel note=new JLabel();
    JLabel score1=new JLabel();
    JLabel score2=new JLabel();
    short run;
    String n1;
    String n2;
    short nn1;
    short nn2;
    int[] pwins;

    
    Font tt=new Font("arial",Font.BOLD,22);
    TTT(){
        pwins=new int[100];
    	pwins[0]=2;
        f.setLayout(null);
        f.setBounds(500,275,356,179);
        a1.setBounds(0,0,50,50);
        a2.setBounds(50,0,50,50);
        a3.setBounds(100,0,50,50);
        b1.setBounds(0,50,50,50);
        b2.setBounds(50,50,50,50);
        b3.setBounds(100,50,50,50);
        c1.setBounds(0,100,50,50);
        c2.setBounds(50,100,50,50);
        c3.setBounds(100,100,50,50);
        start.setBounds(200,0,150,20);
        exit.setBounds(200,20,150,20);
        status.setBounds(200,40,150,20);
        turn.setBounds(200,60,150,20);
        note.setBounds(200,80,150,20);
        result.setBounds(200,100,150,20);
        score1.setBounds(205,120,55,20);
        score2.setBounds(280,120,55,20);
        f.add(score1);
        f.add(score2);
        score1.setForeground(Color.RED);
        score2.setForeground(Color.BLUE);
        f.setResizable(false);
        
        nn1=0;
        nn2=0;
        winner=false;
        
        a1.addActionListener(this);
        a2.addActionListener(this);
        a3.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        start.addActionListener(this);
        exit.addActionListener(this);
        
        a1.setFont(tt);
        a2.setFont(tt);
        a3.setFont(tt);
        b1.setFont(tt);
        b2.setFont(tt);
        b3.setFont(tt);
        c1.setFont(tt);
        c2.setFont(tt);
        c3.setFont(tt);
        
        run=0;
        nn2=0;
        nn1=0;

        f.add(a1);
        f.add(a2);
        f.add(a3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(start);
        f.add(exit);
        f.add(status);
        f.add(turn);
        f.add(note);
        f.add(result);
        f.show();
    }
        public void actionPerformed(ActionEvent ta){
            if(start==ta.getSource()){
                if(run==0){
                    
                n2=JOptionPane.showInputDialog("Enter P1 name:");
                n1=JOptionPane.showInputDialog("Enter P2 name:");}
                a1.setLabel(null);
                a2.setLabel(null);
                a3.setLabel(null);
                b1.setLabel(null);
                b2.setLabel(null);
                b3.setLabel(null);
                c1.setLabel(null);
                c2.setLabel(null);
                c3.setLabel(null);
                a11=true;
                a21=true;
                a31=true;
                b11=true;
                b21=true;
                b31=true;
                c11=true;
                c21=true;
                c31=true;
                game=true;
                p1=true;
                if(run!=0)
                {                	
                if(winner==false&&pwins[run]==1)
                {p1=false;pwins[run+1]=1;}
                else if(winner==false&&pwins[run]==2)
                {p1=true;pwins[run+1]=2;}
                if(winner==true&&wins==1)
                {p1=true;pwins[run+1]=1;}
                else if(winner==true&&wins==2)
                {p1=false;pwins[run+1]=2;}
                }
                run+=1;
                winner=false;
                marka1=0;
                marka2=0;
                marka3=0;
                markb1=0;
                markb3=0;
                markb2=0;
                markc1=0;
                markc2=0;
                markc3=0;
                
              
                status.setText("Game ON");
                status.setForeground(Color.GREEN);
                if(p1==true){
                    wins=0;
                turn.setText(n2+"'s Turn");
                turn.setForeground(Color.RED);}
                else{
                    wins=0;
                turn.setText(n1+"'s Turn");
                turn.setForeground(Color.BLUE);
                }
                result.setText("In Progress");
                result.setForeground(Color.GRAY);
                note.setText("Waiting");
                note.setForeground(Color.GRAY);
            }
                score1.setText(""+nn1);
                score2.setText(""+nn2);
            if(exit==ta.getSource()){
                System.exit(0);
            }
            if(game==false)
                status.setText("Start the game first.");
            
            if(a1==ta.getSource()&&game==true){
                //a1.setEnabled(false);
                if(a11==true){
                    a11=false;
                if(p1==true){
                    marka1=1;
                    a1.setLabel("X");
                    p1=false;
                    a1.setForeground(Color.RED);
                    turn.setText(n1+"'s Turn");
                    turn.setForeground(Color.BLUE);
                    note.setText("Done");
                    
                }
                else{
                    a1.setLabel("0");
                    p1=true;
                    marka1=2;
                    a1.setForeground(Color.BLUE);
                    turn.setText(n2+"'s Turn");
                    turn.setForeground(Color.RED);
                    note.setText("Done");
                }
            }
                else
                    note.setText("Not Eligible");
        }
            
            if(a2==ta.getSource()&&game==true){
                if(a21==true){
                    a21=false;
                if(p1==true){
                    a2.setLabel("X");
                    marka2=1;
                    p1=false;
                    a2.setForeground(Color.RED);
                    turn.setForeground(Color.BLUE);
                    turn.setText(n1+"'s Turn");
                    note.setText("Done");
                    
                }
                else{
                    a2.setLabel("0");
                    p1=true;
                    marka2=2;
                    a2.setForeground(Color.BLUE);
                    turn.setForeground(Color.RED);
                    turn.setText(n2+"'s Turn");
                    note.setText("Done");
                }
            }
                else
                    note.setText("Not Eligible");
        }

            
            
            if(a3==ta.getSource()&&game==true){
                if(a31==true){
                    a31=false;
                if(p1==true){
                    a3.setLabel("X");
                    p1=false;
                    a3.setForeground(Color.RED);
                    turn.setForeground(Color.BLUE);
                    marka3=1;
                    turn.setText(n1+"'s Turn");
                    note.setText("Done");
                    
                }
                else{
                    a3.setLabel("0");
                    p1=true;
                    marka3=2;
                    a3.setForeground(Color.BLUE);
                    turn.setForeground(Color.RED);
                    turn.setText(n2+"'s Turn");
                    note.setText("Done");
                }
            }
                else
                    note.setText("Not Eligible");
        }

            
////////////////////////////////
            
            
            
            
            
            
            
            if(b1==ta.getSource()&&game==true){
                if(b11==true){
                    b11=false;
                if(p1==true){
                    b1.setLabel("X");
                    p1=false;
                    b1.setForeground(Color.RED);
                    turn.setForeground(Color.BLUE);
                    markb1=1;
                    turn.setText(n1+"'s Turn");
                    note.setText("Done");
                    
                }
                else{
                    b1.setLabel("0");
                    p1=true;
                    markb1=2;
                    b1.setForeground(Color.BLUE);
                    turn.setForeground(Color.RED);
                    turn.setText(n2+"'s Turn");
                    note.setText("Done");
                }
            }
                else
                    note.setText("Not Eligible");
        }
            
            if(b2==ta.getSource()&&game==true){
                if(b21==true){
                    b21=false;
                if(p1==true){
                    b2.setLabel("X");
                    p1=false;
                    b2.setForeground(Color.RED);
                    turn.setForeground(Color.BLUE);
                    markb2=1;
                    turn.setText(n1+"'s Turn");
                    note.setText("Done");
                    
                }
                else{
                    b2.setLabel("0");
                    p1=true;
                    markb2=2;
                    b2.setForeground(Color.BLUE);
                    turn.setForeground(Color.RED);
                    turn.setText(n2+"'s Turn");
                    note.setText("Done");
                }
            }
                else
                    note.setText("Not Eligible");
        }

            
            
            if(b3==ta.getSource()&&game==true){
                if(b31==true){
                    b31=false;
                if(p1==true){
                    b3.setLabel("X");
                    p1=false;
                    b3.setForeground(Color.RED);
                    turn.setForeground(Color.BLUE);
                    markb3=1;
                    turn.setText(n1+"'s Turn");
                    note.setText("Done");
                    
                }
                else{
                    b3.setLabel("0");
                    p1=true;
                    markb3=2;
                    b3.setForeground(Color.BLUE);
                    turn.setForeground(Color.RED);
                    turn.setText(n2+"'s Turn");
                    note.setText("Done");
                }
            }
                else
                    note.setText("Not Eligible");
        }

            
////////////////////////////////
            
            
            
            
            if(c1==ta.getSource()&&game==true){
                if(c11==true){
                    c11=false;
                if(p1==true){
                    c1.setLabel("X");
                    p1=false;
                    markc1=1;
                    c1.setForeground(Color.RED);
                    turn.setForeground(Color.BLUE);
                    turn.setText(n1+"'s Turn");
                    note.setText("Done");
                    
                }
                else{
                    c1.setLabel("0");
                    p1=true;
                    markc1=2;
                    c1.setForeground(Color.BLUE);
                    turn.setForeground(Color.RED);
                    turn.setText(n2+"'s Turn");
                    note.setText("Done");
                }
            }
                else
                    note.setText("Not Eligible");
        }
            
            if(c2==ta.getSource()&&game==true){
                if(c21==true){
                    c21=false;
                if(p1==true){
                    c2.setLabel("X");
                    p1=false;
                    c2.setForeground(Color.RED);
                    turn.setForeground(Color.BLUE);
                    markc2=1;
                    turn.setText(n1+"'s Turn");
                    note.setText("Done");
                    
                }
                else{
                    c2.setLabel("0");
                    p1=true;
                    markc2=2;
                    c2.setForeground(Color.BLUE);
                    turn.setForeground(Color.RED);
                    turn.setText(n2+"'s Turn");
                    note.setText("Done");
                }
            }
                else
                    note.setText("Not Eligible");
        }

            
            
            if(c3==ta.getSource()&&game==true){
                if(c31==true){
                    c31=false;
                if(p1==true){
                    c3.setLabel("X");
                    p1=false;
                    c3.setForeground(Color.RED);
                    turn.setForeground(Color.BLUE);
                    markc3=1;
                    turn.setText(n1+"'s Turn");
                    note.setText("Done");
                    
                }
                else{
                    c3.setLabel("0");
                    p1=true;
                    markc3=2;
                    c3.setForeground(Color.BLUE);
                    turn.setForeground(Color.RED);
                    turn.setText(n2+"'s Turn");
                    note.setText("Done");
                }
            }
                else
                    note.setText("Not Eligible");
        }

            

            
            
            
            
            //////////////Winning CONDITIONS//////////////////
            
            
            
            if(a11==false&&a21==false&&a31==false&&b11==false&&b21==false&&b31==false&&c11==false&&c21==false&&c31==false){
                status.setText("Game Over");
                game=false;
                if(pwins[run-1]==1)
                	pwins[run]=2;
                else
                	pwins[run]=1;
                }
            

if(winner==false){
	check(marka1,marka2,marka3);
	check(markb1,markb2,markb3);
	check(markc1,markc2,markc3);
	check(marka1,markb1,markc1);
	check(marka2,markb2,markc2);
	check(marka3,markb3,markc3);
	check(marka1,markb2,markc3);
	check(marka3,markb2,markc1);
	
}


	
//if((marka1==1&&marka2==1&&marka3==1)||(markb1==1&&markb2==1&&markb3==1)||(markc1==1&&markc2==1&&markc3==1)||(marka1==1&&markb1==1&&markc1==1)||(marka2==1&&markb2==1&&markc2==1)||(marka3==1&&markb3==1&&markc3==1)||(marka1==1&&markb2==1&&markc3==1)||(marka3==1&&markb2==1&&markc1==1))
//{result.setText(n2+" is Winner");game=false;result.setForeground(Color.RED);turn.setText("Over");turn.setForeground(Color.GRAY);status.setForeground(Color.ORANGE);status.setText("Game Over.");JOptionPane.showMessageDialog(null,n2+" is Winner. Game Over.");nn1+=1;winner=true;wins=1;pwins[run]=1;}
//else if((marka1==2&&marka2==2&&marka3==2)||(markb1==2&&markb2==2&&markb3==2)||(markc1==2&&markc2==2&&markc3==2)||(marka1==2&&markb1==2&&markc1==2)||(marka2==2&&markb2==2&&markc2==2)||(marka3==2&&markb3==2&&markc3==2)||(marka1==2&&markb2==2&&markc3==2)||(marka3==2&&markb2==2&&markc1==2))
//{result.setText(n1+" is Winner");game=false;result.setForeground(Color.BLUE);turn.setText("Over");turn.setForeground(Color.GRAY);status.setForeground(Color.ORANGE);status.setText("Game Over.");JOptionPane.showMessageDialog(null,n1+" is Winner.Game Over.");nn2+=1;winner=true;wins=2;pwins[run]=2;}
//else 
//{result.setText("No Winner Yet.");winner=false;}}
         
            
                score1.setText(""+nn1);
                score2.setText(""+nn2); 
            
        
        if(game==false&&run!=0)
        {turn.setText("Over.");turn.setForeground(Color.ORANGE);}
        


}
////////////////////////////////
            
            
        

public static void main(String[] args){
        TTT tanixerotwo=new TTT();
    }
    
}
////By Tanweer Ahmad. 14TL02@Student.Muet.Edu.Pk 03027200420.
