package RGR;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
public class Window_Test {
    private static File file;
    public void setFile(File file){this.file = file;}

    public static JPanel printQuestions(File w) throws IOException {

        JTextArea l = new JTextArea();
        l.setEditable(false);

        FileInputStream inMessage = new FileInputStream(w);
        DataInputStream in = new DataInputStream(inMessage);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String line;
            while ((line = br.readLine()) != null) {
                l.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        l.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 16));
        l.setBounds(100, 50, 850, 500);
        JPanel content = new JPanel(null);
        content.setBackground(new Color(255, 250, 205));

        content.add(l);
        return content;
    }

    public static JPanel startTest(File w, File w2) {
        JPanel pan = new JPanel(null);
        pan.setBackground(new Color(255, 205, 228));
        pan.setPreferredSize(new Dimension(900,2000));
        String res =  new String("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\results.txt");

        JTextArea editor = new JTextArea();
        editor.setEditable(false);

        JTextArea editor2 = new JTextArea();
        editor2.setEditable(false);

        JTextArea editor3 = new JTextArea();
        editor3.setEditable(false);

        JTextArea editor4 = new JTextArea();
        editor4.setEditable(false);

        JTextArea editor5 = new JTextArea();
        editor5.setEditable(false);

        JTextArea editor6 = new JTextArea();
        editor6.setEditable(false);

        JTextArea editor7 = new JTextArea();
        editor7.setEditable(false);

        JTextArea editor8 = new JTextArea();
        editor8.setEditable(false);

        JTextArea editor9 = new JTextArea();
        editor9.setEditable(false);

        JTextArea editor10 = new JTextArea();
        editor10.setEditable(false);

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(w));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = new String();
        ArrayList<String> lines = new ArrayList<String>();

        while (true) {
            try {
                if (!((line = reader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            lines.add(line);
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader fr = null;
        try {
            fr = new FileReader(w2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        String inputLine = null;
        StringBuilder sb = new StringBuilder("");
        while (true) {
            try {
                if (!((inputLine = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            sb.append(inputLine);
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        editor.append(lines.get(0));
        editor.setBounds(15, 20, 900, 30);
        String result = sb.toString();
        String[] arr = result.split(";");
        JRadioButton but = new JRadioButton(arr[0]);
        JRadioButton but2 = new JRadioButton(arr[1]);
        JRadioButton but3 = new JRadioButton(arr[2]);
        JRadioButton but4 = new JRadioButton(arr[3]);
        ButtonGroup group = new ButtonGroup();
        but.setBounds(100, 70, 370, 20);
        but2.setBounds(100, 100, 370, 20);
        but3.setBounds(100, 130, 370, 20);
        but4.setBounds(100, 160, 370, 20);
        editor.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 16));
        group.add(but);
        group.add(but2);
        group.add(but3);
        group.add(but4);

        but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but2.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but3.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but4.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        editor2.append(lines.get(1));
        JRadioButton but1 = new JRadioButton(arr[4]);
        JRadioButton but12 = new JRadioButton(arr[5]);
        JRadioButton but13 = new JRadioButton(arr[6]);
        JRadioButton but14 = new JRadioButton(arr[7]);
        but1.setFocusPainted(false);
        but12.setFocusPainted(false);
        but13.setFocusPainted(false);
        but14.setFocusPainted(false);
        ButtonGroup group2 = new ButtonGroup();
        editor2.setBounds(15, 210, 900, 30);

        but1.setBounds(100, 260, 370, 20);
        but12.setBounds(100, 290, 370, 20);
        but13.setBounds(100, 320, 370, 20);
        but14.setBounds(100, 350, 370, 20);
        editor2.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 16));
        group2.add(but1);
        group2.add(but12);
        group2.add(but13);
        group2.add(but14);

        but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but1.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);

                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but12.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but13.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but14.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        editor3.append(lines.get(2));
        JRadioButton but21 = new JRadioButton(arr[8]);
        JRadioButton but22 = new JRadioButton(arr[9]);
        JRadioButton but23 = new JRadioButton(arr[10]);
        JRadioButton but24 = new JRadioButton(arr[11]);
        ButtonGroup group3 = new ButtonGroup();
        editor3.setBounds(15, 400, 900, 30);
        but21.setBounds(100, 450, 370, 20);
        but22.setBounds(100, 480, 370, 20);
        but23.setBounds(100, 510, 370, 20);
        but24.setBounds(100, 540, 370, 20);
        editor3.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 16));
        group3.add(but21);
        group3.add(but22);
        group3.add(but23);
        group3.add(but24);

        but21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but21.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but22.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but23.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but24.getText()  + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        editor4.append(lines.get(3));
        JRadioButton but31 = new JRadioButton(arr[12]);
        JRadioButton but32 = new JRadioButton(arr[13]);
        JRadioButton but33 = new JRadioButton(arr[14]);
        JRadioButton but34 = new JRadioButton(arr[15]);
        ButtonGroup group4 = new ButtonGroup();
        editor4.setBounds(15, 590, 900, 30);
        but31.setBounds(100, 640, 370, 20);
        but32.setBounds(100, 670, 370, 20);
        but33.setBounds(100, 700, 370, 20);
        but34.setBounds(100, 730, 370, 20);
        editor4.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 16));
        group4.add(but31);
        group4.add(but32);
        group4.add(but33);
        group4.add(but34);

        but31.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but31.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but32.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but32.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but33.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but33.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but34.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but34.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        editor5.append(lines.get(4));
        JRadioButton but41 = new JRadioButton(arr[16]);
        JRadioButton but42 = new JRadioButton(arr[17]);
        JRadioButton but43 = new JRadioButton(arr[18]);
        JRadioButton but44 = new JRadioButton(arr[19]);
        editor5.setBounds(15, 780, 900, 30);
        ButtonGroup group5 = new ButtonGroup();
        but41.setBounds(100, 830, 370, 20);
        but42.setBounds(100, 860, 370, 20);
        but43.setBounds(100, 890, 370, 20);
        but44.setBounds(100, 920, 370, 20);
        editor5.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 16));
        group5.add(but41);
        group5.add(but42);
        group5.add(but43);
        group5.add(but44);

        but41.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but41.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but42.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but42.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but43.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but43.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but44.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but44.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });


        editor6.append(lines.get(5));
        JRadioButton but51 = new JRadioButton(arr[20]);
        JRadioButton but52 = new JRadioButton(arr[21]);
        JRadioButton but53 = new JRadioButton(arr[22]);
        JRadioButton but54 = new JRadioButton(arr[23]);
        editor6.setBounds(15, 970, 900, 30);
        ButtonGroup group6 = new ButtonGroup();
        but51.setBounds(100, 1020, 370, 20);
        but52.setBounds(100, 1050, 370, 20);
        but53.setBounds(100, 1080, 370, 20);
        but54.setBounds(100, 1110, 370, 20);
        editor6.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 16));
        group6.add(but51);
        group6.add(but52);
        group6.add(but53);
        group6.add(but54);

        but51.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but51.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but52.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but52.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but53.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but53.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but54.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but54.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        editor7.append(lines.get(6));
        JRadioButton but61 = new JRadioButton(arr[24]);
        JRadioButton but62 = new JRadioButton(arr[25]);
        JRadioButton but63 = new JRadioButton(arr[26]);
        JRadioButton but64 = new JRadioButton(arr[27]);
        editor7.setBounds(15, 1150, 900, 30);
        ButtonGroup group7 = new ButtonGroup();
        but61.setBounds(100, 1200, 370, 20);
        but62.setBounds(100, 1230, 370, 20);
        but63.setBounds(100, 1260, 370, 20);
        but64.setBounds(100, 1290, 370, 20);
        editor7.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 16));
        group7.add(but61);
        group7.add(but62);
        group7.add(but63);
        group7.add(but64);

        but61.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but61.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but62.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but62.getText() + " ";

                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but63.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but63.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but64.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but64.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        editor8.append(lines.get(7));
        JRadioButton but71 = new JRadioButton(arr[28]);
        JRadioButton but72 = new JRadioButton(arr[29]);
        JRadioButton but73 = new JRadioButton(arr[30]);
        JRadioButton but74 = new JRadioButton(arr[31]);
        editor8.setBounds(15, 1340, 900, 30);
        ButtonGroup group8 = new ButtonGroup();
        but71.setBounds(100, 1390, 370, 20);
        but72.setBounds(100, 1420, 370, 20);
        but73.setBounds(100, 1450, 370, 20);
        but74.setBounds(100, 1480, 370, 20);
        editor8.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 16));
        group8.add(but71);
        group8.add(but72);
        group8.add(but73);
        group8.add(but74);

        but71.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but71.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but72.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but71.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but73.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but73.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but74.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but74.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });
        editor9.append(lines.get(8));
        JRadioButton but81 = new JRadioButton(arr[32]);
        JRadioButton but82 = new JRadioButton(arr[33]);
        JRadioButton but83 = new JRadioButton(arr[34]);
        JRadioButton but84 = new JRadioButton(arr[35]);
        editor9.setBounds(15, 1530, 900, 30);
        ButtonGroup group9 = new ButtonGroup();
        but81.setBounds(100, 1580, 370, 20);
        but82.setBounds(100, 1610, 370, 20);
        but83.setBounds(100, 1640, 370, 20);
        but84.setBounds(100, 1670, 370, 20);
        editor9.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 16));
        group9.add(but81);
        group9.add(but82);
        group9.add(but83);
        group9.add(but84);

        but81.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but81.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but82.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but82.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but83.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but83.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but84.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but84.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        editor10.append(lines.get(9));
        JRadioButton but91 = new JRadioButton(arr[36]);
        JRadioButton but92 = new JRadioButton(arr[37]);
        JRadioButton but93 = new JRadioButton(arr[38]);
        JRadioButton but94 = new JRadioButton(arr[39]);
        editor10.setBounds(15, 1720, 900, 30);
        ButtonGroup group10 = new ButtonGroup();
        but91.setBounds(100, 1770, 370, 20);
        but92.setBounds(100, 1800, 370, 20);
        but93.setBounds(100, 1830, 370, 20);
        but94.setBounds(100, 1860, 370, 20);
        editor10.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 16));
        group10.add(but91);
        group10.add(but92);
        group10.add(but93);
        group10.add(but94);

        but91.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but91.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but92.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but92.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but93.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but93.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        but94.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = new String();
                str = but94.getText() + " ";
                try {
                    Files.write(Paths.get(res), str.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException a) {
                    System.out.println(a);
                }
            }
        });

        pan.add(editor);

        pan.add(editor);
        pan.add(but);
        pan.add(but2);
        pan.add(but3);
        pan.add(but4);

        pan.add(editor2);
        pan.add(but1);
        pan.add(but12);
        pan.add(but13);
        pan.add(but14);

        pan.add(editor3);
        pan.add(but21);
        pan.add(but22);
        pan.add(but23);
        pan.add(but24);

        pan.add(editor4);
        pan.add(but31);
        pan.add(but32);
        pan.add(but33);
        pan.add(but34);

        pan.add(editor5);
        pan.add(but41);
        pan.add(but42);
        pan.add(but43);
        pan.add(but44);

        pan.add(editor6);
        pan.add(but51);
        pan.add(but52);
        pan.add(but53);
        pan.add(but54);

        pan.add(editor7);
        pan.add(but61);
        pan.add(but62);
        pan.add(but63);
        pan.add(but64);

        pan.add(editor8);
        pan.add(but71);
        pan.add(but72);
        pan.add(but73);
        pan.add(but74);

        pan.add(editor9);
        pan.add(but81);
        pan.add(but82);
        pan.add(but83);
        pan.add(but84);

        pan.add(editor10);
        pan.add(but91);
        pan.add(but92);
        pan.add(but93);
        pan.add(but94);
        pan.setVisible(true);
        return pan;
    }
}
