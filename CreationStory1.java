//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
//public class CreationStory1 {
//    public static void main(String[] args) {
//        // Schedule a job for the event-dispatching thread
//        SwingUtilities.invokeLater(() -> Creationstory1());
//    }
//
//    private static void Creationstory1() {
//        // Create the main frame
//        JFrame frame = new JFrame("Creation Story");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300, 200);
//        frame.setLayout(new FlowLayout());
//
//        // Create a label
//        JLabel label = new JLabel("Which Day Do you want to talk about::");
//        frame.add(label);
//
//        // Create a text field
//        JTextField textField = new JTextField(10);
//        frame.add(textField);
//
//        // Create a button
//        JButton button = new JButton("Submit");
//        frame.add(button);
//
//        // Create a label to display the result
//        JLabel resultLabel = new JLabel("");
//        frame.add(resultLabel);
//
//        // Add action listener to the button
//        button.addActionListener(new ActionListener() {
//            @Override
////            public void actionPerformed(ActionEvent e) {
////                String inputText = textField.getText();
////                try {
////                    int number = Integer.parseInt(inputText);
////                    if (number > 0) {
////                        resultLabel.setText("You entered: " + number);
////                    } else {
////                        resultLabel.setText("Please enter a positive integer.");
////                    }
////                } catch (NumberFormatException ex) {
////                    resultLabel.setText("Invalid input. Please enter an integer.");
////                }
////            }
//            public void actionPerformed(ActionEvent e) {
//                String  inputText=textField.getText();
//
//
////                System.out.println("CREATION STORY");
////                System.out.println(" On the first day, God created light, separating it from darkness. On the second day, He created the sky. On the third day, God gathered the waters to reveal dry land and created vegetation. On the fourth day, He made the sun, moon, and stars to illuminate the earth and mark time. On the fifth day, God created sea creatures and birds. On the sixth day, He created land animals and human beings in His image, giving them dominion over the earth. Finally, on the seventh day, God rested, blessing and sanctifying this day.");
////                System.out.println("Which Day Do you want to talk about:");
////                int inputInt = Day.nextInt();
////                try{
//                int number = Integer.parseInt(inputText);
//                System.out.println("Day: " + inputText);
//
//
//                switch(number) {
//                    case 1:
//
//                        System.out.println("Create light.\n" +
//                                "Separate light from darkness.\n" +
//                                "Name the light \"Day\" and the darkness \"Night\".\n" +
//                                "This can be found in Genesis Chapter1 verses 3 to 5");
//
//                        break;
//                    case 2:
//                        System.out.println("Create the sky.\n" +
//                                "Separate the waters above from the waters below.\n" +
//                                "This can be found in Genesis Chapter1 verses 6 to 8");
//                        break;
//                    case 3:
//
//                        System.out.println("Gather the waters below the sky into one place.\n" +
//                                "Make dry ground appear.\n" +
//                                "Name the dry ground \"Land\" and the gathered waters \"Seas\".\n" +
//                                "Create vegetation (plants and trees).\n" +
//                                "This can be found in Genesis Chapter1 verses 9 to 13");
//
//                        break;
//                    case 4:
//
//                        System.out.println("Create the sun, moon, and stars.\n" +
//                                "Place them in the sky to give light to the earth and to separate day from night.\n" +
//                                "This can be found in Genesis Chapter1 verses 14 to 19");
//
//                        break;
//                    case 5:
//
//                        System.out.println("Create creatures of the sea.\n" +
//                                "Create birds to fly above the earth.\n" +
//                                "This can be found in Genesis Chapter1 verses 20 to 23");
//
//                        break;
//                    case 6:
//
//                        System.out.println("Create land animals.\n" +
//                                "Create mankind in His own image.\n" +
//                                "Give mankind dominion over the earth and all living things.\n" +
//                                "This can be found in Genesis Chapter1 verses 24 to 31");
//
//                        break;
//                    case 7:
//
//                        System.out.println("God rests from all His work.\n" +
//                                "Bless and make the seventh day holy.\n" +
//                                "This can be found in Genesis Chapter2");
//
//                        break;
//                    default:
//                        System.out.println("Creation took place in 7 days!!!");
//                }
//
//            }
////                catch (NumberFormatException ex) {
////                    resultLabel.setText("Invalid input. Please enter a valid integer.");
////                }
//
//        // Display the frame
//        frame.setVisible(true);
//    })
//;
//    }
//}



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreationStory1 {
    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread
        SwingUtilities.invokeLater(CreationStory1::Creationstory1);
    }

    private static void Creationstory1() {
        // Create the main frame
        JFrame frame = new JFrame("Creation Story");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Create a label
        JLabel label = new JLabel("Which day do you want to talk about:");
        frame.add(label);

        // Create a text field
        JTextField textField = new JTextField(10);
        frame.add(textField);

        // Create a button
        JButton button = new JButton("Submit");
        frame.add(button);

        // Create a text area to display the result
        JTextArea resultTextArea = new JTextArea(10, 30);
        resultTextArea.setEditable(false);
        frame.add(new JScrollPane(resultTextArea));

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                try {
                    int number = Integer.parseInt(inputText);
                    String message;
                    switch (number) {
                        case 1:
                            message = "Create light.\n" +
                                    "Separate light from darkness.\n" +
                                    "Name the light 'Day' and the darkness 'Night'.\n" +
                                    "This can be found in Genesis Chapter 1 verses 3 to 5.";
                            break;
                        case 2:
                            message = "Create the sky.\n" +
                                    "Separate the waters above from the waters below.\n" +
                                    "This can be found in Genesis Chapter 1 verses 6 to 8.";
                            break;
                        case 3:
                            message = "Gather the waters below the sky into one place.\n" +
                                    "Make dry ground appear.\n" +
                                    "Name the dry ground 'Land' and the gathered waters 'Seas'.\n" +
                                    "Create vegetation (plants and trees).\n" +
                                    "This can be found in Genesis Chapter 1 verses 9 to 13.";
                            break;
                        case 4:
                            message = "Create the sun, moon, and stars.\n" +
                                    "Place them in the sky to give light to the earth and to separate day from night.\n" +
                                    "This can be found in Genesis Chapter 1 verses 14 to 19.";
                            break;
                        case 5:
                            message = "Create creatures of the sea.\n" +
                                    "Create birds to fly above the earth.\n" +
                                    "This can be found in Genesis Chapter 1 verses 20 to 23.";
                            break;
                        case 6:
                            message = "Create land animals.\n" +
                                    "Create mankind in His own image.\n" +
                                    "Give mankind dominion over the earth and all living things.\n" +
                                    "This can be found in Genesis Chapter 1 verses 24 to 31.";
                            break;
                        case 7:
                            message = "God rests from all His work.\n" +
                                    "Bless and make the seventh day holy.\n" +
                                    "This can be found in Genesis Chapter 2.";
                            break;
                        default:
                            message = "Creation took place in 7 days!!!";
                            break;
                    }
                    resultTextArea.setText(message);
                } catch (NumberFormatException ex) {
                    resultTextArea.setText("ENTER FROM DAY1 DAY7 ");
                }
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}
