package PROLOG;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pdef;

import java.util.ArrayList;
import java.util.Map;
import javax.swing.*;


import org.jpl7.*;
/**
 *
 * @author Inori
 */
public class interfazwaifu extends javax.swing.JFrame {
//-----------------VOY A INTENTAR COMENTAR BIEN QUE SHINGADOS HAGO!///
    ///PARA EVITAR CONFUSIONES, SUERTE CON EL PROYECTO!!!, 福！
    /**
     * Creates new form interfazwaifu
     */
    //bandera para ocultar el botón 'Siguiente'
    public boolean bandera = false;
    public interfazwaifu() {
        
        initComponents();
        String[] init = new String[0];
        jList1.setListData(init); //comenzar con la lista limpia.
        //System.out.println( answ[0]);
        //Ocultar botón 'Siguiente'
        jButton2.setVisible(bandera);
        
        Query consulta = new Query(
            new Compound(
                "consult",
                new Term [] {new Atom("waifus.pl")}
            )            
        );
        if (consulta.hasSolution())
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
    
    //public static String pre1 = "¿Como prefieres el tipo de cabello?";
    //public static String pre2 = "¿que tan largo prefieres que sea el cabello?";
    //estaba usando la declaracion de cadenas, pero es mejor usar un objetos que tengan, 
    //pregunta, respuestas e indice de pregunta asignados.
    public static int qcounter = 0;
    public static int answnum = 20; //numero de respuesta que se van a usar
    //la variable de arriba se refiere a la respuesta qu el usuario da.
    //las opciones de las preguntas se mandan a llamar con el metodo
    public static String[] answ = new String[answnum];
    public static quest_index[] array_of_questions = new quest_index[20]; //arreglo de preguntas que haremos.
    //Query consulta;
    //hubo un problema quee tenia en que no podia usar mi arreglo de preguntas 
    //y tuve que declararlo como un arreglo publico al inicio del programa.
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 120, 160, 110);

        jButton1.setText("Empezar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 240, 80, 20);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 100, 49, 18);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 130, 70, 110);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 70, 250, 40);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        jButton2.setText("Siguiente");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 240, 90, 30);

        jButton3.setText("jButton3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(280, 260, 72, 30);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 230, 230, 18);

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     //aqui no va nada
    }                                        

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {                                      
       //boton inicio.
       bandera = true;
       jButton2.setVisible(bandera);
       qcounter = 0; // este contador nos dira en que pregunta vamos, si empezamos vuelve a cero.
       //hay que limpiar el arreglo donde vayamos guardando las respuestas. 
       //quest_index[] array_of_questions = new quest_index[10]; //arreglo de preguntas que haremos.
       String[] resp1 = {"dark", "light"};
       String[] resp2 = {"red", "orange", "blonde", "green", "blue", "purple", "brown", "black", "white", "pink"};
       String[] resp3 = {"long", "short"};
       String[] resp4 = {"red", "orange", "yellow", "green", "blue", "purple", "brown", "black", "gray", "pink", "two colors"};
       String[] respb = {"yes", "no"};
       String[] resp5 = {"< 14", "from 15 to 17", "from 17 to 22", ">  22"};
       String[] resps = {"comedy", "drama", "suspense", "schoolar", "magical girls", "shonen", "mecha"};
       array_of_questions[0] = new quest_index(0, "What kind of hair do you like the most?", resp1); 
       array_of_questions[1] = new quest_index(1, "what kind of long do you like the most?", resp2);
       array_of_questions[2] = new quest_index(2, "What color do you like the most?", resp3); 
       array_of_questions[3] = new quest_index(3, "What kind of eyes do you like the most?", resp1); 
       array_of_questions[4] = new quest_index(4, "What color of eyes do you like the most?", resp4); 
       array_of_questions[5] = new quest_index(5, "How old do you prefer your Waifu?", resp5); 
       array_of_questions[6] = new quest_index(6, "Do you like a lovely and sweet girl?", respb); 
       array_of_questions[7] = new quest_index(7, "Do you like girls with violent personality?", respb);
       array_of_questions[8] = new quest_index(8, "Do you like the obsesive girls?", respb);
       array_of_questions[9] = new quest_index(9, "Do you like the girls with assasin impulses?", respb);
       array_of_questions[10] = new quest_index(10, "Do you like to treatyour waifu like a princess?", respb);
       array_of_questions[11] = new quest_index(11, "Do you like the inxpresive/quiet girls?", respb);
       array_of_questions[12] = new quest_index(12, "Do you like the cute and clumsy girls?", respb);
       array_of_questions[13] = new quest_index(13, "Do you like the changes of personality forn paceful to violent?", respb);
       array_of_questions[14] = new quest_index(14, "Do you like the girls with infantile personality?", respb);
       array_of_questions[15] = new quest_index(15, "Do you like the girls with cat's characters?", respb);
       array_of_questions[16] = new quest_index(16, "Do you like the girls with masculine features?", respb);
       array_of_questions[17] = new quest_index(17, "Do you like a energic and happy waifu?", respb);
       array_of_questions[18] = new quest_index(18, "Do you prefer a waifu with a refined and cult touch?", respb);   
       array_of_questions[19] = new quest_index(19, "What genre of series do you like the most?", resps);
       
       //tuve un problema en la linea anterior, es importante recalcar que el constructor funciona
       //con new, de esta forma ya esta creada y declarada la pregunta y sus respuestas.
       //String[] respuesta1 = new String[2];
       //respuesta1[0]="dark";
       //respuesta1[1]="light"; esta parte tambien se mejoro con el constructor.
       pregunta_resp_list(array_of_questions[0]);
    }                                     

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {                                      
        //int ind = jList1.getLeadSelectionIndex();
        if(bandera)
        {
            if(qcounter < 20)
                {
                    if(!jList1.isSelectionEmpty())
                    {
                        String selection = jList1.getSelectedValue();
                        jLabel2.setText(selection);
                        answ[qcounter] = selection; //guardar en la respuesta en nuestro arreglo de respuestas dadas.
                        System.out.println(answ[qcounter]);
                        qcounter = qcounter + 1;
                        pregunta_resp_list(array_of_questions[qcounter]);
                    }
                    else
                    {
                        String msg = "Select one option!";
                        jLabel4.setText(msg);
                    }
                }
            else
            {
                jButton2.setText("Resultado");
                dict_change(answ);
                //jList1.setListData(answ);
            }
        }
        else
            
        {
            jLabel2.setText("Can't do that nigga!");
        }
    }                                     

    public void Consulta(String functionName,String X, int preguntas, String[] arregloQuery)
    {
        Compound tmpC;
        Term[] tmpT;
        tmpT = new Term[1 + arregloQuery.length];
        
        System.out.println("caraojo");
        tmpT[0] = new Variable(X);
        for (int k=1;k <= preguntas;k++)
        {
            tmpT[k] = new Atom(arregloQuery[k-1]);
        }
        
        for (Term tmpT1 : tmpT) {
            System.out.println(tmpT1);
        }
        tmpC = new Compound (functionName,tmpT);
        Query qtmp;
        qtmp = new Query(tmpC);
        System.out.println(qtmp.toString());        
        System.out.println(qtmp.hasSolution());
        Map<String,Term> solution;
        while(qtmp.hasMoreSolutions())
        {
            solution = qtmp.nextSolution();
            System.out.println("Waifu X: " +solution.get(X));
        }
        /*
        
        Query consulta = new Query(
            new Compound(
                "consult",
                new Term [] {new Atom("waifus.pl")}
            )            
        );
        if (consulta.hasSolution())
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
        
        String cons = functionName+"("+X+",";
        for(int k=0;k<preguntas;k++)
        {
            cons = cons+arregloQuery[k];
            if (k!=preguntas-1)
                cons = cons+",";
        }
        cons = cons+").";
        String tmppp = "hair(X,light,pink,long).";
        System.out.println(cons);
        Query tmp;
        tmp = new Query(tmppp);
        System.out.println(tmp.hasSolution());
        */
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {                                      
        String[] tmp = {answ[0],answ[1],answ[2]};
        
        Consulta("hair","X",tmp.length, tmp);        
        //System.out.println("asdasd "+Consulta1[0]);
    }                                     
    
   

    public void pregunta_resp_list(quest_index v1)
    {
        jList1.setListData(v1.getresponses()); //imprimir respuestas
        jLabel1.setText(v1.getquestionstring()); //imprimir preguntas
        
    }

    private void dict_change(String[] v1) {
        //metodo para cmabiar las palabras por lo que se va a consultar
        //con la base de conocimiento.
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object array(Term[] terminos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public class quest_index
    {
         private int index;
         private String preguntax;
         private String[] respuestas;
         
         public quest_index(int newindex, String newpregunta, String[] newresps)
         {
             //constructor de preguntas
             index = newindex;
             preguntax = newpregunta;
             respuestas = newresps;
         }
         
         public String getquestionstring()
         {
             return preguntax;
         }
         public int getquestindex()
         {
             return index;
         }
         public String[] getresponses()
         {
             return respuestas;
         }
    }
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
            java.util.logging.Logger.getLogger(interfazwaifu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazwaifu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazwaifu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazwaifu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazwaifu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}

