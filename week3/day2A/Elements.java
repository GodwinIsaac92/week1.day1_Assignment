package week3.day2A;

public class Elements {

	public static void main(String[] args) {


		 Button submitButton = new Button();
	     submitButton.click();
	     submitButton.submit();

	     TextField textField = new TextField();
	     textField.setText("Hello");
	     System.out.println("Text from TextField: " + textField.getText());

	     CheckBoxButton checkBoxButton = new CheckBoxButton();
	     checkBoxButton.click();
	     checkBoxButton.submit(); // Inherited from Button
	     checkBoxButton.clickCheckButton();

	     RadioButton radioButton = new RadioButton();
	     radioButton.click();
	     radioButton.submit(); // Inherited from Button
	     radioButton.selectRadioButton();

	}

}
