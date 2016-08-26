Feature: Agendar citas

@appointmentSchedulingWithNoDoctorAndNoPatient
Scenario: appointmentSchedulingWithNoDoctorAndNoPatient
Given El usuario ingresa a la url and hace click en Agendar cita
When El usuario selecciona la fecha "mañana"
And El usuario ingresa 123 en el campo Documento de identidad del paciente
And El usuario ingresa 234 en el campo Documento de identidad del doctor
And El usuario ingresa "Cita de medicina general" en el campo Observaciones
And El usuario hace click en el boton guardar
Then debe mostrase ventana con error "No se pudo guardar debido a: *El campo \'Documento de identidad\' no se encuentra entre nuestros doctores" 
And debe mostrarse ventana con error "*El campo \'Documento de identidad\' no se encuentra entre nuestros pacientes registrados"

@appointmentScheduling
Scenario: appointmentScheduling
Given El usuario ingresa a la url and hace click en Agendar cita
And existe el cliente con cedula 321 
And existe el doctor con la cedula 432
When El usuario selecciona la fecha "mañana"
And El usuario ingresa 321 en el campo Documento de identidad del paciente
And El usuario ingresa 432 en el campo Documento de identidad del doctor
And El usuario ingresa "Cita de medicina general" en el campo Observaciones
And El usuario hace click en el boton guardar
Then debe mostrase ventana con mensaje "Datos guardados correctamente"

@appointmentSchedulingWithNoPatient
Scenario: appointmentSchedulingWithNoPatient
Given El usuario ingresa a la url and hace click en Agendar cita
When El usuario selecciona la fecha "mañana" 
And existe el doctor con la cedula 432
And El usuario ingresa 111 en el campo Documento de identidad del paciente
And El usuario ingresa 432 en el campo Documento de identidad del doctor
And El usuario ingresa "Cita de medicina general" en el campo Observaciones
And El usuario hace click en el boton guardar
Then debe mostrase ventana con error "No se pudo guardar debido a: *El campo \'Documento de identidad\' no se encuentra entre nuestros pacientes registrados"

@appointmentSchedulingWithNoDoctor
Scenario: appointmentSchedulingWithNoDoctor
Given El usuario ingresa a la url and hace click en Agendar cita
When El usuario selecciona la fecha "mañana" 
And existe el paciente con la cedula 321
And El usuario ingresa 321 en el campo Documento de identidad del paciente
And El usuario ingresa 111 en el campo Documento de identidad del doctor
And El usuario ingresa "Cita de medicina general" en el campo Observaciones
And El usuario hace click en el boton guardar
Then debe mostrase ventana con error "No se pudo guardar debido a: *El campo \'Documento de identidad\' no se encuentra entre nuestros doctores" 

@appointmentSchedulingWithNoDate
Scenario: appointmentSchedulingWithNoDate
Given El usuario ingresa a la url and hace click en Agendar cita
And existe el cliente con cedula 321 
And existe el doctor con la cedula 432
When El usuario ingresa 321 en el campo Documento de identidad del paciente
And El usuario ingresa 432 en el campo Documento de identidad del doctor
And El usuario ingresa "Cita de medicina general" en el campo Observaciones
And El usuario hace click en el boton guardar
Then debe mostrase ventana con error HTTP ERROR 500

@appointmentSchedulingWithNoComments
Scenario: appointmentScheduling
Given El usuario ingresa a la url and hace click en Agendar cita
And existe el cliente con cedula 321 
And existe el doctor con la cedula 432
When El usuario selecciona la fecha "mañana"
And El usuario ingresa 321 en el campo Documento de identidad del paciente
And El usuario ingresa 432 en el campo Documento de identidad del doctor
And El usuario hace click en el boton guardar
Then debe mostrase ventana con mensaje "Datos guardados correctamente".

@appointmentSchedulingYesterday
Scenario: appointmentSchedulingYesterday
Given El usuario ingresa a la url and hace click en Agendar cita
And existe el cliente con cedula 321 
And existe el doctor con la cedula 432
When El usuario selecciona la fecha "ayer"
And El usuario ingresa 321 en el campo Documento de identidad del paciente
And El usuario ingresa 432 en el campo Documento de identidad del doctor
And El usuario ingresa "Cita de medicina general" en el campo Observaciones
And El usuario hace click en el boton guardar
Then debe mostrase ventana con mensaje de error "Se deben usar fechas mayores a la fecha actual."