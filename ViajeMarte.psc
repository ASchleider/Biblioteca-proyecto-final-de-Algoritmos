Algoritmo ViajeMarte
	
Definir velocidadkms, velocidadkmh Como Real
Definir horasTotales, diasTotales Como Real
Definir DistanciaMarte Como Real

DistanciaMarte <- 225000000

Escribir "Ingrese la velocidad de la sonda en km/s:"
Leer velocidadkms

Si velocidadkms > 0 Entonces

velocidadkmh <- velocidadkms * 3600
horasTotales <- DistanciaMarte / velocidadkmh
diasTotales <- horasTotales / 24

Escribir "La sonda va a tardar ", diasTotales, " dias en llegar a Marte."

SiNo
Escribir "Error, la velocidad debe ser mayor a cero."
FinSi

FinAlgoritmo