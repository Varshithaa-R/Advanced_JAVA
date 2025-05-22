/*Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display them on console whenever the countries are selected on the list.*/



package Swing;


import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListExample {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Country List Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create array of countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark", 
            "France", "Great Britain", "Japan", "Africa", 
            "Greenland", "Singapore"
        };

        // Create JList with country names
        JList<String> countryList = new JList<>(countries);
        countryList.setVisibleRowCount(6); // Show 6 items at once
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add a scroll pane in case of long list
        JScrollPane scrollPane = new JScrollPane(countryList);
        scrollPane.setPreferredSize(new Dimension(200, 120));

        // Add ListSelectionListener to handle selection events
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
                    System.out.println("Selected Countries:");
                    for (String country : selectedCountries) {
                        System.out.println(country);
                    }
                    System.out.println("-----------------------");
                }
            }
        });

        // Add scroll pane (with list) to frame
        frame.add(scrollPane);

        // Center and show
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
