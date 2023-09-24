package RGR;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Controller {
    private static Model model1;
    private static Window_Test test;
    private View view1;

    private static final File file = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\simple.txt");
    private static final File file_1 = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\simple2.txt");
    private static final File file_2 = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\answer_simple.txt");
    private static final File file2 = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\midle.txt");
    private static final File file2_1 = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\midle2.txt");
    private static final File file2_2 = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\answer_midle.txt");
    private static final File file3 = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\hard.txt");
    private static final File file3_1 = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\hard2.txt");
    private static final File file3_2 = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\answer_hard.txt");
    private static final File file4 = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\very_hard.txt");
    private static final File file4_1 = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\very_hard2.txt");
    private static final File file4_2 = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\answer_veryhard.txt");

    private static final File user = new File("C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\inform_user.txt");
    private static final File res= new File("\"C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\results.txt");


    public Controller (View view1, Window_Test test, Model model1) {
        this.view1 = view1;
        this.test = test;
        this.model1 = model1;
        this.view1.addListener(new buttonListener_B1());
        this.view1.addListener2(new buttonListener_B2());
        this.view1.addListener3(new buttonListener_B3());
        this.view1.addListener4(new buttonListener_B4());
        this.view1.addListener5(new buttonListener_B5());
        this.view1.addListener_save(new buttonListener_save());
        this.view1.addListener_buttonback(new buttonListener_buttonback());
        this.view1.addListener_buttonback2(new buttonListener_buttonback2());
        this.view1.addListener_buttonback3(new buttonListener_buttonback3());
        this.view1.addListener_1(new buttonListenner_button1());
        this.view1.addListener_2(new buttonListenner_button2());
        this.view1.addListener_3(new buttonListenner_button3());
        this.view1.addListener_4(new buttonListenner_backMainMenu());
        this.view1.addListener_4_2(new buttonListener_button4_2());
        this.view1.addListener_exit(new buttonListener_exit());

    }

    //Открыть главное меню
    public void openWindow(){
        view1.CreateMainMenu();
    }

    //простой тест
    public static JPanel prints() throws IOException {
        return  test.printQuestions(file);
    }
    public static JPanel start_test() throws IOException {
        return test.startTest(file_1, file_2);
    }

    //средний тест
    public static JPanel prints_m() throws IOException {
        return   test.printQuestions(file2);
    }
    public static JPanel start_test2() throws IOException {
        return test.startTest(file2_1, file2_2);
    }

    //сложный тест
    public static JPanel prints_h() throws IOException {
        return   test.printQuestions(file3);
    }
    public static JPanel start_test3() throws IOException {
        return test.startTest(file3_1, file3_2);
    }

    //очень сложный тест
    public static JPanel prints_vh() throws IOException {
        return   test.printQuestions(file4);
    }
    public static JPanel start_test4() throws IOException {
        return test.startTest(file4_1, file4_2);
    }

    //Кнопка "Регистрация"
    class buttonListener_B1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                new buttonListener_b();
            } catch (Exception w) {
                throw new RuntimeException(w);
            }
            view1.closeFrame1();
            view1.CreatePaneRezeption();
            view1.getmenuFrame().setVisible(true);
        }
    }


    //Кнопки перехода с меню2 на окно теста
    //Простой тест
     class buttonListener_B2 implements ActionListener {
         public void actionPerformed(ActionEvent e) {
             view1.closeFrame1();
             view1.CreateMenu2();
             view1.visible2();
             try {
                 view1.CreatePanelTest(start_test());
                 view1.CreatePanelPrint(prints());
                 model1.setFile(file_2);
             } catch (IOException ex) {
                 throw new RuntimeException(ex);
             }
         }
         }

    //Средний тест
    class buttonListener_B3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                view1.CreatePanelTest(start_test2());
                view1.CreatePanelPrint(prints_m());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            view1.notvisible();
            view1.CreateMenu2();
            view1.visible2();
            model1.setFile(file2_2);
        }
    }
    //Сложный тест
    class buttonListener_B4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view1.notvisible();
            view1.CreateMenu2();
            view1.visible2();
            model1.setFile(file3_2);
            try {
                view1.CreatePanelTest(start_test3());
                view1.CreatePanelPrint(prints_h());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    // Очень сложный тест
    class buttonListener_B5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view1.notvisible();
            view1.CreateMenu2();
            view1.visible2();
            model1.setFile(file4_2);
            try {
                view1.CreatePanelTest(start_test4());
                view1.CreatePanelPrint(prints_vh());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    //Кнопка для записи данных в файл
    class buttonListener_b implements ActionListener {
        String file = "C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\inform_user.txt";

        @Override
        public void actionPerformed(ActionEvent e) {
            String us = view1.getText2().getText() + "\n";
            try {
                Files.write(Paths.get(file), us.getBytes(), StandardOpenOption.APPEND);
            }
            catch (IOException a) {
                System.out.println(a);
            }

            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            try {
                StringBuilder sb = new StringBuilder();
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                while (line != null) {
                    sb.append(line);
                    sb.append("\n");
                    line = br.readLine();
                }
                String everything = sb.toString();
                if(everything == view1.getText2().toString()){
                    System.out.println("Ошибка");
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } finally {
                try {
                    br.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }

    }

    //Кнопка закрытия основного меню
    class buttonListener_exit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view1.closeFrame1();
        }
        }

        //Кнопка "Сохранить"
      class buttonListener_save implements ActionListener{
            String file = "C:\\Users\\katya\\OneDrive\\Рабочий стол\\TestSystem\\TestSystem\\inform_user.txt";
            public void actionPerformed(ActionEvent e) {
                String us = view1.getText2().getText() + "\n";
                try {
                    Files.write(Paths.get(file), us.getBytes(), StandardOpenOption.APPEND);
                    view1.Change_color1();

                }
                catch (IOException a) {
                    System.out.println(a);
                    view1.Change_color2();
                }
            }
        }

        //Кнопка возврата в главное меню
        class buttonListener_buttonback implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                    view1.backMainMenu();
            }
        }

        //кнопка возврата во второе меню
        class  buttonListener_buttonback2 implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                view1.backMenu2();
            }
        }

    //кнопка возврата во второе меню с другим стилем для другой панели
    class  buttonListener_buttonback3 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            view1.backMenu2();
        }
    }

    //Кнопка "Начать тест"
      class buttonListenner_button1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view1.startTest();
        }
      }

      //Кнопка "Посмотреть список вопросов"
    class buttonListenner_button2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view1.printTest();
        }
    }

    //Кнопка "Посмотреть результат"
    class buttonListenner_button3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           if(model1.checkFile()==false){
               view1.SetName(model1.getName());
               view1.SetText(model1.getResults());
               view1.SetText2(model1.getAnswers());
               view1.SetScores(model1.numberTrue(model1.getResults(), model1.getAnswers()));
               view1.ViewResult();
           }
           else {
               System.out.println("File is empty");
           }
        }
    }

    //Кнопка выхода в основное меню с панели регистрации
        class buttonListenner_backMainMenu implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                view1.backMainMenu();
            }
        }

        //Кнопка "Сохранить" для панели с тестом
      class buttonListener_button4_2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            view1.Change_color3();
        }
       }
}
