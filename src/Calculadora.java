import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Calculadora extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Calculadora(Composite parent, int style) {
		super(parent, style);
		
		Button button = new Button(this, SWT.NONE);
		button.setBounds(10, 198, 75, 25);
		button.setText("1");
		
		Button button_1 = new Button(this, SWT.NONE);
		button_1.setBounds(91, 198, 75, 25);
		button_1.setText("2");
		
		Button button_2 = new Button(this, SWT.NONE);
		button_2.setBounds(172, 198, 75, 25);
		button_2.setText("3");
		
		Button button_3 = new Button(this, SWT.NONE);
		button_3.setBounds(10, 167, 75, 25);
		button_3.setText("4");
		
		Button button_4 = new Button(this, SWT.NONE);
		button_4.setBounds(91, 167, 75, 25);
		button_4.setText("5");
		
		Button button_5 = new Button(this, SWT.NONE);
		button_5.setBounds(172, 167, 75, 25);
		button_5.setText("6");
		
		Button button_6 = new Button(this, SWT.NONE);
		button_6.setBounds(10, 136, 75, 25);
		button_6.setText("7");
		
		Button button_7 = new Button(this, SWT.NONE);
		button_7.setBounds(91, 136, 75, 25);
		button_7.setText("8");
		
		Button button_8 = new Button(this, SWT.NONE);
		button_8.setBounds(172, 136, 75, 25);
		button_8.setText("9");
		
		Button button_9 = new Button(this, SWT.NONE);
		button_9.setBounds(10, 229, 75, 25);
		button_9.setText("0");
		
		Button button_resultat = new Button(this, SWT.NONE);
		button_resultat.setBounds(91, 229, 156, 25);
		button_resultat.setText("=");
		
		Button button_dividir = new Button(this, SWT.NONE);
		button_dividir.setBounds(267, 136, 75, 25);
		button_dividir.setText("/");
		
		Button button_multiplicar = new Button(this, SWT.NONE);
		button_multiplicar.setBounds(267, 167, 75, 25);
		button_multiplicar.setText("*");
		
		Button button_sumar = new Button(this, SWT.NONE);
		button_sumar.setBounds(267, 198, 75, 25);
		button_sumar.setText("+");
		
		Button button_restar = new Button(this, SWT.NONE);
		button_restar.setBounds(267, 229, 75, 25);
		button_restar.setText("-");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
