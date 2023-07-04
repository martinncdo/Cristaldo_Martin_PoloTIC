package ejercicio3;

public class CajaAhorro extends CuentaBancaria{
	public double retirar(double retiro) {
		//Si el monto a retirar es negativo, devuelve -1 (error).
		if (retiro < 0) {
			return -1;
		}else {
			//Si el monto a retirar es mayor al saldo, devuelve el saldo actual en su totalidad.
			if(retiro > saldo) {
				return saldo;
			}else {
				//Por último, si todo está correcto actualiza el saldo menos el monto a retirar
				//y devuelve el saldo actualizado
				saldo = saldo - retiro;
				return saldo;
			}
		}
	}
}
