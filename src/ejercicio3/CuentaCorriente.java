package ejercicio3;

public class CuentaCorriente extends CuentaBancaria {
	public double retirar(double retiro) {
		if (retiro < 0) {
			//Si el monto a retirar es negativo, devuelve -1 (error).
			return -1;
		}else {
			//Si el monto a retirar es mayor al saldo actualiza el saldo
			//dejándolo en negativo, pero devuelve el monto solicitado
			if (retiro > saldo) {
				saldo = saldo - retiro;
				return retiro;
			}else {
				//Si no realiza un retiro común, actualizando el saldo menos el retiro
				//y devolviendo el saldo actualizado
				saldo = saldo - retiro;
				return saldo;
			}
		}
	}
	
	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria(19888, 44541689, 10000);
		cuenta1.consultarSaldo();
		cuenta1.ingresar(1000);
		cuenta1.consultarSaldo();
		cuenta1.extraccionRapida();
		cuenta1.consultarDatos();
		CuentaCorriente cuenta2 = new CuentaCorriente();
		System.out.print(cuenta2.retirar(15000));
	}
}
