package principal;


import javax.swing.*;

import ConversorMonedas.OpcionesConversion;
import ConversorTemperatura.OpcionesConversionTemperatura;

public class Principal {

	public static void main(String[] args) {

		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesConversionTemperatura conversionT = new OpcionesConversionTemperatura();

		while (true) {
			String opciones = JOptionPane
					.showInputDialog(null, "Seleccione una opción de conversión", "Bienvenido, siga las instrucciones: ", JOptionPane.PLAIN_MESSAGE,
							null, new Object[] { "Conversor de Divisas", "Conversor de Temperatura" }, "Seleccionar")
					.toString();

			switch (opciones) {
			case "Conversor de Divisas":
				String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);

				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if (JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Ingresa a la proxima operación con éxito");
				} else {
					JOptionPane.showMessageDialog(null, "Gracias por utilizar este conversor");
				}
				break;

			case "Conversor de Temperatura":
				String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionT.ConvertirTemperaturas(valorRecibidoT);

				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if (JOptionPane.OK_OPTION == respuestaT) {
					System.out.println("Ingresa a la proxima operación con éxito");
				} else {
					JOptionPane.showMessageDialog(null, "Gracias por utilizar este conversor");
				}
				break;
			}
			
		}

	}

}
