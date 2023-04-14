import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class MyFrameV2 extends JFrame implements ActionListener {
    JButton sorteggia=new JButton("SORTEGGIA");
    JButton popola=new JButton("POPOLA STRINGA");
    JLabel stringa=new JLabel("Stringa sorteggiata: ");
    JTextArea risultato=new JTextArea();
    JLabel inputStringa=new JLabel("Insersci 5 stringhe: ");
    JTextArea input=new JTextArea();
    String array[]=new String[5];
    int i=0;

    public MyFrameV2() {
        super("Sorteggio Stringhe V2");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());

        c.add(inputStringa);
        c.add(input);
        c.add(stringa);
        c.add(risultato);

        risultato.setPreferredSize(new Dimension(235, 18));
        input.setPreferredSize(new Dimension(235, 18));

        c.add(popola);
        popola.addActionListener(e -> popolaArray());

        c.add(sorteggia);
        sorteggia.addActionListener(e -> random());

        setSize(350,200);
        setVisible(true);
        setResizable(false);
    }

    public void popolaArray(){
        String stringa="";
        stringa=input.getText();
        if(i<array.length){
            array[i]=stringa;
            i++;
        }
        else{
            input.setText("Numero massimo di stringhe inserite");
            input.setEditable(false);
        }
    }

    public void random(){

        int lunghezza=array.length;
        int numRandom=(int)(Math.random()*5);
        String stringaRandom=array[numRandom];
        risultato.setText(stringaRandom);
        risultato.setEditable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sorteggia){
            random();
        }
        if(e.getSource()==popola){
            popolaArray();
        }
    }
}

