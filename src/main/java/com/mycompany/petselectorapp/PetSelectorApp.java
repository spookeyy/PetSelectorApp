/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.petselectorapp;

/**
 *
 * @author spookie
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PetSelectorApp extends JFrame {

    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    private final ButtonGroup petGroup;
    private final JLabel imageLabel;
    
    public PetSelectorApp() {
        //frame
        setTitle("Pet Selector App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));
        
        // radio buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");
        
        petGroup = new ButtonGroup();
        petGroup.add(birdButton);
        petGroup.add(catButton);
        petGroup.add(dogButton);
        petGroup.add(rabbitButton);
        petGroup.add(pigButton);
        
        // Adding the radio buttons to the panel
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);
        
        imageLabel = new JLabel();
        imageLabel.setPreferredSize(new Dimension(200, 200));
        
        //action listeners
        ActionListener listener;
        listener = (var e) -> {
            JRadioButton button = (JRadioButton) e.getSource();
            String selection = button.getText();
            showPetSelection(selection);
        };
        
        birdButton.addActionListener(listener);
        catButton.addActionListener(listener);
        dogButton.addActionListener(listener);
        rabbitButton.addActionListener(listener);
        pigButton.addActionListener(listener);
        
        // Adding components to the frame
        add(radioPanel);
        add(imageLabel);
        
        pack();
        setSize(400, 300);
        setLocationRelativeTo(null);
    }
    
    private void showPetSelection(String pet) {
        JOptionPane.showMessageDialog(this, 
            "You selected a " + pet + " as your pet!",
            "Pet Selection",
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PetSelectorApp().setVisible(true);
        });
    }
}
