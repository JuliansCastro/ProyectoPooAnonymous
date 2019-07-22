package UI;

import data.Nutritionist;
import data.Patient;
import data.User;
import java.awt.Image;
import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import logicBusiness.Login;

/**
 *
 * @author Satellite COREi3
 */
public class EditUserProfile extends javax.swing.JFrame {

    /**
     * Creates new form UserRegisterScreen
     */
    private final User users = new User();
    private final Login login = new Login();
    private HashMap<String, String[]> listOfNutritionists = new HashMap<>();
    private HashMap<String, String[]> listOfPatients = new HashMap<>();
    private HashMap<String, String[]> loginList = new HashMap<>();
    private String user = "", password = "", names = "", lastnames = "", id = "",
            phone = "", email = "", userType = "", birthday = "", sex = "",
            professionalCard = "", yearsExperience = "", age = "", athlete = "";

    public EditUserProfile() {
        initComponents();

        setLocationRelativeTo(null);
        txtId.enable(false);
        cbxTypeUser.enable(false);
        txtUser.enable(false);
        setResizable(false);

        //btnSave.setVisible(false);
        txtPhone.requestFocus();
        jLabelAthlete.setVisible(false);
        rbtYesAthlete.setVisible(false);
        rbtNoAthlete.setVisible(false);
        jLabelAge.setVisible(false);
        txtAge.setVisible(false);
        rbtFemale.setSelected(true);
        rbtYesAthlete.setSelected(true);

        setIconImage(new ImageIcon(getClass().getResource("/resources/img/icono.jpg")).getImage());

        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon background = new ImageIcon(this.getClass().getResource("/resources/img/logotipoH.jpg"));

        background = new ImageIcon(background.getImage().getScaledInstance(getWidth() / 4, getHeight() / 8, Image.SCALE_SMOOTH));

        JLabel fondo = new JLabel();
        fondo.setIcon(background);

        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(550, 20, background.getIconWidth(), background.getIconHeight());

        try {
            users.readDatabase();
            login.readDatabase();
            listOfNutritionists = users.getListOfNutritionistsData();
            listOfPatients = users.getListOfPatientData();

            loginList = login.getUserLoginList();

            String[] loginData = loginList.get(LoginScreen.getUser());
            String[] userDataNutritionist = listOfNutritionists.get(loginData[0]);
            String[] userDataPatient = listOfPatients.get(loginData[0]);

            //System.out.println("INFO USER: " + Arrays.toString(loginData) + Arrays.toString(userData));
            if (listOfNutritionists.containsKey(loginData[0])) {

                txtId.setText(loginData[0]);
                txtUser.setText(loginData[1]);
                txtPasswordField.setText(loginData[2]);
                txtConfirmPasswordField.setText(loginData[2]);
                txtNames.setText(userDataNutritionist[1]);
                txtLastnames.setText(userDataNutritionist[2]);
                txtBirthday.setText(userDataNutritionist[4]);
                txtPhone.setText(userDataNutritionist[5]);
                txtEmail.setText(userDataNutritionist[6]);
                txtYearsExperience.setText(userDataNutritionist[7]);
                txtProfessionalCard.setText(userDataNutritionist[8]);
                if (userDataNutritionist[3].equals("0")) {
                    rbtFemale.setSelected(true);
                } else {
                    rbtMale.setSelected(true);
                }
            } else if (listOfPatients.containsKey(loginData[0])) {
                cbxTypeUser.setSelectedIndex(1);
                txtId.setText(loginData[0]);
                txtUser.setText(loginData[1]);
                txtPasswordField.setText(loginData[2]);
                txtConfirmPasswordField.setText(loginData[2]);
                txtNames.setText(userDataPatient[1]);
                txtLastnames.setText(userDataPatient[2]);
                txtBirthday.setText(userDataPatient[4]);
                txtPhone.setText(userDataPatient[5]);
                txtEmail.setText(userDataPatient[6]);
                txtAge.setText(userDataPatient[7]);
                txtAge.setText(userDataPatient[2]);
                
                if (userDataPatient[8].equals("0")) {
                    rbtYesAthlete.setSelected(true);
                } else {
                    rbtNoAthlete.setSelected(true);
                }
                if (userDataPatient[3].equals("0")) {
                    rbtFemale.setSelected(true);
                } else {
                    rbtMale.setSelected(true);
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(EditUserProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*if (true) {
            
            if ((users.getUserLoginList()).containsKey(txtUser.getText().trim().replaceAll(" ", ""))) {
                JOptionPane.showMessageDialog(rootPane, "Usuario ya existe, intente con otro");
                this.txtUser.requestFocus();
            } else {
                
            }
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtGroupSex = new javax.swing.ButtonGroup();
        rbtGroupSport = new javax.swing.ButtonGroup();
        JpanelSignUp = new javax.swing.JPanel();
        jPanelSignUpTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNames = new javax.swing.JLabel();
        jLabelLastnames = new javax.swing.JLabel();
        txtNames = new javax.swing.JTextField();
        txtLastnames = new javax.swing.JTextField();
        jLabelUser = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jLabelTypeUser = new javax.swing.JLabel();
        jLabelBirthday = new javax.swing.JLabel();
        jLabelSex = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPasswordField = new javax.swing.JPasswordField();
        txtPhone = new javax.swing.JTextField();
        rbtMale = new javax.swing.JRadioButton();
        cbxTypeUser = new javax.swing.JComboBox<>();
        rbtFemale = new javax.swing.JRadioButton();
        txtBirthday = new javax.swing.JTextField();
        jLabelConfirmPassword = new javax.swing.JLabel();
        txtConfirmPasswordField = new javax.swing.JPasswordField();
        jPanelAditionalData = new javax.swing.JPanel();
        jLabelAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabelProfessionalCard = new javax.swing.JLabel();
        txtProfessionalCard = new javax.swing.JTextField();
        jLabelYearsExperience = new javax.swing.JLabel();
        jLabelAthlete = new javax.swing.JLabel();
        txtYearsExperience = new javax.swing.JTextField();
        rbtYesAthlete = new javax.swing.JRadioButton();
        rbtNoAthlete = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        jPanelBottonSave = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jLabeMessagelErrorPasswordConfirm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JpanelSignUp.setBackground(new java.awt.Color(255, 255, 255));
        JpanelSignUp.setOpaque(false);

        jPanelSignUpTitle.setBackground(new java.awt.Color(0, 255, 102));

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Editar Perfil de usuario");

        javax.swing.GroupLayout jPanelSignUpTitleLayout = new javax.swing.GroupLayout(jPanelSignUpTitle);
        jPanelSignUpTitle.setLayout(jPanelSignUpTitleLayout);
        jPanelSignUpTitleLayout.setHorizontalGroup(
            jPanelSignUpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSignUpTitleLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );
        jPanelSignUpTitleLayout.setVerticalGroup(
            jPanelSignUpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSignUpTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelNames.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNames.setText("Nombres: ");

        jLabelLastnames.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelLastnames.setText("Apellidos:");

        txtNames.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamesActionPerformed(evt);
            }
        });
        txtNames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamesKeyPressed(evt);
            }
        });

        txtLastnames.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLastnames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastnamesActionPerformed(evt);
            }
        });
        txtLastnames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLastnamesKeyPressed(evt);
            }
        });

        jLabelUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUser.setText("Usuario: ");

        jLabelId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelId.setText("Identificación:");

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPassword.setText("Contraseña: ");

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEmail.setText("Correo:");

        jLabelPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPhone.setText("Telefono:");

        jLabelTypeUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTypeUser.setText("Tipo de usuario: ");

        jLabelBirthday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelBirthday.setText("F. Nacimiento:");

        jLabelSex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSex.setText("Genero:");

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        txtPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordFieldKeyPressed(evt);
            }
        });

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneKeyPressed(evt);
            }
        });

        rbtGroupSex.add(rbtMale);
        rbtMale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtMale.setText("Masculino");

        cbxTypeUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxTypeUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nutricionista", "Paciente" }));
        cbxTypeUser.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTypeUserItemStateChanged(evt);
            }
        });
        cbxTypeUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxTypeUserMouseClicked(evt);
            }
        });
        cbxTypeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTypeUserActionPerformed(evt);
            }
        });
        cbxTypeUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxTypeUserKeyPressed(evt);
            }
        });

        rbtGroupSex.add(rbtFemale);
        rbtFemale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtFemale.setText("Femenino");
        rbtFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFemaleActionPerformed(evt);
            }
        });

        txtBirthday.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBirthday.setText("dd/mm/aaaa");
        txtBirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthdayActionPerformed(evt);
            }
        });
        txtBirthday.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBirthdayKeyPressed(evt);
            }
        });

        jLabelConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelConfirmPassword.setText("Confirmar contraseña:");

        txtConfirmPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConfirmPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordFieldActionPerformed(evt);
            }
        });
        txtConfirmPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordFieldKeyReleased(evt);
            }
        });

        jLabelAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAge.setText("Edad:");

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });

        jLabelProfessionalCard.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelProfessionalCard.setText("N. tarjeta profesional:");

        txtProfessionalCard.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProfessionalCard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProfessionalCardKeyPressed(evt);
            }
        });

        jLabelYearsExperience.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelYearsExperience.setText("Años de experiencia: ");

        jLabelAthlete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAthlete.setText("Deportista: ");

        txtYearsExperience.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtYearsExperience.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtYearsExperienceKeyPressed(evt);
            }
        });

        rbtGroupSport.add(rbtYesAthlete);
        rbtYesAthlete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtYesAthlete.setText("Si");
        rbtYesAthlete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtYesAthleteMouseClicked(evt);
            }
        });
        rbtYesAthlete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtYesAthleteActionPerformed(evt);
            }
        });
        rbtYesAthlete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbtYesAthleteKeyPressed(evt);
            }
        });

        rbtGroupSport.add(rbtNoAthlete);
        rbtNoAthlete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtNoAthlete.setText("No");
        rbtNoAthlete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtNoAthleteMouseClicked(evt);
            }
        });
        rbtNoAthlete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbtNoAthleteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAditionalDataLayout = new javax.swing.GroupLayout(jPanelAditionalData);
        jPanelAditionalData.setLayout(jPanelAditionalDataLayout);
        jPanelAditionalDataLayout.setHorizontalGroup(
            jPanelAditionalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAditionalDataLayout.createSequentialGroup()
                .addGroup(jPanelAditionalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAditionalDataLayout.createSequentialGroup()
                        .addComponent(jLabelAge)
                        .addGap(28, 28, 28)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAditionalDataLayout.createSequentialGroup()
                        .addComponent(jLabelProfessionalCard)
                        .addGap(14, 14, 14)
                        .addComponent(txtProfessionalCard, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAditionalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAthlete)
                    .addComponent(jLabelYearsExperience))
                .addGap(23, 23, 23)
                .addGroup(jPanelAditionalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAditionalDataLayout.createSequentialGroup()
                        .addComponent(rbtYesAthlete)
                        .addGap(18, 18, 18)
                        .addComponent(rbtNoAthlete))
                    .addComponent(txtYearsExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );
        jPanelAditionalDataLayout.setVerticalGroup(
            jPanelAditionalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAditionalDataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAditionalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProfessionalCard)
                    .addComponent(txtProfessionalCard, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelYearsExperience)
                    .addComponent(txtYearsExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAditionalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAthlete)
                    .addComponent(rbtYesAthlete)
                    .addComponent(rbtNoAthlete))
                .addContainerGap())
        );

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCancel.setText("CANCELAR");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancel)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSave.setText("GUARDAR");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBottonSaveLayout = new javax.swing.GroupLayout(jPanelBottonSave);
        jPanelBottonSave.setLayout(jPanelBottonSaveLayout);
        jPanelBottonSaveLayout.setHorizontalGroup(
            jPanelBottonSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottonSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBottonSaveLayout.setVerticalGroup(
            jPanelBottonSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottonSaveLayout.createSequentialGroup()
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabeMessagelErrorPasswordConfirm.setOpaque(true);

        javax.swing.GroupLayout JpanelSignUpLayout = new javax.swing.GroupLayout(JpanelSignUp);
        JpanelSignUp.setLayout(JpanelSignUpLayout);
        JpanelSignUpLayout.setHorizontalGroup(
            JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelSignUpLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelSignUpLayout.createSequentialGroup()
                        .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanelAditionalData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JpanelSignUpLayout.createSequentialGroup()
                                .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelSignUpLayout.createSequentialGroup()
                                        .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JpanelSignUpLayout.createSequentialGroup()
                                            .addComponent(jLabelNames, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtNames, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(JpanelSignUpLayout.createSequentialGroup()
                                                .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(JpanelSignUpLayout.createSequentialGroup()
                                                .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(JpanelSignUpLayout.createSequentialGroup()
                                                .addComponent(jLabelBirthday)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(29, 29, 29)
                                .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelSignUpLayout.createSequentialGroup()
                                                    .addComponent(jLabelPassword)
                                                    .addGap(64, 64, 64))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelSignUpLayout.createSequentialGroup()
                                                    .addComponent(jLabelConfirmPassword)
                                                    .addGap(6, 6, 6))
                                                .addGroup(JpanelSignUpLayout.createSequentialGroup()
                                                    .addComponent(jLabelLastnames, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(64, 64, 64)))
                                            .addGroup(JpanelSignUpLayout.createSequentialGroup()
                                                .addComponent(jLabelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(64, 64, 64)))
                                        .addGroup(JpanelSignUpLayout.createSequentialGroup()
                                            .addComponent(jLabelTypeUser)
                                            .addGap(41, 41, 41)))
                                    .addGroup(JpanelSignUpLayout.createSequentialGroup()
                                        .addComponent(jLabelSex, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)))
                                .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabeMessagelErrorPasswordConfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(JpanelSignUpLayout.createSequentialGroup()
                                        .addComponent(rbtFemale)
                                        .addGap(26, 26, 26)
                                        .addComponent(rbtMale))
                                    .addComponent(cbxTypeUser, 0, 217, Short.MAX_VALUE)
                                    .addComponent(txtPhone)
                                    .addComponent(txtLastnames)
                                    .addComponent(txtPasswordField)
                                    .addComponent(txtConfirmPasswordField))))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(JpanelSignUpLayout.createSequentialGroup()
                        .addComponent(jPanelSignUpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelSignUpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290)
                .addComponent(jPanelBottonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        JpanelSignUpLayout.setVerticalGroup(
            JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelSignUpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelSignUpLayout.createSequentialGroup()
                        .addComponent(jPanelSignUpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabeMessagelErrorPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelUser)
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastnames, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLastnames)
                            .addComponent(jLabelNames, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNames, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelId)
                            .addComponent(txtId)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPhone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTypeUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelEmail)
                                .addComponent(txtEmail))))
                    .addGroup(JpanelSignUpLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTypeUser)))
                .addGap(18, 18, 18)
                .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSex)
                    .addComponent(jLabelBirthday)
                    .addComponent(rbtFemale)
                    .addComponent(rbtMale)
                    .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelAditionalData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(JpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelBottonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpanelSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JpanelSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamesKeyPressed
        char nextTextField = (char) evt.getKeyCode();
        if (nextTextField == evt.VK_ENTER) {
            this.txtLastnames.requestFocus();
        }
    }//GEN-LAST:event_txtNamesKeyPressed

    private void txtLastnamesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastnamesKeyPressed
        char nextTextField = (char) evt.getKeyCode();
        if (nextTextField == evt.VK_ENTER) {
            this.txtId.requestFocus();
        }
    }//GEN-LAST:event_txtLastnamesKeyPressed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        this.txtPasswordField.requestFocus();

    }//GEN-LAST:event_txtUserKeyPressed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        char nextTextField = (char) evt.getKeyCode();
        if (nextTextField == evt.VK_ENTER) {
            this.txtPhone.requestFocus();
        }
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtBirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthdayActionPerformed

    private void txtPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordFieldKeyPressed
        char nextTextField = (char) evt.getKeyCode();
        if (nextTextField == evt.VK_ENTER) {
            if (new String(txtPasswordField.getPassword()).length() >= 4) {
                this.txtConfirmPasswordField.requestFocus();
            } else {
                jLabeMessagelErrorPasswordConfirm.setText("Contraseña mínimo 4 caracteres");
                this.txtPasswordField.requestFocus();
            }
        }
    }//GEN-LAST:event_txtPasswordFieldKeyPressed

    private void txtPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyPressed
        char nextTextField = (char) evt.getKeyCode();
        if (nextTextField == evt.VK_ENTER) {
            this.txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtPhoneKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        char nextTextField = (char) evt.getKeyCode();
        if (nextTextField == evt.VK_ENTER) {
            this.txtBirthday.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtBirthdayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBirthdayKeyPressed
        char nextTextField = (char) evt.getKeyCode();
        if (nextTextField == evt.VK_ENTER) {
            this.cbxTypeUser.requestFocus();
            age = "13"; //cambiar
            txtAge.setText(age);
        }
    }//GEN-LAST:event_txtBirthdayKeyPressed

    private void cbxTypeUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxTypeUserKeyPressed
        char nextTextField = (char) evt.getKeyCode();
        if (nextTextField == evt.VK_ENTER) {
            if (cbxTypeUser.getSelectedItem().toString().equals("Nutricionista")) {
                this.txtProfessionalCard.requestFocus();
            } else {
                this.txtAge.requestFocus();
            }
        }
    }//GEN-LAST:event_cbxTypeUserKeyPressed

    private void rbtFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtFemaleActionPerformed

    private void rbtYesAthleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtYesAthleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtYesAthleteActionPerformed

    private void cbxTypeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTypeUserActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbxTypeUserActionPerformed

    private void txtConfirmPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordFieldKeyPressed
        char nextTextField = (char) evt.getKeyCode();
        if (nextTextField == evt.VK_ENTER) {
            //new String(txtPasswordField.getPassword())
            if (new String(txtPasswordField.getPassword()).equals(new String(txtConfirmPasswordField.getPassword()))) {
                this.txtNames.requestFocus();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Contraseñas no coinciden");
                this.txtConfirmPasswordField.requestFocus();
            }
        }
    }//GEN-LAST:event_txtConfirmPasswordFieldKeyPressed

    private void txtLastnamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastnamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastnamesActionPerformed

    private void cbxTypeUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxTypeUserMouseClicked
        // TODO add your handling code here:
        if (cbxTypeUser.getSelectedItem().toString().equals("Nutricionista")) {
            jLabelProfessionalCard.setVisible(true);
            txtProfessionalCard.setVisible(true);
            jLabelYearsExperience.setVisible(true);
            txtYearsExperience.setVisible(true);

            jLabelAthlete.setVisible(false);
            rbtYesAthlete.setVisible(false);
            rbtNoAthlete.setVisible(false);
            jLabelAge.setVisible(false);
            txtAge.setVisible(false);

        } else {
            jLabelAthlete.setVisible(true);
            rbtYesAthlete.setVisible(true);
            rbtNoAthlete.setVisible(true);
            jLabelAge.setVisible(true);
            txtAge.setVisible(true);

            jLabelProfessionalCard.setVisible(false);
            txtProfessionalCard.setVisible(false);;
            jLabelYearsExperience.setVisible(false);
            txtYearsExperience.setVisible(false);
        }
    }//GEN-LAST:event_cbxTypeUserMouseClicked

    private void cbxTypeUserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTypeUserItemStateChanged
        // TODO add your handling code here:
        if (cbxTypeUser.getSelectedItem().toString().equals("Nutricionista")) {
            jLabelProfessionalCard.setVisible(true);
            txtProfessionalCard.setVisible(true);
            jLabelYearsExperience.setVisible(true);
            txtYearsExperience.setVisible(true);

            jLabelAthlete.setVisible(false);
            rbtYesAthlete.setVisible(false);
            rbtNoAthlete.setVisible(false);
            jLabelAge.setVisible(false);
            txtAge.setVisible(false);

        } else {
            jLabelAthlete.setVisible(true);
            rbtYesAthlete.setVisible(true);
            rbtNoAthlete.setVisible(true);
            jLabelAge.setVisible(true);
            txtAge.setVisible(true);

            jLabelProfessionalCard.setVisible(false);
            txtProfessionalCard.setVisible(false);;
            jLabelYearsExperience.setVisible(false);
            txtYearsExperience.setVisible(false);
        }
    }//GEN-LAST:event_cbxTypeUserItemStateChanged

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            users.readDatabase();
        } catch (Exception ex) {
            Logger.getLogger(EditUserProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        user = this.txtUser.getText().replaceAll(" ", "").trim().toLowerCase();
        password = new String(txtConfirmPasswordField.getPassword());;
        names = this.txtNames.getText().trim();
        lastnames = this.txtLastnames.getText().trim();
        id = this.txtId.getText().trim();
        phone = this.txtPhone.getText().replaceAll(" ", "").trim();
        email = this.txtEmail.getText().replaceAll(" ", "").trim();
        if (cbxTypeUser.getSelectedItem().toString().equals("Nutricionista")) {
            userType = "0";
        } else {
            userType = "1";
        }
        birthday = this.txtBirthday.getText().replaceAll(" ", "").trim();
        if (this.rbtFemale.isSelected()) {
            sex = "0";
        } else {
            sex = "1";
        }
        professionalCard = this.txtProfessionalCard.getText().replaceAll(" ", "").trim();
        yearsExperience = this.txtYearsExperience.getText().replaceAll(" ", "").trim();
        age = this.txtAge.getText().replaceAll(" ", "").trim();
        if (this.rbtYesAthlete.isSelected()) {
            athlete = "0";
        } else {
            athlete = "1";
        }

        /*-----------------------File Login.txt---------------------------*/
        login.setUser(txtUser.getText());
        login.setPassword(new String(txtPasswordField.getPassword()));
        login.setId(txtId.getText());
        try {
            System.out.println("DAto desen: " + login.decrypt("[-23, -42, -21, 124, -21, -26, -87, -93, 80, -112, 117, 47, 10, 60, -2, -40]"));
            login.saveData(login.getUser(), login.getPassword(), login.getId());
        } catch (Exception ex) {
            Logger.getLogger(EditUserProfile.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*-----------------------File userProfile.txt---------------------*/
        if (cbxTypeUser.getSelectedItem().toString().equals("Nutricionista")) {
            if (((txtUser.getText()).equals("") == false)
                    && (((txtPasswordField.getText()).equals("") == false))
                    && ((txtConfirmPasswordField.getText()).equals("") == false)
                    && ((txtNames.getText()).equals("") == false)
                    && ((txtLastnames.getText()).equals("") == false)
                    && ((txtId.getText()).equals("") == false)
                    && ((txtPhone.getText()).equals("") == false)
                    && ((txtEmail.getText()).equals("") == false)
                    && ((txtBirthday.getText()).equals("") == false)
                    && ((txtProfessionalCard.getText()).equals("") == false)
                    && ((txtYearsExperience.getText()).equals("") == false)) {
                try {
                    login.saveData(user, password, id);
                    Nutritionist nutritionist = new Nutritionist(id, userType,
                            names, lastnames, sex, birthday, phone, email,
                            yearsExperience, professionalCard);
                    nutritionist.saveData();
                    JOptionPane.showMessageDialog(rootPane, "Datos guardados con éxito");
                } catch (Exception ex) {
                    Logger.getLogger(EditUserProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Guardando datos nutricionista");
                for (int i = 0; JpanelSignUp.getComponents().length > i; i++) {
                    if (JpanelSignUp.getComponents()[i] instanceof JTextField) {
                        ((JTextField) JpanelSignUp.getComponents()[i]).setText("");
                    } else if (JpanelSignUp.getComponents()[i] instanceof JPasswordField) {
                        ((JPasswordField) JpanelSignUp.getComponents()[i]).setText("");
                    }
                }
                for (int i = 0; jPanelAditionalData.getComponents().length > i; i++) {
                    if (jPanelAditionalData.getComponents()[i] instanceof JTextField) {
                        ((JTextField) jPanelAditionalData.getComponents()[i]).setText("");
                    } else if (jPanelAditionalData.getComponents()[i] instanceof JPasswordField) {
                        ((JPasswordField) jPanelAditionalData.getComponents()[i]).setText("");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Datos NO pueden estar vacios");
                System.out.println("No Guardado. Datos vacios nutricionista");
            }
        } else {
            if (((txtUser.getText()).equals("") == false)
                    && (((txtPasswordField.getText()).equals("") == false))
                    && ((txtConfirmPasswordField.getText()).equals("") == false)
                    && ((txtNames.getText()).equals("") == false)
                    && ((txtLastnames.getText()).equals("") == false)
                    && ((txtId.getText()).equals("") == false)
                    && ((txtPhone.getText()).equals("") == false)
                    && ((txtEmail.getText()).equals("") == false)
                    && ((txtBirthday.getText()).equals("") == false)
                    && ((txtAge.getText()).equals("") == false)) {

                try {
                    users.saveData(user, password, id);
                    Patient patient = new Patient(id, userType, names, lastnames,
                            sex, birthday, phone, email, age, athlete);
                    patient.saveData();
                    JOptionPane.showMessageDialog(rootPane, "Datos guardados con éxito");
                } catch (Exception ex) {
                    Logger.getLogger(EditUserProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Guardando datos del paciente");

                for (int i = 0; JpanelSignUp.getComponents().length > i; i++) {
                    if (JpanelSignUp.getComponents()[i] instanceof JTextField) {
                        ((JTextField) JpanelSignUp.getComponents()[i]).setText("");
                    } else if (JpanelSignUp.getComponents()[i] instanceof JPasswordField) {
                        ((JPasswordField) JpanelSignUp.getComponents()[i]).setText("");
                    }
                }
                for (int i = 0; jPanelAditionalData.getComponents().length > i; i++) {
                    if (jPanelAditionalData.getComponents()[i] instanceof JTextField) {
                        ((JTextField) jPanelAditionalData.getComponents()[i]).setText("");
                    } else if (jPanelAditionalData.getComponents()[i] instanceof JPasswordField) {
                        ((JPasswordField) jPanelAditionalData.getComponents()[i]).setText("");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Datos NO pueden estar vacios");
                System.out.println("No Guardado. Datos vacios del Paciente");
            }
        }

        this.setVisible(false);//*/
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtProfessionalCardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProfessionalCardKeyPressed
        char nextTextField = (char) evt.getKeyCode();
        if (nextTextField == evt.VK_ENTER) {
            this.txtYearsExperience.requestFocus();
        }
    }//GEN-LAST:event_txtProfessionalCardKeyPressed

    private void txtYearsExperienceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearsExperienceKeyPressed
        char nextTextField = (char) evt.getKeyCode();
        if (nextTextField == evt.VK_ENTER) {
            this.btnSave.setVisible(true);
            this.btnSave.requestFocus();
        }
    }//GEN-LAST:event_txtYearsExperienceKeyPressed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        char nextTextField = (char) evt.getKeyCode();
        if (nextTextField == evt.VK_ENTER) {
            this.rbtYesAthlete.requestFocus();
        }
    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtConfirmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordFieldActionPerformed

    }//GEN-LAST:event_txtConfirmPasswordFieldActionPerformed

    private void rbtYesAthleteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtYesAthleteKeyPressed
        char nextTextField = (char) evt.getKeyCode();
        if (nextTextField == evt.VK_ENTER) {
            this.btnSave.setVisible(true);
            this.btnSave.requestFocus();
        }
    }//GEN-LAST:event_rbtYesAthleteKeyPressed

    private void rbtNoAthleteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtNoAthleteKeyPressed
        char nextTextField = (char) evt.getKeyCode();
        if (nextTextField == evt.VK_ENTER) {
            this.btnSave.setVisible(true);
            this.btnSave.requestFocus();
        }
    }//GEN-LAST:event_rbtNoAthleteKeyPressed

    private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveKeyPressed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void rbtYesAthleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtYesAthleteMouseClicked
        // TODO add your handling code here:
        btnSave.setVisible(true);
        btnSave.requestFocus();
    }//GEN-LAST:event_rbtYesAthleteMouseClicked

    private void rbtNoAthleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtNoAthleteMouseClicked
        // TODO add your handling code here:
        btnSave.setVisible(true);
        btnSave.requestFocus();
    }//GEN-LAST:event_rbtNoAthleteMouseClicked

    private void txtNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamesActionPerformed

    private void txtConfirmPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordFieldKeyReleased
        if (new String(txtPasswordField.getPassword()).equals(new String(txtConfirmPasswordField.getPassword()))) {
            this.txtNames.requestFocus();
            jLabeMessagelErrorPasswordConfirm.setText(" ");
        } else {
            jLabeMessagelErrorPasswordConfirm.setText("*Contraseña no coincide");
        }
    }//GEN-LAST:event_txtConfirmPasswordFieldKeyReleased

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelSignUp;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxTypeUser;
    private javax.swing.JLabel jLabeMessagelErrorPasswordConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelAthlete;
    private javax.swing.JLabel jLabelBirthday;
    private javax.swing.JLabel jLabelConfirmPassword;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelLastnames;
    private javax.swing.JLabel jLabelNames;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelProfessionalCard;
    private javax.swing.JLabel jLabelSex;
    private javax.swing.JLabel jLabelTypeUser;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelYearsExperience;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAditionalData;
    private javax.swing.JPanel jPanelBottonSave;
    private javax.swing.JPanel jPanelSignUpTitle;
    private javax.swing.JRadioButton rbtFemale;
    private javax.swing.ButtonGroup rbtGroupSex;
    private javax.swing.ButtonGroup rbtGroupSport;
    private javax.swing.JRadioButton rbtMale;
    private javax.swing.JRadioButton rbtNoAthlete;
    private javax.swing.JRadioButton rbtYesAthlete;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JPasswordField txtConfirmPasswordField;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastnames;
    private javax.swing.JTextField txtNames;
    private javax.swing.JPasswordField txtPasswordField;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtProfessionalCard;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtYearsExperience;
    // End of variables declaration//GEN-END:variables
}
