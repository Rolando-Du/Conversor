package ConversorMonedas;


import javax.swing.JOptionPane;

public class OpcionesConversion {

	ConvertirMonedas monedas = new ConvertirMonedas();

	public void ConvertirMonedas(double valor) {

		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda que deseas convertir tu dinero ", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos",
						"De Yen Japonés a Pesos", "De Won sur-coreano a Pesos", "De Pesos a Dólar", "De Pesos a Euro",
						"De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won sur-coreano" },
				"Seleccion")).toString();

		switch (opcion) {
		case "De Pesos a Dólar":
			monedas.ConvertirDolaresPesosArgentino(valor);
			break;

		case "De Pesos a Euro":
			monedas.ConvertirEurosPesosArgentino(valor);
			break;

		case "De Pesos a Libras Esterlinas":
			monedas.ConvertirLibraPesosArgentino(valor);
			break;

		case "De Pesos a Yen Japonés":
			monedas.ConvertirYenPesosArgentino(valor);
			break;

		case "De Pesos a Won sur-coreano":
			monedas.ConvertirWonPesosArgentino(valor);
			break;

			
			
		case "De Dólar a Pesos":
			monedas.ConvertirPesosArgentinoDolares(valor);
			break;

		case "De Euro a Pesos":
			monedas.ConvertirPesosArgentinoEuros(valor);
			break;

		case "De Libras Esterlinas a Pesos":
			monedas.ConvertirPesosArgentinoLibra(valor);
			break;

		case "De Yen Japonés a Pesos":
			monedas.ConvertirPesosArgentinoYen(valor);
			break;

		case "De Won sur-coreano a Pesos":
			monedas.ConvertirPesosArgentinoWon(valor);
			break;
		}
	}

}