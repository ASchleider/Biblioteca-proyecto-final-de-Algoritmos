Algoritmo Hidratacion
	
	Definir baseMLporKG, MLporminuto Como Real
	
	baseMLporKG <- 35
	MLporminuto <- 12
	
	Escribir "Ingrese su peso en KG: "
	Leer Peso
	Escribir "Ingrese el tiempo de ejersicio: "
	Leer Tiempo
	
	Hidrtacionbaseporpeso <- peso * baseMLporKG
	Hidrtacionbaseporminuto <- Tiempo * MLporminuto
	Totalsuma <- Hidrtacionbaseporminuto + Hidrtacionbaseporpeso
	Volumentotal <- Totalsuma / 1000
	
	Escribir "El consumo recomendado es: ", Volumentotal "Litros al dia"
	
FinAlgoritmo
