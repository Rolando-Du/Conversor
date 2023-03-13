package ConversorMonedas;


import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirPesosArgentinoDolares(double valor) {
		double monedaDolar = valor / 0.0051;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Total cambio " +  " $ " + monedaDolar + " ARS");
	}

	public void ConvertirPesosArgentinoEuros(double valor) {
		double monedaEuro = valor / 0.0047;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null,  "Total cambio " +  " $ " + monedaEuro + " ARS");
	}

	public void ConvertirPesosArgentinoLibra(double valor) {
		double monedaLibra = valor / 0.0042;
		monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null,  "Total cambio " +  " $ " + monedaLibra + " ARS");
	}

	public void ConvertirPesosArgentinoYen(double valor) {
		double monedaYen = valor / 0.68;
		monedaYen = (double) Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Total cambio " +  " $ " + monedaYen + " ARS");
	}

	public void ConvertirPesosArgentinoWon(double valor) {
		double monedaWon = valor / 6.58;
		monedaWon = (double) Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null,  "Total cambio " +  " $ " + monedaWon + " ARS");
	}

	public void ConvertirDolaresPesosArgentino(double valor) {
		double monedaDolar = valor / 197.95;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Total cambio " +  " $ " + monedaDolar + " USD");
	}

	public void ConvertirEurosPesosArgentino(double valor) {
		double monedaEuro = valor / 212.14;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null,  "Total cambio " +  " $ " + monedaEuro + " EUR");
	}

	public void ConvertirLibraPesosArgentino(double valor) {
		double monedaLibra = valor / 239.99;
		monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null,  "Total cambio " +  " $ " + monedaLibra + " GBP");
	}

	public void ConvertirYenPesosArgentino(double valor) {
		double monedaYen = valor / 1.48;
		monedaYen = (double) Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null,  "Total cambio " +  " $ " + monedaYen + " JPY");
	}

	public void ConvertirWonPesosArgentino(double valor) {
		double monedaWon = valor / 0.15;
		monedaWon = (double) Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null,  "Total cambio " +  " $ " + monedaWon + " KRW");
	}

}