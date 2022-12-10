import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class GradeGUI{
    public static void main(String[] args){
        String x = "";
        JFrame window = new JFrame("Grades");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField ae = new JTextField("Add Grades", 30);
        JPanel panel = new JPanel();
        JLabel title = new JLabel(x);
        window.getContentPane().add(title);
        window.setVisible(true);
        window.setSize(400, 200);
        panel.add(ae);
        ae.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String input = ae.getText();
                if (input.contains("%")){
                    input = input.replace("%", "");
                    input = input.replace(" ", "");
                    float floatin;
                    String grade;
                    floatin = Float.valueOf(input);
                    if (floatin < 60){
                        grade = "F";
                    } else if (floatin < 70){
                        grade = "D";
                    } else if (floatin < 80){
                        grade = "C";
                    } else if (floatin < 90){
                        grade = "B";
                    } else {
                        grade = "A";
                    }

                    if (floatin % 10 <= 3){
                        grade = (grade+"-");
                    } else if (floatin %10 >= 7){
                        grade = (grade+"+");
                    }
                    input = grade.toString();

                } else if ((input.contains("A") || input.contains("B") || (input.contains("C") || input.contains("D")) || input.contains("F"))){
                    Integer approxgrade = 0;
                    if (input.contains("+")){
                        approxgrade += 8;
                    } else if (input.contains("-")){
                        approxgrade +=3;
                    } else {
                        approxgrade += 5;
                    }

                    if (input.contains("A")){
                        approxgrade += 90;
                    } else if (input.contains("B")) {
                        approxgrade += 80;
                    } else if (input.contains("C")){
                        approxgrade += 70;
                    } else if (input.contains("D")){
                        approxgrade += 60;
                    } else if (input.contains("F")){
                        approxgrade += 50;
                    }

                    input = approxgrade.toString();
                    input = "~"+input+"%";


                }
                title.setText(input);
            }
        });
        panel.add(title);


        window.getContentPane().add(panel);
    }
}