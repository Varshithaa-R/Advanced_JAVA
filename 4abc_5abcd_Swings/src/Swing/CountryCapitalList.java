/*Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.*/


package Swing;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;

public class CountryCapitalList {
    public static void main(String[] args) {
        // Create a map of countries and their capitals
        Map<String, String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Vietnam", "Hanoi");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Denmark", "Copenhagen");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Great Britain", "London");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Africa", "Pretoria (South Africa)"); // Adjust as needed
        countryCapitalMap.put("Greenland", "Nuuk");
        countryCapitalMap.put("Singapore", "Singapore");

        // Create frame
        JFrame frame = new JFrame("Country and Capital Viewer");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Country array for the list
        String[] countries = countryCapitalMap.keySet().toArray(new String[0]);

        // Create JList with countries
        JList<String> countryList = new JList<>(countries);
        countryList.setVisibleRowCount(6);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add to scroll pane
        JScrollPane scrollPane = new JScrollPane(countryList);
        scrollPane.setPreferredSize(new Dimension(200, 120));

        // Add selection listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
                    System.out.println("Selected Country Capitals:");
                    for (String country : selectedCountries) {
                        String capital = countryCapitalMap.get(country);
                        System.out.println(country + " → " + capital);
                    }
                    System.out.println("------------------------");
                }
            }
        });

        // Add to frame
        frame.add(scrollPane);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

