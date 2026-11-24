Algoritmo AlmacenamientoSolar
	
	Definir cargaActualkwh, energiaGeneradahoykWH Como Real
	Definir nuevaCargakwh, porcentaje Como Real
	Definir CapacidadmaximaKWH Como Real
	
	CapacidadmaximaKWH <- 1500
	
	Escribir "Ingrese la carga actual de la bateria en kWh: "
	Leer cargaactualKWH
	
	Escribir "Ingrese la energia generada hoy en kWh:"
	Leer energiaGeneradahoykWH
	
	nuevaCargakwh <- cargaactualKWH + energiaGeneradahoykWH
	
	porcentaje <- (nuevaCargakwh / CapacidadmaximaKWH) * 100
	
	Escribir "La nueva carga total es: ", nuevaCargakwh " kWh"
	Escribir "El porcentaje de capacidad alcanzado es: ", porcentaje, "%"
	
	
FinAlgoritmo
