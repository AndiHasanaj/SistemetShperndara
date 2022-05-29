
package com.raven.components;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Icon;


public class Chat_Left11 extends javax.swing.JLayeredPane {

  
    public Chat_Left11() {
        initComponents();
        txt.setBackground(new Color(229,229,229));
    }
    
    
public void setUserProfile(String user){
    txt.setUserProfile(user);
}

//public void setImageProfile(Icon image){
//    IaImage.setImage(image);
//}

    public void setText(String text){
        if (text.equals("")){
            txt.hideText();
        } else {
            txt.setText(text);
        }
    }
    
    public void setImage(Icon ...image) {
        txt.SetImage(false, image);
    }

    public void setTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime now = LocalDateTime.now();
        txt.setTime(dtf.format(now));       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new com.raven.components.Chat_Item();

        setBackground(new java.awt.Color(244, 244, 244));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        txt.setBackground(new java.awt.Color(244, 244, 244));
        add(txt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.components.Chat_Item txt;
    // End of variables declaration//GEN-END:variables
}
