package RGR;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;


public class View {

    JFrame menuFrame = new JFrame("Система тестирования знаний");
    JFrame menuframe = new JFrame("Система тестирования знаний");

    JPanel panel,panel2, pn2;
    JPanel pan1, pan2, pan3;

    JButton Button1;
    JButton Button2;
    JButton Button3;
    JButton Button4;
    JButton Button5;
    JButton exitButton;

    JLabel welcomeLabel;
    JLabel welcomeLabel2;
    JLabel l2;


    JButton button1;
    JButton buttonback, buttonback2, buttonback3;
    JButton button2;
    JButton button3;
    JButton button4, button4_2;
    JButton buttonsave;
    JTextField text2;


    JPanel result;
    JTextArea answ, answ2;
    JLabel labelname,label;


    public View(){
        Toolkit tk1 = Toolkit.getDefaultToolkit();
        Dimension dim1 = tk1.getScreenSize();

        menuFrame.setBounds(dim1.width / 3 - 200, dim1.height / 3 - 200, 1000, 700);
        menuFrame.setBackground(new Color(176, 196, 222));

        menuframe.setBounds(dim1.width / 3 - 200, dim1.height / 3 - 200, 1000, 700);
        menuframe.setBackground(new Color(176, 196, 222));

        panel = new JPanel(null);

        panel2 = new JPanel(null);
        panel2.setBackground(new Color(255,250,205));

        pan1 = new JPanel(null);
        pan1.setBackground(new Color(255, 250, 205));

        pan2 = new JPanel(null);
        pan2.setBackground(new Color(255, 250, 205));

        pan3 = new JPanel(null);
        pan3.setBackground(new Color(255, 250, 205));


        //////////////////////////////////////Элементы основного меню/////////////////////////////////////////////////////////////////
        Button1 = new JButton("Регистрация");
        Button1.setBounds(290, 200, 400, 50);
        Button1.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        Button1.setForeground(Color.WHITE);
        Button1.setBackground(new Color(70, 130, 180));
        Button1.setFocusPainted(false);

        welcomeLabel = new JLabel("Дорогой гость! Проверь уровень своих знаний благодаря этим тестам.");
        welcomeLabel.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 22));
        welcomeLabel.setBounds(140, 50, 800, 100);
        welcomeLabel.setForeground(new Color(65, 105, 225));

        welcomeLabel2 = new JLabel("Зарегестрируся, выбери тест по уровню сложности и приступай!");
        welcomeLabel2.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 22));
        welcomeLabel2.setBounds(220, 90, 800, 100);
        welcomeLabel2.setForeground(new Color(65, 105, 225));

        Button2 = new JButton("Простой тест");
        Button2.setBounds(290, 270, 400, 50);
        Button2.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        Button2.setForeground(Color.WHITE);
        Button2.setBackground(new Color(135, 206, 235));
        Button2.setFocusPainted(false);

        Button3 = new JButton("Средний тест");
        Button3.setBounds(290, 340, 400, 50);
        Button3.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        Button3.setForeground(Color.WHITE);
        Button3.setBackground(new Color(70, 130, 180));
        Button3.setFocusPainted(false);

        Button4 = new JButton("Сложный тест");
        Button4.setBounds(290, 410, 400, 50);
        Button4.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        Button4.setForeground(Color.WHITE);
        Button4.setBackground(new Color(135, 206, 235));
        Button4.setFocusPainted(false);

        Button5 = new JButton("Очень сложный тест");
        Button5.setBounds(290, 480, 400, 50);
        Button5.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        Button5.setForeground(Color.WHITE);
        Button5.setBackground(new Color(70, 130, 180));
        Button5.setFocusPainted(false);

        exitButton = new JButton("Выход");
        exitButton.setBounds(290, 550, 400, 50);
        exitButton.setForeground(Color.WHITE);
        exitButton.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        exitButton.setBackground(new Color(135, 206, 235));
        exitButton.setFocusPainted(false);

//////////////////////////////////////Элементы второго меню////////////////////////////////////////////////////////////////
        button1 = new JButton("Начать тест");
        button1.setBounds(290, 200, 400, 50);
        button1.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        button1.setBackground(new Color(135, 206, 235));
        button1.setFocusPainted(false);

        button2 = new JButton("Список вопросов");
        button2.setBounds(290, 270, 400, 50);
        button2.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        button2.setBackground(new Color(70, 130, 180));
        button2.setFocusPainted(false);

        button3 = new JButton("Посмотреть результаты теста");
        button3.setBounds(290, 340, 400, 50);
        button3.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        button3.setBackground(new Color(135, 206, 235));
        button3.setFocusPainted(false);

        button4 = new JButton("Возврат в меню");
        button4.setBounds(290, 410, 400, 50);
        button4.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        button4.setBackground(new Color(70, 130, 180));
        button4.setFocusPainted(false);

//////////////////////////// Элементы панели регистрации////////////////////////////////////////////////////////////////////////////
        l2 = new JLabel("Введите свое имя и фамилию: ");
        l2.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        l2.setForeground(new Color(65, 105, 225));
        l2.setBounds(200, 200, 700, 50);

        text2 = new JTextField(20);
        text2.setBounds(500, 210, 200, 30);

        buttonsave = new JButton("Сохранить");
        buttonsave.setBounds(490, 410, 200, 50);
        buttonsave.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        buttonsave.setBackground(new Color(255, 228, 181));


        buttonback = new JButton("Вернуться");
        buttonback.setBounds(280, 410, 200, 50);
        buttonback.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        buttonback.setBackground(new Color(255, 228, 181));

        buttonback2 = new JButton("Возврат в меню");
        buttonback2.setBounds(380, 600, 200, 50);
        buttonback2.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        buttonback2.setBackground(new Color(70, 130, 180));

        buttonback3 = new JButton("Возврат в меню");
        buttonback3.setBounds(250, 1900, 200, 50);
        buttonback3.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        buttonback3.setBackground(new Color(70, 130, 180));

        button4_2 = new JButton("Сохранить");
        button4_2.setBounds(480, 1900, 200, 50);
        button4_2.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 20));
        button4_2.setBackground(new Color(70, 130, 180));
        pn2 = new JPanel(new FlowLayout());
        pn2.setBackground(new Color(255, 205, 228));
        pn2.setPreferredSize(new Dimension(1000,2000));

        ////////////////////////////////Элементы панели ввывода результата/////////////////////////////////////////////////
        result = new JPanel(null);
        result.setBackground(new Color(255, 250, 205));

        answ = new JTextArea(15,15);
        answ.setBounds(300, 70, 200, 300);
        answ.setEditable(false);
        answ.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 16));

        answ2 = new JTextArea(15,15);
        answ2.setBounds(500, 70, 200, 300);
        answ2.setEditable(false);
        answ2.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 16));

        labelname = new JLabel();
        labelname.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 18));
        labelname.setBounds(10, 0, 400, 80);
        labelname.setForeground(new Color(65, 105, 225));

        label = new JLabel();
        label.setFont(new Font("Cascadia Mono Light", Font.PLAIN, 22));
        label.setBounds(330, 400, 500, 80);
        label.setForeground(new Color(65, 105, 225));

    }

    //Создать основное меню
    public void CreateMainMenu(){
        pan1.add(welcomeLabel);
        pan1.add(welcomeLabel2);
        pan1.add(Button1);
        pan1.add(Button2);
        pan1.add(Button3);
        pan1.add(Button4);
        pan1.add(Button5);
        pan1.add(exitButton);

        menuFrame.setContentPane(pan1);
        menuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menuFrame.setLayout(null);//using no layout managers
        menuFrame.setVisible(true);//making the frame visible
    }

    //Создать второе меню
    public void CreateMenu2(){
        pan2.add(button1);
        pan2.add(button2);
        pan2.add(button3);
        pan2.add(button4);
        menuframe.setContentPane(pan2);
        menuframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menuframe.setLayout(null);//using no layout managers
        menuframe.setVisible(true);//making the frame visible
    }

    // Создать окно регистрации
    public void CreatePaneRezeption(){
        pan3.add(l2);
        pan3.add(text2);
        pan3.add(buttonsave);
        pan3.add(buttonback);
        menuframe.setContentPane(pan3);
        menuframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menuframe.setLayout(null);//using no layout managers
        menuframe.setVisible(true);//making the frame visible
    }


    public void notvisible(){
        menuFrame.setVisible(false);
    }

    public void visible2(){
        menuframe.setVisible(true);
    }
    public void visible(){
        menuFrame.setVisible(true);
    }

    public void closeFrame1(){
        menuFrame.dispose();
    }
    public JFrame getmenuFrame() {return menuframe;}

    public void Change_color1() {buttonsave.setBackground(
            new Color(144, 238, 144));
            buttonsave.setText("Сохранено");
    }

    public void Change_color2(){buttonsave.setBackground(
            new Color(255,69,0));
            buttonsave.setText("Данные не сохранены");
    }

    public void Change_color3() {button4_2.setBackground(
            new Color(144, 238, 144));
             button4_2.setText("Сохранено");
    }

    //////////////////////Открыть панель теста///////////////////////////////////////////////////////////////////
    public void CreatePanelTest(JPanel panel) {
        this.panel = panel;
        panel.add(buttonback3);
        panel.add(button4_2);
    }

    //////////Поменять текущую панель на панель теста////////////////////////////////////////////////////////////
    public void startTest(){
        panel.add(buttonback3);
        panel.add(button4_2);
        pn2.add(panel);

        JScrollPane sp1  = new JScrollPane(pn2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollBar jsb = new JScrollBar();
        sp1.setVerticalScrollBar(jsb);
        menuframe.setContentPane(sp1);
        menuframe.setVisible(true);
    }

    ///////////Создать панель для предварительного просмотра вопросов//////////////////////////////////////////////////////////
    public void CreatePanelPrint(JPanel panel2){
        this.panel2 = panel2;
        panel2.add(buttonback2);
    }

    /////////Сменить текущую панель на панель с вопросами//////////////////////////////////////////////
    public void printTest(){
        menuframe.setContentPane(panel2);
        menuframe.setVisible(true);
    }
    ////////Создать и открыть панель с результатами прохождения теста//////////////////////////////////////
    public void ViewResult(){
        result.add(labelname);
        result.add(answ);
        result.add(answ2);
        result.add(label);
        result.add(buttonback2);
        menuframe.setContentPane(result);
        menuframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menuframe.setLayout(null);
        menuframe.setVisible(true);
    }

    public void backMainMenu(){
        menuframe.setVisible(false); // закрываем текущий фрейм
        menuFrame.setVisible(true);
    }

    public void backMenu2(){
        menuframe.setVisible(false);
        menuframe.remove(panel2);
        menuframe.setContentPane(pan2);
        menuframe.setVisible(true);
    }
    public JTextField getText2() {return text2;}

    public void SetName(String name){
        labelname.setText("Пользователь: "+ name);
    }
    public void SetText(String[] text){
        answ.append("\nВерные ответы: ");
        answ.append("\n\n");
        for(int i=0; i<text.length; i++){
            answ.append(text[i] + "\n");
        }
    }

    public void SetText2(String[] text){
        answ2.append("\nВаши ответы: ");
        answ2.append("\n\n");
        for(int i=0; i<text.length; i++){
            answ2.append(text[i] + "\n");
        }
    }

    public void SetScores(int scores){
        label.setText("\n\n\nВы ответили правильно на: " + scores +" вопрос(/а/ов)");
    }

    public void addListener(ActionListener clickButton){
        Button1.addActionListener(clickButton);
    }
    public void addListener2(ActionListener clickButton){
        Button2.addActionListener(clickButton);
    }
    public void addListener3(ActionListener clickButton){
        Button3.addActionListener(clickButton);
    }
    public void addListener4(ActionListener clickButton){
        Button4.addActionListener(clickButton);
    }
    public void addListener5(ActionListener clickButton){
        Button5.addActionListener(clickButton);
    }
    public void addListener_exit(ActionListener clickButton){
        exitButton.addActionListener(clickButton);
    }
    public void addListener_save(ActionListener clickButton){
        buttonsave.addActionListener(clickButton);
    }
    public void addListener_buttonback(ActionListener clickButton){
        buttonback.addActionListener(clickButton);
    }
    public void addListener_buttonback2(ActionListener clickButton){
        buttonback2.addActionListener(clickButton);
    }
    public void addListener_buttonback3(ActionListener clickButton){
        buttonback3.addActionListener(clickButton);
    }
    public void addListener_1(ActionListener clickButton){
        button1.addActionListener(clickButton);
    }
    public void addListener_2(ActionListener clickButton){
        button2.addActionListener(clickButton);
    }
    public void addListener_3(ActionListener clickButton){
        button3.addActionListener(clickButton);
    }
    public void addListener_4(ActionListener clickButton){
        button4.addActionListener(clickButton);
    }
    public void addListener_4_2(ActionListener clickButton){
        button4_2.addActionListener(clickButton);
    }
}