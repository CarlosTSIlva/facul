
import javax.swing.JOptionPane;

public class ImcClasse {

  public static void main(String[] args) {
    double peso, altura, imc;
    String pesoString, alturaString;

    pesoString = JOptionPane.showInputDialog("Seu peso como um double");
    peso = Double.parseDouble(pesoString);

    alturaString = JOptionPane.showInputDialog("Sua altura como um double");
    altura = Double.parseDouble(alturaString);

    imc = peso / (altura * altura);

    if (imc < 17 ) {
      JOptionPane.showMessageDialog(null, "Muito abaixo do peso e seu IMC é " + imc);
    } else if (imc >= 17 && imc <= 18.49) {
      JOptionPane.showMessageDialog(null, "Abaixo do peso e seu IMC é " + imc);
    } else if (imc >= 18.50 && imc <= 24.99) {
      JOptionPane.showMessageDialog(null, "Peso normal e seu IMC é " + imc);
    } else if (imc >= 25 && imc <= 29.99) {
      JOptionPane.showMessageDialog(null, "Acima do peso e seu IMC é " + imc);
    } else if (imc >= 30 && imc <= 34.99) {
      JOptionPane.showMessageDialog(null, "Obesidade I e seu IMC é " + imc);
    } else if (imc >= 35 && imc <= 39.99) {
      JOptionPane.showMessageDialog(null, "Obesidade II (severa e seu IMC é " + imc);
    } else if (imc >= 40) {
      JOptionPane.showMessageDialog(null, "Obesidade III (mórbida) e seu IMC é " + imc);
    }
  }
}
